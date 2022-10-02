package com.example.epidemic.service.Impl;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.example.epidemic.dao.VaccineNumDao;
import com.example.epidemic.dao.VaccineStatuDao;
import com.example.epidemic.dao.VaccineUserDao;
import com.example.epidemic.entity.VaccineStatu;
import com.example.epidemic.entity.VaccineUser;
import com.example.epidemic.excel.AdminExcel;
import com.example.epidemic.service.Interface.VaccineUserService;
import com.example.epidemic.utils.PassUtils;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class VaccineUserServiceImpl implements VaccineUserService {
    @Autowired
    private VaccineUserDao vaccineUserDao;
    @Autowired
    private VaccineStatuDao vaccineStatuDao;
    @Autowired
    private VaccineNumDao vaccineNumDao;



    //查询所有
    @Override
    public PageBean<VaccineUser> finAll(Integer pageNum,Integer pageSize,VaccineUser vaccineUser) {

        PageHelper.startPage(pageNum, pageSize);
        PageInfo<VaccineUser> pageInfo = new PageInfo<>(vaccineUserDao.findAll(vaccineUser));
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());

    }
    //save
    @Override
    public ResultBean save(VaccineUser vaccineUser) {
        ResultBean resultBean = new ResultBean();
        if (vaccineUserDao.insert(vaccineUser) == 1){
         resultBean.setCode(200);
         resultBean.setMsg("添成功！");
            VaccineUser byNameAndAddress = vaccineUserDao.findByNameAndAddress(vaccineUser.getName(), vaccineUser.getAddress());

            if ("1".equals(byNameAndAddress.getIsInoculate()) ){
                vaccineUserDao.insertNum(byNameAndAddress.getId(),1);
                VaccineStatu vaccineStatu = new VaccineStatu();
                vaccineStatu.setId(byNameAndAddress.getId());
                vaccineStatu.setName(byNameAndAddress.getName());
                vaccineStatu.setStatu("正常");
                vaccineStatu.setVatime(byNameAndAddress.getCtime());
                vaccineStatuDao.save(vaccineStatu);

                vaccineNumDao.saveUserId(byNameAndAddress.getId());
            }else {
                vaccineUserDao.insertNum(byNameAndAddress.getId(),0);
            }
            return  resultBean;

        }else {
            resultBean.setCode(500);
            resultBean.setMsg("添失败！");
            return resultBean;
        }

    }
   //deleteByid
    @Override
    public ResultBean delete(Integer id) {

        int delete = vaccineUserDao.delete(id);
        if (delete >0){
            return ResultBean.ok();
        }else {
            return ResultBean.ok();
        }
    }
   //deleteBatch
    @Override
    public ResultBean deleteBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            int i = vaccineUserDao.deleteBatch(ids);
            if (i > 0) {
                return ResultBean.ok();
            } else {
                return ResultBean.fail();
            }
        }else {
            return ResultBean.fail();
        }
    }
  //修改
    @Override
    public ResultBean update(VaccineUser vaccineUser) {
        int update = vaccineUserDao.update(vaccineUser);
        if (update >0){
            VaccineStatu vaccineStatu = new VaccineStatu();
            vaccineStatu.setName(vaccineUser.getName());
            vaccineStatu.setId(vaccineUser.getId());
            vaccineStatuDao.update(vaccineStatu);
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }

    }
  //查询为没有打疫苗的不听话的人
    @Override
    public PageBean<VaccineUser> findNot(Integer pageNum, Integer pageSize, VaccineUser vaccineUser) {

        PageHelper.startPage(pageNum, pageSize);

        PageInfo<VaccineUser> pageInfo = new PageInfo<>(vaccineUserDao.findNot(vaccineUser));

        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public List<VaccineUser> findAll() {
        return vaccineUserDao.findAll02();
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            List<VaccineUser> list = EasyExcel.read(file.getInputStream(), VaccineUser.class, new ReadListener() {
                @Override
                public void onException(Exception e, AnalysisContext analysisContext) throws Exception {

                }

                @Override
                public void invokeHead(Map map, AnalysisContext analysisContext) {

                }

                @Override
                public void invoke(Object o, AnalysisContext analysisContext) {

                }

                @Override
                public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                }

                @Override
                public boolean hasNext(AnalysisContext analysisContext) {
                    return false;
                }
            }).sheet().doReadSync();

            List<VaccineUser> adminExcels = new ArrayList<>();


            if (vaccineUserDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public List<VaccineUser> findYes() {

        return vaccineUserDao.findYes();
    }

    @Override
    public Integer ymTotal() {
        return   vaccineUserDao.ymTotal();

    }


}

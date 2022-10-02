package com.example.epidemic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lee
 * @date 2022/9/12  16:59
 */
@Configuration
public class webConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问 “/” 或 “/index.html” 时，都直接跳转到userlogin.html页面,只能映射到template文件夹下的html
        registry.addViewController("/").setViewName("userlogin");
        registry.addViewController("/userlogin.html").setViewName("userlogin");
        registry.addViewController("/adminlogin.html").setViewName("adminlogin");

        //添加路径映射，当url为http://localhost:8082/xxx.html时，定位到xxx.html页面
        registry.addViewController("/userRegister.html").setViewName("userRegister");
        registry.addViewController("/userindex.html").setViewName("userindex");
        registry.addViewController("/index.html").setViewName("index");
        //如果想让用户登录后，让static下的api文件夹里的init.json模板里的href（template下的html）起作用，需要添加映射
        registry.addViewController("page/welcome-3.html").setViewName("page/welcome-3");
        registry.addViewController("page/form-step.html").setViewName("page/form-step");

        registry.addViewController("page/admin/adminadd.html").setViewName("page/admin/adminadd");
        registry.addViewController("page/admin/adminedit.html").setViewName("page/admin/adminedit");
        registry.addViewController("page/admin/admintj.html").setViewName("page/admin/admintj");
        registry.addViewController("page/admin/adminlist.html").setViewName("page/admin/adminlist");
        registry.addViewController("page/admin/adminUpload.html").setViewName("page/admin/adminUpload");
        registry.addViewController("page/admin/adminHealthList.html").setViewName("page/admin/adminHealthList");
        registry.addViewController("page/admin/adminHealthAdd.html").setViewName("page/admin/adminHealthAdd");
        registry.addViewController("page/admin/adminHealthUpload.html").setViewName("page/admin/adminHealthUpload");
        registry.addViewController("page/admin/adminHealthEdit.html").setViewName("page/admin/adminHealthEdit");
        registry.addViewController("page/admin/adminNoticeList.html").setViewName("page/admin/adminNoticeList");
        registry.addViewController("page/admin/adminNoticeAdd.html").setViewName("page/admin/adminNoticeAdd");
        registry.addViewController("page/admin/adminNoticeUpload.html").setViewName("page/admin/adminNoticeUpload");
        registry.addViewController("page/admin/adminNoticeEdit.html").setViewName("page/admin/adminNoticeEdit");
        registry.addViewController("page/admin/adminMessageList.html").setViewName("page/admin/adminMessageList");


        registry.addViewController("page/user/userList.html").setViewName("page/user/userList");
        registry.addViewController("page/user/userAdd.html").setViewName("page/user/userAdd");
        registry.addViewController("page/user/userEdit.html").setViewName("page/user/userEdit");
        registry.addViewController("page/user/userNoticeList.html").setViewName("page/user/userNoticeList");
        registry.addViewController("page/user/usertj.html").setViewName("page/user/usertj");
        registry.addViewController("page/user/UserUpload.html").setViewName("page/user/UserUpload");
        registry.addViewController("page/user/heathList.html").setViewName("page/user/heathList");
        registry.addViewController("page/user/heathAdd.html").setViewName("page/user/heathAdd");
        registry.addViewController("page/user/heathEdit.html").setViewName("page/user/heathEdit");
        registry.addViewController("page/user/healthCommitList.html").setViewName("page/user/healthCommitList");
        registry.addViewController("page/user/heathUpload.html").setViewName("page/user/heathUpload");
        registry.addViewController("page/user/IsolateList.html").setViewName("page/user/IsolateList");
        registry.addViewController("page/user/IsolateAdd.html").setViewName("page/user/IsolateAdd");
        registry.addViewController("page/user/IsolateEdit.html").setViewName("page/user/IsolateEdit");
        registry.addViewController("page/user/IsolateUpload.html").setViewName("page/user/IsolateUpload");
        registry.addViewController("page/user/MessageList.html").setViewName("page/user/MessageList");
        registry.addViewController("page/user/OtherLocusList.html").setViewName("page/user/OtherLocusList");
        registry.addViewController("page/user/OtherLocusAdd.html").setViewName("page/user/OtherLocusAdd");
        registry.addViewController("page/user/OtherLocusUpload.html").setViewName("page/user/OtherLocusUpload");
        registry.addViewController("page/user/OtherLocusEdit.html").setViewName("page/user/OtherLocusEdit");
        registry.addViewController("page/user/PathList.html").setViewName("page/user/PathList");
        registry.addViewController("page/user/PathAdd.html").setViewName("page/user/PathAdd");
        registry.addViewController("page/user/PathUpload.html").setViewName("page/user/PathUpload");
        registry.addViewController("page/user/PathTj.html").setViewName("page/user/PathTj");
        registry.addViewController("page/user/PathEdit.html").setViewName("page/user/PathEdit");
        registry.addViewController("page/user/nucleateList.html").setViewName("page/user/nucleateList");
        registry.addViewController("page/user/nucleateReport.html").setViewName("page/user/nucleateReport");
        registry.addViewController("page/user/OwnHealthAdd.html").setViewName("page/user/OwnHealthAdd");


        registry.addViewController("page/user/MessageAdd.html").setViewName("page/user/MessageAdd");
        registry.addViewController("page/user/OwnHealthAdd.html").setViewName("page/user/OwnHealthAdd");
        registry.addViewController("page/user/userNoticeList.html").setViewName("page/user/userNoticeList");


        registry.addViewController("page/vaccine/findall.html").setViewName("page/vaccine/findall");
        registry.addViewController("page/vaccine/insert.html").setViewName("page/vaccine/insert");
        registry.addViewController("page/vaccine/findNotYm.html").setViewName("page/vaccine/findNotYm");
        registry.addViewController("page/vaccine/statuFindAll.html").setViewName("page/vaccine/statuFindAll");
        registry.addViewController("page/vaccine/numFindAll.html").setViewName("page/vaccine/numFindAll");
        registry.addViewController("page/vaccine/vaccinetj.html").setViewName("page/vaccine/vaccinetj");

        registry.addViewController("page/goods/goodslist.html").setViewName("page/goods/goodslist");
        registry.addViewController("page/goods/goodsadd.html").setViewName("page/goods/goodsadd");
        registry.addViewController("page/goodsLog/goodsLoglist.html").setViewName("page/goodsLog/goodsLoglist");
        registry.addViewController("page/goodsApprove/goodsApprovelist.html").setViewName("page/goodsApprove/goodsApprovelist");
        registry.addViewController("page/goodsPurchase/goodsPurchaselist.html").setViewName("page/goodsPurchase/goodsPurchaselist");

        registry.addViewController("page/visitor/visitorlist.html").setViewName("page/visitor/visitorlist");
        registry.addViewController("page/visitor/visitortj.html").setViewName("page/visitor/visitortj");
        registry.addViewController("page/visitor/visitorupload.html").setViewName("page/visitor/visitorupload");
        registry.addViewController("page/visitor/visitoradd.html").setViewName("page/visitor/visitoradd");
        registry.addViewController("page/visitor/itemslist.html").setViewName("page/visitor/itemslist");
        registry.addViewController("page/visitor/itemsadd.html").setViewName("page/visitor/itemsadd");
        registry.addViewController("page/visitor/itemsupload.html").setViewName("page/visitor/itemsupload");
        registry.addViewController("page/visitor/carlist.html").setViewName("page/visitor/carlist");
        registry.addViewController("page/visitor/caradd.html").setViewName("page/visitor/caradd");
        registry.addViewController("page/visitor/carupload.html").setViewName("page/visitor/carupload");
        registry.addViewController("page/visitor/messagelist.html").setViewName("page/visitor/messagelist");
        registry.addViewController("page/visitor/messageupload.html").setViewName("page/visitor/messageupload");





    }
}



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a_admin
-- ----------------------------
DROP TABLE IF EXISTS `a_admin`;
CREATE TABLE `a_admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '信息',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `flag` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_admin
-- ----------------------------
INSERT INTO `a_admin` VALUES (1, '博', 'OPvUIxneBdryzBoPKq744w==', '13546798521', '4564', '牛皮88', '2022-04-05 05:10:24', 2);
INSERT INTO `a_admin` VALUES (2, 'alex1', 'OPvUIxneBdryzBoPKq744w==', '13546798521', '45646', '牛皮666', '2022-04-05 05:10:24', 2);
INSERT INTO `a_admin` VALUES (3, 'admin', 'VW4am+fDy1nvJPXih6HY8w==', '1456789123', '45646', '热水器不行了', '2022-04-04 15:49:21', 1);
INSERT INTO `a_admin` VALUES (4, '静静1', 'VW4am+fDy1nvJPXih6HY8w==', '13546798521', '45646', '牛皮666', '2022-04-04 15:48:18', 1);
INSERT INTO `a_admin` VALUES (47, '小香想', 'VW4am+fDy1nvJPXih6HY8w==', '123456', '21312', '是打发斯蒂芬是的是的', '2022-04-05 05:10:24', 2);
INSERT INTO `a_admin` VALUES (48, 'ls', 'Q342xYn/RSbuVYW/TQbgAg==', '16478964523', '4564', '牛皮66', '2022-04-05 05:10:24', 1);
INSERT INTO `a_admin` VALUES (50, '郭奥敬1', 'VW4am+fDy1nvJPXih6HY8w==', '123456', '971875885@qq.com', '是打发斯蒂芬是的是的', '2022-04-05 05:10:24', 1);
INSERT INTO `a_admin` VALUES (52, '静静7', 'Q342xYn/RSbuVYW/TQbgAg==', '14567891236', '45646768', '牛皮9988', '2022-04-05 05:10:24', 1);
INSERT INTO `a_admin` VALUES (53, 'jing', 'VW4am+fDy1nvJPXih6HY8w==', '15689785645', '6546844', '哈哈哈', '2022-04-05 05:10:24', 1);
INSERT INTO `a_admin` VALUES (54, 'jing1', 'VW4am+fDy1nvJPXih6HY8w==', '4687564684', '5432135', '坎坎坷坷', '2022-04-05 05:10:24', 2);
INSERT INTO `a_admin` VALUES (55, 'alex', 'VW4am+fDy1nvJPXih6HY8w==', '1456789123', '45646', '牛皮88', '2022-04-05 08:19:35', 1);

-- ----------------------------
-- Table structure for a_adminHealth
-- ----------------------------
DROP TABLE IF EXISTS `a_adminHealth`;
CREATE TABLE `a_adminHealth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `aid` int(11) NULL DEFAULT NULL COMMENT '管理员的id',
  `temperature` decimal(24, 1) NULL DEFAULT NULL COMMENT '体温',
  `nucleic_acid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '核酸情况',
  `health_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '健康码',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '14天内是否去过中高风险地区',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_adminHealth
-- ----------------------------
INSERT INTO `a_adminHealth` VALUES (2, 2, 37.6, '阴', '绿色', '2022-04-01 13:18:53', '1');
INSERT INTO `a_adminHealth` VALUES (3, 3, 36.8, '阴', '绿色', '2022-04-01 13:21:34', '1');
INSERT INTO `a_adminHealth` VALUES (4, 1, 36.8, '阴', '绿色', '2022-04-01 13:30:09', '1');
INSERT INTO `a_adminHealth` VALUES (5, 2, 36.8, '阴', '绿色', '2022-04-01 13:30:09', '1');
INSERT INTO `a_adminHealth` VALUES (6, 3, 36.8, '阴', '黄色', '2022-04-01 14:33:50', '1');
INSERT INTO `a_adminHealth` VALUES (7, NULL, 36.9, '阴', '绿色', '2022-04-01 14:37:40', '1');
INSERT INTO `a_adminHealth` VALUES (8, 2, 36.9, '阴', '绿', '2022-04-01 14:39:09', '1');
INSERT INTO `a_adminHealth` VALUES (15, 2, 36.9, '阴', '绿', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (16, 3, 36.8, '阴', '黄色', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (17, 2, 36.8, '阴', '绿色', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (18, 1, 36.8, '阴', '绿色', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (19, 3, 36.8, '阴', '绿色', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (20, 2, 37.6, '阴', '绿色', '2022-04-04 12:04:38', '1');
INSERT INTO `a_adminHealth` VALUES (21, 2, 36.9, '阴', '绿色', '2022-04-05 05:12:43', '1');
INSERT INTO `a_adminHealth` VALUES (22, 29, 36.8, '阴', '绿色', '2022-04-05 05:15:41', '1');
INSERT INTO `a_adminHealth` VALUES (23, 29, 36.9, '阴', '绿色', '2022-04-05 07:18:10', '1');
INSERT INTO `a_adminHealth` VALUES (24, 36, 36.8, '阴', '黄色', '2022-04-05 07:18:10', '2');
INSERT INTO `a_adminHealth` VALUES (25, 29, 36.8, '阴', '绿色', '2022-04-05 07:18:10', '1');
INSERT INTO `a_adminHealth` VALUES (26, 30, 36.8, '阴', '绿色', '2022-04-05 07:18:10', '2');
INSERT INTO `a_adminHealth` VALUES (27, 50, 36.8, '阴', '绿色', '2022-04-05 07:18:10', '1');
INSERT INTO `a_adminHealth` VALUES (28, 51, 37.6, '阴', '绿色', '2022-04-05 07:18:10', '2');
INSERT INTO `a_adminHealth` VALUES (29, 52, 38.6, '阴', '黄色', '2022-04-05 07:18:10', '2');
INSERT INTO `a_adminHealth` VALUES (30, 53, 39.6, '阴', '黄色', '2022-04-05 07:18:10', '2');
INSERT INTO `a_adminHealth` VALUES (31, 54, 40.6, '阴', '绿色', '2022-04-05 07:18:10', '2');

-- ----------------------------
-- Table structure for a_adminMessage
-- ----------------------------
DROP TABLE IF EXISTS `a_adminMessage`;
CREATE TABLE `a_adminMessage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_adminMessage
-- ----------------------------
INSERT INTO `a_adminMessage` VALUES (1, 1, '需要蔬菜', '2022-04-02 15:27:11', '1');
INSERT INTO `a_adminMessage` VALUES (2, 2, '需要水果', '2022-04-02 16:39:35', '2');
INSERT INTO `a_adminMessage` VALUES (3, 1, '需要大米', '2022-04-04 13:50:37', '1');
INSERT INTO `a_adminMessage` VALUES (4, 2, '谁要大米', '2022-04-04 14:18:30', '1');
INSERT INTO `a_adminMessage` VALUES (5, 229, '谁要大米', '2022-04-05 05:16:38', '2');
INSERT INTO `a_adminMessage` VALUES (6, 296, '谁要大米', '2022-04-05 14:55:05', '');

-- ----------------------------
-- Table structure for a_adminNotice
-- ----------------------------
DROP TABLE IF EXISTS `a_adminNotice`;
CREATE TABLE `a_adminNotice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `aname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发起人',
  `flag` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '管理员通知表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_adminNotice
-- ----------------------------
INSERT INTO `a_adminNotice` VALUES (5, '大事件大事件', '门口白菜两块钱4斤', '2022-04-04 12:22:03', 'alex', 2);
INSERT INTO `a_adminNotice` VALUES (6, '大事件大事件', '门口白菜两块钱5斤', '2022-04-04 12:22:03', 'alex', 1);
INSERT INTO `a_adminNotice` VALUES (7, '大事件大事件', '门口白菜两块钱6斤', '2022-04-04 12:22:03', 'alex', 1);
INSERT INTO `a_adminNotice` VALUES (8, '大事件大事件', '门口白菜两块钱7斤', '2022-04-04 12:22:03', 'alex', 2);
INSERT INTO `a_adminNotice` VALUES (9, '小事件', '门口白菜两块钱3斤', '2022-04-05 14:21:30', '静静1', 2);
INSERT INTO `a_adminNotice` VALUES (10, '哈哈哈', '嘻嘻', '2022-04-05 14:51:17', 'alex', 1);
INSERT INTO `a_adminNotice` VALUES (11, '下大雨了', '骗人的', '2022-04-05 14:52:17', '静静2', 1);

-- ----------------------------
-- Table structure for g_approve
-- ----------------------------
DROP TABLE IF EXISTS `g_approve`;
CREATE TABLE `g_approve`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '申请人',
  `goodsname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '申请物资',
  `count` int(11) NULL DEFAULT NULL COMMENT '数量',
  `unit` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单位',
  `time` datetime NULL DEFAULT NULL COMMENT '时间',
  `state` int(11) NULL DEFAULT 1 COMMENT '状态表示符 默认为1有效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '物资申请表 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of g_approve
-- ----------------------------
INSERT INTO `g_approve` VALUES (1, '小萝卜', '土豆', 10, '斤', '2022-04-02 06:16:48', 1);
INSERT INTO `g_approve` VALUES (6, '黑蛋', '打火机', 3, '个', '2022-04-02 06:26:32', 2);
INSERT INTO `g_approve` VALUES (7, '小黑蛋', '防风打火机', 2, '个', '2022-04-02 06:16:48', 1);
INSERT INTO `g_approve` VALUES (8, '王晨', '毛巾', 5, '条', '2022-04-02 06:16:48', 1);
INSERT INTO `g_approve` VALUES (9, '迪迦', '光', 999999, '条', '2022-04-02 06:19:13', 1);
INSERT INTO `g_approve` VALUES (10, '黑蛋', '毛巾', 5, '条', '2022-04-03 01:05:57', 1);
INSERT INTO `g_approve` VALUES (11, '黑蛋', '毛巾', 5, '条', '2022-04-04 13:34:49', 1);
INSERT INTO `g_approve` VALUES (12, '王晨', '蜜雪冰城', 5, '个', '2022-04-04 14:05:56', 1);
INSERT INTO `g_approve` VALUES (13, '黑蛋', '小白菜', 5, '条', '2022-04-04 14:11:30', 1);
INSERT INTO `g_approve` VALUES (14, '黑蛋', '小白菜', 999999, '条', '2022-04-04 14:13:04', 1);
INSERT INTO `g_approve` VALUES (15, '黑蛋', '小白菜', 5, '个', '2022-04-04 14:14:31', 1);
INSERT INTO `g_approve` VALUES (16, '黑蛋', '小白菜', 5, '个', '2022-04-04 14:15:48', 1);
INSERT INTO `g_approve` VALUES (17, '小香', '小白菜', 5, '条', '2022-04-04 14:27:00', 1);
INSERT INTO `g_approve` VALUES (18, '小香', '小白菜', 3, '条', '2022-04-04 14:35:21', 1);
INSERT INTO `g_approve` VALUES (19, '小香', '雪花', 3, '个', '2022-04-04 14:37:38', 1);
INSERT INTO `g_approve` VALUES (20, '小香', '蜜雪冰城', 999999, '个', '2022-04-04 15:16:16', 1);
INSERT INTO `g_approve` VALUES (21, '小香', '蜜雪冰城', 3, '个', '2022-04-04 15:16:37', 1);
INSERT INTO `g_approve` VALUES (22, '小香', '蜜雪冰城', 3, '个', '2022-04-04 15:21:03', 1);
INSERT INTO `g_approve` VALUES (23, '小香', '小白菜', 200, '个', '2022-04-04 15:33:27', 1);
INSERT INTO `g_approve` VALUES (24, '小香', '白菜', 20, '个', '2022-04-04 15:34:05', 1);

-- ----------------------------
-- Table structure for g_goods
-- ----------------------------
DROP TABLE IF EXISTS `g_goods`;
CREATE TABLE `g_goods`  (
  `g_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `g_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物品名',
  `g_count` int(11) NULL DEFAULT NULL COMMENT '物品数量',
  `g_unit` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单位',
  `g_tid` int(11) NULL DEFAULT NULL COMMENT '物资类型',
  `g_st_id` int(11) NULL DEFAULT NULL COMMENT '物资状态',
  `g_ctime` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`g_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 75 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = ' ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of g_goods
-- ----------------------------
INSERT INTO `g_goods` VALUES (1, '方便面', 165, '箱', 1, 1, '2022-04-01 06:21:31');
INSERT INTO `g_goods` VALUES (2, '消毒液', 100, '瓶', 2, 1, '2022-04-01 06:21:21');
INSERT INTO `g_goods` VALUES (3, '口罩', 20, '包', 2, 1, '2022-04-01 07:19:11');
INSERT INTO `g_goods` VALUES (7, '充电宝', 333, '个', 2, 1, '2022-04-01 07:20:14');
INSERT INTO `g_goods` VALUES (10, '小萝卜', 200, '根', 2, 1, '2022-04-01 08:14:12');
INSERT INTO `g_goods` VALUES (11, '白菜', 130, '颗', 2, 1, '2022-04-04 15:34:05');
INSERT INTO `g_goods` VALUES (12, '84消毒液', 50, '瓶', 2, 1, '2022-04-01 08:47:28');
INSERT INTO `g_goods` VALUES (13, '疫苗', 9999, '针', 1, 1, '2022-04-01 08:47:58');
INSERT INTO `g_goods` VALUES (14, '面条', 600, '袋', 2, 1, '2022-04-01 08:48:52');
INSERT INTO `g_goods` VALUES (15, '土豆', 366, '斤', 2, 1, '2022-04-01 08:49:03');
INSERT INTO `g_goods` VALUES (16, '猪肉', 500, '斤', 2, 1, '2022-04-01 08:49:23');
INSERT INTO `g_goods` VALUES (17, '面粉', 530, '斤', 2, 1, '2022-04-01 08:49:44');
INSERT INTO `g_goods` VALUES (18, '牛奶', 100, '箱', 2, 1, '2022-04-01 08:50:31');
INSERT INTO `g_goods` VALUES (21, '红旗渠', 200, '条', 2, 1, '2022-04-01 08:51:13');
INSERT INTO `g_goods` VALUES (22, '崂山', 600, '箱', 2, 1, '2022-04-01 09:37:03');
INSERT INTO `g_goods` VALUES (23, '雪花', 600, '箱', 2, 1, '2022-04-01 09:37:14');
INSERT INTO `g_goods` VALUES (26, '小米', 200, '斤', 2, 1, '2022-04-02 08:53:51');
INSERT INTO `g_goods` VALUES (27, '888444消毒液', 20, '个', 2, 1, '2022-04-02 09:18:34');
INSERT INTO `g_goods` VALUES (29, '66333口罩', 600, '个', 2, 1, '2022-04-02 09:20:01');
INSERT INTO `g_goods` VALUES (48, '白菜', 0, '斤', 2, 1, '2022-04-04 15:34:05');
INSERT INTO `g_goods` VALUES (49, '土豆', 100, '袋', 1, 1, '2022-04-03 01:06:08');
INSERT INTO `g_goods` VALUES (50, '白菜', 180, '斤', 2, 1, '2022-04-04 15:34:05');
INSERT INTO `g_goods` VALUES (52, '蜜雪冰城', 20, '袋', 2, 2, '2022-04-04 13:51:24');
INSERT INTO `g_goods` VALUES (53, '小白菜', 394, '斤', 2, 1, '2022-04-04 15:33:27');
INSERT INTO `g_goods` VALUES (54, '羽毛球', 200, '个', 1, 1, '2022-04-04 16:31:34');
INSERT INTO `g_goods` VALUES (55, '网球', 100, '个', 1, 1, '2022-04-04 16:31:56');
INSERT INTO `g_goods` VALUES (56, '小黑蛋', 100299, '个', 1, 1, '2022-04-05 08:12:13');
INSERT INTO `g_goods` VALUES (57, '法拉利', 100, '辆', 1, 1, '2022-04-04 16:38:08');
INSERT INTO `g_goods` VALUES (58, '兰博基尼', 100, '辆', 2, 1, '2022-04-04 16:39:21');
INSERT INTO `g_goods` VALUES (59, '绿茶', 200, '瓶', 2, 1, '2022-04-04 16:42:05');
INSERT INTO `g_goods` VALUES (60, '绿茶1', 200, '瓶', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (61, '绿茶2', 100, '辆', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (62, '绿茶3', 100, '辆', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (63, '绿茶4', 200, '个', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (64, '绿茶5', 100, '个', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (65, '绿茶6', 200, '个', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (66, '绿茶7', 394, '斤', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (67, '绿茶8', 20, '袋', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (68, '绿茶9', 180, '斤', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (69, '绿茶10', 100, '袋', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (70, '绿茶11', 0, '斤', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (71, '绿茶12', 600, '个', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (72, '绿茶13', 20, '个', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (73, '绿茶14', 200, '斤', 1, 1, '2022-04-05 08:05:50');
INSERT INTO `g_goods` VALUES (74, '绿茶15', 600, '箱', 1, 1, '2022-04-05 08:05:50');

-- ----------------------------
-- Table structure for g_log
-- ----------------------------
DROP TABLE IF EXISTS `g_log`;
CREATE TABLE `g_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `goodsname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物资',
  `operate` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作 记录对物资表的操作，包括1、新增数据，2、删除数据，3、修改物资名称，4、修改数量，5、修改单位，6、修改状态，7、修改物资属性等操作',
  `result` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作结果 记录操作结果，包括：1、数据被删除，2、数据被添加，3、（操作前数据）--->（操作后数据）',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'admin' COMMENT '操作人',
  `time` datetime NULL DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = ' ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of g_log
-- ----------------------------
INSERT INTO `g_log` VALUES (1, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:21');
INSERT INTO `g_log` VALUES (2, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:24');
INSERT INTO `g_log` VALUES (3, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:25');
INSERT INTO `g_log` VALUES (4, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:25');
INSERT INTO `g_log` VALUES (5, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:25');
INSERT INTO `g_log` VALUES (6, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:26');
INSERT INTO `g_log` VALUES (7, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:26');
INSERT INTO `g_log` VALUES (8, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:26');
INSERT INTO `g_log` VALUES (9, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:26');
INSERT INTO `g_log` VALUES (10, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (11, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (12, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (13, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (14, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (15, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (16, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:27');
INSERT INTO `g_log` VALUES (17, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:28');
INSERT INTO `g_log` VALUES (18, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:28');
INSERT INTO `g_log` VALUES (19, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:28');
INSERT INTO `g_log` VALUES (20, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:28');
INSERT INTO `g_log` VALUES (21, '土豆', '新增', '新增了一条数据', '王晨', '2022-04-02 08:35:28');
INSERT INTO `g_log` VALUES (24, '大葱', '新增', '新增了一条数据', '小晨', '2022-04-02 09:10:18');
INSERT INTO `g_log` VALUES (25, '大葱', '新增', '新增了一条数据', '小晨', '2022-04-02 09:10:19');
INSERT INTO `g_log` VALUES (26, '大葱', '新增', '新增了一条数据', '小晨', '2022-04-02 09:10:20');
INSERT INTO `g_log` VALUES (27, '大葱', '新增', '新增了一条数据', '小晨', '2022-04-02 09:10:20');

-- ----------------------------
-- Table structure for g_purchase
-- ----------------------------
DROP TABLE IF EXISTS `g_purchase`;
CREATE TABLE `g_purchase`  (
  `gp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gp_admin` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'admin' COMMENT '管理员名字',
  `gp_gname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物资名称',
  `gp_count` int(11) NULL DEFAULT NULL COMMENT '采购数量',
  `gp_unit` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单位',
  `gp_money` decimal(32, 8) NULL DEFAULT NULL COMMENT '花费金额',
  `gp_time` datetime NULL DEFAULT NULL COMMENT '日期',
  `gp_state` int(11) NULL DEFAULT 1 COMMENT '状态 表示这条数据是否有效，默认为1有效',
  `gp_tid` int(11) NULL DEFAULT NULL COMMENT '物资类型',
  PRIMARY KEY (`gp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = ' ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of g_purchase
-- ----------------------------
INSERT INTO `g_purchase` VALUES (1, '王晨', '小萝卜蛋', 100, '斤', 2233.00000000, '2022-04-01 14:31:50', 1, 1);
INSERT INTO `g_purchase` VALUES (5, '王晨', '毛巾', 2001, '条', 1231233.00000000, '2022-04-01 15:48:45', 1, 1);
INSERT INTO `g_purchase` VALUES (6, '王晨', '羽毛球', 100, '个', 6666.00000000, '2022-04-04 16:10:18', 1, 1);
INSERT INTO `g_purchase` VALUES (7, '王晨', '羽毛球', 100, '个', 6666.00000000, '2022-04-04 16:29:34', 1, 1);
INSERT INTO `g_purchase` VALUES (8, '王晨', '网球', 100, '个', 1231233.00000000, '2022-04-04 16:31:56', 1, 1);
INSERT INTO `g_purchase` VALUES (9, '王晨', '小黑蛋', 200, '个', 2233.00000000, '2022-04-04 16:34:36', 1, 1);
INSERT INTO `g_purchase` VALUES (10, '王晨', '法拉利', 100, '辆', 999999.00000000, '2022-04-04 16:38:08', 1, 1);
INSERT INTO `g_purchase` VALUES (11, '王晨', '兰博基尼', 100, '辆', 99999.00000000, '2022-04-04 16:39:21', 1, 2);
INSERT INTO `g_purchase` VALUES (12, '王晨', '绿茶', 100, '瓶', 8888.00000000, '2022-04-04 16:41:19', 1, 2);
INSERT INTO `g_purchase` VALUES (13, '王晨', '绿茶', 100, '瓶', 1231233.00000000, '2022-04-04 16:42:05', 1, 2);
INSERT INTO `g_purchase` VALUES (14, '王晨', '小黑蛋', 100, '辆', 123123.00000000, '2022-04-05 08:11:45', 1, 2);
INSERT INTO `g_purchase` VALUES (15, '王晨', '小黑蛋', 99999, '辆', 1231233.00000000, '2022-04-05 08:12:13', 1, 2);

-- ----------------------------
-- Table structure for t_heatlth
-- ----------------------------
DROP TABLE IF EXISTS `t_heatlth`;
CREATE TABLE `t_heatlth`  (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '健康信息id',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户的id',
  `plcondition` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身体状况',
  `seltemp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '体温自查',
  `seltemptime` datetime NULL DEFAULT NULL COMMENT '体温自查时间',
  `bytemptime` datetime NULL DEFAULT NULL COMMENT '体温被查时间',
  `bytemp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '体温被查',
  `aid` int(11) NULL DEFAULT NULL COMMENT '体温被哪个管理员查的',
  `flag` int(11) NULL DEFAULT NULL COMMENT '1正常,2关注,3被隔离',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 226 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '居民健康表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_heatlth
-- ----------------------------
INSERT INTO `t_heatlth` VALUES (1, 225, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (2, 226, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (3, 227, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (4, 228, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (5, 229, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (6, 230, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (7, 231, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (8, 232, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (9, 233, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (10, 234, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (11, 235, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (12, 236, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (18, 237, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8', 3, 1);
INSERT INTO `t_heatlth` VALUES (19, 238, '良好', '36.9度', '2022-04-04 12:45:55', '2022-04-04 12:46:07', '36.8', 1, 1);
INSERT INTO `t_heatlth` VALUES (20, 239, '良好', '36.9度', '2022-04-04 12:45:55', '2022-04-04 12:46:07', '36.8', 1, 1);
INSERT INTO `t_heatlth` VALUES (21, 240, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8', 1, 1);
INSERT INTO `t_heatlth` VALUES (25, 241, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (26, 242, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (27, 243, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (28, 244, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (29, 245, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (30, 246, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (31, 247, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (32, 248, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (33, 249, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (34, 250, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (35, 251, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (36, 252, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (37, 253, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (38, 254, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (39, 255, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (40, 256, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (41, 257, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (42, 258, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (43, 259, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (44, 260, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (45, 261, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (46, 262, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (47, 263, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (48, 264, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (49, 265, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (50, 266, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (51, 267, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (52, 268, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (53, 269, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (54, 270, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (55, 271, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (56, 272, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (57, 273, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (58, 274, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (59, 275, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (60, 276, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (61, 277, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (62, 278, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (63, 279, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (64, 280, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (65, 281, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (66, 282, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (67, 283, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (68, 284, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (69, 285, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (70, 286, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (71, 287, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (72, 288, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (73, 289, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (74, 290, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (75, 291, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (76, 292, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (77, 293, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (78, 294, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (79, 295, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (80, 296, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (81, 297, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (82, 298, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (83, 299, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (84, 300, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (85, 301, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (86, 302, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (87, 303, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (88, 304, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (89, 305, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (90, 306, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (91, 307, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (92, 308, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (93, 309, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (94, 310, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (95, 311, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (96, 312, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (97, 313, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (98, 314, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (99, 315, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (100, 316, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (101, 317, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (102, 318, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (103, 319, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (104, 320, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (105, 321, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (106, 322, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (107, 323, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (108, 324, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (109, 325, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (110, 326, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (111, 327, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (112, 328, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (113, 329, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (114, 330, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (115, 331, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (116, 332, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 4, 1);
INSERT INTO `t_heatlth` VALUES (117, 333, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (118, 334, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (119, 335, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (120, 336, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (121, 337, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 2);
INSERT INTO `t_heatlth` VALUES (122, 338, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 2);
INSERT INTO `t_heatlth` VALUES (123, 339, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (124, 340, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (125, 341, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (126, 342, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (127, 343, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 4, 1);
INSERT INTO `t_heatlth` VALUES (128, 344, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (129, 345, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (130, 346, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 4, 1);
INSERT INTO `t_heatlth` VALUES (131, 347, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (132, 348, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (133, 349, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (134, 350, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (135, 351, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (136, 352, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (137, 353, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (138, 354, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (139, 355, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (140, 356, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (141, 357, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (142, 358, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (143, 359, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (144, 360, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (145, 361, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (146, 362, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (147, 363, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (148, 364, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 2);
INSERT INTO `t_heatlth` VALUES (149, 365, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (150, 366, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (151, 367, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (152, 368, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (153, 369, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (154, 370, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (155, 371, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 4, 1);
INSERT INTO `t_heatlth` VALUES (156, 372, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (157, 373, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (158, 374, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 2);
INSERT INTO `t_heatlth` VALUES (159, 375, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (160, 376, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (161, 377, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 2);
INSERT INTO `t_heatlth` VALUES (162, 378, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (163, 379, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 4, 1);
INSERT INTO `t_heatlth` VALUES (164, 380, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (165, 381, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (166, 382, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (167, 383, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (168, 384, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (169, 385, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (170, 386, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (171, 387, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (172, 388, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (173, 389, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (174, 390, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (175, 391, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (176, 392, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (177, 393, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (178, 394, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (179, 395, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (180, 396, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (181, 397, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (182, 398, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (183, 399, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (184, 400, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (185, 401, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (186, 402, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (187, 403, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (188, 404, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (189, 405, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (190, 406, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (191, 407, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (192, 408, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (193, 409, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (194, 410, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (195, 411, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (196, 412, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (197, 413, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (198, 414, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (199, 415, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (200, 416, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (201, 417, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (202, 418, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (203, 419, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (204, 420, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (205, 421, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (206, 422, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (207, 423, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (208, 424, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (209, 425, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (210, 426, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (211, 427, '还行', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (212, 428, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (213, 429, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (214, 212, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (215, 213, '良好', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (216, 214, '良好', '36.9度', '2022-04-04 00:00:00', '2022-04-04 00:00:00', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (217, 215, '良好', '36.7度', '2022-03-30 00:00:00', '2022-03-30 00:00:00', '36.9度', 3, 1);
INSERT INTO `t_heatlth` VALUES (218, 216, '还行', '36.8度', '2022-04-01 15:50:36', '2022-04-01 15:50:38', '37.0度', 1, 1);
INSERT INTO `t_heatlth` VALUES (219, 217, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 1);
INSERT INTO `t_heatlth` VALUES (220, 218, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (221, 219, '还行', '36.9度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 3, 1);
INSERT INTO `t_heatlth` VALUES (222, 220, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 2, 2);
INSERT INTO `t_heatlth` VALUES (223, 221, '良好', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 2);
INSERT INTO `t_heatlth` VALUES (224, 222, '还行', '36.8度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);
INSERT INTO `t_heatlth` VALUES (225, 223, '良好', '36.7度', '2022-04-01 15:51:00', '2022-04-01 15:51:02', '36.8度', 1, 1);

-- ----------------------------
-- Table structure for t_isolate
-- ----------------------------
DROP TABLE IF EXISTS `t_isolate`;
CREATE TABLE `t_isolate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '居家隔离表id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民性名',
  `isoSure` datetime NULL DEFAULT NULL COMMENT '隔离起始时间确认',
  `isoStart` datetime NULL DEFAULT NULL COMMENT '居家隔离开始',
  `isoEnd` datetime NULL DEFAULT NULL COMMENT '居家隔离结束',
  `isoTotal` int(11) NULL DEFAULT NULL COMMENT '居家隔离时长',
  `flag` int(11) NULL DEFAULT NULL COMMENT '状态1正常,2带走',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '居家隔离表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_isolate
-- ----------------------------
INSERT INTO `t_isolate` VALUES (1, '张三', '2022-04-01 21:44:48', '2022-04-01 21:44:52', '2022-04-15 21:44:58', 14, 1);
INSERT INTO `t_isolate` VALUES (19, '泰式按摩', '2022-04-04 17:17:23', '2022-04-04 17:17:26', '2022-04-04 17:17:30', 14, 1);
INSERT INTO `t_isolate` VALUES (20, '张浩', '2022-04-01 00:00:00', '2022-04-04 17:17:32', '2022-04-18 17:17:35', 14, 1);
INSERT INTO `t_isolate` VALUES (21, '张三', '2022-04-01 00:00:00', '2022-04-01 00:00:00', '2022-04-15 00:00:00', 14, 1);
INSERT INTO `t_isolate` VALUES (22, '李四', '2022-04-01 00:00:00', '2022-04-01 00:00:00', '2022-04-15 00:00:00', 14, 1);
INSERT INTO `t_isolate` VALUES (23, '王五', '2022-04-01 00:00:00', '2022-04-01 00:00:00', '2022-04-16 00:00:00', 14, 1);
INSERT INTO `t_isolate` VALUES (24, '赵六', '2022-04-01 00:00:00', '2022-04-01 00:00:00', '2022-04-17 00:00:00', 14, 1);
INSERT INTO `t_isolate` VALUES (25, '关鹏涛', '2022-04-01 21:44:48', '2022-04-01 21:44:52', '2022-04-15 21:44:58', 14, 1);

-- ----------------------------
-- Table structure for t_nucleate
-- ----------------------------
DROP TABLE IF EXISTS `t_nucleate`;
CREATE TABLE `t_nucleate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号id',
  `uId` int(11) NULL DEFAULT NULL COMMENT 'uid',
  `collectTime` datetime NULL DEFAULT NULL COMMENT '采样时间',
  `testTime` datetime NULL DEFAULT NULL COMMENT '检测时间',
  `result` int(11) NULL DEFAULT NULL COMMENT '加测结果,1为阴,2为阳',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '核酸统计' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_nucleate
-- ----------------------------
INSERT INTO `t_nucleate` VALUES (1, 287, '2022-04-05 16:05:38', '2022-04-05 17:05:51', 1, '2022-04-05 16:05:58');
INSERT INTO `t_nucleate` VALUES (2, 288, '2022-04-05 16:05:38', '2022-04-05 17:05:51', 1, '2022-04-05 16:05:58');
INSERT INTO `t_nucleate` VALUES (3, 289, '2022-04-05 16:05:38', '2022-04-05 17:05:51', 1, '2022-04-05 16:05:58');
INSERT INTO `t_nucleate` VALUES (4, 287, '2022-04-05 16:05:38', '2022-04-05 17:05:51', 1, '2022-04-05 16:05:58');
INSERT INTO `t_nucleate` VALUES (17, 228, '2022-04-05 17:52:04', '2022-04-05 17:52:05', 1, '2022-04-05 09:52:06');

-- ----------------------------
-- Table structure for t_otherLocus
-- ----------------------------
DROP TABLE IF EXISTS `t_otherLocus`;
CREATE TABLE `t_otherLocus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '其他轨迹信息id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民性名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民手机号',
  `reside` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有中高风险地区居住史(地区)',
  `contacPeo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否接触过类似症状的人(描述)',
  `contactAni` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有野生动物接触史',
  `contactMar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有农贸市场活动市',
  `flag` int(11) NULL DEFAULT NULL COMMENT '标记1正常,2危险',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '其他轨迹信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_otherLocus
-- ----------------------------
INSERT INTO `t_otherLocus` VALUES (1, '关鹏涛', '123456', '无', '无', '无', '无', 1, '2022-04-02 07:07:35');
INSERT INTO `t_otherLocus` VALUES (2, 'gaj', '123456', '无', '无', '无', '无', 1, '2022-04-02 07:08:06');
INSERT INTO `t_otherLocus` VALUES (3, '张浩', '147852', '无', '无', '无', '无', 1, '2022-04-02 07:15:11');
INSERT INTO `t_otherLocus` VALUES (6, '小香', '123456', '无', '无', '无', '无', 1, '2022-04-02 07:15:34');
INSERT INTO `t_otherLocus` VALUES (7, '段奚瑶', '17127867619', '无', '无', '无', '2', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (8, '顾灵槐', '13141139675', '无', '无', '无', '3', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (9, '后心悦', '17508905683', '无', '无', '无', '4', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (10, '钟问柳', '15696060762', '无', '无', '无', '5', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (11, '石惠芳', '16520411075', '无', '无', '无', '6', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (12, '养清一', '15360510776', '无', '无', '无', '7', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (13, '熊清奇', '14838338394', '无', '无', '无', '8', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (14, '党怿悦', '16500081253', '无', '无', '无', '9', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (15, '孟静逸', '17875363970', '无', '无', '无', '10', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (16, '曹春桃', '19942816131', '无', '无', '无', '11', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (17, '陈井色', '13336683453', '无', '无', '无', '12', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (18, '晃怜南', '18926886803', '无', '无', '无', '13', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (19, '傅斯文', '13344332145', '无', '无', '无', '14', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (20, '吕品韵', '15543484472', '无', '无', '无', '15', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (21, '濮倩冰', '14843195801', '无', '无', '无', '16', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (22, '惠乃欣', '17072210195', '无', '无', '无', '17', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (23, '卢如曼', '13131695962', '无', '无', '无', '18', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (24, '容霞姝', '17870207251', '无', '无', '无', '19', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (25, '鱼芝兰', '17850142528', '无', '无', '无', '20', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (26, '广玲娇', '15706313623', '无', '无', '无', '21', 1, '2022-04-04 09:19:41');
INSERT INTO `t_otherLocus` VALUES (27, '鱼真兰', '17509078612', '无', '无', '无', '22', 1, '2022-04-04 09:19:41');

-- ----------------------------
-- Table structure for t_ownHealth
-- ----------------------------
DROP TABLE IF EXISTS `t_ownHealth`;
CREATE TABLE `t_ownHealth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `temp` decimal(24, 1) NULL DEFAULT NULL COMMENT '体温',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_ownHealth
-- ----------------------------
INSERT INTO `t_ownHealth` VALUES (1, 238, 36.8, '2022-04-04 15:32:20', '1');
INSERT INTO `t_ownHealth` VALUES (2, 239, 36.8, '2022-04-04 15:36:41', '1');
INSERT INTO `t_ownHealth` VALUES (3, 238, 36.8, '2022-04-04 16:14:31', '1');
INSERT INTO `t_ownHealth` VALUES (4, 1, 36.0, '2022-04-04 16:22:45', '1');
INSERT INTO `t_ownHealth` VALUES (5, 296, 2.0, '2022-04-05 15:00:08', '1');

-- ----------------------------
-- Table structure for t_path
-- ----------------------------
DROP TABLE IF EXISTS `t_path`;
CREATE TABLE `t_path`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '路径id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民性名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `outLocation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出发地',
  `goTime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出发时间',
  `transport` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交通方式',
  `cardId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车牌号/火车班次',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 451 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '来此地的路径信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_path
-- ----------------------------
INSERT INTO `t_path` VALUES (250, '毛依柔', '15932824791', '河南安阳滑县', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (251, '符莎莉', '18243386491', '河北适当的', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (252, '丁平蝶', '15178045573', '北京朝阳区', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (253, '祖小萱', '18715865183', '广东三头', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (254, '衡初雪', '13670022133', '河南开封', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (255, '牛元冬', '18272756414', '河南安阳滑县', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (256, '濮竹韵', '18252372761', '河北适当的', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (257, '邴米莱', '14730182295', '北京朝阳区', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (258, '宁闲静', '14743939569', '广东三头', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (259, '董忆秋', '13491027563', '河南开封', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (260, '怀秋荷', '13715955534', '河南安阳滑县', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (261, '雍平晓', '17204365665', '河北适当的', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (262, '家碧菡', '18282597129', '北京朝阳区', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (263, '邹妙可', '18302278723', '广东三头', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (264, '步幻桃', '18752215775', '河南开封', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (265, '罗从波', '17865648846', '河南安阳滑县', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (266, '班步美', '14794858726', '河北适当的', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (267, '晏冰蓝', '14741622478', '北京朝阳区', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (268, '邓芬璇', '15191042388', '广东三头', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (269, '巢恬欣', '18399382553', '河南开封', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (270, '宋访云', '13440196021', '河南安阳滑县', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (271, '毋畅然', '13747013824', '河北适当的', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (272, '古恬默', '13646649945', '北京朝阳区', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (273, '符天巧', '15285188642', '广东三头', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (274, '姜燕星', '13599361688', '河南开封', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (275, '隆惠然', '19801037591', '河南安阳滑县', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (276, '孟尔容', '15140891706', '河北适当的', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (277, '牛晗雨', '18722828893', '北京朝阳区', '2022-04-03', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (278, '庾知世', '17846334820', '广东三头', '2022-04-04', '高铁', 'G611', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (279, '简瑾琳', '18369015321', '河南开封', '2022-04-05', '高铁', 'G612', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (280, '魏夏蓉', '13603903078', '河南安阳滑县', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (281, '谭丹珍', '15078798641', '河北适当的', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (282, '印子蕙', '18465359689', '北京朝阳区', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (283, '袁问旋', '13750991160', '广东三头', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (284, '夏清奇', '17872665508', '河南开封', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (285, '孟慧婕', '15139349964', '河南安阳滑县', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (286, '宰谷波', '18234606556', '河北适当的', '无', '无', '无', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (287, '武凝蝶', '17841333823', '北京朝阳区', NULL, '私家车', '豫Q305A3', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (288, '孙丹烟', '15125022524', '广东三头', '2022-04-02', '飞机', 'aa', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (289, '蔚沛柔', '13920772931', '河南开封', '2022-04-02', '高铁', 'G610', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (290, '刘滢滢', '15180057710', '河南安阳滑县', '2022-04-02', '飞机', 'aa', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (291, '庾从霜', '15850916035', '河北适当的', '2022-04-02', '飞机', 'aa', '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (292, '周禾悦', '15185771030', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (293, '郏依珊', '13764864162', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (294, '向晓彤', '15224914287', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (295, '甄怀萍', '15872455721', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (296, '那田田', '15702392253', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (297, '厉钰彤', '13744767577', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (298, '欧永琴', '13870229479', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (299, '空恨寒', '17843011693', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (300, '崔雅唱', '15962966403', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (301, '印寒梅', '13711234527', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (302, '聂静香', '13604111554', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (303, '红含双', '17861999634', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (304, '阙寒香', '15188353413', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (305, '马忆之', '15221719430', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (306, '姚杨柳', '18293047922', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (307, '相安露', '13497146264', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (308, '林梓云', '18760077500', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (309, '国恨真', '13669494815', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (310, '钭天蓝', '14799129974', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (311, '高迷伤', '18260131308', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (312, '敖琬莹', '13469865210', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (313, '广映天', '15257555882', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (314, '古孤云', '15702853656', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (315, '姚言心', '16504475731', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (316, '顾嘉惠', '13584891553', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (317, '束问雁', '13544451324', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (318, '钟湛恩', '17878887481', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (319, '高映秋', '18781872875', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (320, '尹代真', '16507592379', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (321, '许小莉', '15190277364', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (322, '车幼丝', '15745035265', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (323, '勾斯玉', '18873565087', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (324, '乜端懿', '13898916059', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (325, '郜静槐', '13613381722', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (326, '郭瑞彩', '18315536842', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (327, '陈方仪', '14785089353', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (328, '国静槐', '13947925053', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (329, '余恬悦', '15881997067', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (330, '高棠莉', '18839628906', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (331, '弘慧月', '15169489892', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (332, '郑陈红', '15878496715', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (333, '汲笛韵', '17295393894', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (334, '利琳竣', '15882962811', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (335, '终千易', '18734994838', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (336, '钭瑶琴', '18354849393', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (337, '段灵凡', '18422144775', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (338, '何谷波', '18496867232', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (339, '白依丝', '18485724494', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (340, '容彗云', '13568368476', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (341, '班生文', '18370845890', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (342, '慕怜翠', '18203537608', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (343, '厍若美', '18465565600', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (344, '浦幻香', '18295884397', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (345, '衡梦蕾', '15023996080', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (346, '甄宵月', '15884959437', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (347, '毛莞然', '15917818239', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (348, '麴云亭', '15006069716', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (349, '曹代柔', '18307814921', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (350, '宫齐心', '16501070459', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (351, '彭端敏', '16500070459', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (352, '边喜儿', '13139578956', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (353, '龚天巧', '13343396355', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (354, '朱娅童', '15805216197', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (355, '阚雁易', '15778489278', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (356, '怀梓云', '14838441757', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (357, '养含文', '18619487141', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (358, '仰听南', '13822164454', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (359, '幸清莹', '13349514969', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (360, '程霞辉', '16500033678', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (361, '白香菱', '19803180031', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (362, '何千城', '17509164638', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (363, '晏雅彤', '18927287138', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (364, '汪婷雯', '14843174902', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (365, '冉郁蓝', '13140813345', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (366, '祖文静', '15805260494', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (367, '吴兰月', '15810387098', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (368, '索思敏', '18601749800', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (369, '殳洛妃', '13138413782', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (370, '邹瑜文', '15794228585', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (371, '郭月桂', '13713177300', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (372, '卢霓云', '15012578677', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (373, '家山雁', '19393611701', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (374, '段飞兰', '19835222881', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (375, '汲凝安', '17871048599', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (376, '马今歌', '17871975572', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (377, '桓采珊', '19808192854', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (378, '扈丽姝', '17875156633', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (379, '王晓梅', '13679810058', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (380, '高如雪', '17077961032', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (381, '石燕萍', '18926651501', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (382, '辛玲丽', '13819644602', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (383, '秦厦洁', '13819654371', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (384, '陆妙菡', '17509182539', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (385, '扶盼柳', '19941530234', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (386, '宓彦红', '19390423235', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (387, '戌秦澈', '13329114736', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (388, '郜孟夏', '19921951186', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (389, '那柔蔓', '17848828366', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (390, '周念巧', '17508930732', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (391, '戌真一', '13724547693', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (392, '庄灵波', '18619479075', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (393, '郭义文', '13349453819', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (394, '曾思思', '13020521284', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (395, '金暖梦', '17870999004', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (396, '冉彩萱', '13720135859', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (397, '边姗婷', '17134359829', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (398, '欧慕梅', '17074773434', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (399, '欧芮欢', '17850283126', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (400, '潘真茹', '18609107710', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (401, '郜雁凡', '16531064812', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (402, '怀思菱', '16683917849', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (403, '浦颖馨', '13937006646', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (404, '贡依白', '15018116416', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (405, '沃娴雅', '13007717646', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (406, '程静曼', '15018202398', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (407, '巴智敏', '17841776170', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (408, '富蒙雨', '13819266498', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (409, '宫雁风', '17850030290', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (410, '怀心语', '15303570719', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (411, '班小霜', '17509284776', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (412, '权燕岚', '13819241453', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (413, '萧芳懿', '18619368275', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (414, '邴凌蝶', '13348987743', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (415, '易谷玉', '17121145575', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (416, '简妍凌', '17120671283', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (417, '越谷枫', '13656065223', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (418, '王雅爱', '19895184127', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (419, '彭怜阳', '17844986222', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (420, '游皓洁', '17074797319', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (421, '巢碧凡', '18619840421', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (422, '籍幼南', '18619827829', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (423, '林以菱', '17077364843', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (424, '汤洛灵', '19950684469', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (425, '方和悦', '13020910156', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (426, '庄天媛', '13348193985', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (427, '郝梦旋', '17509262781', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (428, '屠浩文', '19882566829', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (429, '申心菱', '13819660596', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (430, '段奚瑶', '17127867619', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (431, '顾灵槐', '13141139675', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (432, '后心悦', '17508905683', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (433, '钟问柳', '15696060762', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (434, '石惠芳', '16520411075', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (435, '养清一', '15360510776', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (436, '熊清奇', '14838338394', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (437, '党怿悦', '16500081253', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (438, '孟静逸', '17875363970', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (439, '曹春桃', '19942816131', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (440, '陈井色', '13336683453', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (441, '晃怜南', '18926886803', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (442, '傅斯文', '13344332145', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (443, '吕品韵', '15543484472', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (444, '濮倩冰', '14843195801', '河南开封', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (445, '惠乃欣', '17072210195', '河南安阳滑县', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (446, '卢如曼', '13131695962', '河北适当的', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (447, '容霞姝', '17870207251', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (448, '鱼芝兰', '17850142528', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (449, '广玲娇', '15706313623', '北京朝阳区', NULL, NULL, NULL, '2022-04-04 09:28:53');
INSERT INTO `t_path` VALUES (450, '鱼真兰', '17509078612', '广东三头', NULL, NULL, NULL, '2022-04-04 09:28:53');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '居民id',
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民性名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民账号密码',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居民手机号',
  `idcard` bigint(18) NOT NULL COMMENT '居民身份证号',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `sex` int(11) NULL DEFAULT NULL COMMENT '性别',
  `origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '住址',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `flag` int(11) NULL DEFAULT NULL COMMENT '状态 1为在住,2为不在住',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 441 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '居民信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (225, '李四', 'WK7fBfOkcLPNkIBQN6I1qQ==', '123464', 10000016, 45, 1, '河南省临走时', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (226, '小香', 'Tb7t1uWWAWHIglsLWSph+w==', '123465', 10000017, 18, 2, '河南省郑州市二七区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (227, '玊博', 'NI95jzgy1GhEz18FXeCS/g==', '123466', 10000018, 34, 1, '河南上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (228, '关鹏涛', 'Q342xYn/RSbuVYW/TQbgAg==', '123467', 10000019, 24, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (229, '毛依柔', 'Q342xYn/RSbuVYW/TQbgAg==', '15932824791', 10000020, 19, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (230, '符莎莉', 'Q342xYn/RSbuVYW/TQbgAg==', '18243386491', 10000021, 30, 1, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (231, '丁平蝶', 'Q342xYn/RSbuVYW/TQbgAg==', '15178045573', 10000022, 49, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (232, '祖小萱', 'Q342xYn/RSbuVYW/TQbgAg==', '18715865183', 10000023, 33, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (233, '衡初雪', 'Q342xYn/RSbuVYW/TQbgAg==', '13670022133', 10000024, 41, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (234, '牛元冬', 'Q342xYn/RSbuVYW/TQbgAg==', '18272756414', 10000025, 54, 1, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (235, '濮竹韵', 'Q342xYn/RSbuVYW/TQbgAg==', '18252372761', 10000026, 26, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (236, '邴米莱', 'Q342xYn/RSbuVYW/TQbgAg==', '14730182295', 10000027, 25, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (237, '宁闲静', 'Q342xYn/RSbuVYW/TQbgAg==', '14743939569', 10000028, 18, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (238, '董忆秋', 'Q342xYn/RSbuVYW/TQbgAg==', '13491027563', 10000029, 36, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (239, '怀秋荷', 'Q342xYn/RSbuVYW/TQbgAg==', '13715955534', 10000030, 51, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (240, '雍平晓', 'Q342xYn/RSbuVYW/TQbgAg==', '17204365665', 10000031, 29, 1, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (241, '家碧菡', 'Q342xYn/RSbuVYW/TQbgAg==', '18282597129', 10000032, 60, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (242, '邹妙可', 'Q342xYn/RSbuVYW/TQbgAg==', '18302278723', 10000033, 25, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (243, '步幻桃', 'Q342xYn/RSbuVYW/TQbgAg==', '18752215775', 10000034, 36, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (244, '罗从波', 'Q342xYn/RSbuVYW/TQbgAg==', '17865648846', 10000035, 44, 2, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (245, '班步美', 'Q342xYn/RSbuVYW/TQbgAg==', '14794858726', 10000036, 48, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (246, '晏冰蓝', 'Q342xYn/RSbuVYW/TQbgAg==', '14741622478', 10000037, 30, 2, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (247, '邓芬璇', 'Q342xYn/RSbuVYW/TQbgAg==', '15191042388', 10000038, 21, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (248, '巢恬欣', 'Q342xYn/RSbuVYW/TQbgAg==', '18399382553', 10000039, 54, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (249, '宋访云', 'Q342xYn/RSbuVYW/TQbgAg==', '13440196021', 10000040, 25, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (250, '毋畅然', 'Q342xYn/RSbuVYW/TQbgAg==', '13747013824', 10000041, 30, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (251, '古恬默', 'Q342xYn/RSbuVYW/TQbgAg==', '13646649945', 10000042, 28, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (252, '符天巧', 'Q342xYn/RSbuVYW/TQbgAg==', '15285188642', 10000043, 15, 2, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (253, '姜燕星', 'Q342xYn/RSbuVYW/TQbgAg==', '13599361688', 10000044, 53, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (254, '隆惠然', 'Q342xYn/RSbuVYW/TQbgAg==', '19801037591', 10000045, 26, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (255, '孟尔容', 'Q342xYn/RSbuVYW/TQbgAg==', '15140891706', 10000046, 53, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (256, '牛晗雨', 'Q342xYn/RSbuVYW/TQbgAg==', '18722828893', 10000047, 45, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (257, '庾知世', 'Q342xYn/RSbuVYW/TQbgAg==', '17846334820', 10000048, 28, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (258, '简瑾琳', 'Q342xYn/RSbuVYW/TQbgAg==', '18369015321', 10000049, 48, 2, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (259, '魏夏蓉', 'Q342xYn/RSbuVYW/TQbgAg==', '13603903078', 10000050, 36, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (260, '谭丹珍', 'Q342xYn/RSbuVYW/TQbgAg==', '15078798641', 10000051, 51, 1, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (261, '印子蕙', 'Q342xYn/RSbuVYW/TQbgAg==', '18465359689', 10000052, 52, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (262, '袁问旋', 'Q342xYn/RSbuVYW/TQbgAg==', '13750991160', 10000053, 38, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (263, '夏清奇', 'Q342xYn/RSbuVYW/TQbgAg==', '17872665508', 10000054, 60, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (264, '孟慧婕', 'Q342xYn/RSbuVYW/TQbgAg==', '15139349964', 10000055, 45, 1, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (265, '宰谷波', 'Q342xYn/RSbuVYW/TQbgAg==', '18234606556', 10000056, 45, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (266, '武凝蝶', 'Q342xYn/RSbuVYW/TQbgAg==', '17841333823', 10000057, 31, 1, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (267, '孙丹烟', 'Q342xYn/RSbuVYW/TQbgAg==', '15125022524', 10000058, 21, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (268, '蔚沛柔', 'Q342xYn/RSbuVYW/TQbgAg==', '13920772931', 10000059, 42, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (269, '刘滢滢', 'Q342xYn/RSbuVYW/TQbgAg==', '15180057710', 10000060, 56, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (270, '庾从霜', 'Q342xYn/RSbuVYW/TQbgAg==', '15850916035', 10000061, 54, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (271, '周禾悦', 'Q342xYn/RSbuVYW/TQbgAg==', '15185771030', 10000062, 59, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (272, '郏依珊', 'Q342xYn/RSbuVYW/TQbgAg==', '13764864162', 10000063, 38, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (273, '向晓彤', 'Q342xYn/RSbuVYW/TQbgAg==', '15224914287', 10000064, 58, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (274, '甄怀萍', 'Q342xYn/RSbuVYW/TQbgAg==', '15872455721', 10000065, 47, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (275, '那田田', 'Q342xYn/RSbuVYW/TQbgAg==', '15702392253', 10000066, 42, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (276, '厉钰彤', 'Q342xYn/RSbuVYW/TQbgAg==', '13744767577', 10000067, 44, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (277, '欧永琴', 'Q342xYn/RSbuVYW/TQbgAg==', '13870229479', 10000068, 34, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (278, '空恨寒', 'Q342xYn/RSbuVYW/TQbgAg==', '17843011693', 10000069, 28, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (279, '崔雅唱', 'Q342xYn/RSbuVYW/TQbgAg==', '15962966403', 10000070, 29, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (280, '印寒梅', 'Q342xYn/RSbuVYW/TQbgAg==', '13711234527', 10000071, 60, 2, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (281, '聂静香', 'Q342xYn/RSbuVYW/TQbgAg==', '13604111554', 10000072, 25, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (282, '红含双', 'Q342xYn/RSbuVYW/TQbgAg==', '17861999634', 10000073, 43, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (283, '阙寒香', 'Q342xYn/RSbuVYW/TQbgAg==', '15188353413', 10000074, 22, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (284, '马忆之', 'Q342xYn/RSbuVYW/TQbgAg==', '15221719430', 10000075, 37, 1, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (285, '姚杨柳', 'Q342xYn/RSbuVYW/TQbgAg==', '18293047922', 10000076, 54, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (286, '相安露', 'Q342xYn/RSbuVYW/TQbgAg==', '13497146264', 10000077, 58, 2, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (287, '林梓云', 'Q342xYn/RSbuVYW/TQbgAg==', '18760077500', 10000078, 52, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (288, '国恨真', 'Q342xYn/RSbuVYW/TQbgAg==', '13669494815', 10000079, 32, 2, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (289, '钭天蓝', 'Q342xYn/RSbuVYW/TQbgAg==', '14799129974', 10000080, 15, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (290, '高迷伤', 'Q342xYn/RSbuVYW/TQbgAg==', '18260131308', 10000081, 47, 1, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (291, '敖琬莹', 'Q342xYn/RSbuVYW/TQbgAg==', '13469865210', 10000082, 37, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (292, '广映天', 'Q342xYn/RSbuVYW/TQbgAg==', '15257555882', 10000083, 21, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (293, '古孤云', 'Q342xYn/RSbuVYW/TQbgAg==', '15702853656', 10000084, 48, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (294, '姚言心', 'Q342xYn/RSbuVYW/TQbgAg==', '16504475731', 10000085, 22, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (295, '顾嘉惠', 'Q342xYn/RSbuVYW/TQbgAg==', '13584891553', 10000086, 56, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (296, '束问雁', 'Q342xYn/RSbuVYW/TQbgAg==', '13544451324', 10000087, 53, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (297, '钟湛恩', 'Q342xYn/RSbuVYW/TQbgAg==', '17878887481', 10000088, 26, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (298, '高映秋', 'Q342xYn/RSbuVYW/TQbgAg==', '18781872875', 10000089, 30, 2, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (299, '尹代真', 'Q342xYn/RSbuVYW/TQbgAg==', '16507592379', 10000090, 49, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (300, '许小莉', 'Q342xYn/RSbuVYW/TQbgAg==', '15190277364', 10000091, 18, 2, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (301, '车幼丝', 'Q342xYn/RSbuVYW/TQbgAg==', '15745035265', 10000092, 25, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (302, '勾斯玉', 'Q342xYn/RSbuVYW/TQbgAg==', '18873565087', 10000093, 53, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (303, '乜端懿', 'Q342xYn/RSbuVYW/TQbgAg==', '13898916059', 10000094, 18, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (304, '郜静槐', 'Q342xYn/RSbuVYW/TQbgAg==', '13613381722', 10000095, 49, 2, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (305, '郭瑞彩', 'Q342xYn/RSbuVYW/TQbgAg==', '18315536842', 10000096, 43, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (306, '陈方仪', 'Q342xYn/RSbuVYW/TQbgAg==', '14785089353', 10000097, 51, 1, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (307, '国静槐', 'Q342xYn/RSbuVYW/TQbgAg==', '13947925053', 10000098, 44, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (308, '余恬悦', 'Q342xYn/RSbuVYW/TQbgAg==', '15881997067', 10000099, 21, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (309, '高棠莉', 'Q342xYn/RSbuVYW/TQbgAg==', '18839628906', 10000100, 31, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (310, '弘慧月', 'Q342xYn/RSbuVYW/TQbgAg==', '15169489892', 10000101, 48, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (311, '郑陈红', 'Q342xYn/RSbuVYW/TQbgAg==', '15878496715', 10000102, 56, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (312, '汲笛韵', 'Q342xYn/RSbuVYW/TQbgAg==', '17295393894', 10000103, 23, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (313, '利琳竣', 'Q342xYn/RSbuVYW/TQbgAg==', '15882962811', 10000104, 47, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (314, '终千易', 'Q342xYn/RSbuVYW/TQbgAg==', '18734994838', 10000105, 59, 1, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (315, '钭瑶琴', 'Q342xYn/RSbuVYW/TQbgAg==', '18354849393', 10000106, 55, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (316, '段灵凡', 'Q342xYn/RSbuVYW/TQbgAg==', '18422144775', 10000107, 46, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (317, '何谷波', 'Q342xYn/RSbuVYW/TQbgAg==', '18496867232', 10000108, 24, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (318, '白依丝', 'Q342xYn/RSbuVYW/TQbgAg==', '18485724494', 10000109, 17, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (319, '容彗云', 'Q342xYn/RSbuVYW/TQbgAg==', '13568368476', 10000110, 20, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (320, '班生文', 'Q342xYn/RSbuVYW/TQbgAg==', '18370845890', 10000111, 40, 2, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (321, '慕怜翠', 'Q342xYn/RSbuVYW/TQbgAg==', '18203537608', 10000112, 17, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (322, '厍若美', 'Q342xYn/RSbuVYW/TQbgAg==', '18465565600', 10000113, 39, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (323, '浦幻香', 'Q342xYn/RSbuVYW/TQbgAg==', '18295884397', 10000114, 15, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (324, '衡梦蕾', 'Q342xYn/RSbuVYW/TQbgAg==', '15023996080', 10000115, 55, 2, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (325, '甄宵月', 'Q342xYn/RSbuVYW/TQbgAg==', '15884959437', 10000116, 18, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (326, '毛莞然', 'Q342xYn/RSbuVYW/TQbgAg==', '15917818239', 10000117, 19, 1, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (327, '麴云亭', 'Q342xYn/RSbuVYW/TQbgAg==', '15006069716', 10000118, 29, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (328, '曹代柔', 'Q342xYn/RSbuVYW/TQbgAg==', '18307814921', 10000119, 58, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (329, '宫齐心', 'Q342xYn/RSbuVYW/TQbgAg==', '16501070459', 10000120, 6, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (330, '彭端敏', 'Q342xYn/RSbuVYW/TQbgAg==', '16500070459', 10000121, 21, 1, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (331, '边喜儿', 'Q342xYn/RSbuVYW/TQbgAg==', '13139578956', 10000122, 34, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (332, '龚天巧', 'Q342xYn/RSbuVYW/TQbgAg==', '13343396355', 10000123, 18, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (333, '朱娅童', 'Q342xYn/RSbuVYW/TQbgAg==', '15805216197', 10000124, 17, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (334, '阚雁易', 'Q342xYn/RSbuVYW/TQbgAg==', '15778489278', 10000125, 10, 1, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (335, '怀梓云', 'Q342xYn/RSbuVYW/TQbgAg==', '14838441757', 10000126, 9, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (336, '养含文', 'Q342xYn/RSbuVYW/TQbgAg==', '18619487141', 10000127, 6, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (337, '仰听南', 'Q342xYn/RSbuVYW/TQbgAg==', '13822164454', 10000128, 20, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (338, '幸清莹', 'Q342xYn/RSbuVYW/TQbgAg==', '13349514969', 10000129, 39, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (339, '程霞辉', 'Q342xYn/RSbuVYW/TQbgAg==', '16500033678', 10000130, 29, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (340, '白香菱', 'Q342xYn/RSbuVYW/TQbgAg==', '19803180031', 10000131, 28, 1, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (341, '何千城', 'Q342xYn/RSbuVYW/TQbgAg==', '17509164638', 10000132, 13, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (342, '晏雅彤', 'Q342xYn/RSbuVYW/TQbgAg==', '18927287138', 10000133, 15, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (343, '汪婷雯', 'Q342xYn/RSbuVYW/TQbgAg==', '14843174902', 10000134, 39, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (344, '冉郁蓝', 'Q342xYn/RSbuVYW/TQbgAg==', '13140813345', 10000135, 21, 2, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (345, '祖文静', 'Q342xYn/RSbuVYW/TQbgAg==', '15805260494', 10000136, 21, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (346, '吴兰月', 'Q342xYn/RSbuVYW/TQbgAg==', '15810387098', 10000137, 12, 2, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (347, '索思敏', 'Q342xYn/RSbuVYW/TQbgAg==', '18601749800', 10000138, 16, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (348, '殳洛妃', 'Q342xYn/RSbuVYW/TQbgAg==', '13138413782', 10000139, 22, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (349, '邹瑜文', 'Q342xYn/RSbuVYW/TQbgAg==', '15794228585', 10000140, 25, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (350, '郭月桂', 'Q342xYn/RSbuVYW/TQbgAg==', '13713177300', 10000141, 16, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (351, '卢霓云', 'Q342xYn/RSbuVYW/TQbgAg==', '15012578677', 10000142, 6, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (352, '家山雁', 'Q342xYn/RSbuVYW/TQbgAg==', '19393611701', 10000143, 33, 2, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (353, '段飞兰', 'Q342xYn/RSbuVYW/TQbgAg==', '19835222881', 10000144, 6, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (354, '汲凝安', 'Q342xYn/RSbuVYW/TQbgAg==', '17871048599', 10000145, 2, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (355, '马今歌', 'Q342xYn/RSbuVYW/TQbgAg==', '17871975572', 10000146, 8, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (356, '桓采珊', 'Q342xYn/RSbuVYW/TQbgAg==', '19808192854', 10000147, 7, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (357, '扈丽姝', 'Q342xYn/RSbuVYW/TQbgAg==', '17875156633', 10000148, 29, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (358, '王晓梅', 'Q342xYn/RSbuVYW/TQbgAg==', '13679810058', 10000149, 13, 2, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (359, '高如雪', 'Q342xYn/RSbuVYW/TQbgAg==', '17077961032', 10000150, 13, 1, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (360, '石燕萍', 'Q342xYn/RSbuVYW/TQbgAg==', '18926651501', 10000151, 11, 1, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (361, '辛玲丽', 'Q342xYn/RSbuVYW/TQbgAg==', '13819644602', 10000152, 31, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (362, '秦厦洁', 'Q342xYn/RSbuVYW/TQbgAg==', '13819654371', 10000153, 25, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (363, '陆妙菡', 'Q342xYn/RSbuVYW/TQbgAg==', '17509182539', 10000154, 20, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (364, '扶盼柳', 'Q342xYn/RSbuVYW/TQbgAg==', '19941530234', 10000155, 6, 1, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (365, '宓彦红', 'Q342xYn/RSbuVYW/TQbgAg==', '19390423235', 10000156, 5, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (366, '戌秦澈', 'Q342xYn/RSbuVYW/TQbgAg==', '13329114736', 10000157, 7, 1, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (367, '郜孟夏', 'Q342xYn/RSbuVYW/TQbgAg==', '19921951186', 10000158, 29, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (368, '那柔蔓', 'Q342xYn/RSbuVYW/TQbgAg==', '17848828366', 10000159, 25, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (369, '周念巧', 'Q342xYn/RSbuVYW/TQbgAg==', '17508930732', 10000160, 22, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (370, '戌真一', 'Q342xYn/RSbuVYW/TQbgAg==', '13724547693', 10000161, 36, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (371, '庄灵波', 'Q342xYn/RSbuVYW/TQbgAg==', '18619479075', 10000162, 39, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (372, '郭义文', 'Q342xYn/RSbuVYW/TQbgAg==', '13349453819', 10000163, 25, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (373, '曾思思', 'Q342xYn/RSbuVYW/TQbgAg==', '13020521284', 10000164, 14, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (374, '金暖梦', 'Q342xYn/RSbuVYW/TQbgAg==', '17870999004', 10000165, 40, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (375, '冉彩萱', 'Q342xYn/RSbuVYW/TQbgAg==', '13720135859', 10000166, 36, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (376, '边姗婷', 'Q342xYn/RSbuVYW/TQbgAg==', '17134359829', 10000167, 22, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (377, '欧慕梅', 'Q342xYn/RSbuVYW/TQbgAg==', '17074773434', 10000168, 13, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (378, '欧芮欢', 'Q342xYn/RSbuVYW/TQbgAg==', '17850283126', 10000169, 29, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (379, '潘真茹', 'Q342xYn/RSbuVYW/TQbgAg==', '18609107710', 10000170, 7, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (380, '郜雁凡', 'Q342xYn/RSbuVYW/TQbgAg==', '16531064812', 10000171, 19, 2, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (381, '怀思菱', 'Q342xYn/RSbuVYW/TQbgAg==', '16683917849', 10000172, 38, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (382, '浦颖馨', 'Q342xYn/RSbuVYW/TQbgAg==', '13937006646', 10000173, 22, 2, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (383, '贡依白', 'Q342xYn/RSbuVYW/TQbgAg==', '15018116416', 10000174, 12, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (384, '沃娴雅', 'Q342xYn/RSbuVYW/TQbgAg==', '13007717646', 10000175, 12, 1, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (385, '程静曼', 'Q342xYn/RSbuVYW/TQbgAg==', '15018202398', 10000176, 7, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (386, '巴智敏', 'Q342xYn/RSbuVYW/TQbgAg==', '17841776170', 10000177, 39, 2, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (387, '富蒙雨', 'Q342xYn/RSbuVYW/TQbgAg==', '13819266498', 10000178, 23, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (388, '宫雁风', 'Q342xYn/RSbuVYW/TQbgAg==', '17850030290', 10000179, 18, 2, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (389, '怀心语', 'Q342xYn/RSbuVYW/TQbgAg==', '15303570719', 10000180, 32, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (390, '班小霜', 'Q342xYn/RSbuVYW/TQbgAg==', '17509284776', 10000181, 14, 1, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (391, '权燕岚', 'Q342xYn/RSbuVYW/TQbgAg==', '13819241453', 10000182, 17, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (392, '萧芳懿', 'Q342xYn/RSbuVYW/TQbgAg==', '18619368275', 10000183, 17, 1, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (393, '邴凌蝶', 'Q342xYn/RSbuVYW/TQbgAg==', '13348987743', 10000184, 24, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (394, '易谷玉', 'Q342xYn/RSbuVYW/TQbgAg==', '17121145575', 10000185, 35, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (395, '简妍凌', 'Q342xYn/RSbuVYW/TQbgAg==', '17120671283', 10000186, 21, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (396, '越谷枫', 'Q342xYn/RSbuVYW/TQbgAg==', '13656065223', 10000187, 15, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (397, '王雅爱', 'Q342xYn/RSbuVYW/TQbgAg==', '19895184127', 10000188, 39, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (398, '彭怜阳', 'Q342xYn/RSbuVYW/TQbgAg==', '17844986222', 10000189, 38, 2, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (399, '游皓洁', 'Q342xYn/RSbuVYW/TQbgAg==', '17074797319', 10000190, 13, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (400, '巢碧凡', 'Q342xYn/RSbuVYW/TQbgAg==', '18619840421', 10000191, 30, 2, '河北适当的', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (401, '籍幼南', 'Q342xYn/RSbuVYW/TQbgAg==', '18619827829', 10000192, 39, 1, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (403, '汤洛灵', 'Q342xYn/RSbuVYW/TQbgAg==', '19950684469', 10000194, 3, 1, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (404, '方和悦', 'Q342xYn/RSbuVYW/TQbgAg==', '13020910156', 10000195, 25, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (405, '庄天媛', 'Q342xYn/RSbuVYW/TQbgAg==', '13348193985', 10000196, 23, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (406, '郝梦旋', 'Q342xYn/RSbuVYW/TQbgAg==', '17509262781', 10000197, 38, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (407, '屠浩文', 'Q342xYn/RSbuVYW/TQbgAg==', '19882566829', 10000198, 31, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (408, '申心菱', 'Q342xYn/RSbuVYW/TQbgAg==', '13819660596', 10000199, 13, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (409, '段奚瑶', 'Q342xYn/RSbuVYW/TQbgAg==', '17127867619', 10000200, 14, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (410, '顾灵槐', 'Q342xYn/RSbuVYW/TQbgAg==', '13141139675', 10000201, 19, 2, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (411, '后心悦', 'Q342xYn/RSbuVYW/TQbgAg==', '17508905683', 10000202, 6, 2, '北京朝阳区', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (412, '钟问柳', 'Q342xYn/RSbuVYW/TQbgAg==', '15696060762', 10000203, 40, 1, '广东三头', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (413, '石惠芳', 'Q342xYn/RSbuVYW/TQbgAg==', '16520411075', 10000204, 17, 2, '河南省驻马店市上蔡县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (414, '养清一', 'Q342xYn/RSbuVYW/TQbgAg==', '15360510776', 10000205, 38, 1, '河南安阳滑县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (415, '熊清奇', 'Q342xYn/RSbuVYW/TQbgAg==', '14838338394', 10000206, 18, 1, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (416, '党怿悦', 'Q342xYn/RSbuVYW/TQbgAg==', '16500081253', 10000207, 23, 2, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (417, '孟静逸', 'Q342xYn/RSbuVYW/TQbgAg==', '17875363970', 10000208, 33, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (418, '曹春桃', 'Q342xYn/RSbuVYW/TQbgAg==', '19942816131', 10000209, 10, 1, '河南省驻马店市上蔡县', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (419, '陈井色', 'Q342xYn/RSbuVYW/TQbgAg==', '13336683453', 10000210, 2, 2, '河南安阳滑县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (420, '晃怜南', 'Q342xYn/RSbuVYW/TQbgAg==', '18926886803', 10000211, 40, 2, '河北适当的', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (421, '傅斯文', 'Q342xYn/RSbuVYW/TQbgAg==', '13344332145', 10000212, 16, 2, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (422, '吕品韵', 'Q342xYn/RSbuVYW/TQbgAg==', '15543484472', 10000213, 7, 2, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (423, '濮倩冰', 'Q342xYn/RSbuVYW/TQbgAg==', '14843195801', 10000214, 38, 1, '河南省驻马店市上蔡县', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (424, '惠乃欣', 'Q342xYn/RSbuVYW/TQbgAg==', '17072210195', 10000215, 27, 2, '河南安阳滑县', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (425, '卢如曼', 'Q342xYn/RSbuVYW/TQbgAg==', '13131695962', 10000216, 34, 1, '河北适当的', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (426, '容霞姝', 'Q342xYn/RSbuVYW/TQbgAg==', '17870207251', 10000217, 37, 1, '北京朝阳区', '20栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (427, '鱼芝兰', 'Q342xYn/RSbuVYW/TQbgAg==', '17850142528', 10000218, 4, 1, '广东三头', '19栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (428, '广玲娇', 'Q342xYn/RSbuVYW/TQbgAg==', '15706313623', 10000219, 9, 1, '北京朝阳区', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (429, '鱼真兰', 'Q342xYn/RSbuVYW/TQbgAg==', '17509078612', 10000220, 18, 2, '广东三头', '18栋', '2022-04-04 14:00:54', 1);
INSERT INTO `t_user` VALUES (430, '王晨', 'VW4am+fDy1nvJPXih6HY8w==', '1553986846', 100000006, 32, 1, '河南省南阳市诸葛庐', '19栋', '2022-04-05 11:21:00', 1);
INSERT INTO `t_user` VALUES (431, '增瑞杰', 'VW4am+fDy1nvJPXih6HY8w==', '14785236969', 1000000123, 12, 1, '河南省洛阳市', '19栋', '2022-04-06 08:19:52', 1);
INSERT INTO `t_user` VALUES (432, '小花', 'VW4am+fDy1nvJPXih6HY8w==', '14785236912', 1000000895, 32, 2, '河南省洛阳', '19栋', '2022-04-06 08:21:20', 1);
INSERT INTO `t_user` VALUES (433, '吴耀华', 'VW4am+fDy1nvJPXih6HY8w==', '14785296323', 1000000875, 24, 1, '河南省洛阳', '19栋', '2022-04-06 08:48:27', 1);
INSERT INTO `t_user` VALUES (434, '大米', 'Q342xYn/RSbuVYW/TQbgAg==', '13546798521', 123456, 15, 1, '汉', '二七', '2022-04-06 13:32:44', 1);
INSERT INTO `t_user` VALUES (435, 'test', 'OPvUIxneBdryzBoPKq744w==', '1456789123', 123456, 54646, 1, '汉', 'qqq', '2022-04-06 13:33:13', 1);
INSERT INTO `t_user` VALUES (436, 'zs', 'VW4am+fDy1nvJPXih6HY8w==', '1456789123', 123456, 654, 1, '汉', 'QQ群', '2022-04-06 13:33:35', 1);
INSERT INTO `t_user` VALUES (437, '郭晓婷', 'U09qjK1lVY1SmuZPuX9pSA==', '1478523691', 466451, 12, 1, '河南省洛阳', '19栋', '2022-04-06 13:33:42', 1);
INSERT INTO `t_user` VALUES (438, 'qq', 'VW4am+fDy1nvJPXih6HY8w==', '1456789123', 123456, 15, 1, '汉', '打打', '2022-04-06 13:45:57', 1);
INSERT INTO `t_user` VALUES (439, '小香', 'VW4am+fDy1nvJPXih6HY8w==', '123456', 100008725, 12, 1, '河南省洛阳', '19栋', '2022-04-06 13:47:47', 1);

-- ----------------------------
-- Table structure for t_userLog
-- ----------------------------
DROP TABLE IF EXISTS `t_userLog`;
CREATE TABLE `t_userLog`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志记录id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户性名',
  `optIp` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人员 的IP',
  `operation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `ctime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_userLog
-- ----------------------------

-- ----------------------------
-- Table structure for v_car
-- ----------------------------
DROP TABLE IF EXISTS `v_car`;
CREATE TABLE `v_car`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `license` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `ctime` date NULL DEFAULT NULL,
  `position` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_car
-- ----------------------------
INSERT INTO `v_car` VALUES (1, '叶如意', '京A11111', '2022-04-02', '天字一号', 1);
INSERT INTO `v_car` VALUES (3, '云天明', '天A11220', '2022-04-02', '天字三号', 0);
INSERT INTO `v_car` VALUES (4, '郭奥静', '豫A77777', '2022-04-03', '天通苑北门', 0);
INSERT INTO `v_car` VALUES (5, '郭奥静', '豫A77777', '2022-04-03', '天通苑北门', 0);
INSERT INTO `v_car` VALUES (6, '云天明', '天A11220', '2022-04-02', '天字三号', 0);
INSERT INTO `v_car` VALUES (7, '叶如意', '京A11111', '2022-04-02', '天字一号', 1);

-- ----------------------------
-- Table structure for v_items
-- ----------------------------
DROP TABLE IF EXISTS `v_items`;
CREATE TABLE `v_items`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `items` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_items
-- ----------------------------
INSERT INTO `v_items` VALUES (2, '小芳', '口罩', 2000, 0);
INSERT INTO `v_items` VALUES (3, '小明', '苹果', 4000, 1);
INSERT INTO `v_items` VALUES (4, '明日香', '消毒水', 4000, 1);
INSERT INTO `v_items` VALUES (5, '芳婷', '口罩', 2000, 0);

-- ----------------------------
-- Table structure for v_message
-- ----------------------------
DROP TABLE IF EXISTS `v_message`;
CREATE TABLE `v_message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `message` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `ctime` date NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_message
-- ----------------------------
INSERT INTO `v_message` VALUES (1, '小花', '真是吐了，车位找了半天找不到，好不容易看见还被抢了。', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (2, '小花', '垃圾快点清理', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (3, '小花', '地上的叶子都没有人清理的吗', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (4, '小聪', '这小区真高档，全是豪车。', '2022-04-02', 0);
INSERT INTO `v_message` VALUES (5, '小聪', '附近有富婆吗，求包养', '2022-04-02', 0);
INSERT INTO `v_message` VALUES (6, '小花', '转转', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (7, '小花', '转转', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (8, '小聪', '附近有富婆吗，求包养', '2022-04-02', 0);
INSERT INTO `v_message` VALUES (9, '小聪', '这小区真高档，全是豪车。', '2022-04-02', 0);
INSERT INTO `v_message` VALUES (10, '小花', '地上的叶子都没有人清理的吗', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (11, '小花', '垃圾快点清理', '2022-04-01', 0);
INSERT INTO `v_message` VALUES (12, '小花', '真是吐了，车位找了半天找不到，好不容易看见还被抢了。', '2022-04-01', 0);

-- ----------------------------
-- Table structure for v_visitor
-- ----------------------------
DROP TABLE IF EXISTS `v_visitor`;
CREATE TABLE `v_visitor`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '访客电话',
  `addr` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '访客住址',
  `comment` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `sid` int(11) NULL DEFAULT NULL COMMENT '门牌号',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = ' ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of v_visitor
-- ----------------------------
INSERT INTO `v_visitor` VALUES (6, '小明', '123', '海为酒店', '送外卖', 101, 0);
INSERT INTO `v_visitor` VALUES (7, '阿芳', '125', '台胞小区', '京东快递', 20, 0);
INSERT INTO `v_visitor` VALUES (8, '小聪', '124', '汽车总站小区', '访亲', 202, 1);
INSERT INTO `v_visitor` VALUES (9, '小王', '12345', '台胞小区', '转转', 102, 1);
INSERT INTO `v_visitor` VALUES (10, '王阿明', '12345', '台胞小区', '转转', 102, 1);
INSERT INTO `v_visitor` VALUES (11, '葱油酱饼', '12444', '台胞小区', '访亲', 202, 1);
INSERT INTO `v_visitor` VALUES (12, '芳婷', '12555', '台胞小区', '京东快递', 20, 0);
INSERT INTO `v_visitor` VALUES (13, '明日香', '12366', '海为酒店', '送外卖', 101, 0);
INSERT INTO `v_visitor` VALUES (14, '往日提昂', '12345', '汽车总站小区', '转转', 102, 0);
INSERT INTO `v_visitor` VALUES (15, '酱香饼', '12444', '台胞小区', '访亲', 202, 2);
INSERT INTO `v_visitor` VALUES (16, '芳小婷', '12555', '台胞小区', '京东快递', 20, 0);
INSERT INTO `v_visitor` VALUES (17, '胡桃', '12366', '海为酒店', '推销墓地', 101, 0);
INSERT INTO `v_visitor` VALUES (18, '王阿明', '12345', '台胞小区', '转转', 102, 1);
INSERT INTO `v_visitor` VALUES (19, '葱油酱饼', '12444', '汽车总站小区', '访亲', 202, 1);
INSERT INTO `v_visitor` VALUES (20, '芳婷', '12555', '台胞小区', '京东快递', 20, 0);
INSERT INTO `v_visitor` VALUES (21, '明日香', '12366', '海为酒店', '送外卖', 101, 0);

-- ----------------------------
-- Table structure for ym_num
-- ----------------------------
DROP TABLE IF EXISTS `ym_num`;
CREATE TABLE `ym_num`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `isOk` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否可以打下一针',
  `userId` int(11) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '人员加强针' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ym_num
-- ----------------------------
INSERT INTO `ym_num` VALUES (4, NULL, 29);
INSERT INTO `ym_num` VALUES (5, NULL, 31);

-- ----------------------------
-- Table structure for ym_status
-- ----------------------------
DROP TABLE IF EXISTS `ym_status`;
CREATE TABLE `ym_status`  (
  `id` int(11) NOT NULL COMMENT 'ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `vatime` datetime NULL DEFAULT NULL COMMENT '接种时间',
  `statu` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接种后反应',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '疫苗接种后情况' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ym_status
-- ----------------------------
INSERT INTO `ym_status` VALUES (29, '华仔01', '2022-04-06 18:18:30', '正常');
INSERT INTO `ym_status` VALUES (31, '虎仔03', '2022-04-06 18:19:41', '正常');

-- ----------------------------
-- Table structure for ym_user
-- ----------------------------
DROP TABLE IF EXISTS `ym_user`;
CREATE TABLE `ym_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `isInoculate` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否接种',
  `ctime` datetime NULL DEFAULT NULL COMMENT '接种日期',
  `address` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '住址',
  `typeId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接种疫苗类型',
  `cnum` int(11) NULL DEFAULT NULL COMMENT '当前打了几针',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '疫苗接种人员' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ym_user
-- ----------------------------
INSERT INTO `ym_user` VALUES (29, '华仔01', '1', '2022-04-06 18:18:30', '郑州', '灭火', 1);
INSERT INTO `ym_user` VALUES (30, '华仔02', '0', '2022-04-06 18:19:13', '郑州', 'null', 0);
INSERT INTO `ym_user` VALUES (31, '虎仔03', '1', '2022-04-06 18:24:42', '郑州', '灭火', 2);

SET FOREIGN_KEY_CHECKS = 1;

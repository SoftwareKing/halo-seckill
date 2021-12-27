CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '英文名唯一',
  `name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '中文名',
  `password` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '密码',
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `status` tinyint(1) NOT NULL COMMENT '是否启用',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 否 1 已经删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户表';

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', 'jin.xu', '许进', '1OEB3LUSLTDVJDU42HJFE52PMF', 'jin.xu@itxh.net', '1', '2020-02-27 13:07:09', '2020-02-28 20:50:16', '0'), ('21', 'zhiyuan.ye', '叶志远', 'UUKHSDDI5KPA43A8VL06V0TU2', 'zhiyuan.ye@itxh.net', '1', '2020-02-27 18:21:49', '2020-02-27 21:59:32', '0'), ('23', 'weiji.du', '杜为极', 'UUKHSDDI5KPA43A8VL06V0TU2', 'weiji.du@itxh.net', '1', '2020-02-27 21:56:59', '2020-02-27 21:56:59', '0'), ('24', 'ramostear', 'ramostear', 'UUKHSDDI5KPA43A8VL06V0TU2', 'ramostear@qq.com', '1', '2020-02-28 18:09:36', '2020-02-28 18:09:36', '0'), ('26', 'shuang.niu', '牛爽', 'UUKHSDDI5KPA43A8VL06V0TU2', 'shuang.niu@itxh.net', '1', '2020-02-28 20:51:56', '2020-02-28 20:51:56', '0'), ('27', 'shiming.liu', '刘石明', 'UUKHSDDI5KPA43A8VL06V0TU2', 'shiming.liu@qq.com', '1', '2020-03-01 18:35:52', '2020-03-01 18:35:52', '0'), ('28', 'tianhui.huang', 'tianhui.huang', 'UUKHSDDI5KPA43A8VL06V0TU2', 'tianhui.huang@qq.com', '1', '2020-03-08 21:35:18', '2020-03-08 21:35:18', '0'), ('29', 'demo', 'demo', '105ISM5B2P0TDPCIO72KMI6IRG', '123@qq.com', '1', '2020-03-17 18:30:57', '2020-03-17 18:30:57', '0'), ('30', 'pingxin.xu', '徐新平', 'UUKHSDDI5KPA43A8VL06V0TU2', 'pingxin.xu@qingcloud.net', '1', '2020-09-27 16:31:54', '2020-09-27 16:31:54', '0'), ('31', 'li.mao', '毛利', 'UUKHSDDI5KPA43A8VL06V0TU2', 'li.mao@qingcloud.net', '1', '2020-09-27 16:43:31', '2020-09-27 16:43:31', '0'), ('32', 'rijian.chen', '陈日建', 'UUKHSDDI5KPA43A8VL06V0TU2', 'rijian.chen@qq.com', '1', '2020-10-21 10:09:09', '2020-10-21 10:09:09', '0'), ('33', 'demo2', 'demo2', 'UUKHSDDI5KPA43A8VL06V0TU2', 'demo@qingcloud.net', '1', '2020-11-16 15:23:01', '2020-11-16 15:23:01', '0');
COMMIT;
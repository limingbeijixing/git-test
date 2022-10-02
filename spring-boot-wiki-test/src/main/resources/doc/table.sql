/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : zhanggx

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2022-09-18 17:10:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
    `id` bigint(20) NOT NULL COMMENT '主键',
    `identity_card` varchar(64) DEFAULT NULL COMMENT '用户身份证号码',
    `username` varchar(64) DEFAULT NULL COMMENT '用户名称',
    `password` varchar(64) DEFAULT NULL COMMENT '用户密码',
    `nick` varchar(64) DEFAULT NULL COMMENT '昵称',
    `sex` varchar(64) DEFAULT NULL COMMENT '性别',
    `age` int(4) DEFAULT NULL COMMENT '年龄',
    `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
    `phone` varchar(64) DEFAULT NULL COMMENT '电话',
    `status` varchar(64) DEFAULT NULL COMMENT '状态',
    `salt` varchar(64) DEFAULT NULL COMMENT '密盐',
    `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
    `gmt_modified` datetime DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `index_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统用户表';

/*
Navicat MySQL Data Transfer

Source Server         : geo
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : geo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-17 07:39:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for main_point
-- ----------------------------
DROP TABLE IF EXISTS `main_point`;
CREATE TABLE `main_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `geo` geometry DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of main_point
-- ----------------------------
INSERT INTO `main_point` VALUES ('1', '1', GeomFromText('POINT(42.2 31.5)'), '1');
INSERT INTO `main_point` VALUES ('2', '1', GeomFromText('POINT(42.2 32.5)'), '1');
INSERT INTO `main_point` VALUES ('3', '1', GeomFromText('POINT(42.2 22.5)'), '1');
INSERT INTO `main_point` VALUES ('4', '1', GeomFromText('POINT(42.2 52.5)'), '1');

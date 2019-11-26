/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `money` double(7,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `account` */

insert  into `account`(`id`,`name`,`money`) values (1,'tom',5000.00),(2,'lucy',5000.00),(3,'zhangsan',123.00);

/*Table structure for table `t_province` */

DROP TABLE IF EXISTS `t_province`;

CREATE TABLE `t_province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_province` */

insert  into `t_province`(`id`,`code`,`name`) values (1,'111','河北'),(2,'222','甘肃'),(3,'333','陕西'),(4,'444','四川'),(5,'555','江苏'),(6,'666','湖南');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `gender` varchar(32) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(32) DEFAULT NULL,
  `qq` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`gender`,`age`,`address`,`qq`,`email`,`username`,`password`) values (12,'war','南',12,'111','131','war@qq.com','war','123'),(13,'ma','女',12,'444','939','ma@qq.com','ma','123'),(14,'warma','女',17,'666','101','warma@163.com','warma','123'),(15,'1900','男',27,'222','1900','1900@163.com',NULL,NULL),(16,'hanser','女',27,'333','1234','hanser@qq.com',NULL,NULL),(17,'ling','女',27,'444','101939','liing@qq.com',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

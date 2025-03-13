-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm2bn52
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm2bn52/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm2bn52/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm2bn52/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liaotianhuifu`
--

DROP TABLE IF EXISTS `liaotianhuifu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liaotianhuifu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `huifuneirong` longtext COMMENT '回复内容',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343617100 DEFAULT CHARSET=utf8 COMMENT='聊天回复';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liaotianhuifu`
--

LOCK TABLES `liaotianhuifu` WRITE;
/*!40000 ALTER TABLE `liaotianhuifu` DISABLE KEYS */;
INSERT INTO `liaotianhuifu` VALUES (1610343617099,'2021-01-11 05:40:16','你好','1','刘倩','222222','2020-12-27');
/*!40000 ALTER TABLE `liaotianhuifu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liaotianxinxi`
--

DROP TABLE IF EXISTS `liaotianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liaotianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `liaotianneirong` longtext COMMENT '聊天内容',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343560479 DEFAULT CHARSET=utf8 COMMENT='聊天信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liaotianxinxi`
--

LOCK TABLES `liaotianxinxi` WRITE;
/*!40000 ALTER TABLE `liaotianxinxi` DISABLE KEYS */;
INSERT INTO `liaotianxinxi` VALUES (1610343560478,'2021-01-11 05:39:20','管理员你好','111111','2020-12-27','1','刘倩');
/*!40000 ALTER TABLE `liaotianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeishenqing`
--

DROP TABLE IF EXISTS `shebeishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinleixing` varchar(200) DEFAULT NULL COMMENT '物品类型',
  `shenqingliyou` longtext COMMENT '申请理由',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343472729 DEFAULT CHARSET=utf8 COMMENT='设备申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeishenqing`
--

LOCK TABLES `shebeishenqing` WRITE;
/*!40000 ALTER TABLE `shebeishenqing` DISABLE KEYS */;
INSERT INTO `shebeishenqing` VALUES (1610343472728,'2021-01-11 05:37:52','1003','洗衣机','电子','要拿10台出来使用','2020-12-27','1','刘倩','是','同意使用');
/*!40000 ALTER TABLE `shebeishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','6s13ofwe3sbno1ctnwndzgljyaqrahnk','2021-01-11 05:31:02','2021-01-11 06:39:29'),(2,1610343318031,'1','yonghu','用户','nz8pu00u46zu1k20luwycubi5cjznxs1','2021-01-11 05:36:49','2021-01-11 06:40:30');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-01-11 05:09:16');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wupinleixing`
--

DROP TABLE IF EXISTS `wupinleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wupinleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinleixing` varchar(200) NOT NULL COMMENT '物品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343354216 DEFAULT CHARSET=utf8 COMMENT='物品类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wupinleixing`
--

LOCK TABLES `wupinleixing` WRITE;
/*!40000 ALTER TABLE `wupinleixing` DISABLE KEYS */;
INSERT INTO `wupinleixing` VALUES (21,'2021-01-11 05:09:16','电器'),(22,'2021-01-11 05:09:16','设备'),(23,'2021-01-11 05:09:16','数码'),(24,'2021-01-11 05:09:16','手机'),(1610343354215,'2021-01-11 05:35:54','电子');
/*!40000 ALTER TABLE `wupinleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaohuixinxi`
--

DROP TABLE IF EXISTS `xiaohuixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaohuixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinleixing` varchar(200) DEFAULT NULL COMMENT '物品类型',
  `kucun` int(11) NOT NULL COMMENT '库存',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `xiaohuiyuanyin` longtext COMMENT '销毁原因',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343508477 DEFAULT CHARSET=utf8 COMMENT='销毁信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaohuixinxi`
--

LOCK TABLES `xiaohuixinxi` WRITE;
/*!40000 ALTER TABLE `xiaohuixinxi` DISABLE KEYS */;
INSERT INTO `xiaohuixinxi` VALUES (1610343508476,'2021-01-11 05:38:28','1003','洗衣机','电子',5,'http://localhost:8080/ssm2bn52/upload/1610343376971.jpg','有5台已经损坏了，无法修理了，特产申请销毁','2020-12-27','1','刘倩','是','同意销毁');
/*!40000 ALTER TABLE `xiaohuixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343318032 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-01-11 05:09:16','001','001','姓名1','男','http://localhost:8080/ssm2bn52/upload/yonghu_touxiang1.jpg','440300199101010001','13823888881'),(16,'2021-01-11 05:09:16','用户6','123456','姓名6','男','http://localhost:8080/ssm2bn52/upload/yonghu_touxiang6.jpg','440300199606060006','13823888886'),(1610343318031,'2021-01-11 05:35:18','1','1','刘倩','女','http://localhost:8080/ssm2bn52/upload/1610343422508.png','441214121412141214','15214121411');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zichanbaobiao`
--

DROP TABLE IF EXISTS `zichanbaobiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zichanbaobiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `gudingzichan` int(11) DEFAULT NULL COMMENT '固定资产',
  `wuxingzichan` int(11) DEFAULT NULL COMMENT '无形资产',
  `qitazichan` int(11) DEFAULT NULL COMMENT '其他资产',
  `zongzichan` int(11) DEFAULT NULL COMMENT '总资产',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343546929 DEFAULT CHARSET=utf8 COMMENT='资产报表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zichanbaobiao`
--

LOCK TABLES `zichanbaobiao` WRITE;
/*!40000 ALTER TABLE `zichanbaobiao` DISABLE KEYS */;
INSERT INTO `zichanbaobiao` VALUES (71,'2021-01-11 05:09:16','名称1',1,1,1,1,'2021-01-11','用户名1','姓名1'),(72,'2021-01-11 05:09:16','名称2',2,2,2,2,'2021-01-11','用户名2','姓名2'),(73,'2021-01-11 05:09:16','名称3',3,3,3,3,'2021-01-11','用户名3','姓名3'),(74,'2021-01-11 05:09:16','名称4',4,4,4,4,'2021-01-11','用户名4','姓名4'),(75,'2021-01-11 05:09:16','名称5',5,5,5,5,'2021-01-11','用户名5','姓名5'),(76,'2021-01-11 05:09:16','名称6',6,6,6,6,'2021-01-11','用户名6','姓名6'),(1610343546928,'2021-01-11 05:39:06','1月份资产报表',250000,250000,15000,515000,'2020-12-27','1','刘倩');
/*!40000 ALTER TABLE `zichanbaobiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zichanruku`
--

DROP TABLE IF EXISTS `zichanruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zichanruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinleixing` varchar(200) DEFAULT NULL COMMENT '物品类型',
  `goumaigongsi` varchar(200) DEFAULT NULL COMMENT '购买公司',
  `goumaijiage` int(11) DEFAULT NULL COMMENT '购买价格',
  `kucun` int(11) DEFAULT NULL COMMENT '库存',
  `zongjiage` int(11) DEFAULT NULL COMMENT '总价格',
  `rukuriqi` date DEFAULT NULL COMMENT '入库日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343454983 DEFAULT CHARSET=utf8 COMMENT='资产入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zichanruku`
--

LOCK TABLES `zichanruku` WRITE;
/*!40000 ALTER TABLE `zichanruku` DISABLE KEYS */;
INSERT INTO `zichanruku` VALUES (1610343454982,'2021-01-11 05:37:34','1003','洗衣机','电子','肖记电器有限公司',2500,10,25000,'2020-12-27','1','刘倩');
/*!40000 ALTER TABLE `zichanruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zichanshebei`
--

DROP TABLE IF EXISTS `zichanshebei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zichanshebei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) NOT NULL COMMENT '编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `wupinleixing` varchar(200) DEFAULT NULL COMMENT '物品类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `kucun` int(11) DEFAULT NULL COMMENT '库存',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='资产设备';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zichanshebei`
--

LOCK TABLES `zichanshebei` WRITE;
/*!40000 ALTER TABLE `zichanshebei` DISABLE KEYS */;
INSERT INTO `zichanshebei` VALUES (31,'2021-01-11 05:09:16','1001','华为手机','手机','http://localhost:8080/ssm2bn52/upload/1610343105344.jpg',20,'1111'),(32,'2021-01-11 05:09:16','1002','物品名称2','数码','http://localhost:8080/ssm2bn52/upload/zichanshebei_tupian2.jpg',20,'简介2'),(33,'2021-01-11 05:09:16','1003','洗衣机','电子','http://localhost:8080/ssm2bn52/upload/1610343376971.jpg',35,'这里可以写一些简介，内容都是用于测试的，可以自行添加修改删除的'),(34,'2021-01-11 05:09:16','编号4','物品名称4','物品类型4','http://localhost:8080/ssm2bn52/upload/zichanshebei_tupian4.jpg',40,'简介4'),(35,'2021-01-11 05:09:16','编号5','物品名称5','物品类型5','http://localhost:8080/ssm2bn52/upload/zichanshebei_tupian5.jpg',50,'简介5'),(36,'2021-01-11 05:09:16','编号6','物品名称6','物品类型6','http://localhost:8080/ssm2bn52/upload/zichanshebei_tupian6.jpg',60,'简介6');
/*!40000 ALTER TABLE `zichanshebei` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-18 15:06:10

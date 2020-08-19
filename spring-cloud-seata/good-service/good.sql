
DROP TABLE IF EXISTS `seata_good`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `seata_good` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `price` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='商品信息';


LOCK TABLES `seata_good` WRITE;
INSERT INTO `seata_good` VALUES (1,'华为Meta 30',10,5000.00);
UNLOCK TABLES;
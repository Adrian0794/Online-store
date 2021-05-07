-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: onlinestore
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zip_code` bigint DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_image` varchar(255) DEFAULT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.18169-9/28576965_838416189677731_8974468489125763671_n.jpg?_nc_cat=105&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=PBpQfF79IC8AX8-Q8Uo&_nc_ht=scontent.fclj2-1.fna&oh=dc1f55fd9ebd05f36531f287e225bbb1&oe=60B9A0C0','NUME DIN FETRU SIMPLE'),(3,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/110956976_1466005866918757_7458008462148425703_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=Ad9Kf3rUlzAAX963yYF&_nc_ht=scontent.fclj2-1.fna&oh=948b6cb0078ec5518734fd577df02055&oe=60BBAAAE','NUME DIN FETRU PERSONALIZATE'),(4,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/130254156_1587871564732186_3733994767872702787_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=Dq5x92PrW0MAX-7MDDh&_nc_ht=scontent.fclj2-1.fna&oh=d821b1a207488bdfa2b3b1cd6e500ebd&oe=60BB8483','ANIMALE DE PLUS'),(5,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/69854746_1185372551648758_567715790866874368_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=3xSv8wiBzqsAX9gj_pI&_nc_ht=scontent.fclj2-1.fna&oh=ff1b558e2efaf03fe270a765ad36b69d&oe=60BABD43','GHIOZDAN/RUCSAC'),(6,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/74664579_1253826494803363_5596273504002506752_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=nmaoTNB5PTkAX8a9Ey4&_nc_ht=scontent.fclj2-1.fna&oh=c486ba73561186804a53a5f39af9d384&oe=60BC2CD2','DECORATIUNI DE CRACIUN'),(7,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/88014477_1342640025922009_7859433128228552704_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=5rZ6UAlEMh0AX_gw2BM&_nc_ht=scontent.fclj2-1.fna&oh=6491ca39bc74dee9f47faff9f9bf6a19&oe=60BCD9B3','MARTISOARE');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comanda`
--

DROP TABLE IF EXISTS `comanda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comanda` (
  `comanda_id` int NOT NULL AUTO_INCREMENT,
  `date_of_order` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `total_cost` double NOT NULL,
  `delivery_adress_address_id` int DEFAULT NULL,
  `user_account_user_id` int DEFAULT NULL,
  PRIMARY KEY (`comanda_id`),
  KEY `FKsajkjabesaav7yt3eh695alx` (`delivery_adress_address_id`),
  KEY `FKk1xw5cs58sobwaqdg5mtwndue` (`user_account_user_id`),
  CONSTRAINT `FKk1xw5cs58sobwaqdg5mtwndue` FOREIGN KEY (`user_account_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKsajkjabesaav7yt3eh695alx` FOREIGN KEY (`delivery_adress_address_id`) REFERENCES `address` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comanda`
--

LOCK TABLES `comanda` WRITE;
/*!40000 ALTER TABLE `comanda` DISABLE KEYS */;
/*!40000 ALTER TABLE `comanda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comanda_order_lines`
--

DROP TABLE IF EXISTS `comanda_order_lines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comanda_order_lines` (
  `order_entity_comanda_id` int NOT NULL,
  `order_lines_order_line_id` int NOT NULL,
  UNIQUE KEY `UK_211f7lyuayxxdp6cgm1u6y8fw` (`order_lines_order_line_id`),
  KEY `FKdqtibp2yo7peqegp4pdmllkrv` (`order_entity_comanda_id`),
  CONSTRAINT `FKdqtibp2yo7peqegp4pdmllkrv` FOREIGN KEY (`order_entity_comanda_id`) REFERENCES `comanda` (`comanda_id`),
  CONSTRAINT `FKma3q0ar1ys2sel2cd9y2dpra9` FOREIGN KEY (`order_lines_order_line_id`) REFERENCES `order_line` (`order_line_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comanda_order_lines`
--

LOCK TABLES `comanda_order_lines` WRITE;
/*!40000 ALTER TABLE `comanda_order_lines` DISABLE KEYS */;
/*!40000 ALTER TABLE `comanda_order_lines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_line`
--

DROP TABLE IF EXISTS `order_line`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_line` (
  `order_line_id` int NOT NULL AUTO_INCREMENT,
  `product_price` double NOT NULL,
  `quantity_of_products` double NOT NULL,
  `total_price_order` double NOT NULL,
  `product_product_id` int DEFAULT NULL,
  PRIMARY KEY (`order_line_id`),
  KEY `FKmk8y3rw2ybq7oty1qme297w9x` (`product_product_id`),
  CONSTRAINT `FKmk8y3rw2ybq7oty1qme297w9x` FOREIGN KEY (`product_product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_line`
--

LOCK TABLES `order_line` WRITE;
/*!40000 ALTER TABLE `order_line` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_line` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producator`
--

DROP TABLE IF EXISTS `producator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producator` (
  `producator_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`producator_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producator`
--

LOCK TABLES `producator` WRITE;
/*!40000 ALTER TABLE `producator` DISABLE KEYS */;
INSERT INTO `producator` VALUES (1,'Szabo','Cristina');
/*!40000 ALTER TABLE `producator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producator_product`
--

DROP TABLE IF EXISTS `producator_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producator_product` (
  `producator_entity_producator_id` int NOT NULL,
  `product_product_id` int NOT NULL,
  UNIQUE KEY `UK_gm5ugjf6v777oed4xqvobujp4` (`product_product_id`),
  KEY `FKa5ygdb30ea35yld8fhb0g2btw` (`producator_entity_producator_id`),
  CONSTRAINT `FKa5ygdb30ea35yld8fhb0g2btw` FOREIGN KEY (`producator_entity_producator_id`) REFERENCES `producator` (`producator_id`),
  CONSTRAINT `FKbrx2b0i0ys693ja2yaw1njwxk` FOREIGN KEY (`product_product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producator_product`
--

LOCK TABLES `producator_product` WRITE;
/*!40000 ALTER TABLE `producator_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `producator_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `thumbnail` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `producator_id` int DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FK1mtsbur82frn64de7balymq9s` (`category_id`),
  KEY `FKhgyj7388lhcf5yl56g8okjtma` (`producator_id`),
  CONSTRAINT `FK1mtsbur82frn64de7balymq9s` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
  CONSTRAINT `FKhgyj7388lhcf5yl56g8okjtma` FOREIGN KEY (`producator_id`) REFERENCES `producator` (`producator_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Nume feminin',108,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/46468089_1002987716553910_3753768869441830912_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=8Cd5oreK6CYAX8NSfeb&_nc_ht=scontent.fclj2-1.fna&oh=98c2d6ac38c35ee4c02426f370a31911&oe=60BC3570','Alexandra',NULL,3,1),(2,'Nume feminin',60,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/47159358_1008151036037578_6428502552374935552_n.jpg?_nc_cat=108&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=iL2-siGYgNwAX-tDTae&_nc_ht=scontent.fclj2-1.fna&oh=ee6b77901f7fddc9c89c0600b1831429&oe=60BB0DAE','Irina',NULL,3,1),(4,'Nume feminin',96,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/52856763_1062177610634920_8718960469043314688_n.jpg?_nc_cat=102&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=lRjJpig-DMQAX_lQEQc&_nc_ht=scontent.fclj2-1.fna&oh=ee60feba986c4d4b1122369cce1c0ddc&oe=60BAC8BA','Cristina',NULL,3,1),(9,'De plus',130,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/130146267_1587871741398835_1327495536984564874_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=zdBcCmhUF6cAX8cGYt5&_nc_ht=scontent.fclj2-1.fna&oh=edd65633e5d83cf119f7b4e32580bb70&oe=60BC0EC1','Ursulet',NULL,4,1),(10,'De plus',130,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/130141273_1587871654732177_2599526796128954789_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=x1MaiXx8p5YAX8dqvKk&_nc_ht=scontent.fclj2-1.fna&oh=25bc9237a2e34412de43c6b8685d387b&oe=60BC958A','Pinguin',NULL,4,1),(11,'De plus',130,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/105287948_1442335482619129_5519665551431049754_n.jpg?_nc_cat=108&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=CQWurTUMEWwAX-7IEMv&_nc_ht=scontent.fclj2-1.fna&oh=25213a4149a6fc5690fa992240f8b266&oe=60BB28E7','Leu',NULL,4,1),(12,'Ghiozdan pentru printese',90,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/119109066_1508414406011236_8260244538412215236_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=d7RGZlLiEcEAX-amnwB&_nc_ht=scontent.fclj2-1.fna&oh=e6aaf84c2c6e5d730b8407ac084d6977&oe=60BC287E','Ghiozdan de fete',NULL,5,1),(13,'Ghiozdan cu dinozauri',90,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/119086287_1508414169344593_6545711710439625410_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=_sGLDdVFp6AAX9h0aCB&_nc_ht=scontent.fclj2-1.fna&oh=98246881e6aff225704ea391d638e52d&oe=60BC2699','Ghiozdan de baieti',NULL,5,1),(14,'Sosetele pentru cadouri',150,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/129640042_1583540221831987_5070711353460088444_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=myjLM1ew65kAX_7JXT9&_nc_ht=scontent.fclj2-1.fna&oh=7b6081a0b9694329d1794379070766dc&oe=60BB2385','Sosetele',NULL,6,1),(15,'',150,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/69603163_1182639805255366_987593189588205568_n.jpg?_nc_cat=110&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=8RGlR696Op0AX9EbSip&_nc_ht=scontent.fclj2-1.fna&oh=75ab144feb09def8c2a77cd171d74965&oe=60BA0125','Decoratiuni',NULL,6,1),(16,'Familia ta',150,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/122672733_1550045708514772_3585835706336750675_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=PaJwrnuKlAMAX_90qKL&_nc_ht=scontent.fclj2-1.fna&oh=1f009db219ca2513eebff24d2fb9ea85&oe=60BCE847','Decoratiuni de famiie',NULL,6,1),(17,'',20,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/86493102_1331633080356037_5312717658586611712_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=nqvBDi6TcrcAX_4JjEW&_nc_ht=scontent.fclj2-1.fna&oh=57ee3aeec6cea36e4da26725c3b49df5&oe=60BCDA94','Buburuza',NULL,7,1),(18,'Arata afectiunea/ iubirea',20,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/85098854_1329026787283333_6860295465980657664_n.jpg?_nc_cat=104&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=zuDhPjTDkTcAX-12mXR&_nc_ht=scontent.fclj2-1.fna&oh=5acc6b66e424a8292c3805fee43ec389&oe=60BA38B6','Inima',NULL,7,1),(19,'',20,'https://scontent.fclj2-1.fna.fbcdn.net/v/t1.6435-9/84590988_1327798007406211_3518284870688178176_n.jpg?_nc_cat=102&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=Pr-mgkjVFiAAX8rMjeX&_nc_ht=scontent.fclj2-1.fna&oh=07986c8155e1549ca838ffa927ff80d6&oe=60BC72A5','Fluturas',NULL,7,1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `enable` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `address_address_id` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKp890qjjx13q8wwq23o1cndl9i` (`address_address_id`),
  CONSTRAINT `FKp890qjjx13q8wwq23o1cndl9i` FOREIGN KEY (`address_address_id`) REFERENCES `address` (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,NULL,'$2a$10$OxsxGOVByISnnOGwiCSl0e7jokMb4uCpQy.JXiinBCb/IR85Sbhtu','ROLE_CUSTOMER','Adrian',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 21:49:27

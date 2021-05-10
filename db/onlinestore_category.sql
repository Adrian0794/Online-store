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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 21:55:17

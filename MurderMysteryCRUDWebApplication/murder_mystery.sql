-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: murder_mystery
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `murder_mystery_box_set`
--

use heroku_5a36b8e6504461f;

DROP TABLE IF EXISTS `murder_mystery_box_set`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `murder_mystery_box_set` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `creativity_rating` varchar(255) DEFAULT NULL,
  `difficulty_rating` varchar(255) DEFAULT NULL,
  `murder_mystery_title` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `user_review` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `murder_mystery_box_set`
--

LOCK TABLES `murder_mystery_box_set` WRITE;
/*!40000 ALTER TABLE `murder_mystery_box_set` DISABLE KEYS */;
INSERT INTO `murder_mystery_box_set` VALUES (1,'7/10','Medium','Death At The Dive Bar',29.99,'The difficulty level of the puzzles and challenges is well balanced, offering an enjoyable challenge without becoming too overwhelming. It presents unique and inventive scenarios that require critical thinking.'),(18,'10/10','Medium','Box One',29.99,'This one has it all from tools and puzzles provided to accessing digital media for clues. This is one of the most creative box sets I have played to date. Not too difficult and plenty of ways to keep your attention while playing. Overall a great set.'),(20,'8/10','Hard','Unsolved Case Files Harmony Ashcroft Case',29.99,'This murder mystery is more on the difficult side, however, it offers creativity through authentic documents and realistic crime scene reconstructions. Very good if you want a challenge, you will need to use hints.'),(21,'7/10','Medium','Unsolved Case Files Jamie Banks Case',29.99,'This is similar to the Harmony Ashcroft Case in creativity. It is a little easier than that one but they have the same style of documents and puzzles. Overall a great intermediate game.'),(22,'5/10','Hard','Dead Man on The Orient Express | Exit: The Game',14.99,'This was a bit lack luster in comparison to other games I have played. The clues were very vague and the creativity was lacking, mainly consisting of paragraphs to read. It was a challenge and failed to keep my interest for long.'),(23,'N/A','N/A','Hunt A Killer Blair Witch Box Set',149.99,'N/A'),(25,'N/A','N/A','Camp Calamity',59.99,'N/A');
/*!40000 ALTER TABLE `murder_mystery_box_set` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-27 19:22:19

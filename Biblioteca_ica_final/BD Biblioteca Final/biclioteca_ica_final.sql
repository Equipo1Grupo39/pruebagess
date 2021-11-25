CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
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
-- Table structure for table `alarma`
--

DROP TABLE IF EXISTS `alarma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alarma` (
  `codigoalarma` varchar(45) NOT NULL,
  `Ala_codigoregistroprestamos` int NOT NULL,
  `Ala_idusuario` int NOT NULL,
  `Ala_idadministrador` int NOT NULL,
  `Alafechadevencimiento` date NOT NULL,
  `Alageneraralarma` enum('Recuerde realizar devolución a tiempo') NOT NULL,
  PRIMARY KEY (`codigoalarma`),
  KEY `codigoregistroprestamos` (`Ala_codigoregistroprestamos`),
  KEY `idusuario` (`Ala_idusuario`),
  KEY `alarma_ibfk_3` (`Ala_idadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alarma`
--

LOCK TABLES `alarma` WRITE;
/*!40000 ALTER TABLE `alarma` DISABLE KEYS */;
/*!40000 ALTER TABLE `alarma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audiosyvideos`
--

DROP TABLE IF EXISTS `audiosyvideos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `audiosyvideos` (
  `codigoaudiosyvideosisbn` varchar(100) NOT NULL,
  `AyVtitulo` varchar(100) NOT NULL,
  `AyVcontenido` varchar(500) NOT NULL,
  `AyV_codigoautor` int NOT NULL,
  `AyV_codigomateria` int NOT NULL,
  `AyV_codigoeditorial` int NOT NULL,
  `AyV_codigoidioma` int NOT NULL,
  `AyVfechacreacion` date NOT NULL,
  `AyVfecharetiro` date DEFAULT NULL,
  PRIMARY KEY (`codigoaudiosyvideosisbn`),
  KEY `codigoautor` (`AyV_codigoautor`),
  KEY `codigomateria` (`AyV_codigomateria`),
  KEY `codigoeditorial` (`AyV_codigoeditorial`),
  KEY `codigoidioma` (`AyV_codigoidioma`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audiosyvideos`
--

LOCK TABLES `audiosyvideos` WRITE;
/*!40000 ALTER TABLE `audiosyvideos` DISABLE KEYS */;
INSERT INTO `audiosyvideos` VALUES ('980-980-5050-20-20','Audio 1','prueba audio',3,910,5,3,'2021-11-08',NULL),('980-980-5050-20-30','Audio 2','prueba audio 2',1,410,2,5,'2021-11-08',NULL);
/*!40000 ALTER TABLE `audiosyvideos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `codigoautor` int NOT NULL AUTO_INCREMENT,
  `Autnombresapellidos` varchar(45) NOT NULL,
  `Autnacionalidad` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoautor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Augusto Ghio D.','Chileno'),(2,'Sen, Amartya','Indio'),(3,'prueba1','peruano'),(4,'Francisco Ayala','colombiano');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bloqueomultas`
--

DROP TABLE IF EXISTS `bloqueomultas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bloqueomultas` (
  `codigobloqueomultas` int NOT NULL AUTO_INCREMENT,
  `BMu_codigoalarma` varchar(45) NOT NULL,
  `BMu_codigoregistroprestamos` int NOT NULL,
  `BMu_idusuario` int NOT NULL,
  `BMu_idadministrador` int NOT NULL,
  `Bmugenerarbloqueo` enum('Sin prestamos por devoluciones pendientes o multas por pagar') NOT NULL,
  PRIMARY KEY (`codigobloqueomultas`),
  KEY `codigoalarma` (`BMu_codigoalarma`),
  KEY `codigoregistroprestamos` (`BMu_codigoregistroprestamos`),
  KEY `idusuario` (`BMu_idusuario`),
  KEY `bloqueomultas_ibfk_4` (`BMu_idadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bloqueomultas`
--

LOCK TABLES `bloqueomultas` WRITE;
/*!40000 ALTER TABLE `bloqueomultas` DISABLE KEYS */;
/*!40000 ALTER TABLE `bloqueomultas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `codigoeditorial` int NOT NULL AUTO_INCREMENT,
  `Edinombreeditorial` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoeditorial`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (1,'Planeta'),(2,'Penguin Random House'),(4,'Editorial Solar SAS'),(5,'Norma');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturasmulta`
--

DROP TABLE IF EXISTS `facturasmulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturasmulta` (
  `codigofacturasmulta` int NOT NULL AUTO_INCREMENT,
  `FMu_idusuario` int NOT NULL,
  `FMuvalorafacturar` int NOT NULL,
  `FMunumero` varchar(10) NOT NULL,
  `FMucantidad` int NOT NULL,
  `FMuestado` varchar(1) NOT NULL,
  `FMufecha` date NOT NULL,
  `FMufechapago` date DEFAULT NULL,
  PRIMARY KEY (`codigofacturasmulta`),
  KEY `idusuario` (`FMu_idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturasmulta`
--

LOCK TABLES `facturasmulta` WRITE;
/*!40000 ALTER TABLE `facturasmulta` DISABLE KEYS */;
INSERT INTO `facturasmulta` VALUES (1,1,10000,'0000000001',2,'C','2021-11-14','2021-11-15'),(2,1,5000,'0000000002',1,'V','2021-11-17',NULL);
/*!40000 ALTER TABLE `facturasmulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma`
--

DROP TABLE IF EXISTS `idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idioma` (
  `codigoidioma` int NOT NULL AUTO_INCREMENT,
  `Idinombreidioma` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoidioma`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma`
--

LOCK TABLES `idioma` WRITE;
/*!40000 ALTER TABLE `idioma` DISABLE KEYS */;
INSERT INTO `idioma` VALUES (1,'Español'),(3,'Ingles'),(4,'Portugues'),(5,'Arabe');
/*!40000 ALTER TABLE `idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `codigoinventario` int NOT NULL AUTO_INCREMENT,
  `Inv_codigolibroisbn` varchar(100) DEFAULT NULL,
  `Inv_codigoaudiosyvideosisbn` varchar(100) DEFAULT NULL,
  `Invcantidad` int NOT NULL,
  `Invsalidas` int DEFAULT NULL,
  `Invfechacreacion` date DEFAULT NULL,
  `Invfechaactualizacion` date DEFAULT NULL,
  PRIMARY KEY (`codigoinventario`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES (4,'978-958-5165-11-15',NULL,8,1,'2021-11-01','2021-11-17'),(7,'978-958-5165-11-10',NULL,2,-1,'2021-11-01','2021-11-15'),(8,'978-958-5165-11-3',NULL,1,0,'2021-11-01','0000-00-00'),(9,NULL,'980-980-5050-20-30',2,2,'2021-11-01','2021-11-15'),(11,NULL,'980-980-5000-10-60',3,0,'2021-11-01','0000-00-00'),(12,'978-958-5165-11-6',NULL,3,-1,'2021-11-17','2021-11-17'),(13,NULL,'980-980-5050-20-20',5,0,'2021-11-17','2021-11-17');
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `codigolibroisbn` varchar(100) NOT NULL,
  `Libtitulo` varchar(100) NOT NULL,
  `Libnumerodepaginas` int NOT NULL,
  `Lib_codigoautor` int NOT NULL,
  `Lib_codigomateria` int NOT NULL,
  `Lib_codigoeditorial` int NOT NULL,
  `Lib_codigoidioma` int NOT NULL,
  `Libfechacreacion` date NOT NULL,
  `Libfecharetiro` date DEFAULT NULL,
  PRIMARY KEY (`codigolibroisbn`),
  KEY `codigoautor` (`Lib_codigoautor`),
  KEY `codigomateria` (`Lib_codigomateria`),
  KEY `codigoeditorial` (`Lib_codigoeditorial`),
  KEY `codigoidioma` (`Lib_codigoidioma`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES ('978-958-5165-11-10','Libro prueba 2',111,1,800,4,4,'2021-11-05',NULL),('978-958-5165-11-15','Libro prueba 3',1010,3,910,5,1,'2021-11-08',NULL),('978-958-5165-11-3','Un hogar en el mundo',544,2,800,2,1,'2021-08-17',NULL),('978-958-5165-11-40','Libro prueba 6',80,2,800,1,4,'2021-11-11',NULL),('978-958-5165-11-6','Libro prueba 1',80,2,410,2,1,'2021-11-05',NULL);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `codigomateria` int NOT NULL,
  `Matnombremateria` varchar(45) NOT NULL,
  PRIMARY KEY (`codigomateria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (410,'Lingüística'),(800,'Literatura y retórica'),(910,'Matemáticas');
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `codigopagos` int NOT NULL AUTO_INCREMENT,
  `Pag_codigofacturasmulta` int NOT NULL,
  `Pag_idusuario` int NOT NULL,
  `Pag_idadministrador` int NOT NULL,
  `Pag_idtbiblioteca` int NOT NULL,
  `PagfacturacanceladaS/N` enum('Si','No') NOT NULL,
  PRIMARY KEY (`codigopagos`),
  KEY `codigofacturasmulta` (`Pag_codigofacturasmulta`),
  KEY `idusuario` (`Pag_idusuario`),
  KEY `idadministrador` (`Pag_idadministrador`),
  KEY `idtbiblioteca` (`Pag_idtbiblioteca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `codigoprestamo` int NOT NULL,
  `Pr_idusuario` int NOT NULL,
  `Pr_idadministrador` int NOT NULL,
  `Pr_codigolibroisbn` varchar(100) DEFAULT NULL,
  `Pr_codigoaudiosyvideosisbn` varchar(100) DEFAULT NULL,
  `Prfechaprestamo` date NOT NULL,
  `Prfechaprogdevolucion` date DEFAULT NULL,
  `Prestado` varchar(1) DEFAULT NULL,
  `Prfecharealdevolucion` date DEFAULT NULL,
  `Pr_codigofacturasmulta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codigoprestamo`),
  KEY `idusuario` (`Pr_idusuario`),
  KEY `registrodeprestamo_ibfk_2` (`Pr_idadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (1,1,8,'978-958-5165-11-10',NULL,'2021-11-05','2021-11-13','E','2021-11-15','1'),(2,1,8,NULL,'980-980-5050-20-20','2021-11-06','2021-11-14','D',NULL,NULL),(3,1,8,'978-958-5165-11-10',NULL,'2021-11-14','2021-11-22','D',NULL,''),(4,1,8,'978-958-5165-11-15',NULL,'2021-11-05','2021-11-13','E','2021-11-17','2'),(5,1,8,NULL,'980-980-5050-20-30','2021-11-06','2021-11-14','M',NULL,'2'),(6,2,12,'978-958-5165-11-10',NULL,'2021-11-15','2021-11-23','V',NULL,NULL),(7,7,8,'978-958-5165-11-15',NULL,'2021-11-15','2021-11-23','V',NULL,NULL),(8,7,12,'978-958-5165-11-10',NULL,'2021-11-15','2021-11-23','V',NULL,NULL),(9,1,8,NULL,'980-980-5050-20-30','2021-11-15','2021-11-23','V',NULL,NULL),(10,3,8,'978-958-5165-11-6',NULL,'2021-11-17','2021-11-25','D','2021-11-17',NULL),(11,3,8,NULL,'980-980-5050-20-20','2021-11-17','2021-11-25','V','2021-11-17',NULL);
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `codigoreservas` int NOT NULL AUTO_INCREMENT,
  `Res_idusuario` int NOT NULL,
  `Res_idadministrador` int NOT NULL,
  `Res_codigolibroisbn` varchar(100) DEFAULT NULL,
  `Res_codigoaudiosyvideosisbn` varchar(100) DEFAULT NULL,
  `Resfechareserva` date NOT NULL,
  `Resestado` varchar(1) NOT NULL,
  `Resfechaactualizacion` date DEFAULT NULL,
  PRIMARY KEY (`codigoreservas`),
  KEY `idusuario` (`Res_idusuario`),
  KEY `codigolibroisbn` (`Res_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`Res_codigoaudiosyvideosisbn`),
  KEY `reservas_ibfk_2` (`Res_idadministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,3,12,'978-958-5165-11-6',NULL,'2021-11-15','C','2021-11-15'),(2,7,8,'978-958-5165-11-15',NULL,'2021-11-15','P','2021-11-15');
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signaturatopografica`
--

DROP TABLE IF EXISTS `signaturatopografica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signaturatopografica` (
  `codigosignaturatopografica` varchar(100) NOT NULL,
  `STo_idtbiblioteca` int DEFAULT NULL,
  `STo_codigolibroisbn` varchar(100) DEFAULT NULL,
  `STo_codigoaudiosyvideosisbn` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigosignaturatopografica`),
  KEY `idbiblioteca` (`STo_idtbiblioteca`),
  KEY `codigolibroisbn` (`STo_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`STo_codigoaudiosyvideosisbn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signaturatopografica`
--

LOCK TABLES `signaturatopografica` WRITE;
/*!40000 ALTER TABLE `signaturatopografica` DISABLE KEYS */;
INSERT INTO `signaturatopografica` VALUES ('Aud-Mem-U-300',4657,NULL,'980-980-5050-20-30'),('Aud-Mem-U-400',4658,NULL,'980-980-5050-20-20'),('Lit-Mem-U',4657,'978-958-5165-11-3',NULL),('Lit-Mem-U-001',4657,'978-958-5165-11-10',NULL),('Lit-Mem-U-100',4657,'978-958-5165-11-15',NULL),('Lit-Mem-U-200',4657,'978-958-5165-11-6',NULL);
/*!40000 ALTER TABLE `signaturatopografica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbiblioteca`
--

DROP TABLE IF EXISTS `tbiblioteca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbiblioteca` (
  `idtbiblioteca` int NOT NULL DEFAULT '4657',
  `Tbinombre` varchar(45) NOT NULL,
  `Tbinit` int NOT NULL,
  `Tbiemail` varchar(45) NOT NULL,
  `Tbidireccion` varchar(45) NOT NULL,
  `Tbitelefono` varchar(10) NOT NULL,
  `Tbicuentabancaria` varchar(20) NOT NULL,
  `Tbinombrebanco` varchar(45) NOT NULL,
  PRIMARY KEY (`idtbiblioteca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbiblioteca`
--

LOCK TABLES `tbiblioteca` WRITE;
/*!40000 ALTER TABLE `tbiblioteca` DISABLE KEYS */;
INSERT INTO `tbiblioteca` VALUES (4657,'Instituto Pedagogico de Cultura y Arte',75087804,'irios_ipca@gmail.com','Calle 11 1 - 75','5722125172','657-018922-1','AvVillas'),(4658,'Biblioteca Nacional',801234567,'bnacional@gov.co','carrera 4 No. 26-09','5963287','05289621','Banco Itaú');
/*!40000 ALTER TABLE `tbiblioteca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_event_history`
--

DROP TABLE IF EXISTS `test_event_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_event_history` (
  `id` int NOT NULL AUTO_INCREMENT,
  `event_ts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_event_history`
--

LOCK TABLES `test_event_history` WRITE;
/*!40000 ALTER TABLE `test_event_history` DISABLE KEYS */;
INSERT INTO `test_event_history` VALUES (1,'2021-11-14 16:26:55'),(2,'2021-11-14 16:28:59'),(3,'2021-11-14 16:32:57'),(4,'2021-11-14 17:43:34'),(5,'2021-11-14 18:40:11'),(6,'2021-11-17 09:09:57'),(7,'2021-11-18 12:03:12'),(8,'2021-11-18 12:41:31'),(9,'2021-11-18 12:50:43'),(10,'2021-11-18 13:03:38');
/*!40000 ALTER TABLE `test_event_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `Usulogin` varchar(10) NOT NULL,
  `Usucedula` char(10) NOT NULL,
  `Usunombresapellidos` varchar(45) NOT NULL,
  `Usuemail` varchar(45) DEFAULT NULL,
  `Usutelefono` char(10) DEFAULT NULL,
  `Usudireccion` varchar(45) DEFAULT NULL,
  `Usutipo` varchar(1) NOT NULL,
  `Usuestado` varchar(1) NOT NULL,
  `Usucontrasena` varchar(12) NOT NULL,
  `Usufechacreacion` date NOT NULL,
  `Usufechainactivacion` date DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'1023112873','1023112873','Roxana Palacio','Rpalacio@gmail.com','3104916827','Calle 80 25 - 33','U','A','password1','2021-09-13',NULL),(2,'1022718903','1022718903','Luis Beltran','Lbeltran@gmail.com','3114180738','Carrera 9 90 - 110','U','A','password2','2021-08-23',NULL),(3,'1044213749','1044213749','Eduardo Cespedes','Ecespedes@gmail.com','3131125980','Transversal 17 54 - 109','U','A','password3','2021-08-23',NULL),(4,'1019234617','1019234617','Carolina Correa','Ccorrea@gmail.com','3204672628','Calle 67 10 - 93','U','B','password4','2021-08-24',NULL),(7,'1022718903','1022718903','Luis Beltran','Lbeltran@gmail.com','3114180738','Carrera 9 90 - 110','U','A','password6','2021-11-10',NULL),(8,'admin','52479631','Fredy Montoya Caballero',NULL,NULL,NULL,'A','A','admin123','2021-11-10',NULL),(9,'52515288','52515288','Rafael Contreras','rafaelc@hotmail.com','5963287','calle 76b No. 99b-45','U','I','pwd123456','2021-11-10',NULL),(12,'admin1','10234569','Angie Peralta','angie.peralta@hotmail.com','5963287','carrera 4 No. 26-09','A','A','admin123','2021-11-15',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'biblioteca'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `revisarMora` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8mb4 */ ;;
/*!50003 SET character_set_results = utf8mb4 */ ;;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `revisarMora` ON SCHEDULE EVERY 1 DAY STARTS '2021-11-19 01:00:00' ON COMPLETION NOT PRESERVE ENABLE DO SET SQL_SAFE_UPDATES = 0 */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-18 15:05:12

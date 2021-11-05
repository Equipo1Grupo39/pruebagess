

CREATE DATABASE /*!32312 IF NOT EXISTS*/`biblioteca` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `biblioteca`;





CREATE TABLE IF NOT EXISTS  `administrador` (
  `idadministrador` int(3) NOT NULL AUTO_INCREMENT,
  `Admnombresapellidos` varchar(45) NOT NULL,
  `Admcedula` char(10) NOT NULL,
  `Admemail` varchar(45) NOT NULL,
  `Admdireccion` varchar(45) NOT NULL,
  `Admfechacreacion` date NOT NULL,
  `Admfechainactivacion` date DEFAULT NULL,
  `Admtelefono` char(10) NOT NULL,
  `Admclavemaestra` int(8) NOT NULL,
  PRIMARY KEY (`idadministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `administrador` */

insert  into `administrador`(`idadministrador`,`Admnombresapellidos`,`Admcedula`,`Admemail`,`Admdireccion`,`Admfechacreacion`,`Admfechainactivacion`,`Admtelefono`,`Admclavemaestra`) values 
(1,'Lucia Menendez','1017323415','lmenendez@gmail.com','Calle 60 45 - 30','0000-00-00',NULL,'3203184466',12345678);

/*Table structure for table `alarma` */

 

CREATE TABLE IF NOT EXISTS  `alarma` (
  `codigoalarma` varchar(45) NOT NULL,
  `Ala_codigoregistroprestamos` int(11) NOT NULL,
  `Ala_idusuario` int(11) NOT NULL,
  `Ala_idadministrador` int(11) NOT NULL,
  `Alafechadevencimiento` date NOT NULL,
  `Alageneraralarma` enum('Recuerde realizar devolución a tiempo') NOT NULL,
  PRIMARY KEY (`codigoalarma`),
  KEY `codigoregistroprestamos` (`Ala_codigoregistroprestamos`),
  KEY `idusuario` (`Ala_idusuario`),
  KEY `alarma_ibfk_3` (`Ala_idadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `alarma` */

/*Table structure for table `audiosyvideos` */



CREATE TABLE IF NOT EXISTS `audiosyvideos` (
  `codigoaudiosyvideosisbn` varchar(100) NOT NULL,
  `AyVtitulo` varchar(100) NOT NULL,
  `AyVcontenido` varchar(500) NOT NULL,
  `AyV_codigoautor` int(3) NOT NULL,
  `AyV_codigomateria` int(3) NOT NULL,
  `AyV_codigoeditorial` int(3) NOT NULL,
  `AyV_codigoidioma` int(3) NOT NULL,
  `AyV_codigosignaturatopografica`int (100) NOT NULL,
  `AyVfechacreacion` date NOT NULL,
  `AyVfecharetiro` date DEFAULT NULL,
  PRIMARY KEY (`codigoaudiosyvideosisbn`),
  KEY `codigoautor` (`AyV_codigoautor`),
  KEY `codigomateria` (`AyV_codigomateria`),
  KEY `codigoeditorial` (`AyV_codigoeditorial`),
  KEY `codigoidioma` (`AyV_codigoidioma`),
  KEY `codigosignaturatopografica` (`AyV_codigosignaturatopografica`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `audiosyvideos` */

/*Table structure for table `autor` */

 

CREATE TABLE IF NOT EXISTS  `autor` (
  `codigoautor` int(3) NOT NULL AUTO_INCREMENT,
  `Autnombresapellidos` varchar(45) NOT NULL,
  `Autnacionalidad` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoautor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `autor` */

insert  into `autor`(`codigoautor`,`Autnombresapellidos`,`Autnacionalidad`) values 
(1,'Augusto Ghio D.','Chileno'),
(2,'Sen, Amartya','Indio');

/*Table structure for table `bloqueomultas` */

 

CREATE TABLE IF NOT EXISTS  `bloqueomultas` (
  `codigobloqueomultas` int(11) NOT NULL AUTO_INCREMENT,
  `BMu_codigoalarma` varchar(45) NOT NULL,
  `BMu_codigoregistroprestamos` int(11) NOT NULL,
  `BMu_idusuario` int(11) NOT NULL,
  `BMu_idadministrador` int(11) NOT NULL,
  `Bmugenerarbloqueo` enum('Sin prestamos por devoluciones pendientes o multas por pagar') NOT NULL,
  PRIMARY KEY (`codigobloqueomultas`),
  KEY `codigoalarma` (`BMu_codigoalarma`),
  KEY `codigoregistroprestamos` (`BMu_codigoregistroprestamos`),
  KEY `idusuario` (`BMu_idusuario`),
  KEY `bloqueomultas_ibfk_4` (`BMu_idadministrador`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bloqueomultas` */

/*Table structure for table `editorial` */


CREATE TABLE IF NOT EXISTS  `editorial` (
  `codigoeditorial` int(3) NOT NULL AUTO_INCREMENT,
  `Edinombreeditorial` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoeditorial`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `editorial` */

insert  into `editorial`(`codigoeditorial`,`Edinombreeditorial`) values 
(1,'Planeta'),
(2,'Penguin Random House'),
(4,'Editorial Solar SAS');

/*Table structure for table `facturasmulta` */
 

CREATE TABLE IF NOT EXISTS  `facturasmulta` (
  `codigofacturasmulta` int(11) NOT NULL AUTO_INCREMENT,
  `FMu_codigoalarma` varchar(45) NOT NULL,
  `FMu_idusuario` int(11) NOT NULL,
  `FMu_idadministrador` int(11) NOT NULL,
  `FMuvalorafacturar` int(11) NOT NULL,
  `FMugenerarfactura` varchar(200) NOT NULL,
  PRIMARY KEY (`codigofacturasmulta`),
  KEY `codigoalarma` (`FMu_codigoalarma`),
  KEY `idusuario` (`FMu_idusuario`),
  KEY `idadministrador` (`FMu_idadministrador`)) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `facturasmulta` */

/*Table structure for table `idioma` */

CREATE TABLE IF NOT EXISTS  `idioma` (
  `codigoidioma` int(3) NOT NULL AUTO_INCREMENT,
  `Idinombreidioma` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoidioma`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `idioma` */

insert  into `idioma`(`codigoidioma`,`Idinombreidioma`) values 
(1,'Español'),
(3,'Ingles');

/*Table structure for table `inventario` */



CREATE TABLE IF NOT EXISTS  `inventario` (
  `codigoinventario` int(11) NOT NULL AUTO_INCREMENT,
  `Inv_codigolibroisbn` varchar(100) NOT NULL,
  `Inv_codigoaudiosyvideosisbn` varchar(100) NOT NULL,
  `Inv_codigosignaturatopografica` varchar(100) NOT NULL,
  `Invnumerodeejemplares` int(11) NOT NULL,
  PRIMARY KEY (`codigoinventario`),
  KEY `codigolibroisbn` (`Inv_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`Inv_codigoaudiosyvideosisbn`),
  KEY `codigosignaturatopografica` (`Inv_codigosignaturatopografica`)
  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `inventario` */

/*Table structure for table `libros` */
 


CREATE TABLE IF NOT EXISTS  `libros` (
  `codigolibroisbn` varchar(100) NOT NULL,
  `Libtitulo` varchar(100) NOT NULL,
  `Libnumerodepaginas` int(11) NOT NULL,
  `Lib_codigoautor` int(3) NOT NULL,
  `Lib_codigomateria` int(3) NOT NULL,
  `Lib_codigoeditorial` int(3) NOT NULL,
  `Lib_codigoidioma` int(3) NOT NULL,
  `Lib_codigosignaturatopografica` varchar(100) NOT NULL,
  `Libfechacreacion` date NOT NULL,
  `Libfecharetiro` date DEFAULT NULL,
  PRIMARY KEY (`codigolibroisbn`),
  KEY `codigoautor` (`Lib_codigoautor`),
  KEY `codigomateria` (`Lib_codigomateria`),
  KEY `codigoeditorial` (`Lib_codigoeditorial`),
  KEY `codigoidioma` (`Lib_codigoidioma`),
  KEY `codigosignaturatopografica` (`Lib_codigosignaturatopografica`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `libros` */

insert  into `libros`(`codigolibroisbn`,`Libtitulo`,`Libnumerodepaginas`,`Lib_codigoautor`,`Lib_codigomateria`,`Lib_codigoeditorial`,`Lib_codigoidioma`,`Lib_codigosignaturatopografica`,`Libfechacreacion`,`Libfecharetiro`) values 
('978-958-5165-11-3','Un hogar en el mundo',544,2,800,2,1,'Lit-Mem-U','2021-08-17',NULL);


/*Table structure for table `materia` */


CREATE TABLE IF NOT EXISTS  `materia` (
  `codigomateria` int(3) NOT NULL,
  `Matnombremateria` varchar(45) NOT NULL,
  PRIMARY KEY (`codigomateria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `materia` */

insert  into `materia`(`codigomateria`,`Matnombremateria`) values 
(410,'Lingüística'),
(800,'Literatura y retórica');

/*Table structure for table `pagos` */

 
CREATE TABLE IF NOT EXISTS  `pagos` (
  `codigopagos` int(11) NOT NULL AUTO_INCREMENT,
  `Pag_codigofacturasmulta` int(11) NOT NULL,
  `Pag_idusuario` int(11) NOT NULL,
  `Pag_idadministrador` int(3) NOT NULL,
  `Pag_idtbiblioteca` int(11) NOT NULL,
  `PagfacturacanceladaS/N` enum('Si','No') NOT NULL,
  PRIMARY KEY (`codigopagos`),
  KEY `codigofacturasmulta` (`Pag_codigofacturasmulta`),
  KEY `idusuario` (`Pag_idusuario`),
  KEY `idadministrador` (`Pag_idadministrador`),
  KEY `idtbiblioteca` (`Pag_idtbiblioteca`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pagos` */

/*Table structure for table `registrodeprestamo` */


CREATE TABLE IF NOT EXISTS  `registrodeprestamo` (
  `codigoregistroprestamos` int(11) NOT NULL,
  `RPr_idusuario` int(3) NOT NULL,
  `RPr_idadministrador` int(3) NOT NULL,
  `RPr_codigoinventario` int(3) NOT NULL,
  `RPr_codigolibroisbn` varchar(100) NOT NULL,
  `RPr_codigoaudiosyvideosisbn` varchar(100) NOT NULL,
  `RPrestadoaprobadoS/N` enum('Si','No') NOT NULL,
  `RPrfechaprestamo` date NOT NULL,
  `RPrfechadevolucion` date DEFAULT NULL,
  PRIMARY KEY (`codigoregistroprestamos`),
  KEY `idusuario` (`RPr_idusuario`),
  KEY `codigoinventario` (`RPr_codigoinventario`),
  KEY `codigolibroisbn` (`RPr_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`RPr_codigoaudiosyvideosisbn`),
  KEY `registrodeprestamo_ibfk_2` (`RPr_idadministrador`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `registrodeprestamo` */

/*Table structure for table `reservas` */

 
CREATE TABLE IF NOT EXISTS  `reservas` (
  `codigoreservas` int(11) NOT NULL AUTO_INCREMENT,
  `Res_idusuario` int(11) NOT NULL,
  `Res_idadministrador` int(11) NOT NULL,
  `Res_codigoregistroprestamos` int(11) NOT NULL,
  `Res_codigoinventario` int(11) NOT NULL,
  `Res_codigolibroisbn` varchar(100) NOT NULL,
  `Res_codigoaudiosyvideosisbn` varchar(100) NOT NULL,
  `ResestadoaprobadoS/N` enum('Si','No') NOT NULL,
  `Resfechaentregamaterialreservado` date NOT NULL,
  PRIMARY KEY (`codigoreservas`),
  KEY `idusuario` (`Res_idusuario`),
  KEY `codigoregistroprestamos` (`Res_codigoregistroprestamos`),
  KEY `codigoinventario` (`Res_codigoinventario`),
  KEY `codigolibroisbn` (`Res_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`Res_codigoaudiosyvideosisbn`),
  KEY `reservas_ibfk_2` (`Res_idadministrador`)
 
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `reservas` */
 

CREATE TABLE IF NOT EXISTS  `tbiblioteca` (
  `idtbiblioteca` int(100) NOT NULL DEFAULT '4657',
  `Tbinombre` varchar(45) NOT NULL,
  `Tbinit` int(10) NOT NULL,
  `Tbiemail` varchar(45) NOT NULL,
  `Tbidireccion` varchar(45) NOT NULL,
  `Tbitelefono` varchar(10) NOT NULL,
  `Tbicuentabancaria` varchar(20) NOT NULL,
  `Tbinombrebanco` varchar(45) NOT NULL,
  PRIMARY KEY (`idtbiblioteca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbiblioteca` */

insert  into `tbiblioteca`(`idtbiblioteca`,`Tbinombre`,`Tbinit`,`Tbiemail`,`Tbidireccion`,`Tbitelefono`,`Tbicuentabancaria`,`Tbinombrebanco`) values 
(4657,'Instituto Pedagogico de Cultura y Arte',75087804,'irios_ipca@gmail.com','Calle 11 1 - 75','5722125172','657-018922-1','AvVillas');

/*Table structure for table `usuario` */
/*Table structure for table `signaturatopografica` */
 

CREATE TABLE IF NOT EXISTS  `signaturatopografica` (
  `codigosignaturatopografica` varchar(100) NOT NULL,
  `STo_idtbiblioteca` int (100) DEFAULT NULL,
  `STo_codigolibroisbn` varchar(100) DEFAULT NULL,
  `STo_codigoaudiosyvideosisbn` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigosignaturatopografica`),
  KEY `idbiblioteca` (`STo_idtbiblioteca`),
  KEY `codigolibroisbn` (`STo_codigolibroisbn`),
  KEY `codigoaudiosyvideosisbn` (`STo_codigoaudiosyvideosisbn`)
 
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `signaturatopografica` */

insert  into `signaturatopografica`(`codigosignaturatopografica`,`STo_idtbiblioteca`,`STo_codigolibroisbn`,`STo_codigoaudiosyvideosisbn`) values 
('Lit-Mem-U',4657,'978-958-5165-11-3',NULL),
('Lit-Mem-U-001',4657,'978-958-5165-11-3',NULL);

/*Table structure for table `tbiblioteca` */





CREATE TABLE IF NOT EXISTS  `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `Usunombresapellidos` varchar(45) NOT NULL,
  `Usucedula` char(10) NOT NULL,
  `Usuemail` varchar(45) DEFAULT NULL,
  `Usudireccion` varchar(45) NOT NULL,
  `Usufechacreacion` date NOT NULL,
  `Usufechainactivacion` date DEFAULT NULL,
  `Usutelefono` char(10) NOT NULL,
  `Usu_codigopagos` int(11) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `codigopagos` (`Usu_codigopagos`)
 
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`idusuario`,`Usunombresapellidos`,`Usucedula`,`Usuemail`,`Usudireccion`,`Usufechacreacion`,`Usufechainactivacion`,`Usutelefono`,`Usu_codigopagos`) values 
(1,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','2021-09-13',NULL,'3104916827',NULL),
(2,'Luis Beltran','1022718903','Lbeltran@gmail.com','Carrera 9 90 - 110','2021-08-23',NULL,'3114180738',NULL),
(3,'Eduardo Cespedes','1044213749','Ecespedes@gmail.com','Transversal 17 54 - 109','2021-08-23',NULL,'3131125980',NULL),
(4,'Carolina Correa','1019234617','Ccorrea@gmail.com','Calle 67 10 - 93','2021-08-24',NULL,'3204672628',NULL),
(5,'Carolina Correa','1019234617','Ccorrea@gmail.com','Calle 67 10 - 93','0000-00-00',NULL,'3204672628',NULL),
(6,'Eduardo Cespedes','1044213749','Ecespedes@gmail.com','Transversal 17 54 - 109','0000-00-00',NULL,'3131125980',NULL),
(7,'Luis Beltran','1022718903','Lbeltran@gmail.com','Carrera 9 90 - 110','0000-00-00',NULL,'3114180738',NULL),
(8,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','0000-00-00',NULL,'3104916827',NULL),
(9,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','0000-00-00',NULL,'3104916827',NULL),
(10,'Carolina Correa','1019234617','Ccorrea@gmail.com','Calle 67 10 - 93','2021-08-24',NULL,'3204672628',NULL),
(11,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','2021-08-22',NULL,'3104916827',NULL),
(12,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','2021-09-13',NULL,'3104916827',NULL),
(13,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','2021-09-13',NULL,'3104916827',NULL),
(14,'Roxana Palacio','1023112873','Rpalacio@gmail.com','Calle 80 25 - 33','2021-09-13',NULL,'3104916827',NULL);

/*funsiones */
DELIMITER $$


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;





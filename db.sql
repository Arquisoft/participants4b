
CREATE TABLE `citizen` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `residencia` varchar(40) NOT NULL,
  `nacionalidad` varchar(15) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(20) NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) 
INSERT INTO `citizen` VALUES (1,'Marcos','González ','1957-04-15','C/Misteriosa nº38','Española','14574169H','marcos@gmail.com','marcos1',0),(2,'María','Pérez','1964-11-28','C/Inexistente nº12','Española','45311759P','maria@gmail.com','maria1',0);

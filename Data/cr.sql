/*Reference,Colour_Description,Breed_Description,Animal_Name,Gender,Suburb,Mother,Father
20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER,,*/
use Kennell2
DROP TABLE IF EXISTS `dogs`;
CREATE TABLE `dogs` (
  `dogID` int(2) NOT NULL ,
  `Color` varchar(255) DEFAULT NULL,
  `Breed` varchar(255) DEFAULT NULL,
  `DogName` varchar(255) DEFAULT NULL,
  `Gender` varchar(255) DEFAULT NULL,
  `CityOrigin` varchar(255) DEFAULT NULL,
  `MotherID` varchar(255) DEFAULT NULL,
  `FatherID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DogID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

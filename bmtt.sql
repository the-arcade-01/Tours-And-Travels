CREATE TABLE `cabs` (
  `CID` int(4) NOT NULL,
  `CNAME` varchar(50) NOT NULL,
  `CNO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`CID`));

CREATE TABLE `drivers` (
  `did` int(4) NOT NULL,
  `dname` varchar(50) NOT NULL,
  `dmobno` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`did`));

CREATE TABLE `bookings` (
  `BID` int(6) NOT NULL,
  `B_FROM` varchar(50) DEFAULT NULL,
  `B_TO` varchar(50) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `CID` int(4) DEFAULT NULL,
  `DID` int(4) DEFAULT NULL,
  PRIMARY KEY (`BID`),
  KEY `CID` (`CID`),
  KEY `DID` (`DID`),
  CONSTRAINT `bookings_ibfk_1` FOREIGN KEY (`CID`) REFERENCES `cabs` (`CID`),
  CONSTRAINT `bookings_ibfk_2` FOREIGN KEY (`DID`) REFERENCES `drivers` (`did`));

 
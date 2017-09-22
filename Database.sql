-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2017 at 09:26 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlinegame`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Accountname` varchar(100) NOT NULL,
  `passwords` varchar(10000) NOT NULL,
  `Email` mediumtext NOT NULL,
  `Accountcreated` date DEFAULT NULL,
  `LastSignedin` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Accountname`, `passwords`, `Email`, `Accountcreated`, `LastSignedin`) VALUES
('Ashmar', '1234', ' ashmar@gmail.com', '2016-05-22', '00:08:16'),
('dsdsd', 'sssas', ' ', '2016-05-21', '10:41:08'),
('hassan', '123', 'jdshsjdsi@gmail.com', '2016-08-27', '11:40:07'),
('Reem', '1', 'Reem@gmail.com', '2016-06-01', '04:48:02');

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE `characters` (
  `Charname` varchar(100) NOT NULL,
  `Lvl` int(11) DEFAULT NULL,
  `Class` varchar(30) DEFAULT NULL,
  `Exppoints` int(11) DEFAULT NULL,
  `Actname` varchar(100) DEFAULT NULL,
  `Rname` varchar(100) DEFAULT NULL,
  `Iname` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`Charname`, `Lvl`, `Class`, `Exppoints`, `Actname`, `Rname`, `Iname`) VALUES
('Ashmar1', 110, 'DragonSlayer', 5000, 'Ashmar', 'Highland', 'Sword'),
('Ashmar2', 110, 'Gunner', 50000, 'Ashmar', 'LowLand', 'Gun'),
('Ashmar3', 3, 'Ninja', 99, 'Ashmar', 'Highland', 'Kunai'),
('Ashmar4', 15, 'Warrior', 5555, 'Ashmar', 'LowLand', 'Sword'),
('Ashmar5', 55, 'DragonSlayer', 5555, 'Ashmar', 'Highland', 'Sword'),
('HHH', 5, 'Warrior', 55, 'dsdsd', 'Iceland', 'Sword'),
('N', 11, 'Ninja', 620, 'Reem', 'Highland', 'Kunai'),
('N2', 55, 'Archer', 1, 'Reem', 'Highland', 'Bow'),
('N3', 5555, 'DragonSlayer', 333, 'Reem', 'FireLand', 'Sword'),
('Reem', 55, 'Gunner', 22, 'Reem', 'Highland', 'Gun');

--
-- Triggers `characters`
--
DELIMITER $$
CREATE TRIGGER `char_add` BEFORE INSERT ON `characters` FOR EACH ROW BEGIN
 If (new.Lvl < 0 ) then
Set  new.Lvl =new.Lvl* -1 ;

END IF;
If (new.Exppoints < 0 ) then
Set  new.Exppoints =new.Exppoints * -1 ;

END IF;
End
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `Classname` varchar(100) NOT NULL,
  `Itname` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`Classname`, `Itname`) VALUES
('Archer', 'Bow'),
('Gunner', 'Gun'),
('Ninja', 'Kunai'),
('DragonSlayer', 'Sword'),
('Warrior', 'Sword');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `Itemname` varchar(100) NOT NULL,
  `ItemDamage` int(11) DEFAULT NULL,
  `Itemtype` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`Itemname`, `ItemDamage`, `Itemtype`) VALUES
('Bow', 1500, 'Rangetype'),
('Dagger', 6000, 'Mele'),
('Gun', 2000, 'Rangetype'),
('Kunai', 2000, 'Mele/range'),
('Sword', 13000, 'Meletype');

--
-- Triggers `item`
--
DELIMITER $$
CREATE TRIGGER `itemneg` BEFORE INSERT ON `item` FOR EACH ROW BEGIN
 If (new.ItemDamage < 0 ) then
Set  new.ItemDamage =new.ItemDamage* -1 ;

END IF;
End
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `monster`
--

CREATE TABLE `monster` (
  `Monstername` varchar(100) NOT NULL,
  `MonsterDamage` int(11) DEFAULT NULL,
  `Monstertype` varchar(30) DEFAULT NULL,
  `Mosterlvl` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monster`
--

INSERT INTO `monster` (`Monstername`, `MonsterDamage`, `Monstertype`, `Mosterlvl`) VALUES
('Blaze Dragon', 5555, 'Fire', 10),
('Blood Dragon', 2000, 'Fire', 110),
('Blue Dragon', 3300, 'Thunder', 200),
('Serpentine Dragon', 5000, 'Ice', 200),
('Tiny Dragon', 5, 'wind', 1);

--
-- Triggers `monster`
--
DELIMITER $$
CREATE TRIGGER `dmgneg` BEFORE INSERT ON `monster` FOR EACH ROW BEGIN
 If (new.MonsterDamage < 0 ) then
Set  new.MonsterDamage =new.MonsterDamage* -1 ;

END IF;
If (new.Mosterlvl < 0 ) then
Set  new.Mosterlvl =new.Mosterlvl* -1 ;

END IF;

End
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

CREATE TABLE `region` (
  `Regname` varchar(100) NOT NULL,
  `Climate` varchar(100) DEFAULT NULL,
  `Precipitation` varchar(30) DEFAULT NULL,
  `Foliage` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `region`
--

INSERT INTO `region` (`Regname`, `Climate`, `Precipitation`, `Foliage`) VALUES
('FireLand', 'Hot', 'Sunny', 'no Foliage'),
('Highland', 'Moderate', 'Sunny', 'Green'),
('Iceland', 'Cold', 'Cloudy', 'No Foliage'),
('LowLand', 'cold', 'rainy', 'yellowish');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Accountname`);

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`Charname`),
  ADD KEY `Actname` (`Actname`),
  ADD KEY `Rname` (`Rname`),
  ADD KEY `Iname` (`Iname`);

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`Classname`),
  ADD KEY `fk1` (`Itname`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`Itemname`);

--
-- Indexes for table `monster`
--
ALTER TABLE `monster`
  ADD PRIMARY KEY (`Monstername`);

--
-- Indexes for table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`Regname`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `characters`
--
ALTER TABLE `characters`
  ADD CONSTRAINT `characters_ibfk_1` FOREIGN KEY (`Actname`) REFERENCES `account` (`Accountname`),
  ADD CONSTRAINT `characters_ibfk_2` FOREIGN KEY (`Rname`) REFERENCES `region` (`Regname`),
  ADD CONSTRAINT `characters_ibfk_3` FOREIGN KEY (`Iname`) REFERENCES `item` (`Itemname`);

--
-- Constraints for table `class`
--
ALTER TABLE `class`
  ADD CONSTRAINT `class_ibfk_1` FOREIGN KEY (`Itname`) REFERENCES `item` (`Itemname`),
  ADD CONSTRAINT `fk1` FOREIGN KEY (`Itname`) REFERENCES `item` (`Itemname`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

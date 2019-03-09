-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 16, 2017 at 05:48 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `myproject`
--
CREATE DATABASE IF NOT EXISTS `myproject` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `myproject`;

-- --------------------------------------------------------

--
-- Table structure for table `patientrecord`
--

CREATE TABLE IF NOT EXISTS `patientrecord` (
  `PatientId` int(11) NOT NULL AUTO_INCREMENT,
  `LastName` varchar(50) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `Age` int(2) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `PhoneNo` varchar(11) NOT NULL,
  PRIMARY KEY (`PatientId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `patientrecord`
--

INSERT INTO `patientrecord` (`PatientId`, `LastName`, `FirstName`, `Age`, `Gender`, `Address`, `PhoneNo`) VALUES
(1, 'Elias', 'Regi', 20, 'M', 'Rukuba', '123456'),
(2, 'Elias', 'Regi', 20, 'M', 'Rukuba', '123456'),
(3, 'Elias', 'Regi', 20, 'F', 'Rukuba', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE IF NOT EXISTS `result` (
  `ResultId` int(11) NOT NULL AUTO_INCREMENT,
  `PatientId` int(11) NOT NULL,
  `DiseaseStatus` varchar(10) NOT NULL,
  `DiseaseSeverity` varchar(10) NOT NULL,
  `Treatment` varchar(255) NOT NULL,
  PRIMARY KEY (`ResultId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

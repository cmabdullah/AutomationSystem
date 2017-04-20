-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 18, 2017 at 06:49 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `CarRent`
--

-- --------------------------------------------------------

--
-- Table structure for table `CarInfo`
--

CREATE TABLE `CarInfo` (
  `brandname` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `price` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CarInfo`
--

INSERT INTO `CarInfo` (`brandname`, `model`, `status`, `price`) VALUES
('Farari', '800', 'Abailable', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `rentInfo`
--

CREATE TABLE `rentInfo` (
  `rentername` varchar(100) NOT NULL,
  `rentervoterid` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `fromdate` varchar(100) NOT NULL,
  `returndate` varchar(100) NOT NULL,
  `toralprice` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rentInfo`
--

INSERT INTO `rentInfo` (`rentername`, `rentervoterid`, `address`, `phone`, `fromdate`, `returndate`, `toralprice`) VALUES
('rayhan', '11111', 'ddd', 'ffff', 'ffff', 'fffff', 200000);

-- --------------------------------------------------------

--
-- Table structure for table `userInfo`
--

CREATE TABLE `userInfo` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userInfo`
--

INSERT INTO `userInfo` (`username`, `password`) VALUES
('ab', 'cd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 18, 2017 at 12:18 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `AutomationSystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `abc`
--

CREATE TABLE `abc` (
  `Id12` varchar(100) NOT NULL,
  `Id13` varchar(100) NOT NULL,
  `id14` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `abc`
--

INSERT INTO `abc` (`Id12`, `Id13`, `id14`) VALUES
('1', 'The book is ______ the table', 2),
('2', 'He want ______ befor', 2),
('3', 'He sent ______ me', 2),
('4', 'He is ______ me', 2),
('5', 'I am ______ a Class', 2);

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE `log` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `log`
--

INSERT INTO `log` (`username`, `password`) VALUES
('abcd', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `indexQ` int(100) NOT NULL,
  `q2` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`indexQ`, `q2`) VALUES
(1, 'hellow world'),
(0, 'dfddfd'),
(0, 'dfdfdfsd');

-- --------------------------------------------------------

--
-- Table structure for table `SA`
--

CREATE TABLE `SA` (
  `an` varchar(20) NOT NULL,
  `ID` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `SA`
--

INSERT INTO `SA` (`an`, `ID`) VALUES
('on', 1),
('away', 2),
('by', 3),
('against', 4),
('for', 5);

-- --------------------------------------------------------

--
-- Table structure for table `SystemContent`
--

CREATE TABLE `SystemContent` (
  `id` int(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `age` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `SystemContent`
--

INSERT INTO `SystemContent` (`id`, `fname`, `lname`, `age`) VALUES
(1510, 'cmss', 'kh@nccd', 2122),
(11, 'wwd', 'ddd', 23);

-- --------------------------------------------------------

--
-- Table structure for table `TA`
--

CREATE TABLE `TA` (
  `Tans` varchar(20) NOT NULL,
  `ID` int(6) NOT NULL,
  `an` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `TA`
--

INSERT INTO `TA` (`Tans`, `ID`, `an`) VALUES
('abi', 1, 'on'),
('def', 2, 'away'),
('ghi', 3, 'by'),
('jkl', 4, 'against'),
('mno', 5, 'for');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `A1` varchar(20) NOT NULL,
  `A2` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`A1`, `A2`) VALUES
(' sss', 1),
(' qq', 1),
('x', 112),
('q', 222);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `SA`
--
ALTER TABLE `SA`
  ADD KEY `an` (`an`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

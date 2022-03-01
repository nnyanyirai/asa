-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 27, 2022 at 11:26 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `asa_assessment`
--

-- --------------------------------------------------------

--
-- Table structure for table `ACCOUNT_TYPE`
--

CREATE TABLE `ACCOUNT_TYPE` (
  `ACCOUNT_TYPE_CODE` varchar(10) NOT NULL,
  `DESCRIPTION` varchar(50) NOT NULL,
  `TRANSACTIONAL` bit(1) NOT NULL DEFAULT b'0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ATM`
--

CREATE TABLE `ATM` (
  `ATM_ID` int(11) NOT NULL,
  `NAME` varchar(10) NOT NULL,
  `LOCATION` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ATM_ALLOCATION`
--

CREATE TABLE `ATM_ALLOCATION` (
  `ATM_ALLOCATION_ID` int(11) NOT NULL,
  `ATM_ID` int(11) NOT NULL,
  `DENOMINATION_ID` int(11) NOT NULL,
  `COUNT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CLIENT`
--

CREATE TABLE `CLIENT` (
  `CLIENT_ID` int(11) NOT NULL,
  `TITLE` varchar(10) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `SURNAME` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `CLIENT_SUB_TYPE_CODE` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CLIENT_ACCOUNT`
--

CREATE TABLE `CLIENT_ACCOUNT` (
  `CLIENT_ACCOUNT_NUMBER` varchar(10) NOT NULL,
  `CLIENT_ID` int(11) NOT NULL,
  `ACCOUNT_TYPE_CODE` varchar(10) NOT NULL,
  `CURRENCY_CODE` varchar(3) NOT NULL,
  `DISPLAY_BALANCE` decimal(18,3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CLIENT_SUB_TYPE`
--

CREATE TABLE `CLIENT_SUB_TYPE` (
  `CLIENT_SUB_TYPE_CODE` varchar(4) NOT NULL,
  `CLIENT_TYPE_CODE` varchar(2) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CLIENT_TYPE`
--

CREATE TABLE `CLIENT_TYPE` (
  `CLIENT_TYPE_CODE` varchar(2) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CREDIT_CARD_LIMIT`
--

CREATE TABLE `CREDIT_CARD_LIMIT` (
  `CLIENT_ACCOUNT_NUMBER` varchar(10) NOT NULL,
  `ACCOUNT_LIMIT` decimal(18,3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CURRENCY`
--

CREATE TABLE `CURRENCY` (
  `CURRENCY_CODE` varchar(3) NOT NULL,
  `DECIMAL_PLACES` int(5) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `CURRENCY_CONVERSION_RATE`
--

CREATE TABLE `CURRENCY_CONVERSION_RATE` (
  `CURRENCY_CODE` varchar(3) NOT NULL,
  `CONVERSION_INDICATOR` varchar(1) NOT NULL,
  `RATE` decimal(18,8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DENOMINATION`
--

CREATE TABLE `DENOMINATION` (
  `DENOMINATION_ID` int(11) NOT NULL,
  `VALUE` decimal(10,0) NOT NULL,
  `DENOMINATION_TYPE_CODE` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DENOMINATION_TYPE`
--

CREATE TABLE `DENOMINATION_TYPE` (
  `DENOMINATION_TYPE_CODE` varchar(1) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ACCOUNT_TYPE`
--
ALTER TABLE `ACCOUNT_TYPE`
  ADD PRIMARY KEY (`ACCOUNT_TYPE_CODE`);

--
-- Indexes for table `ATM`
--
ALTER TABLE `ATM`
  ADD PRIMARY KEY (`ATM_ID`);

--
-- Indexes for table `ATM_ALLOCATION`
--
ALTER TABLE `ATM_ALLOCATION`
  ADD PRIMARY KEY (`ATM_ALLOCATION_ID`),
  ADD KEY `ATM_ID` (`ATM_ID`),
  ADD KEY `DENOMINATION_ID` (`DENOMINATION_ID`);

--
-- Indexes for table `CLIENT`
--
ALTER TABLE `CLIENT`
  ADD PRIMARY KEY (`CLIENT_ID`),
  ADD KEY `CLIENT_SUB_TYPE_CODE` (`CLIENT_SUB_TYPE_CODE`);

--
-- Indexes for table `CLIENT_ACCOUNT`
--
ALTER TABLE `CLIENT_ACCOUNT`
  ADD PRIMARY KEY (`CLIENT_ACCOUNT_NUMBER`),
  ADD KEY `CLIENT_ID` (`CLIENT_ID`),
  ADD KEY `ACCOUNT_TYPE_CODE` (`ACCOUNT_TYPE_CODE`),
  ADD KEY `CURRENCY_CODE` (`CURRENCY_CODE`);

--
-- Indexes for table `CLIENT_SUB_TYPE`
--
ALTER TABLE `CLIENT_SUB_TYPE`
  ADD PRIMARY KEY (`CLIENT_SUB_TYPE_CODE`),
  ADD KEY `CLIENT_TYPE_CODE` (`CLIENT_TYPE_CODE`);

--
-- Indexes for table `CLIENT_TYPE`
--
ALTER TABLE `CLIENT_TYPE`
  ADD PRIMARY KEY (`CLIENT_TYPE_CODE`);

--
-- Indexes for table `CREDIT_CARD_LIMIT`
--
ALTER TABLE `CREDIT_CARD_LIMIT`
  ADD PRIMARY KEY (`CLIENT_ACCOUNT_NUMBER`);

--
-- Indexes for table `CURRENCY`
--
ALTER TABLE `CURRENCY`
  ADD PRIMARY KEY (`CURRENCY_CODE`);

--
-- Indexes for table `CURRENCY_CONVERSION_RATE`
--
ALTER TABLE `CURRENCY_CONVERSION_RATE`
  ADD PRIMARY KEY (`CURRENCY_CODE`);

--
-- Indexes for table `DENOMINATION`
--
ALTER TABLE `DENOMINATION`
  ADD PRIMARY KEY (`DENOMINATION_ID`),
  ADD KEY `DENOMINATION_TYPE_CODE` (`DENOMINATION_TYPE_CODE`);

--
-- Indexes for table `DENOMINATION_TYPE`
--
ALTER TABLE `DENOMINATION_TYPE`
  ADD PRIMARY KEY (`DENOMINATION_TYPE_CODE`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ATM`
--
ALTER TABLE `ATM`
  MODIFY `ATM_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ATM_ALLOCATION`
--
ALTER TABLE `ATM_ALLOCATION`
  MODIFY `ATM_ALLOCATION_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `CLIENT`
--
ALTER TABLE `CLIENT`
  MODIFY `CLIENT_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `DENOMINATION`
--
ALTER TABLE `DENOMINATION`
  MODIFY `DENOMINATION_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ATM_ALLOCATION`
--
ALTER TABLE `ATM_ALLOCATION`
  ADD CONSTRAINT `atm_allocation_ibfk_1` FOREIGN KEY (`ATM_ID`) REFERENCES `ATM` (`ATM_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `atm_allocation_ibfk_2` FOREIGN KEY (`DENOMINATION_ID`) REFERENCES `DENOMINATION` (`DENOMINATION_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `CLIENT`
--
ALTER TABLE `CLIENT`
  ADD CONSTRAINT `client_ibfk_1` FOREIGN KEY (`CLIENT_SUB_TYPE_CODE`) REFERENCES `CLIENT_SUB_TYPE` (`CLIENT_SUB_TYPE_CODE`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `CLIENT_ACCOUNT`
--
ALTER TABLE `CLIENT_ACCOUNT`
  ADD CONSTRAINT `client_account_ibfk_1` FOREIGN KEY (`CLIENT_ID`) REFERENCES `CLIENT` (`CLIENT_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `client_account_ibfk_2` FOREIGN KEY (`ACCOUNT_TYPE_CODE`) REFERENCES `ACCOUNT_TYPE` (`ACCOUNT_TYPE_CODE`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `client_account_ibfk_3` FOREIGN KEY (`CURRENCY_CODE`) REFERENCES `CURRENCY` (`CURRENCY_CODE`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `CLIENT_SUB_TYPE`
--
ALTER TABLE `CLIENT_SUB_TYPE`
  ADD CONSTRAINT `client_sub_type_ibfk_1` FOREIGN KEY (`CLIENT_TYPE_CODE`) REFERENCES `CLIENT_TYPE` (`CLIENT_TYPE_CODE`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `CREDIT_CARD_LIMIT`
--
ALTER TABLE `CREDIT_CARD_LIMIT`
  ADD CONSTRAINT `credit_card_limit_ibfk_1` FOREIGN KEY (`CLIENT_ACCOUNT_NUMBER`) REFERENCES `CLIENT_ACCOUNT` (`CLIENT_ACCOUNT_NUMBER`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `CURRENCY_CONVERSION_RATE`
--
ALTER TABLE `CURRENCY_CONVERSION_RATE`
  ADD CONSTRAINT `currency_conversion_rate_ibfk_1` FOREIGN KEY (`CURRENCY_CODE`) REFERENCES `CURRENCY` (`CURRENCY_CODE`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DENOMINATION`
--
ALTER TABLE `DENOMINATION`
  ADD CONSTRAINT `denomination_ibfk_1` FOREIGN KEY (`DENOMINATION_TYPE_CODE`) REFERENCES `DENOMINATION_TYPE` (`DENOMINATION_TYPE_CODE`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
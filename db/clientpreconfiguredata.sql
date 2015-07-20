-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2014 at 07:35 PM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
 

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
 
--
-- Database: `countrylist`
--
CREATE DATABASE IF NOT EXISTS `lmsdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `lmsdb`;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE IF NOT EXISTS `client_pre_configure_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent` varchar(30),
  `type`  varchar(30),
  `category` varchar(30),
  `gl_account_type`  varchar(30),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6178 ;

--
-- Dumping data for table `location`
--

INSERT INTO `client_pre_configure_data` (`id`, `parent`, `type`, `category`, `gl_account_type`) VALUES
(1, 'Root', 'Bank', 'Head Office', 'Liability pool'),
(2, 'Parent1', 'Partner', 'Branch', 'Settlement pool'),
(3, 'Parent2', '', 'Outlet', 'Profit pool'),
(4, 'Parent3', '', '', 'Fee pool')
-- Adminer 4.8.1 MySQL 8.0.27-0ubuntu0.21.10.1 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `msg_log`;
CREATE TABLE `msg_log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sender` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `channel` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `msg` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `system_log`;
CREATE TABLE `system_log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `value` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` char(255) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- 2022-01-04 12:58:04
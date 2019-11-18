-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.3.20-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 4scoverletter 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `4scoverletter` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `4scoverletter`;

-- 테이블 4scoverletter.teammember 구조 내보내기
CREATE TABLE IF NOT EXISTS `teammember` (
  `name` varchar(50) DEFAULT NULL,
  `email_n` varchar(80) DEFAULT NULL,
  `email_g` varchar(80) DEFAULT NULL,
  `github` varchar(80) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `imgsrc` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 4scoverletter.teammember:~4 rows (대략적) 내보내기
/*!40000 ALTER TABLE `teammember` DISABLE KEYS */;
INSERT INTO `teammember` (`name`, `email_n`, `email_g`, `github`, `position`, `imgsrc`) VALUES
	('박 현찬', 'pitcher0303@naver.com', 'pitcher0303@gmail.com', 'https://github.com/pitcher0303', 'Lead Designer', 'http://106.10.46.34:9000/img/team/1.jpg'),
	('최 영석', 'blackhawk737@naver.com', 'ghkseh123@gmail.com', 'https://github.com/YeongseokChoi', 'Lead Designer', 'http://106.10.46.34:9000/img/team/member2.jpg'),
	('이 원준', 'rhkdqhrehddl@naver.com', 'rhkdqhrehddl@gmail.com', 'https://github.com/rhkdqhrehddl', 'Lead Designer', 'http://106.10.46.34:9000/img/team/1.jpg'),
	('이 주영', 'ljoy1994@naver.com', 'leejoy1994@gmail.com', 'https://github.com/leejoy980', 'Lead Designer', 'http://106.10.46.34:9000/img/team/1.jpg');
/*!40000 ALTER TABLE `teammember` ENABLE KEYS */;

-- 테이블 4scoverletter.token 구조 내보내기
CREATE TABLE IF NOT EXISTS `token` (
  `tid` varchar(50) DEFAULT NULL,
  `tstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 4scoverletter.token:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;

-- 테이블 4scoverletter.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `uemail` varchar(50) DEFAULT NULL,
  `uname` varchar(50) DEFAULT NULL,
  `upassword` varchar(50) DEFAULT NULL,
  `tid` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 4scoverletter.user:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`uemail`, `uname`, `upassword`, `tid`) VALUES
	('pitcher0303@gmail.com', '박현찬', 'anfqud0303', '#123456789');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

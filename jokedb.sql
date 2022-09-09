-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: mysqldb
-- Erstellungszeit: 06. Apr 2021 um 12:48
-- Server-Version: 5.7.33
-- PHP-Version: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `jokedb`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `joke`
--

CREATE TABLE `joke` (
  `id` int(11) NOT NULL,
  `section_idfs` int(11) NOT NULL,
  `text` text COLLATE utf8_bin NOT NULL,
  `rating` int(11) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `joke`
--

INSERT INTO `joke` (`id`, `section_idfs`, `text`, `rating`, `date`) VALUES
(1, 1, 'Kunde: \"Ich möchte Ihren Chef sprechen!\"\r\nSekretärin: \"Geht leider nicht, er ist nicht da!\"\r\nKunde: \"Ich hab ihn doch durchs Fenster gesehen!\"\r\nSekretärin: \"Er Sie auch!\"', 5, '2014-01-08 21:39:40'),
(2, 1, 'Der Verwaltungsrat zum CEO:\r\n\"Na, wie macht sich denn der neue Buchhalter?\"\r\nCEO: \"Toll, dieser Mann!\"\r\nVerwaltungsrat: \"Was kann er denn so besonderes?\"\r\nCEO: \"Er ist gelernter Friseur, er kann frisieren!\"', 3, '2014-01-08 21:42:41'),
(3, 1, 'Chef: \"Müller, Sie sind das beste Pferd in meinem Stall!\"\r\nMüller: \"Wirklich, Chef?\"\r\nChef: \"Ja, Sie machen den meisten Mist!\"', 5, '2014-01-08 21:43:20'),
(6, 2, 'Was steht auf dem Grabstein eines Mathematikers?\r\n\"Damit hat er nicht gerechnet.\"', 3, '2021-04-06 12:47:17');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `section`
--

CREATE TABLE `section` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `section`
--

INSERT INTO `section` (`id`, `name`) VALUES
(1, 'Flachwitze'),
(2, 'Schwarzer Humor');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `joke`
--
ALTER TABLE `joke`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `section`
--
ALTER TABLE `section`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `joke`
--
ALTER TABLE `joke`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `section`
--
ALTER TABLE `section`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

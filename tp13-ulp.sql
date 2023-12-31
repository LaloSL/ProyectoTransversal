-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2023 a las 19:36:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tp13-ulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNacimiento` varchar(100) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES
(34, 12345671, 'Veron', 'Juan', '2001-01-22', 1),
(35, 12345672, 'Milito', 'Gabriel', '2002-02-12', 1),
(36, 12345673, 'Perez', 'Juan manuel', '2001-03-12', 1),
(37, 1231231231, 'Ortega', 'Joaco', '1990-05-05', 1),
(38, 123, 'ortega', 'marcos', '2023-10-17', 1),
(39, 1234, 'lucero', 'maria', '2023-10-10', 1),
(40, 123123, 'chaher', 'alejandro', '2023-10-03', 1),
(41, 123456, 'becerra', 'maria', '2023-10-04', 1),
(42, 111111, 'Martinez', 'Mariano', '2023-10-21', 1),
(43, 1231233, 'perez', 'juan', '1995-05-05', 1),
(44, 347008606, 'pepito', 'pablo', '2023-10-24', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`idInscripto`, `nota`, `idAlumno`, `idMateria`) VALUES
(3, 8, 34, 24),
(4, 7, 34, 25),
(7, 2, 36, 28),
(10, 5, 35, 26),
(11, 7, 38, 26),
(12, 10, 35, 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(24, 'Ingles', 2023, 0),
(25, 'Matematica 5', 2023, 1),
(26, 'Lengua', 2023, 1),
(27, 'Fisica', 2023, 1),
(28, 'Quimica', 2023, 1),
(29, 'Biología', 2023, 1),
(30, 'Literatura', 2023, 1),
(31, 'Laboratorio1', 2023, 0),
(32, 'EDA', 2023, 1),
(33, 'Ingles2', 2022, 1),
(34, 'Matematica 2', 2023, 1),
(37, 'Matematica 3', 2023, 0),
(40, 'Matematica 4', 2023, 1),
(52, 'literatura II', 2023, 1),
(53, 'historia americana', 2023, 1),
(54, 'historia argentna', 2023, 1),
(55, 'pepita', 12023, 1),
(56, 'Geografia argentina', 2023, 1),
(57, 'Geografia Argentina 2', 2023, 0),
(59, 'Geografia argentina 1', 2023, 1),
(67, 'Ingenieria ', 2023, 1),
(69, 'Ingenieria 2', 2023, 1),
(70, 'ingenieria1', 2023, 1),
(71, 'Biologia 1', 2023, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripto`),
  ADD UNIQUE KEY `idAlumno` (`idAlumno`,`idMateria`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 29-Nov-2022 às 19:59
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `lojahq`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `item`
--

CREATE TABLE `item` (
  `id_item` int(15) NOT NULL,
  `edicao` int(5) NOT NULL,
  `ano` int(5) NOT NULL,
  `nome_hq` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `ilust` varchar(50) NOT NULL,
  `editora` varchar(25) NOT NULL,
  `imagem` varchar(200) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `item`
--

INSERT INTO `item` (`id_item`, `edicao`, `ano`, `nome_hq`, `autor`, `ilust`, `editora`, `imagem`, `endereco`) VALUES
(8, 25, 2022, 'Batman', 'Scott Snyder', 'Greg Capullo', 'DC Comics', '51L6uw5et-L._SX336_BO1,204,203,200_.jpg', '../uploads/51L6uw5et-L._SX336_BO1,204,203,200_.jpg'),
(9, 50, 2020, 'Flash', 'Thiago', 'Camila', 'DC comics', 'download.jpg', '../uploads/download.jpg');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `n_usuario` varchar(50) NOT NULL,
  `endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `id_venda` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id_item`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_item` (`id_item`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `item`
--
ALTER TABLE `item`
  MODIFY `id_item` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  ADD CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`id_item`) REFERENCES `item` (`id_item`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

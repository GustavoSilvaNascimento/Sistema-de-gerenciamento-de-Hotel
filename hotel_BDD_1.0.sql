
create database hotel;
use hotel;
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    telefone VARCHAR(20)
    
);

CREATE TABLE Quartos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL UNIQUE,
    tipo VARCHAR(50) NOT NULL,
    status ENUM('Disponível', 'Ocupado', 'Manutenção', 'Reservado') NOT NULL,
    valor_diaria DECIMAL(10,2) NOT NULL

);

CREATE TABLE Reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_quarto INT NOT NULL,
    id_cliente INT NOT NULL,
    data_checkin DATE NOT NULL,
    data_checkout DATE NOT NULL,
    valor_total DECIMAL(10,2) NOT NULL,
    status ENUM('Ativo','Finalizado') NOT NULL,
    FOREIGN KEY (id_quarto) REFERENCES Quartos(id),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id)
);

CREATE TABLE Pagamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_reserva INT NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    data_pagamento DATE NOT NULL,
    metodo ENUM('Cartão de Crédito', 'Pix', 'Cartão de debito', 'Dinheiro') NOT NULL,
    FOREIGN KEY (id_reserva) REFERENCES Reservas(id)
);

CREATE TABLE Funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    login VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

INSERT INTO Funcionarios (nome, cargo, login, senha) 
VALUES ('Administrador', 'Mestre', 'Admin', 'Admin');

INSERT INTO Quartos (id, numero, tipo, status, valor_diaria) VALUES
(1, 101, 'Solteiro', 'Disponível', 150.00),
(2, 102, 'Casal', 'Disponível', 200.00),
(3, 103, 'Duplo', 'Disponível', 180.00),
(4, 104, 'Solteiro', 'Disponível', 150.00),
(5, 105, 'Casal', 'Disponível', 200.00),
(6, 106, 'Duplo', 'Disponível', 180.00),
(7, 107, 'Solteiro', 'Disponível', 150.00),
(8, 108, 'Casal', 'Disponível', 200.00),
(9, 109, 'Duplo', 'Disponível', 180.00),
(10, 110, 'Casal', 'Disponível', 200.00);


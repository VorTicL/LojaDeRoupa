<bm> Loja De Roupa</bm>

Crie um banco de dados DERBY APPACHE NO NETBEANS com nome Moda_Fashion,  usuario: victor e senha:loja
Execute o comando:
create table Produtos(
ID int not null primary key GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
nome varchar(50) not null,
tamanho varchar(10) not null,
quantidade int not null,
colecao varchar(50) not null,
sexo varchar(50) not null,
cor varchar(50) not null,
preco double not null,
enabled boolean
);

create table Clientes(
ID int not null primary key GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
nomecli varchar(50) not null,
sobrenome varchar(50) not null,
cpfcnpj varchar(20) not null,
data_de_nascCli timestamp default current_timestamp,
telefoneCli varchar(15) not null,
emailCli varchar(50),
cidadeCli varchar(15) not null,
estadoCli varchar(15) not null,
enderecoCli varchar(100) not null,
complementoCli varchar(50),
numeroCli varchar(10) not null,
bairroCli varchar(50) not null,
cepCli varchar(15) not null,
enable boolean
);

create table Vendas(
ID int not null primary key GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
data_venda timestamp default current_timestamp,
formaPagamento varchar(50),
valorTotal double,
idCli int not null,
foreign key (idCli) references Clientes
);

create table ItensVenda(
idProd int not null,
qtdProd int not null,
idVenda int not null,
primary key (idVenda, idProd),
foreign key (idVenda) references Vendas,
foreign key (idProd) references Produtos
);




Inicie o servidor.

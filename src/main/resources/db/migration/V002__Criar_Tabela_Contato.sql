Create Table Contato(
id bigint not null auto_increment primary key,
descricao varchar (100),
contato varchar (100),
clienteid bigint not null
);

Alter table contato add constraint fk_contato_cliente foreign key (clienteid) references cliente (id);

insert into contato(descricao, contato, clienteid) values ('Vivo', '99721-9282',1);
insert into contato(descricao, contato, clienteid) values ('Claro', '9928-2821',2);
insert into contato(descricao, contato, clienteid) values ('Tim', '99827-1111',3);
insert into contato(descricao, contato, clienteid) values ('Laricel','99731-0603',4);
insert into contato(descricao, contato, clienteid) values ('Vivo', '9923-2809',5);
insert into contato(descricao, contato, clienteid) values ('Claro', '99734-8379',6);


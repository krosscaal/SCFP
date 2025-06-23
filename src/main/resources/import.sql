insert into tb_usuario (id,data_criacao,nome,email,senha,telefone,role) values (1, localtimestamp ,'Admin','admin@gmail.com','semsenha','999998888','ADMIN');

insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (1,localtimestamp,'SALARIO CLT','RECEITA',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (2,localtimestamp,'ENERGIA ELETRICA - ENEGISA','DESPESA_VARIAVEL',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (3,localtimestamp,'ALUGUEL','DESPESA_FIXA',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (4,localtimestamp,'CONDOMINIO','DESPESA_FIXA',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (5,localtimestamp,'SALARIO PJ','RECEITA',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (6,localtimestamp,'SALARIO PJ MAIDA','RECEITA',1);
insert into tb_conta(id,data_criacao,nome_conta,tipo_conta,id_usuario) values (7,localtimestamp,'OUTROS','RECEITA',1);


insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (1,localtimestamp,4000,0,2024,'RECEBIDO','SIM',1,1);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (2,localtimestamp,350,0,2024,'PAGO','SIM',1,2);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (3,localtimestamp,500,0,2024,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (4,localtimestamp,180,0,2024,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (5,localtimestamp,3500,0,2024,'RECEBIDO','SIM',1,5);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (6,localtimestamp,4000,1,2024,'NAO_RECEBIDO','SIM',1,1);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (7,localtimestamp,350,1,2024,'PENDENTE','SIM',1,2);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (8,localtimestamp,500,1,2024,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (9,localtimestamp,180,1,2024,'PENDENTE','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (10,localtimestamp,3500,1,2024,'NAO_RECEBIDO','SIM',1,5);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (11,localtimestamp,3500,2,2024,'RECEBIDO','SIM',1,5);


insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (12,localtimestamp,1500,10,2023,'RECEBIDO','SIM',1,7);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (13,localtimestamp,1600,11,2023,'RECEBIDO','SIM',1,7);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (14,localtimestamp,400,5,2023,'RECEBIDO','SIM',1,6);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (15,localtimestamp,4000,6,2023,'RECEBIDO','SIM',1,6);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (16,localtimestamp,4000,7,2023,'RECEBIDO','SIM',1,6);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (17,localtimestamp,500,0,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (18,localtimestamp,180,0,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (19,localtimestamp,500,1,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (20,localtimestamp,180,1,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (21,localtimestamp,500,2,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (22,localtimestamp,180,2,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (23,localtimestamp,500,3,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (24,localtimestamp,180,3,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (25,localtimestamp,500,4,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (26,localtimestamp,180,4,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (27,localtimestamp,500,5,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (28,localtimestamp,180,5,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (29,localtimestamp,500,6,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (30,localtimestamp,180,6,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (31,localtimestamp,500,7,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (32,localtimestamp,180,7,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (33,localtimestamp,500,8,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (34,localtimestamp,180,8,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (35,localtimestamp,500,9,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (36,localtimestamp,180,9,2023,'PAGO','SIM',1,4);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (37,localtimestamp,500,10,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (38,localtimestamp,180,10,2023,'PAGO','SIM',1,4);

insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (39,localtimestamp,500,11,2023,'PAGO','SIM',1,3);
insert into tb_movimento(id,data_criacao,valor,referencia_mes,referencia_ano,status_conta,ativo,id_usuario,id_conta_nome) values (40,localtimestamp,180,11,2023,'PAGO','SIM',1,4);

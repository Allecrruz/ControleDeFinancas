# ControleDeFinancas
Desafio proposto pela MV
# Padrão Utilizado no Projeto
MVC
# Pl/SQL
responsável por criar as tabelas nos bancos e seus respectivos campos
CREATE TABLE CLIENTE( 
    ID NUMBER(10) NOT NULL, 
	NOME VARCHAR2(30), 
	CPF VARCHAR2(30 ) NOT NULL ENABLE, 
	CNPJ VARCHAR2(30 ), 
	CONTA VARCHAR2(30 ), 
	PHONE VARCHAR2(30 ), 
	RAZAO_SOCIAL VARCHAR2(30 ), 
	EMAIL VARCHAR2(30), 
	STATUS_CLIENTE VARCHAR2(10), 
	DATA_ALTERACAO DATE, 
	 PRIMARY KEY (ID));
     
   CREATE TABLE CONTA( 
  	ID_CONTA NUMBER(10) NOT NULL, 
	 TITULAR VARCHAR2(30), 
	 AGENCIA VARCHAR2(10), 
	 DATA DATE, 
	 CONTA VARCHAR2(30), 
	 ID_CLIENTE NUMBER(10), 
	 PRIMARY KEY (ID_CONTA));
     
     
   CREATE TABLE ENDERECO( 
   	ID_ENDERECO NUMBER(10), 
	LOGRADOURO VARCHAR2(100), 
	NUMERO VARCHAR2(5), 
	BAIRRO VARCHAR2(30), 
	CIDADE VARCHAR2(20), 
	CEP VARCHAR2(10 ), 
	ESTADO VARCHAR2(10), 
	ID_CLIENTE NUMBER(10) NOT NULL, 
	 PRIMARY KEY (ID_ENDERECO));
     
     
     
   ALTER TABLE endereco
    ADD CONSTRAINT endereco_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id ); 
        
        
   ALTER TABLE conta
    ADD CONSTRAINT conta_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id );
        
   ALTER TABLE faz
    ADD CONSTRAINT faz_conta_fk FOREIGN KEY ( id_cliente )
        REFERENCES conta ( id_conta );






# Trigger 
 PREENCHE_CAMP_CLIENT
  Preenche campos status cliente para 'A = Ativo' e Data criação / alteração.
  declarando uma trigger.
     
        CREATE OR REPLACE TRIGGER PREENCHE_CAMP_CLIENTE 
after INSERT on cliente
DECLARE
    vid_cliente cliente.id %type;
BEGIN
    select MAX(id) into vid_cliente from cliente;
    UPDATE CLIENTE SET STATUS_CLIENTE = 'A',DATA_CADASTRO = SYSDATE, DATA_ALTERACAO = SYSDATE WHERE id = vid_cliente;
END;

# view
criando uma View para facilitar na manutenção das consultas.
CREATE VIEW contaCliente AS
SELECT ID_CLIENTE AS CODIGO,
NOME,AGENCIA,CONTA 
  
 

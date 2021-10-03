package DAO;


import java.util.logging.Level;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Model.ClienteModel;
import Util.ConexaoDAO;

public class ClienteDAO extends ConexaoDAO {
	
	public boolean SaveCliente(ClienteModel cliente) {
		 conectar();
		String sql = "INSERT INTO cliente (id,nome,cpf,cnpj,conta,sexo,phone,razao_social"
				+ "email) VALUES (?,?,?,?,?,?,?,?,?)";
		
		
		//prepara uma estrutura para conectar com o java
		
		PreparedStatement pstm = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
		try {
			
			//ADICIONANDO OS VALORES QUE SÃO ESPERADOS PELA QUERY
			pstm.setInt(1, cliente.getId());
			pstm.setNString(2, cliente.getNome());
			pstm.setString(3,cliente.getCpf() );
			pstm.setString(4, cliente.getCnpj());
			pstm.setString(5, cliente.getConta());
			pstm.setString(6,cliente.getSexo());
			pstm.setString(7, cliente.getPhone());
			pstm.setString(8, cliente.getRazao_social());
			pstm.setString(9, cliente.getEmail());
			
			
			pstm.executeUpdate();
			
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
		
		return false;
		}
		
	
	} 
	
	



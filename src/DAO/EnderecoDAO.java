package DAO;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.EnderecoModel;
import Util.ConexaoDAO;

public class EnderecoDAO extends ConexaoDAO {
	
	public boolean SaveEndereco(EnderecoModel pEnderecoModel) {
		conectar();
		String sql = "INSERT INTO ENDERECO (id_ende,logradouro,numero,bairro,"
				+ "cidade,cep,estado,)VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement pstm = criarPreparedStatement(sql);
		
		try {
			pstm.setInt(1, pEnderecoModel.getId_ende());
			pstm.setString(2,pEnderecoModel.getLogradouro());
			pstm.setString(3,pEnderecoModel.getNumero());
			pstm.setString(4, pEnderecoModel.getBairro());
			pstm.setString(5, pEnderecoModel.getCidade());
			pstm.setString(6, pEnderecoModel.getCep());
			pstm.setString(7, pEnderecoModel.getEstado());
			
			pstm.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE,null,ex);
			return false;
		}
		
		desconectar();
		return true;
	}
	 // preparando um list para receber as informaçoes tradizads do BD
	public List<EnderecoModel> getListEnderecoDAO(){
        List<EnderecoModel> listaEndereco = new ArrayList<>();
        EnderecoModel enderecoModel = new EnderecoModel();
        // Fazendo conexão com o banco e preparando com o PreparedStatement
        conectar();
        //classe que vai recuperar os dados do BD.
        ResultSet resultSet = null;
        PreparedStatement pstm = null;
        
        
        String sql = "SELECT ID_ENDERECO, ENDERECO, NUMERO, BAIRRO, COMPLEMENTO, "
        		+ "CIDADE, UF, CEP, ID_CLIENTE FROM ENDERECO";
        
        try{
            pstm = criarPreparedStatement(sql);
            resultSet = pstm.executeQuery();
            
            while(resultSet.next()){
                enderecoModel = new EnderecoModel();
                enderecoModel.setId_ende(resultSet.getInt(1));
                enderecoModel.setLogradouro(resultSet.getString(2));
                enderecoModel.setNumero(resultSet.getString(3));
                enderecoModel.setBairro(resultSet.getString(4));
                enderecoModel.setCidade(resultSet.getString(5));
                enderecoModel.setCep(resultSet.getString(6));
                enderecoModel.setEstado(resultSet.getString(7));
                enderecoModel.seId_cliente(resultSet.getInt(8));
        
                listaEndereco.add(enderecoModel);

            }
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
         return listaEndereco;
	}
	

}

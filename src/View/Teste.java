package View;
import java.sql.*;

import DAO.ClienteDAO;
import Model.ClienteModel;
import Util.ConexaoDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO clienteDao = new ClienteDAO();
		
		ClienteModel cliente = new ClienteModel();
		cliente.setId(0);
		cliente.setNome("ALESSANDRO");
		cliente.setCpf("12336");
		cliente.setCnpj("2514589569");
		cliente.setConta(".p");
		cliente.setSexo("masculino");
		cliente.setPhone("888888");
		
		clienteDao.SaveCliente(cliente);
		System.out.println("conexão feita "+ cliente);

	}

}

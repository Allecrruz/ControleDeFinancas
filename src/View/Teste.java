package View;
import java.sql.*;
import java.util.Scanner;


import DAO.ClienteDAO;
import Model.ClienteModel;
import Model.ContaModel;
import Model.EnderecoModel;
import Model.ContaModel;
import Util.ConexaoDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO clienteDao = new ClienteDAO();
		clienteDao.conectar();
		
		ContaModel conta = new ContaModel();
		conta.depositar(200);
		conta.Sacar(100);
		
		ClienteModel cliente = new ClienteModel();
		System.out.println("-- EXIBINDO INFORMAÇOES");
		System.out.println("");
		
		cliente.setId(1);
		cliente.setNome("Joao");
		cliente.setCpf("12336");
		cliente.setCnpj("2514589569");
		cliente.setRazao_social("ltda");
		cliente.setConta("Poupança");
		cliente.setSexo("masculino");
		cliente.setPhone("888888");
		cliente.setEmail("teste@gmail.com");
		System.out.println(cliente);
		
		
	
		

	}

}

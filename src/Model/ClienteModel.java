package Model;

import javax.swing.JMenuItem;

public class ClienteModel {
	
	//Declarar os Atributos da Classe Cliente
	private int id;
	private String nome;
	private String cpf;
	private String cnpj;
	private String conta;
	private String sexo;
	private String phone;
	private String razao_social;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente nome=" + nome + ", \n cpf=" + cpf + ",\n cnpj=" + cnpj + ", \nconta=" + conta + ",\n sexo=" + sexo
		+ ", phone=" + phone + ",\n razao_social=" + razao_social + ",\n email=" + email + ";";
	}
	
	
	
		 
	
	
	

}

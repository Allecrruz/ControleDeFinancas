package Model;

public class EnderecoModel {
	private int id_ende;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	private int cliente_id_cliente;
	
	
	
	
	public int getId_ende() {
		return id_ende;
	}
	public void setId_ende(int id_ende) {
		this.id_ende = id_ende;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCliente_id_cliente() {
		return cliente_id_cliente;
	}
	public void setCliente_id_cliente(int cliente_id_cliente) {
		this.cliente_id_cliente = cliente_id_cliente;
	}
	
	
	
	

}

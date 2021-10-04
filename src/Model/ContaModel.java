package Model;

public class ContaModel {
	private int id_conta;
	private String numero;
	private String titular;
	private String agencia;
	private String data_conta;
	private double saldo;
	private String conta;
	private int qtdcontas =0;
	private double total_receitas = 0;
	private double  total_despesas = 0;
	
	
	
			
	public int getId_conta() {
		return id_conta;
	}
	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getData_conta() {
		return data_conta;
	}
	public void setData_conta(String data_conta) {
		this.data_conta = data_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public void DadosBancarios() {
		/*System.out.println("");
		System.out.println("--DADOS BANCÁRIOS--");
		System.out.println("--NUMERO: "+this.numero);
		System.out.println("--Titular"+this.titular);
		System.out.println("--saldo "+ this.saldo);
		System.out.println("");*/
	}
	public void depositar(double pvalor) {
		System.out.println("");
		//System.out.println("--DADOS BANCÁRIOS--");
		//System.out.println("--: "+this.numero);
		//System.out.println("--Titular"+this.titular);
		System.out.println("--saldo anterior "+ this.saldo);
		System.out.println("");
		System.out.println("--saldo atual "+ this.saldo);
		this.saldo+= pvalor;
	}
		
	public void Sacar(double pValor) {
		System.out.println("--saldo anterior "+ this.saldo);
		if(pValor <= this.saldo) { // caso eu tenha saldo
			this.saldo -= pValor;
			System.out.println("--saldo atual "+ this.saldo); 
			
		}else {
			System.out.println("saldo insuficiente");//caso seja insuficiente
		}
	}
	
		
	
}


package Util;
import java.sql.*;

public class ConexaoDAO {
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	
	private Connection conexao;
    private String driver = "oracle.jdbc.OracleDriver";
    private String caminho = "jdbc:oracle:thin:@localhost:1521:XE";
    private String senha = "123";
    private String Usuario = "Alessandro";
	
		
	
    public boolean conectar() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            this.conexao = DriverManager.getConnection(caminho,Usuario,senha);
            System.out.println("Conectado");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean desconectar() {

        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }
            System.out.println("desconectado");
        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    
     // ONDE OS SQLS SERAO EXECUTADOS
    
    public java.sql.Statement criarStatement() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    
    public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS) {
        try {
            System.out.println("Executando");
            return conexao.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }

}
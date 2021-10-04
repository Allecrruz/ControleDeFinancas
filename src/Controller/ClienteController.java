package Controller;

import java.sql.SQLException;
import java.util.List;

import DAO.ClienteDAO;
import Model.ClienteModel;

public class ClienteController {
	
	ClienteDAO clienteDao = new ClienteDAO();

   
	public boolean saveClienteController(ClienteModel clienteModel) throws SQLException {
	       return this.clienteDao.SaveCliente(clienteModel);
	    }
	public List<ClienteModel> getListaClienteController() {
	       return this.clienteDao.getListClienteDAO();

	}
}

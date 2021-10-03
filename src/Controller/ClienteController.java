package Controller;

import DAO.ClienteDAO;
import Model.ClienteModel;

public class ClienteController {
	
	ClienteDAO clienteDao = new ClienteDAO();

   
    public boolean salvarClienteController(ClienteModel clienteModel) {
       return this.clienteDao.SaveCliente(clienteModel);
    }

}

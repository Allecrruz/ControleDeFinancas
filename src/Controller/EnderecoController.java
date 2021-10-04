package Controller;

import java.util.List;

import DAO.EnderecoDAO;
import Model.EnderecoModel;

public class EnderecoController {
	EnderecoDAO enderecoDao = new EnderecoDAO();
	
	public boolean saveEnderecoController(EnderecoModel enderecoModel) {
		return this.enderecoDao.SaveEndereco(enderecoModel);
	}
	public List<EnderecoModel> getListaEnderecoController() {
        return this.enderecoDao.getListEnderecoDAO();
    }
	
	
	

}  

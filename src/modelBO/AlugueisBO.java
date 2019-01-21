/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.AlugueisDAO;
import modelDAO.IAlugueisDAO;
import modelVO.Alugueis;

/**
 *
 * @author manoelson
 */
public class AlugueisBO implements IAlugueisBO{
    IAlugueisDAO alugueisDAO;
    
    public AlugueisBO() {
     this.alugueisDAO =new AlugueisDAO();
    }

    @Override
    public void salvar(Alugueis alugueis) {
        this.alugueisDAO.salvar(alugueis); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alugueis buscarPorId(int id) {
       return  this.alugueisDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alugueis> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Alugueis alugueis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

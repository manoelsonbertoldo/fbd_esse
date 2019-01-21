/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.ImoveisDAO;
import modelVO.Imoveis;

/**
 *
 * @author manoelson
 */
public class ImoveisBO implements IImoveisBO{
ImoveisDAO imoveisDAO;
    public ImoveisBO() {
        this.imoveisDAO=new ImoveisDAO();
                
    }

    @Override
    public void salvar(Imoveis imoveis) {
        this.imoveisDAO.salvar(imoveis); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Imoveis buscarPorId(int id) {
      return  this.imoveisDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imoveis> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Imoveis Imoveis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

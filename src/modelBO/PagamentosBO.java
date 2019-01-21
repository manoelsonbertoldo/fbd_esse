/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IPagamentosDAO;
import modelDAO.PagamentosDAO;
import modelVO.Pagamentos;

/**
 *
 * @author manoelson
 */
public class PagamentosBO implements IPagamentosBO{
IPagamentosDAO pagamentosDAO;
    public PagamentosBO() {
        this.pagamentosDAO=new PagamentosDAO();
    }

    @Override
    public void salvar(Pagamentos pagamentos) {
        this.pagamentosDAO.salvar(pagamentos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pagamentos buscarPorId(int id) {
      return  this.pagamentosDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamentos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Pagamentos pagamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

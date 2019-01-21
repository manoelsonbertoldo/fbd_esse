/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IPagamentos_VendasDAO;
import modelDAO.Pagamentos_VendasDAO;
import modelVO.Pagamentos_Vendas;

/**
 *
 * @author manoelson
 */
public class Pagamentos_VendasBO implements IPagamentos_VendasBO{
IPagamentos_VendasDAO pagamentos_VendasDAO;
    public Pagamentos_VendasBO() {
        this.pagamentos_VendasDAO= new Pagamentos_VendasDAO();
    }

    @Override
    public void salvar(Pagamentos_Vendas pagamentos_Vendas) {
       this.pagamentos_VendasDAO.salvar(pagamentos_Vendas);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pagamentos_Vendas buscarPorId(int id) {
      return  this.pagamentos_VendasDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamentos_Vendas> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Pagamentos_Vendas pagamentos_Vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IVendasDAO;
import modelDAO.VendasDAO;
import modelVO.Vendas;

/**
 *
 * @author manoelson
 */
public class VendasBO implements IVendasBO{
IVendasDAO vendasDAO;
    public VendasBO() {
        this.vendasDAO= new VendasDAO();
    }

    @Override
    public void salvar(Vendas vendas) {
       this.vendasDAO.salvar(vendas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendas buscarPorId(int id) {
     return   this.vendasDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendas> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Vendas vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

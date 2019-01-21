/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelVO.Vendas;
import sql.SQLConections;
import sql.SQLUtil;

/**
 *
 * @author manoelson
 */
public class VendasDAO implements IVendasDAO{
private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    @Override
    public int salvar(Vendas vendas) {
        int id =0;
        try{
            
            int clientes_id = new ClientesDAO().salvar(vendas.getClientes());
            int imoveis_id = new ImoveisDAO().salvar(vendas.getImoveis());
            
           this.conexao = SQLConections.getInstance();
           this.statement = conexao.prepareStatement(SQLUtil.Vendas.INSERT);
           
           String d[] = vendas.getData().split("/");
           
           java.sql.Date data = java.sql.Date.valueOf(d[2]+"-"+d[1]+"-"+d[0]);
           
           this.statement.setDate(1, data);
           this.statement.setInt(2, vendas.getNota_Fiscal());
           this.statement.setBoolean(3, vendas.getStatus());
           this.statement.setDouble(4, vendas.getTotal());
           this.statement.setDouble(5, vendas.getDesconto());
           this.statement.setDouble(6, vendas.getValor_recebido());
           this.statement.setDouble(7, vendas.getTroco());
            this.statement.setInt(8,clientes_id);
            this.statement.setInt(9,imoveis_id);

            this.result = this.statement.executeQuery();
            
            
            if (result.next()) {
                id = result.getInt(1);
                //clientes.setId(clientes_id);
                vendas.setId(id);
            }//To change body of generated methods, choose Tools | Templates.
    }   catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendas buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

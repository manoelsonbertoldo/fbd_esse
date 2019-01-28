/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscarCasas;
import view.BuscarTerrenos;
import view.TelaCadastro;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControlleBusterreno implements  ActionListener{
  private BuscarTerrenos buscarTerreno;
  private TelaPrincipal telaPrincipal;

    public ControlleBusterreno(BuscarTerrenos buscarTerreno) {
        this.buscarTerreno = buscarTerreno;
        this.buscarTerreno.getVoltarButton().addActionListener(this);
        this.buscarTerreno.getConfirmarButton().addActionListener(this);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscarTerreno.getVoltarButton()){
            buscarTerreno.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==buscarTerreno.getConfirmarButton()){
            buscarTerreno.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

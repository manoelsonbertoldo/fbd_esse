/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscarApartamento;
import view.BuscarCasas;
import view.TelaCadastro;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControlleBusApartamento implements  ActionListener{
  private BuscarApartamento buscarApartamento;
  private TelaPrincipal telaPrincipal;

    public ControlleBusApartamento(BuscarApartamento buscarApartamento) {
        this.buscarApartamento =buscarApartamento;
        this.buscarApartamento.getVoltarButton().addActionListener(this);
        this.buscarApartamento.getConfirmarButton().addActionListener(this);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscarApartamento.getVoltarButton()){
            buscarApartamento.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==buscarApartamento.getConfirmarButton()){
            buscarApartamento.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

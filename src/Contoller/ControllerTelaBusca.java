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
import view.BuscarFun;
import view.BuscarTerrenos;
import view.TelaBuscar;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControllerTelaBusca implements ActionListener{
   private TelaBuscar telaBuscar;
   private TelaPrincipal telaPrincipal;
   private BuscarApartamento buscarApartamento;
   private BuscarCasas buscarCasas;
   private BuscarTerrenos buscarTerrenos;
   private BuscarFun buscarFun;
   
   private ControlleBusCasas controlleBusCasas;
   private ControlleBusApartamento controlleBusApartamento;
   private ControlleBusFuncionário controlleBusFuncionário;
   private ControlleBusterreno controlleBusTerreno;
   
   

    public ControllerTelaBusca(TelaBuscar telaBuscar) {
        this.telaBuscar = telaBuscar;
        this.buscarApartamento= new BuscarApartamento();
        this.buscarCasas= new BuscarCasas();
        this.buscarFun= new BuscarFun();
        this.buscarTerrenos= new BuscarTerrenos();
        
        this.controlleBusApartamento= new ControlleBusApartamento(buscarApartamento);
        this.controlleBusCasas= new  ControlleBusCasas(buscarCasas);
        this.controlleBusFuncionário= new ControlleBusFuncionário(buscarFun);
        this.controlleBusTerreno= new ControlleBusterreno(buscarTerrenos);
        
        this.telaBuscar.getVoltarButton().addActionListener(this);
         this.telaBuscar.getBuscarAparButton().addActionListener(this);
          this.telaBuscar.getBuscarCasaButton().addActionListener(this);
           this.telaBuscar.getBuscarFunButton().addActionListener(this);
            this.telaBuscar.getBuscarterButton().addActionListener(this);
        
    }
   
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==telaBuscar.getBuscarAparButton()){
           buscarApartamento.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==telaBuscar.getBuscarCasaButton()){
            buscarCasas.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaBuscar.getBuscarFunButton()){
            buscarFun.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaBuscar.getBuscarterButton()){
            buscarTerrenos.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaBuscar.getVoltarButton()){
            telaBuscar.setVisible(false);
            telaPrincipal.setVisible(true);//To change body of generated methods, choose Tools | Templates.
    }
     //To change body of generated methods, choose Tools | Templates.
    }
    
}

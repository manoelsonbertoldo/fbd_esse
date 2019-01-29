/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadApartamento;
import view.CadCasas;
import view.CadFun;
import view.CadTerreno;
import view.TelaCadastro;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControllerTelaCadastro implements ActionListener{
    private TelaPrincipal telaPrincipal;
    private TelaCadastro telaCadastro;
    private CadApartamento cadApartamento;
    private ControllerCadApartamento controllerCadApartamento;
    private CadFun cadFun;
    private ControllerCadFun controllerCadFun;
    private CadTerreno cadTerreno;
    private ControllerCadTerreno controllerCadTerreno;
    private CadCasas cadCasas;
    private ControllerCadCasas controllerCadcasas;
    

    public ControllerTelaCadastro(TelaCadastro telaCadastro) {
        this.telaCadastro = telaCadastro;
        
         telaCadastro.setResizable(false);
        telaCadastro.setLocationRelativeTo(null);
        this.cadApartamento=new CadApartamento();
        this.controllerCadApartamento = new ControllerCadApartamento(cadApartamento,this.telaCadastro);
        this.cadCasas=new CadCasas();
        this.controllerCadcasas=new ControllerCadCasas(cadCasas);
        this.cadFun =new CadFun();
        this.controllerCadFun = new ControllerCadFun(cadFun);
        this.cadTerreno =new CadTerreno();
        this.controllerCadTerreno = new ControllerCadTerreno(cadTerreno);
        
        
        this.telaCadastro.getCasajButton().addActionListener(this);
        this.telaCadastro.getApartamentosButton().addActionListener(this);
        this.telaCadastro.getFuncButton().addActionListener(this);
        this.telaCadastro.getTerrenosButton().addActionListener(this);
        this.telaCadastro.getVoltarButton().addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==telaCadastro.getCasajButton()){
            cadCasas.setVisible(true);
            telaCadastro.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==telaCadastro.getApartamentosButton()){
            cadApartamento.setVisible(true);
            telaCadastro.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaCadastro.getTerrenosButton()){
            cadTerreno.setVisible(true);
            telaCadastro.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaCadastro.getFuncButton()){
            cadFun.setVisible(true);
            telaCadastro.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaCadastro.getVoltarButton()){
            telaPrincipal.setVisible(true);
            telaCadastro.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

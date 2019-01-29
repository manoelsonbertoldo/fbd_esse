/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaAlugueis;
import view.TelaBuscar;
import view.TelaCadastro;
import view.TelaPrincipal;
import view.TelaTransacoes;
import view.TelaVenda;

/**
 *
 * @author manoelson
 */
public class ControllerPrincipal implements ActionListener{
    
    private TelaPrincipal telaPrincipal;
    
    private ControllerTelaAlugueis controllerTelaAlugueis;
    private ControllerTelaBusca controllerTelaBusca;
    private ControllerTelaCadastro controllerTelaCadastro;
    private ControllerTelaTransacao controllerTelaTransacao;
    private ControllerTelaVendas controllerTelaVendas;
    
    private TelaCadastro telaCadastro;
    private TelaAlugueis telaAlugueis;
    private TelaVenda telaVendas;
    private TelaTransacoes telaTransacoes;
    private TelaBuscar telaBuscar;
    public ControllerPrincipal(){
    this.telaAlugueis= new TelaAlugueis();
        this.controllerTelaAlugueis = new ControllerTelaAlugueis();
        this.telaCadastro = new TelaCadastro();
        this.controllerTelaCadastro =new ControllerTelaCadastro(telaCadastro);
        this.telaBuscar =new TelaBuscar();
        this.controllerTelaBusca =new ControllerTelaBusca(telaBuscar);
        this.telaVendas=new TelaVenda();
        this.controllerTelaVendas=new ControllerTelaVendas();
        this.telaTransacoes=new TelaTransacoes();
        this.controllerTelaTransacao=new ControllerTelaTransacao();
        
        this.telaPrincipal.getCadastrarButton().addActionListener(this);
        this.telaPrincipal.getTransButton().addActionListener(this);
        this.telaPrincipal.getVendasButton().addActionListener(this);
        this.telaPrincipal.getAlugueisButton().addActionListener(this);
        this.telaPrincipal.getBuscarButton().addActionListener(this);
        }
    public ControllerPrincipal(TelaPrincipal telaPrincipal) {
        
        this.telaPrincipal = telaPrincipal;
       
        telaPrincipal.setResizable(false);
        telaPrincipal.setLocationRelativeTo(null);
        this.telaAlugueis= new TelaAlugueis();
        this.controllerTelaAlugueis = new ControllerTelaAlugueis();
        this.telaCadastro = new TelaCadastro();
        this.controllerTelaCadastro =new ControllerTelaCadastro(telaCadastro);
        this.telaBuscar =new TelaBuscar();
        this.controllerTelaBusca =new ControllerTelaBusca(telaBuscar);
        this.telaVendas=new TelaVenda();
        this.controllerTelaVendas=new ControllerTelaVendas();
        this.telaTransacoes=new TelaTransacoes();
        this.controllerTelaTransacao=new ControllerTelaTransacao();
        
        this.telaPrincipal.getCadastrarButton().addActionListener(this);
        this.telaPrincipal.getTransButton().addActionListener(this);
        this.telaPrincipal.getVendasButton().addActionListener(this);
        this.telaPrincipal.getAlugueisButton().addActionListener(this);
        this.telaPrincipal.getBuscarButton().addActionListener(this);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==telaPrincipal.getBuscarButton()){
            telaBuscar.setVisible(true);
           
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==telaPrincipal.getCadastrarButton()){
            
            telaCadastro.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaPrincipal.getTransButton()){
            telaTransacoes.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaPrincipal.getVendasButton()){
            telaVendas.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    if(e.getSource()==telaPrincipal.getAlugueisButton()){
            telaAlugueis.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
}
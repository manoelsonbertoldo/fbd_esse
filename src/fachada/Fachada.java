/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.util.List;
import modelBO.AlugueisBO;
import modelBO.ApartamentosBO;
import modelBO.CasasBO;
import modelBO.ClientesBO;
import modelBO.EnderecosBO;
import modelBO.EstadosBO;
import modelBO.FuncionariosBO;
import modelBO.IAlugueisBO;
import modelBO.IApartamentosBO;
import modelBO.ICasasBO;
import modelBO.IClientesBO;
import modelBO.IEnderecosBO;
import modelBO.IEstadosBO;
import modelBO.IFuncionariosBO;
import modelBO.IImoveisBO;
import modelBO.IMunicipiosBO;
import modelBO.IPagamentosBO;
import modelBO.IPagamentos_VendasBO;
import modelBO.IPrediosBO;
import modelBO.IProprietariosBO;
import modelBO.ITerrenosBO;
import modelBO.IVendasBO;
import modelBO.ImoveisBO;
import modelBO.MunicipiosBO;
import modelBO.PagamentosBO;
import modelBO.Pagamentos_VendasBO;
import modelBO.PrediosBO;
import modelBO.ProprietariosBO;
import modelBO.TerrenosBO;
import modelBO.VendasBO;
import modelVO.Alugueis;
import modelVO.Apartamentos;
import modelVO.Casas;
import modelVO.Clientes;
import modelVO.Enderecos;
import modelVO.Estados;
import modelVO.Funcionarios;
import modelVO.Imoveis;
import modelVO.Municipios;
import modelVO.Pagamentos;
import modelVO.Pagamentos_Vendas;
import modelVO.Predios;
import modelVO.Proprietarios;
import modelVO.Terrenos;
import modelVO.Vendas;

/**
 *
 * @author manoelson
 */
public class Fachada implements IFachada{
        private static Fachada instance;
	
	private IApartamentosBO apartamentosBO;
        private ITerrenosBO terrenosBO;
        private IPrediosBO prediosBO;
        private IAlugueisBO alugueisBO;
        private IFuncionariosBO funcionariosBO;
	
        private ICasasBO casasBO;
	private IClientesBO clientesBO;
	private IPagamentosBO pagamentosBO;
	private IPagamentos_VendasBO pagamentos_VendasBO;
	private IEnderecosBO enderecosBO;
	
        private IEstadosBO estadosBO;
        private IImoveisBO imoveisBO;
	private IMunicipiosBO municipiosBO;
	private IProprietariosBO proprietariosBO;
	private IVendasBO vendasBO;
	
	
	
	
	private Fachada() {
		
		this.apartamentosBO = new ApartamentosBO();
		this.casasBO = new CasasBO();
		this.clientesBO = new ClientesBO();
		this.pagamentosBO = new PagamentosBO();
		this.pagamentos_VendasBO = new Pagamentos_VendasBO();
		
                this.enderecosBO = new EnderecosBO();
		this.estadosBO = new EstadosBO();
		this.imoveisBO = new ImoveisBO();
		this.municipiosBO =new  MunicipiosBO();
		this.proprietariosBO = new ProprietariosBO();
		
                this.vendasBO = new VendasBO();
                this.funcionariosBO = new FuncionariosBO();
                this.terrenosBO = new TerrenosBO();
                 this.alugueisBO = new AlugueisBO();
                  this.prediosBO = new PrediosBO();
	}


	public static Fachada getInstance() {
		if(instance==null) {
			instance= new Fachada();
		}
		return instance;
	}
    @Override
    public void salvarApartamento(Apartamentos apartamentos) {
        this.apartamentosBO.salvar(apartamentos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apartamentos buscarApartamentosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Apartamentos> getALLApartamnetos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarAparatamentos(Apartamentos apartamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarApartamentos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarCasas(Casas casas) {
        this.casasBO.salvar(casas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casas buscarCasasPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Casas> getALLCasas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarCasas(Casas casas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarCasas(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarClientes(Clientes clientes) {
       this.clientesBO.salvar(clientes); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clientes buscarClientesPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> getALLClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarClientes(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarClientes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarTerrenos(Terrenos terrenos) {
        this.terrenosBO.salvar(terrenos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Terrenos buscarTerrenosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Terrenos> getALLTerrenos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarContato(Terrenos terrenos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarTerrenos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarFuncionarios(Funcionarios funcionarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionarios buscarFuncionariosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionarios> getALLFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarFuncionarios(Funcionarios funcionarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarFuncionarios(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarEnderecos(Enderecos enderecos) {
    this.enderecosBO.salvar(enderecos);         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enderecos buscarEnderecosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Enderecos> getALLEnderecos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarEnderecos(Enderecos enderecos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarEnderecos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarEstados(Estados estados) {
        this.estadosBO.salvar(estados);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estados buscarEstadosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estados> getALLEstados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarEstado(Estados estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarEstados(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarImoveis(Imoveis imoveis) {
        this.imoveisBO.salvar(imoveis);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Imoveis buscarImoveisPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imoveis> getALLImoveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarImoveis(Imoveis imoveis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarImoveis(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarMunicipios(Municipios municipios) {
        this.municipiosBO.salvar(municipios); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Municipios buscarMunicipiosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipios> getALLMunicipios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarMunicipios(Municipios municipio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarMunicipios(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarProprietarios(Proprietarios proprietarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proprietarios buscarProprietariosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proprietarios> getALLProprietarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarProprietarios(Proprietarios proprietarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarProprietarios(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarVendas(Vendas vendas) {
        this.vendasBO.salvar(vendas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendas buscarVendasPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendas> getALLVendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarVendas(Vendas vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarVendas(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarAlugueis(Alugueis alugueis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendas buscarAlugueisPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendas> getALLAlugueis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarAlugueis(Alugueis alugueis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarAlugueis(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarPredios(Predios predios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Predios buscarPrediosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Predios> getALLPredios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarPredios(Predios predios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarPredios(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarPagamentos(Pagamentos pagamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Predios buscarPagamentosPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamentos> getALLPagamentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarPagamentos(Pagamentos pagamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarPagamentos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarPagamentos_Vendas(Pagamentos_Vendas pagamentos_Vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Predios buscarPagamentos_VendasPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamentos_Vendas> getALLPagamentos_Vendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarPagamentos_Vendas(Pagamentos_Vendas pagamentos_Vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativarPagamentos_Vendas(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

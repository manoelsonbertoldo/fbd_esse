/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Municipios;

/**
 *
 * @author manoelson
 */
public interface IMunicipiosBO {
    
        public  void salvar(Municipios municipios);
	public Municipios buscarPorId(int id);
	public List<Municipios> getALL();
	public  void editar(Municipios municipios);
	public  void ativarDesativar(int id);
}

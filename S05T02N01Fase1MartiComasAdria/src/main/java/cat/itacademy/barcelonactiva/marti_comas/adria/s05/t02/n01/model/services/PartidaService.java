package cat.itacademy.barcelonactiva.marti_comas.adria.s05.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.marti_comas.adria.s05.t02.n01.model.domain.Partida;


public interface PartidaService {

	public List<Partida> mostrarPartidesUsuari(Integer pk_UsuariID);

	public void guardar(Partida partida, Integer pk_UsuariID);

	public void eliminarPartides(Integer id);
	
	/*public static String getUsuariName(Usuari usuari) {
		return usuari.getNumUsuari();
		
	}*/

}

package br.com.mypet.ent;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ed.Usuario;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {
	
	@PersistenceContext(name = "myPet")
	private EntityManager em;
 
	@Override
	public void consultaUsuario(Usuario usuario) { 
		em.find(Usuario.class, 0);
 
	}
}

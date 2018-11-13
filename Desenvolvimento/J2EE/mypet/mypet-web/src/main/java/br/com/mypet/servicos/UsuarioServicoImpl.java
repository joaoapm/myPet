package main.java.br.com.mypet.servicos;

 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.java.br.com.mypet.entidades.Usuario;

 

@Stateless
public class UsuarioServicoImpl implements UsuarioServico {
	
	@PersistenceContext(name = "myPet")
	private EntityManager em;
 
	@Override
	public void consultaUsuario(Usuario usuario) { 
		em.find(Usuario.class, 0);
 
	}
}

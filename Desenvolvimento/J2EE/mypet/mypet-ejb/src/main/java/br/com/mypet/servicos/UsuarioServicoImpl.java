package br.com.mypet.servicos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.mypet.entidades.Usuario;

@Stateless
public class UsuarioServicoImpl implements UsuarioServico {

	@PersistenceContext(name = "myPet")
	private EntityManager em;

	@Override
	public Usuario consultaUsuario(Usuario usuario) {
		return em.find(Usuario.class, 0);
	}
}

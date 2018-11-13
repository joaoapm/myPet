package main.java.br.com.mypet.MB;

import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import main.java.br.com.mypet.entidades.Usuario;
import main.java.br.com.mypet.servicos.UsuarioServico;

@ManagedBean
@ApplicationScoped
public class Login {

	private Usuario usuario;
	
	@EJB
	private UsuarioServico usuarioService;

	public String logar() {
		
	 
		return null;
	}

	public String deslogar() {
		 
		return "login";
	}

	public Usuario getUsuario() {
		if (this.usuario == null)
			this.usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

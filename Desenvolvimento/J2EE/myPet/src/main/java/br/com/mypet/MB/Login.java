package br.com.mypet.MB;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;

import br.com.mypet.ent.UsuarioService;
import br.com.mypet.util.SessionContext;
import ed.Usuario;

@ManagedBean
@ApplicationScoped
public class Login {

	private Usuario usuario;
	
	@EJB
	private UsuarioService usuarioService;

	public String logar() {
		
		usuarioService.consultaUsuario(usuario);
		
		if (usuario != null) {
			SessionContext.getInstance().setAttribute("usuarioLogado", usuario);
			return "index";
		} else {
		}
		return null;
	}

	public String deslogar() {
		SessionContext.getInstance().setAttribute("usuarioLogado", null);
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

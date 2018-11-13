package br.com.mypet.servicos;

import javax.ejb.Remote;

import br.com.mypet.entidades.Usuario;

@Remote
public interface UsuarioServico {

	public void consultaUsuario(Usuario usuario);

}
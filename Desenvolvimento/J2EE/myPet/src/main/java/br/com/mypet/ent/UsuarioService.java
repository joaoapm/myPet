package br.com.mypet.ent;

import javax.ejb.Remote;

import ed.Usuario;

@Remote
public interface UsuarioService {

	public void consultaUsuario(Usuario usuario);

}
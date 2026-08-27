package controlador;

import java.util.ArrayList;

import modelo.Usuario;
import vista.UsuarioVista;

public class UsuarioController {
	private ArrayList<Usuario> usuariosList = new ArrayList<>();
	private UsuarioVista vista;

	public UsuarioController(UsuarioVista vista) {
		this.vista = vista;
	}

	public void agregarUsuario(Usuario usuario) {
		this.usuariosList.add(usuario);
		vista.mostrarMensaje("Usuario agregado con exito.");
	}

	public void quitarUsuario(int id) {
		boolean removido = this.usuariosList.removeIf(usuario -> usuario.getId() == id);
		if(removido) {
			vista.mostrarMensaje("Usuario eliminado.");
		} else {
			vista.mostrarMensaje("Usuario no encontrado.");
		}
	}

	public Usuario buscarUsuario(int id) {
		for (Usuario u : usuariosList) {
			if (u.getId() == id) {
				return u;
			}
		}
		vista.mostrarMensaje("Usuario no encontrado.");
		return null;
	}
	
	public void mostrarUsuarios() {
		vista.mostrarUsuarios(this.usuariosList);
	}
	
	public void mostrarDetalleUsuario(int id) {
		Usuario u = buscarUsuario(id);
		if (u != null) {
			vista.mostrarDetalleUsuario(u);
		}
	}
}
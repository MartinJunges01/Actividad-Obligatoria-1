package vista;

import java.util.List;
import modelo.Usuario;

public class UsuarioVista {

	public void mostrarMensaje(String mensaje) {
		System.out.println("[SISTEMA] " + mensaje);
	}

	public void mostrarUsuarios(List<Usuario> usuarios) {
		System.out.println("=== Lista de Usuarios ===");
		if (usuarios.isEmpty()) {
			System.out.println("No hay usuarios registrados.");
		} else {
			for (Usuario u : usuarios) {
				System.out.println(u.toString());
			}
		}
	}

	public void mostrarDetalleUsuario(Usuario usuario) {
		System.out.println("=== Detalle del Usuario ===");
		System.out.println(usuario.toString());
	}
}

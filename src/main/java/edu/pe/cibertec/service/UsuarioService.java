package edu.pe.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.model.Usuario;
import edu.pe.cibertec.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	IUsuarioRepository repositorio;
	
	public List<Usuario> listarUsuarios(){
		return repositorio.findAll();
	}

	public Usuario crearUsuario(Usuario usuario) {
		return repositorio.save(usuario);
		
	}
	
	public Usuario busarUsuario(Integer id) {
		return repositorio.findById(id).orElse(null);
		
	}
	public void eliminarUsuario(Integer id) {
		repositorio.deleteById(id);
	}
}
 
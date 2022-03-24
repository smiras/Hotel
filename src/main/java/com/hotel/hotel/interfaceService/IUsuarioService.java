package com.hotel.hotel.interfaceService;

import java.util.List;
import java.util.Optional;

import com.hotel.hotel.model.Usuario;

public interface IUsuarioService {

	
	public Iterable<Usuario> listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
}

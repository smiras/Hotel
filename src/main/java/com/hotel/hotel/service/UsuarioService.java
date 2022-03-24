package com.hotel.hotel.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.hotel.hotel.interfaceService.IUsuarioService;
import com.hotel.hotel.interfaces.IUsuario;
import com.hotel.hotel.model.Usuario;

public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuario data;
	
	public UsuarioService() {
		
	}
	@Override
	public Iterable<Usuario> listar() {
		Iterable<Usuario> listaUsuarios = data.findAll();
		return listaUsuarios;
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		return data.findById(id);
	}


	@Override
	public int save(Usuario u) {
		data.save(u);
		return 0;
	}
	
	@Override
	public void delete(int id) {
		data.deleteById(id);

	}

}

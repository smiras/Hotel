package com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.hotel.model.Usuario;
import com.hotel.hotel.service.UsuarioService;

@Controller
public class UsuarioControlador {
	
	@Autowired
	UsuarioService us;
	
	@RequestMapping("/admin")
	public String login() {
		return "admin";
	}

	@PostMapping("/login")
	public String buscarUsuario(Model modelo, Usuario user) {
		
		Iterable<Usuario> usuarios = us.listar();
		usuarios.forEach(u->System.out.println(u.getUsername()));
		String cadena="";
		int i =0;
		for(Usuario u: usuarios) {
			if(u.getUsername()==user.getUsername())
				i=1;
		}
		
		if (i==1)
			cadena="Bienvenido "+user.getUsername();
		else
			cadena="no se reconoce el usuario";
		
		modelo.addAttribute(cadena, "cadena");
			return "Ingreso";
	}
	
	@GetMapping("/crearUsuario")
	public String formCrearUsuario() {
		return "crearUsuario";
	}
	
	@PostMapping("/crearUsuario")
	public void crearUsuario(Model modelo, Usuario u) {
		System.out.println("crear Usuario");
		System.out.println(u.getUsername());
		System.out.println(u.getPass());
		us.save(u);
	}
}

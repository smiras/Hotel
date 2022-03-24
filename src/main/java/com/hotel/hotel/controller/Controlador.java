package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hotel.hotel.model.Usuario;
import com.hotel.hotel.service.UsuarioService;

@Controller
public class Controlador {
	
	@GetMapping("/admin/")
	public String index() {
		return "index";
	}
	
	
}

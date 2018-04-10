package com.boraji.tutorial.spring.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boraji.tutorial.spring.service.NoticiasServiceImp;

@Controller
public class MyContoller {

	@Autowired
	private NoticiasServiceImp noticiasService;

	@GetMapping("/")
	public String index(Model model, Principal principal) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "index";
	}

	@GetMapping("/contacto")
	public String contacto(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "contacto";
	}

	@GetMapping("/logout")
	public String fuera(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "index";
	}

	@GetMapping("/noticias")
	public String noticias(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		model.addAttribute("noticias", noticiasService.getNoticias());
		return "noticias";
	}

	@GetMapping("/privado")
	public String privado(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "privado";
	}

	@GetMapping("/administracion")
	public String administracion(Model model) {
		// model.addAttribute("message", "You are logged in as " + principal.getName());
		return "administracion";
	}

}

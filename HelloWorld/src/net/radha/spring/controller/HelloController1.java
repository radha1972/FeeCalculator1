package net.radha.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController1 {

	@GetMapping("/hello1")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");

		return "welcome";
	}
}
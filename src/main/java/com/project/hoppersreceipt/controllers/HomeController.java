package com.project.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String name = "Grace Hopper";
		String itemName = "Diablo IV";
		double price = 69.99;
		String description = "An action role-playing game developed and published by Blizzard Entertainment.";
		String vendor = "Battle.net";
		
		model.addAttribute("name", name);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}

}

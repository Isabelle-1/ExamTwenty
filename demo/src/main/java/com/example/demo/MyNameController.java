package com.example.demo;

import com.example.demo.MyName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyNameController {

	@GetMapping("/myName")
	public String myName(@RequestParam(name="name", required=false, defaultValue="Isabelle") String name, Model model) {
		model.addAttribute("name", name);
		return "Isabelle";
				}
	
}	
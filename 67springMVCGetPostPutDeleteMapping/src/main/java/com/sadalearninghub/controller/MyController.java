package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
		@GetMapping("/")
		public String handleGetReq(Model model) {
			model.addAttribute("msg", "I am From @GetMapping");
			return "index";
		}
		
		@GetMapping("/put")
		public String handlePutReq(Model model) {
			model.addAttribute("msg", "I am From @PutMapping");
			return "index";
		}
		
		@GetMapping("/post")
		public String hadlePostReq(Model model) {
			model.addAttribute("msg", "I am From @PostMapping");
			return "index";
		}
		
		@GetMapping("/delete")
		public String handleDeleteReq(Model model) {
			model.addAttribute("msg", "I am From @DeleteMapping");
			return "index";
		}
		
		

}

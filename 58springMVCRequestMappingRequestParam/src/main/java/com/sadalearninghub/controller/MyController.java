package com.sadalearninghub.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class MyController {
	
	@RequestMapping(params = "name")
	public String handleSingleParam(@RequestParam("name") String name, Model model) {
		model.addAttribute("msg", name);
		return "display";
	}
	
	@RequestMapping(params = {"name", "city"})
	public String handleMultipleParam(@RequestParam("name") String name,
							            @RequestParam("city") String city,
							            Model model) {
		model.addAttribute("msg", name + " And From " + city);
		return "display";
	}
	
	@RequestMapping("{name}/info")
    public String handleSingleParam1 (@PathVariable("name") String name,
					                 @RequestParam Map<String, String> queryMap,
					                 Model model) {
        
        model.addAttribute("msg", name + ", " +
                            queryMap.toString());
        return "display";
    }




}

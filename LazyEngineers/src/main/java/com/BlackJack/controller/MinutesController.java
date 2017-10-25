package com.BlackJack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BlackJack.model.Exercise;

@Controller 
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("exercise: " +exercise.getMinutes());
		 //return "addMinutes";
		 return "redirect:addMoreMinutes.html";   // redirects to html
	}
	
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercising: " + exercise.getMinutes());
		return "addMinutes";
	}
}

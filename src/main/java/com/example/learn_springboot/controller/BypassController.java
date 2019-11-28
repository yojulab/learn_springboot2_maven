package com.example.learn_springboot.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BypassController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/interior/**")
	public void bypass(Locale locale, Model model) {
	}
}

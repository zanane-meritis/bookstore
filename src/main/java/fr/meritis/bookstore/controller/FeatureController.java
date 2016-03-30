package fr.meritis.bookstore.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeatureController {
	
	private static final Logger LOGGER = Logger.getLogger(FeatureController.class);
	
	@RequestMapping(value = "/features", method=RequestMethod.GET)
	public String login(ModelMap model) {
		//model.addAttribute("account", new Account());
		return "features";
	}
	
}
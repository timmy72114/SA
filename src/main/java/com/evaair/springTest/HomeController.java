package com.evaair.springTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//==========================登入頁面=================================
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	//==========================登入頁面=================================
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(){
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	//==========================登入成功頁面=================================
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView success(){
		ModelAndView model = new ModelAndView("success");
		return model;
	}
	
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("home");
		return model;
	}

	
}

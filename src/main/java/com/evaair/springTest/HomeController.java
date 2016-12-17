package com.evaair.springTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evaair.springTest.HomeController;

import DAO.ProductDAO;
import entity.Product;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//==========================管理者頁面=================================
	@RequestMapping(value = "/userProduct", method = RequestMethod.GET)
	public ModelAndView userProduct() {
		ModelAndView model = new ModelAndView("userProduct");
//		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//		List<Product> list = dao.getList();
//		model.addObject(list);
		return model;
	}

	//==========================產品管理頁面=================================
	@RequestMapping(value = "/manageProduct", method = RequestMethod.GET)
	public ModelAndView manageProduct() {
		ModelAndView model = new ModelAndView("manageProduct");
//		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//		List<Product> list = dao.getList();
//		model.addObject(list);
		return model;
	}	
	//==========================訂單管理頁面=================================
	@RequestMapping(value = "/manageOrder", method = RequestMethod.GET)
	public ModelAndView manageOrder() {
		ModelAndView model = new ModelAndView("manageOrder");
//		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//		List<Product> list = dao.getList();
//		model.addObject(list);
		return model;
	}
	//==========================新增商品頁面=================================
		@RequestMapping(value = "/insertProduct", method = RequestMethod.GET)
		public ModelAndView insertProduct() {
			ModelAndView model = new ModelAndView("insertProduct");
//			ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//			List<Product> list = dao.getList();
//			model.addObject(list);
			return model;
		}
		//==========================倉儲頁面=================================
		@RequestMapping(value = "/storage", method = RequestMethod.GET)
		public ModelAndView storage() {
			ModelAndView model = new ModelAndView("storage");
//			ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//			List<Product> list = dao.getList();
//			model.addObject(list);
			return model;
		}
		//==========================對帳頁面=================================
		@RequestMapping(value = "/manageRecord", method = RequestMethod.GET)
		public ModelAndView manageRecord() {
			ModelAndView model = new ModelAndView("manageRecord");
//			ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//			List<Product> list = dao.getList();
//			model.addObject(list);
			return model;
		}
	//==========================顧客頁面=================================

	@RequestMapping(value = "/cusProduct", method = RequestMethod.GET)
	public ModelAndView ProductList() {
		ModelAndView model = new ModelAndView("cusProduct");
//		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
//		List<Product> list = dao.getList();
//		model.addObject(list);
		return model;
	}// getcustomerProduct
	//==========================註冊=================================
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(){
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	//==========================註冊成功頁面==============================
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView success(){
		ModelAndView model = new ModelAndView("success");
		return model;
	}
	

	//==========================首頁================================


	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("home");
		//ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		//List<Product> list = dao.getList();
		//model.addObject(list);
		return model;
		}
	//==========================男裝=================================
		@RequestMapping(value = "/men", method = RequestMethod.GET)
		public ModelAndView men(){
			ModelAndView model = new ModelAndView("men");
			return model;
		}
    //==========================女裝=================================
		@RequestMapping(value = "/women", method = RequestMethod.GET)
		public ModelAndView women(){
			ModelAndView model = new ModelAndView("women");
			return model;
		}
		
}

package link.thinkonweb.spring;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@ModelAttribute("testList")
	public List<String> referenceList() {		
		List<String> testIntegers = new ArrayList<String>();
		testIntegers.add("string1");
		testIntegers.add("string2");
		testIntegers.add("string3");
		return testIntegers;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/mav", method = RequestMethod.GET)
	public ModelAndView modelAndView(@RequestParam(value="q", required=false, defaultValue="querytest") String query,
			@RequestParam(value="p", required=false, defaultValue="1") int page
			) {
		

		ModelAndView mav = new ModelAndView();
		mav.setViewName("mav2");
		mav.addObject("mavtest", new String("model and view test"));
		mav.addObject("query", query);
		mav.addObject("page", page);
		return mav;
	}
}

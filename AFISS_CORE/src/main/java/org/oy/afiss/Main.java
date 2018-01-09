package org.oy.afiss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
	
	@RequestMapping("hello")
	public ModelAndView handleLogin(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		return mav;
	}
}

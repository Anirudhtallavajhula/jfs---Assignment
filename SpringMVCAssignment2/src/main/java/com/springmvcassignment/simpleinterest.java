package com.springmvcassignment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class simpleinterest {

		

		@RequestMapping("/cal")
		public ModelAndView cal(HttpServletRequest request,HttpServletResponse response) {
			
			int p=Integer.parseInt(request.getParameter("P"));
			int r=Integer.parseInt(request.getParameter("R"));
			int t=Integer.parseInt(request.getParameter("T"));
			
			int SI=(p*r*t)/100;
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("result.jsp");
			mv.addObject("SimpleInterest",SI);

			return mv;
			

	}
		
	
}

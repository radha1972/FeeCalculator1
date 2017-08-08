package com.radha;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.*;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AddController  {
	@Autowired
	AddServiceDao addservice=new AddServiceimpl();
	@RequestMapping("/add")
	   public ModelAndView printHello(
			   HttpServletRequest req,HttpServletResponse res) {
	int id=Integer.parseInt(req.getParameter("id"));
	   String name=  req.getParameter("customername");
	    String addrs=req.getParameter("address");
	    String zipcode=req.getParameter("zipcode");
	    addservice.add(id,name,addrs,zipcode);
	    String message="hello world spring mvc";
	    return new ModelAndView("welcome","message",message);
	   }


}

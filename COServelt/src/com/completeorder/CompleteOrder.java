package com.completeorder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompleteOrder extends HttpServlet
{
 public void service(HttpServletRequest req, HttpServletResponse res )
 {
	 int ordern=Integer.parseInt(req.getParameter("orderno"));
	 int dayscount=Integer.parseInt(req.getParameter("days"));
	 String environment = req.getParameter("env");
	 String martenstask=req.getParameter("martens1");
	 String ffwftask=req.getParameter("ffwf1");
	 String tomtask=req.getParameter("tom1");
	 String billtask=req.getParameter("bill1");
	 
	 
	 
 }
	
}

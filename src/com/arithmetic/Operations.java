package com.arithmetic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operations extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		float i = Float.parseFloat(req.getParameter("num1"));
		float j = Float.parseFloat(req.getParameter("num2"));
		String value = req.getParameter("val");
		float k = 0;
		if(value.equals("+")) {
			k = i+j;
		}
		else if(value.equals("-")) {
			k = i-j;
		}
		else if(value.equals("*")) {
			k = i*j;
		}
		else if(value.equals("/")) {
			k = i/j;
		}
		//System.out.println("Result is "+k);
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
	}
}

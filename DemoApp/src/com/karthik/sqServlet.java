package com.karthik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class sqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int k=0;
		Cookie cookies[]= req.getCookies();
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
//		HttpSession session = req.getSession();
//		
//		int k = (int)session.getAttribute("k");
//		
	//	int k = Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("the result of square is  "+k);
		
	}

}

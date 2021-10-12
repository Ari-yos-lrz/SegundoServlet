package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AriadneLaraServlet_2 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		/*
		 * Si escribe un metodo init que tome un servletconfig
		 * como argumento siempre llame a super.init() een 
		 * la primer linea*/
		
		/*ServletConfig cuenta con un metodo getInitParameter
		 * con el cual podemos buscar parametro de carga inicial*/
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = req.getParameter("nombre");
		System.out.println("El nombre es:"+nombre);
		
		String apellido = req.getParameter("apellido");
		System.out.println("El apellido es:"+apellido);
		
		PrintWriter salida = resp.getWriter();
		salida.println("Hola mi nombre es "+ nombre+" y mi apellido es "+apellido);
	}
}

package br.com.alura.maven.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/novaEmpresa"})
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		System.out.println("Registering new Company");
		
		String companysName = httpServletRequest.getParameter("nome");
		
		Company company = new Company(companysName);
		
		DataBankSimulator dataBankSimulator = new DataBankSimulator();
		dataBankSimulator.add(company);
		
//		Invoke JPS
		RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/newCompanyRegistered.jsp");
		
		httpServletRequest.setAttribute("companysName", company.getName());
		
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
		
	}

}

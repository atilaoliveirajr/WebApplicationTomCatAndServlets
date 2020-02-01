package br.com.alura.maven.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/companiesList" })
public class CompaniesList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)
			throws ServletException, IOException {

		final DataBankSimulator dataBankSimulator = new DataBankSimulator();
		List<Company> listForTheBrownser = dataBankSimulator.getCompany();
		
		httpServletRequest.setAttribute("ListOfRegisteredCompanies", listForTheBrownser);
		
		RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ListOfRegisteredCompanies.jsp");
		
		requestDispatcher.forward(httpServletRequest, httpServletResponse);		


	}

}
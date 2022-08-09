package br.ufscar.dc.dsw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufscar.dc.dsw.domain.Prestador;;


@WebServlet(urlPatterns = "/prestador/*")
public class PrestadorController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Prestador prestador = (Prestador) request.getSession().getAttribute("usuarioLogado");
    	
    	if (prestador == null) {
    		response.sendRedirect(request.getContextPath());
    	} else if (prestador.getEmail() != null) {
    		RequestDispatcher dispatcher = request.getRequestDispatcher("/logado/prestador/index.jsp");
            dispatcher.forward(request, response);
    	} else {
    		RequestDispatcher rd = request.getRequestDispatcher("/logout.jsp");
    		rd.forward(request, response);
    	}
    }
}
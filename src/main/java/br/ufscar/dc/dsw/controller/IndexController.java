package br.ufscar.dc.dsw.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufscar.dc.dsw.dao.ClienteDAO;
import br.ufscar.dc.dsw.domain.Cliente;


@WebServlet(name = "Index", urlPatterns = { "/index.jsp", "/logout.jsp" })
public class IndexController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("botaoLogin") != null) {
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
				ClienteDAO dao = new ClienteDAO();
				Cliente cliente = dao.getbyLogin(email);
				if (cliente != null) {
					if (cliente.getSenha().equals(senha)) {
						request.getSession().setAttribute("usuarioLogado", cliente);
						if (cliente.getAdm()== 1) {
							response.sendRedirect("admin/");
						} else {
							response.sendRedirect("cliente/");
						}
						return;
				}
			}
		}
		request.getSession().invalidate();

		String URL = "/login.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(URL);
		rd.forward(request, response);
	}
}

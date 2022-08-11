package br.ufscar.dc.dsw.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufscar.dc.dsw.dao.PrestadorDAO;
import br.ufscar.dc.dsw.domain.Prestador;


@WebServlet(urlPatterns = "/prestador/*")
public class PrestadorController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private PrestadorDAO dao;
    
    public void init() {
        dao = new PrestadorDAO();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getPathInfo();
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "/cadastro":
                    formCadastro(request, response);
                    break;
                case "/insercao":
                    insere(request, response);
                    break;
                case "/remocao":
                    //remove(request, response);
                    break;
                case "/edicao":
                    //apresentaFormEdicao(request, response);
                    break;
                case "/atualizacao":
                    //atualize(request, response);
                    break;
                case "/gerenciar":
                    gerencia(request, response);
                    break;
                case "/listagem":
                    listaPrestadores(request, response);
                    break;
                default:
                    login(request, response);
                    break;
            }
        } catch (RuntimeException | IOException | ServletException e) {
            throw new ServletException(e);
        }
    	
    }
    
    private void formCadastro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/logado/prestador/cadastro.jsp");
        dispatcher.forward(request, response);
    }
    
    private void insere(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String nome = request.getParameter("nome");
        String CPF = request.getParameter("CPF");
        String area = request.getParameter("area");
        String especialidade = request.getParameter("especialidade");
        
        Prestador prestador = new Prestador(null, email, senha, nome, CPF, area, especialidade);
        dao.insert(prestador);
        response.sendRedirect("login");
    }
    
    private void gerencia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	List<Prestador> listaPrestadores = dao.getAll();
        request.setAttribute("listaPrestadores", listaPrestadores);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/logado/prestador/gerenciamento.jsp");
        dispatcher.forward(request, response);
    }
    
    private void listaPrestadores(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Prestador> listaPrestadores = dao.getAll();
        request.setAttribute("listaPrestadores", listaPrestadores);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listaprofs.jsp");
        dispatcher.forward(request, response);
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
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
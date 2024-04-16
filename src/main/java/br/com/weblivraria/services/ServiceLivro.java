package br.com.weblivraria.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.weblivraria.dao.DAOLivro;
import br.com.weblivraria.dominio.Livro;

/**
 * Servlet implementation class ServiceLivro
 */
public class ServiceLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceLivro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String titulo = request.getParameter("txtTitulo");
		String genero = request.getParameter("cboGenero");
		String sinopse = request.getParameter("txtSinopse");
		String autor = request.getParameter("txtAutor");
		String preco = request.getParameter("txtPreco");
		String capa = request.getParameter("txtCapa");
		
		//instância da classe Livro
		Livro lv = new Livro();
		//passando os dados para o objeto livro(lv)
		lv.setTitulo(titulo);
		lv.setGenero(genero);
		lv.setSinopse(sinopse);
		lv.setAutor(autor);
		lv.setPreco(Double.parseDouble(preco));
		lv.setCapa(capa);
		//instância da camada DAO para efetuar o cadastro do livro
		DAOLivro dv = new DAOLivro();
		if(dv.cadastrar(lv).equals("Cadastro realizado")) {
			response.sendRedirect("confirmacao.html");
		}
		
		
	}

}

package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {
	
		// Vamos realizar os teste em todos os métodos que estão
		// na classe DAOUsuario.
	 
		// Vamos começar testando o cadastro do usuário.
//		@Test
//		public void testCadastroUsuario() {
//			//Realizar a instância da classe Usuario e aplicar dados
//			//ficticios para cadastrar. Está técnica é chamada de dados
//			//mockados
//			Usuario us = new Usuario();
//		
//			us.setNomeusuario("valeria");
//			us.setSenha("123");
//			us.setEmail("valeria@gmail.com");
//			us.setTelefone("(11) 9328-9528");
//			us.setNomecompleto("Valeria Mansini");
//			us.setCpf("547824521473");
//			
////			//Instância da classe DAOUsuario
//			DAOUsuario daous = new DAOUsuario();
//			assertEquals("Cadastro realizado",daous.cadastrar(us));
//		}
	
//	@Test
//	public void testListar() {
//		DAOUsuario daous = new DAOUsuario();
//		List<Usuario> resultado = new ArrayList<Usuario>();
//		assertEquals(resultado, daous.listar());
//	}
//	@Test
//	public void testPesquisar() {
//		DAOUsuario daous = new DAOUsuario();
//		Usuario us = new Usuario();
//		Usuario usuario_id = new Usuario();
//		usuario_id.setIdusuario(1);
//		assertEquals("pedro", daous.pesquisar(usuario_id).getNomeusuario());
//		
//	}
	
//	@Test
//	public void testAtualizar() {
//		Usuario us_test = new Usuario();
//		us_test.setIdusuario(1);
//		us_test.setNomeusuario("pedro.pedros");
//		us_test.setEmail("ped@gmail.com");
//		us_test.setTelefone("(11) 5969-6659");
//		us_test.setNomecompleto("Pedro Pedreira da Silva");
//		
//		DAOUsuario daous = new DAOUsuario();
//		
//		assertEquals("Atualização realizada", daous.atualizar(us_test));
//	}
	
	@Test
	public void testLogin() {
		Usuario us = new Usuario();
		us.setNomeusuario("pedro");
		us.setSenha("123");
		
		DAOUsuario daous = new DAOUsuario();
		assertTrue(daous.login(us));
	}

//	@Test
//	public void testAlterarSenha() {
//		Usuario us = new Usuario();
//		us.setSenha("abc123");
//		us.setIdusuario(1);
//		
//		DAOUsuario daous = new DAOUsuario();
//		assertEquals("Atualização realizada", daous.alterarSenha(us));
//	}
}

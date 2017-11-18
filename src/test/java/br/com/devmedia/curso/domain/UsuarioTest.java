package br.com.devmedia.curso.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testGetNome() {
		Usuario u = new Usuario();
		assertEquals("", u.getNome());
		
	}
}

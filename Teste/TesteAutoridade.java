import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	//Teste de tratamento informal
	@Test
	public void testInformal() {
		FormatadorNome FrNe = new Informal();
		Autoridade a = new Autoridade ("Guilherme", "Oliveira", FrNe);
		assertEquals(a.getTratamento(), "Guilherme");
	}

	//Teste de tratamento Respeitoso para o caso masculino
	@Test
	public void testRespeitosoMasculino() {
		FormatadorNome FrNe = new Respeitoso("Masculino");
		Autoridade a = new Autoridade ("Guilherme", "Oliveira", FrNe);
		assertEquals(a.getTratamento(),"Sr. Oliveira");
	}
	
	//Teste de tratamento Respeitoso para o caso feminino
	@Test
	public void testRespeitosoFeminino() {
		FormatadorNome FrNe = new Respeitoso("feminino");
		Autoridade a = new Autoridade ("Lea", "Cristiane", FrNe);
		assertEquals(a.getTratamento(),"Sra. Cristiane");
	}
	
	//Teste de tratamento Com Titulo
	@Test
	public void testComTitulo() {
		FormatadorNome FrNe = new ComTitulo("Excelentíssimo");
		Autoridade a = new Autoridade("Guilherme", "Oliveira", FrNe);
		assertEquals(a.getTratamento(),"Excelentíssimo Guilherme Oliveira");
	}
}

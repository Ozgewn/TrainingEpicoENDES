package ImprimirPantalla;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrueba {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@BeforeEach
	void reiniciarFlujo(){
		System.setOut(new PrintStream(outContent));
	}
	@AfterEach
	void reiniciarFlujo2(){
		System.setOut(originalOut);
	}
	@Test
	void TestNota1(){
		 Prueba.aprobado(1);
		 assertTrue(outContent.toString().contains(Prueba.MENSAJE_SUSPENSO));
	}
	@Test
	void TestNota5(){
		 Prueba.aprobado(5);
		 assertFalse(outContent.toString().contains(Prueba.MENSAJE_SUSPENSO));
		 assertTrue(outContent.toString().contains(Prueba.MENSAJE_APROBADO));
	}
	@Test
	void TestNota10(){
		 Prueba.aprobado(10);
		 assertTrue(outContent.toString().contains(Prueba.MENSAJE_APROBADO));
	}
	@Test
	void TestNota0(){
		assertThrows(IllegalArgumentException.class,()-> Prueba.aprobado(0));
	}
	@Test
	void TestNota11(){
		assertThrows(IllegalArgumentException.class,()-> Prueba.aprobado(11));
	}
	

}
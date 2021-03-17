package ImprimirPantalla;

public class Prueba {
//
public static final String MENSAJE_APROBADO="¡Enhorabuena, has aprobado!";
public static final String MENSAJE_SUSPENSO="Lo siento, has suspendido";

public static void aprobado(int nota){
		if(nota>4 && nota<11){
			System.out.println(MENSAJE_APROBADO);
		}else if(nota>0 && nota<5){
			System.out.println(MENSAJE_SUSPENSO);
		}else{
			throw new IllegalArgumentException();
		}
	}

}


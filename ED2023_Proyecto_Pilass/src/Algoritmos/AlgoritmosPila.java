package algoritmos;

import tadPila.Pila;
import tadPila.PilaVacia;

public class AlgoritmosPila {

	public static <T> int contarPila(Pila<T> pila) throws PilaVacia {
		int resul;
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			resul = 1 + contarPila(pila);
			pila.apilar(elem);
		}
		else
			resul = 0;		
		return resul;
	}
	
	public static <T> void sumergir(Pila<T> pila, T dato) throws PilaVacia {
		T elem;
		if(!pila.pilaVacia()) {
			elem = pila.desapilar();
			sumergir(pila, dato);
			pila.apilar(elem);
		}
		else {
			pila.apilar(dato);
		}		
	}
	
	public static <T> T fondo(Pila<T> pila) {
		T resul = null;
		T elem;
		try {
			if(!pila.pilaVacia()) {
				elem = pila.desapilar();
				if(pila.pilaVacia())
					resul = elem;
				else
					resul = fondo(pila);
				pila.apilar(elem);
			}		
		}catch(PilaVacia e) {
			
		}
		return resul;
			
	}
	
	public static <T> void apilarEnOrden(Pila<T> pila, T dato) {
		
	}
	
}

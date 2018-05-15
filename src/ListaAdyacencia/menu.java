package ListaAdyacencia;

import java.util.ArrayList;

public class menu {

	public static void main(String[] args) {

		ListaAdyacencias lista = new ListaAdyacencias();
		
		for (int i = 0; i < 10; i++) {
			lista.agregarVertice(i);
		}
		
		lista.agregarArista(1, 3, 5);
		lista.agregarArista(1, 5, 2);
		lista.agregarArista(1, 2, 6);
		lista.agregarArista(1, 7, 9);
		lista.agregarArista(2, 7, 3);

		
		System.out.println("");
		System.out.println(lista.existeArista(1, 2) ? "Exite la arista" : "No existe la arista");

		
		System.out.println("La cantidad de aristas que existen son " + lista.getNumAristas());
		System.out.println("La cantidad de vertices que existen son " + lista.getNumVertices());

		System.out.println("");
		
		ArrayList<Vertice> adyacentes1 = lista.obtenerAdyacentes(1);
		ArrayList<Vertice> adyacentes2 = lista.obtenerAdyacentes(2);

		System.out.println("Los adyacentes del vertice 1 son: ");
		
		for (Vertice vertice : adyacentes1) {
			System.out.print(vertice.getNombre() + " - ");
		}
		System.out.println("");

		
		System.out.println("Los adyacentes del vertice 2 son: ");
		
		for (Vertice vertice : adyacentes2) {
			System.out.print(vertice.getNombre() + " - ");
		}
		System.out.println("");

		
		ArrayList<Vertice> listaVertices = lista.obtenerVertices();
		System.out.println("Los vertices que existen son: ");
		
		for (Vertice vertice : listaVertices) {
			System.out.print(vertice.getNombre() + " - ");
		}

	}

}

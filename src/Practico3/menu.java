package Practico3;

public class menu {

	public static void main(String[] args) {

		MatrizAdyacencias matriz = new MatrizAdyacencias(6);
		matriz.agregarArista(2, 3);
		matriz.agregarArista(3, 5);
		matriz.agregarArista(2, 5);
		
		System.out.println(
				(matriz.existeArista(3, 5) ? 
						"Exite arista, el peso es " + matriz.obtenerPesoArista(3, 5) + ""
						:
						"No existe arista"));
		
		System.out.println("");
		matriz.imprimir();
		
		System.out.println("");

		System.out.println("Se agrega un nuevo vertice");
		
		matriz.agregarVertice(7);
		
		System.out.println("");
		matriz.imprimir();
		
		System.out.println("");

		System.out.println("Se agrega un nuevo vertice mas chico (Lo deberia duplicar)");
		
		matriz.agregarVertice(6);
		System.out.println("");
		matriz.imprimir();

	}

}

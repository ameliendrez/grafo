package ListaAdyacencia;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaAdyacencias implements Grafo {
	
	private LinkedList<Vertice> vertices;
	private int cantidadAristas;
	
	public ListaAdyacencias() {
		this.vertices = new LinkedList<Vertice>();
		this.cantidadAristas = 0;
	}

	@Override
	public void agregarVertice(Vertice vertice) {
		vertices.add(vertice);
	}

	@Override
	public void agregarArista(Vertice verticeA, Vertice verticeB, int peso) {
		Vertice origen = this.obtenerVertice(verticeA);
		Vertice destino = this.obtenerVertice(verticeB);
		
		if (origen != null && destino != null) {
			Arista arista = new Arista(destino, peso);
			origen.addArista(arista);
			cantidadAristas++;
		}
		else 
			System.out.println("Uno de los vertices no existe");
	}

	@Override
	public Vertice obtenerVertice(Vertice v) {
		for (Vertice vertice : this.vertices) {
			if (vertice.equals(v)) {
				return vertice;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Vertice> obtenerVertices() {
		ArrayList <Vertice> vertices = new ArrayList<Vertice>();
		for (Vertice vertice : this.vertices) {
			vertices.add(vertice);
		}
		return vertices;
	}

	@Override
	public Integer getNumVertices() {
		return this.vertices.size();
	}

	@Override
	public Integer getNumAristas() {
		return this.cantidadAristas;
	}

	@Override
	public boolean existeArista(Vertice verticeA, Vertice verticeB) {
//		Vertice origen = this.obtenerVertice(verticeA);
//		Vertice destino = this.obtenerVertice(verticeB);
	//abria que verificar con un hasVertice por ejemplo, si existe el vertice en el grafo	
		if (verticeA.existeArista(verticeB)) {
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Vertice> obtenerAdyacentes(Vertice vertice) {
		ArrayList<Vertice> adyacentes = new ArrayList<Vertice>();
		//Vertice origen = this.obtenerVertice(vertice);
		//verificar si esta el vertice aca antes, creo q el if de si es null no se tendria q hacer
		if (vertice != null) {
			adyacentes.addAll(vertice.obtenerAdyacentes());
		}
		return adyacentes;
	}

}

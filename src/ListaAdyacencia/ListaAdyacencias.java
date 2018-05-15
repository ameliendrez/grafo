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
	public void agregarVertice(int vertice) {
		Vertice nuevoVertice = new Vertice(vertice);
		vertices.add(nuevoVertice);
	}

	@Override
	public void agregarArista(int verticeA, int verticeB, int peso) {
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
	public Vertice obtenerVertice(int claveVertice) {
		for (Vertice vertice : this.vertices) {
			if (vertice.getNombre() == claveVertice) {
				return vertice.getVertice();
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
	public boolean existeArista(int verticeA, int verticeB) {
		Vertice origen = this.obtenerVertice(verticeA);
		Vertice destino = this.obtenerVertice(verticeB);
		
		if (origen.existeArista(destino)) {
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Vertice> obtenerAdyacentes(int vertice) {
		ArrayList<Vertice> adyacentes = new ArrayList<Vertice>();
		Vertice origen = this.obtenerVertice(vertice);
		if (origen != null) {
			adyacentes.addAll(origen.obtenerAdyacentes());
		}
		return adyacentes;
	}

}

package ListaAdyacencia;

import java.util.ArrayList;
import java.util.LinkedList;

public class Vertice {

	private String nombre;
	private LinkedList<Arista> aristas;
	
	public Vertice (String nombre) {
		this.nombre = nombre;
		aristas = new LinkedList<Arista>();
	}
	
	public void addArista(Arista arista) {
		aristas.add(arista);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Vertice getVertice() {
		return this;
	}
	
	public boolean existeArista (Vertice destino){
		for (Arista arista : this.aristas) {
			if (arista.getDestino().equals(destino)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Vertice> obtenerAdyacentes() {
		ArrayList<Vertice> adyacentes = new ArrayList<Vertice>();
		for (Arista arista : aristas) {
			adyacentes.add(arista.getDestino());
		}
		return adyacentes;
	}
	
	public boolean equals(Vertice v) {
		if(this.getNombre().equals(v.getNombre()))
			return true;
		else
			return false;		
	}
	
}

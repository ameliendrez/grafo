package ListaAdyacencia;
import java.util.*;

public interface Grafo {
	
	//Grafo() crea un grafo nuevo y vacío.
	
	public void agregarVertice(Vertice vertice); //agrega una instancia de Vértice al grafo.
	
	public void  agregarArista(Vertice verticeA, Vertice verticeB, int peso); 
	//agrega al grafo una nueva arista dirigida que conecta dos vértices.
	
	public Vertice  obtenerVertice(Vertice claveVertice);
	//encuentra el vértice en el grafo con nombre claveVert.
	
	public ArrayList<Vertice> obtenerVertices();
	
	//devuelve la lista de todos los vértices en el grafo.
	
	public Integer getNumVertices(); //devuelve la cantidad de Vértices.
	
	public Integer getNumAristas(); //devuelve la cantidad de Aristas.
	
	public boolean existeArista(Vertice verticeA, Vertice verticeB);
	//devuelve true si existe una arista que conecte los vértices dados.
	
	public ArrayList<Vertice> obtenerAdyacentes(Vertice vertice);
	//devuelve una lista con todos los vértices alcanzables desde el dado.

}

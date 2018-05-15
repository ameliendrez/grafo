package MatrizAdyacencias;
import java.util.*;

public interface Grafo {
	
	//Grafo() crea un grafo nuevo y vacío.
	
	public void agregarVertice(int vertice); //agrega una instancia de Vértice al grafo.
	
	public void  agregarArista(int verticeA, int verticeB, int peso); 
	//agrega al grafo una nueva arista dirigida que conecta dos vértices.
	
	public int  obtenerVertice(int claveVertice);
	//encuentra el vértice en el grafo con nombre claveVert.
	
	public ArrayList<Integer> obtenerVertices();
	
	//devuelve la lista de todos los vértices en el grafo.
	
	public Integer getNumVertices(); //devuelve la cantidad de Vértices.
	
	public Integer getNumAristas(); //devuelve la cantidad de Aristas.
	
	public boolean existeArista(int verticeA, int verticeB);
	//devuelve true si existe una arista que conecte los vértices dados.
	
	public ArrayList<Integer> obtenerAdyacentes(int vertice);
	//devuelve una lista con todos los vértices alcanzables desde el dado.

}

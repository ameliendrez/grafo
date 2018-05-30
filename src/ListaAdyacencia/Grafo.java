package ListaAdyacencia;
import java.util.*;

public interface Grafo {
	
	//Grafo() crea un grafo nuevo y vac�o.
	
	public void agregarVertice(Vertice vertice); //agrega una instancia de V�rtice al grafo.
	
	public void  agregarArista(Vertice verticeA, Vertice verticeB, int peso); 
	//agrega al grafo una nueva arista dirigida que conecta dos v�rtices.
	
	public Vertice  obtenerVertice(Vertice claveVertice);
	//encuentra el v�rtice en el grafo con nombre claveVert.
	
	public ArrayList<Vertice> obtenerVertices();
	
	//devuelve la lista de todos los v�rtices en el grafo.
	
	public Integer getNumVertices(); //devuelve la cantidad de V�rtices.
	
	public Integer getNumAristas(); //devuelve la cantidad de Aristas.
	
	public boolean existeArista(Vertice verticeA, Vertice verticeB);
	//devuelve true si existe una arista que conecte los v�rtices dados.
	
	public ArrayList<Vertice> obtenerAdyacentes(Vertice vertice);
	//devuelve una lista con todos los v�rtices alcanzables desde el dado.

}

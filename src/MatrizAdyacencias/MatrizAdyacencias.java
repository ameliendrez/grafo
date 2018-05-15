package MatrizAdyacencias;

import java.util.ArrayList;

public class MatrizAdyacencias implements Grafo {
	
	private int cantidadVertices;
	private int cantidadAristas;
	private int matriz[][];
	
	public MatrizAdyacencias (int cantidadVertices) {
		this.cantidadVertices = cantidadVertices;
		this.cantidadAristas = 0;
		matriz = new int [cantidadVertices][cantidadVertices];
		for (int i = 0; i < cantidadVertices; i++) {
			for (int j = 0; j< cantidadVertices; j++) {
				matriz [i][j] = 0;
			}
		}
	}

	@Override
	public void agregarVertice(int vertice) {
		int nuevaMatriz[][];
		int nuevaCantidadVertices;
		if (vertice < cantidadVertices) {
			nuevaMatriz = new int [cantidadVertices*2][cantidadVertices*2];
			nuevaCantidadVertices = cantidadVertices*2;
		}
		else {
			nuevaMatriz = new int [vertice][vertice];
			nuevaCantidadVertices = vertice;
		}
		
		
		for (int i = 0; i < nuevaCantidadVertices; i++) {
			for (int j = 0; j < nuevaCantidadVertices; j++) {
				if (i < cantidadVertices && j < cantidadVertices) 
					nuevaMatriz[i][j] =  matriz [i][j];
				else
					nuevaMatriz[i][j] = 0;
			}
		}
		
		matriz = nuevaMatriz;
		cantidadVertices = nuevaCantidadVertices;
	}

	@Override
	public void agregarArista(int verticeA, int verticeB, int peso) {
		if (verticeA < cantidadVertices && verticeB < cantidadVertices && verticeA != verticeB) {
			matriz[verticeA][verticeB] = peso;
			cantidadAristas++;
		}
		else 
			System.out.println("Ese vertice no existe");
	}
	
	public void agregarArista(int verticeA, int verticeB) {
		if (verticeA < cantidadVertices && verticeB < cantidadVertices && verticeA != verticeB) {
			matriz[verticeA][verticeB] = 1;
			cantidadAristas++;
		}
		else 
			System.out.println("Ese vertice no existe");
	}

	@Override
	public int obtenerVertice(int claveVertice) {
		return matriz[claveVertice][claveVertice];
	}

	@Override
	public ArrayList<Integer> obtenerVertices() {
		ArrayList<Integer> retorno = new ArrayList<Integer>();
		
		for (int i = 0; i < cantidadVertices; i++) {
			retorno.add(i);
		}
		return null;
	}

	@Override
	public Integer getNumVertices() {
		return cantidadVertices;
	}

	@Override
	public Integer getNumAristas() {
		return cantidadAristas;
	}

	@Override
	public boolean existeArista(int verticeA, int verticeB) {
		if (verticeA < cantidadVertices && verticeB < cantidadVertices) {
			if ((matriz[verticeA][verticeB] != 0)||(matriz[verticeB][verticeA] != 0)) {
				return true;
			}
		}
		return false;
	}
	
	public int obtenerPesoArista(int verticeA, int verticeB) {
		return matriz [verticeA][verticeB];
	}

	@Override
	public ArrayList<Integer> obtenerAdyacentes(int vertice) {
		ArrayList <Integer> retorno = new ArrayList<Integer>();
		
		for (int i = 0; i < cantidadVertices; i++) {
			if (matriz[vertice][i] != 0) {
				retorno.add(matriz[vertice][i]);
			}
		}
		
		return retorno;
	}
	
	  public void imprimir(){
	        for(int i=0; i< cantidadVertices; i++){
	            for(int j=0; j< cantidadVertices; j++){
	                System.out.print( matriz[i][j] + " - " );        
	            }
	            System.out.println();
	        }  
	    }
}

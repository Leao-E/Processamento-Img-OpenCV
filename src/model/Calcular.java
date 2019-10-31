package model;

import java.util.List;

public class Calcular {
	
	public static float DistanciaEuclidiana(List<Float>x, List<Float>y, int n) {
		float soma = 0;
		for (int i = 0; i < n; i++) {
			soma += Math.pow((x.get(i) - y.get(i)), 2);;
		}
		return soma;
	}
	public static float DistanciaManhattan(List<Float>x, List<Float>y, int n) {
		float soma = 0;
		for(int i = 0; i < n; i++) {
			soma += Math.abs((x.get(i)-y.get(i)));
		}
		return soma;
	}
	public static float DistanciaChebychev(List<Float>x, List<Float>y, int n) {
		/*Precisa implementar ainda*/
		float soma = 0;
		return soma;
	}
}

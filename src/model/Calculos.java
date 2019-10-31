package model;

import java.util.List;

public abstract class Calculos implements CalculosDistancia{
	@Override
	public float DistanciaEuclidiana(List<Float>x, List<Float>y, int n) {
		float soma = 0;
		for (int i = 0; i < n; i++) {
			soma += Math.pow((x.get(i) - y.get(i)), 2);;
		}
		return soma;
	}
	@Override
	public float DistanciaManhattan(List<Float>x, List<Float>y, int n) {
		float soma = 0;
		for(int i = 0; i < n; i++) {
			soma += Math.abs((x.get(i)-y.get(i)));
		}
		return soma;
	}
	@Override
	public float DistanciaChebychev(List<Float>x, List<Float>y, int n) {
		/*Precisa implementar ainda*/
		float soma = 0;
		return soma;
	}
}

package model;

import java.util.List;

public interface CalculosDistancia {
	float DistanciaEuclidiana(List<Float>x, List<Float>y, int n);
	float DistanciaManhattan(List<Float>x, List<Float>y, int n);
	float DistanciaChebychev(List<Float>x, List<Float>y, int n);
}

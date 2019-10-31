package model;

import java.util.List;;

public class Imagem {
	private List <Float> atributos;
	private String rotulo;
	
	public void addAtributo(float atributo) {
		this.atributos.add(atributo);
	}
	public float getAtributo() {
		return this.atributos.get(this.atributos.size()-1);
	}
	public float getAtributo(int index) {
		return this.atributos.get(index);
	}
	public String getRotulo() {
		return rotulo;
	}
	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}
}

package model;

import java.util.List;;

public class Imagem {
	private List <Float> atributos;
	private String rotulo;
	
	public void setAtributos(List<Float> atributos) {
		this.atributos = atributos;
	}
	public void addAtributo(float atributo) {
		this.atributos.add(atributo);
	}
	public float getAtributo() {
		return this.atributos.get(this.atributos.size()-1);
	}
	public float getAtributo(int index) {
		return this.atributos.get(index);
	}
	public List<Float> getAtributos() {
		return this.atributos;
	}
	public String getRotulo() {
		return this.rotulo;
	}
	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}
}

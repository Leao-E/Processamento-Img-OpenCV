package model;

import java.util.List;
import model.Imagem;

public class Dataset {
	private List <Imagem> instancias;
	
	public void addInstancia(Imagem instancias) {
		this.instancias.add(instancias);
	}
	public Imagem getInstancia() {
		return this.instancias.get(this.instancias.size()-1);
	}
	public Imagem getInstancia(int index) {
		return this.instancias.get(index);
	}
}

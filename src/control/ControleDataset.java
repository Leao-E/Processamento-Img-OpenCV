package control;

import model.Imagem;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class ControleDataset {
	public ArrayList<Imagem> carregarDataset(String caminhoDataset) throws Exception{
		BufferedReader leitor = new BufferedReader(new FileReader(caminhoDataset));
		ArrayList<String> atributos = new ArrayList<String>();
		ArrayList<Imagem> dataset = new ArrayList<Imagem>();
		atributos = this.lerLinha(leitor);
		while(leitor.ready()){		
			atributos = this.lerLinha(leitor);
			dataset.add(this.criarImagem(atributos));
		}
		leitor.close();
		return dataset;
	}
	private ArrayList<String> lerLinha(BufferedReader leitor) throws Exception{
		ArrayList<String> linha = new ArrayList<String>();
		linha.addAll(Arrays.asList(leitor.readLine().split(",")));
		return linha;
	}
	private Imagem criarImagem (ArrayList<String> atributos) {
		Imagem imagem = new Imagem();
		imagem.setRotulo(atributos.get(atributos.size() - 1));
		atributos.remove(atributos.size() - 1);
		imagem.setAtributos(this.converterFloat(atributos));
		return imagem;
	}
	private ArrayList<Float> converterFloat(ArrayList<String> numerosString){
		ArrayList<Float> numerosFloat = new ArrayList<Float>();
		for(String numero: numerosString) {
			numerosFloat.add(Float.valueOf(numero));
		}
		return numerosFloat;
	}
}

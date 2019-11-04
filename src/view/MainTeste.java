package view;

import model.Imagem;
import org.opencv.core.Core;
import control.ControleImagem;

public class MainTeste {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	public static void main(String[] args) {
		Imagem imagem = new Imagem();
		ControleImagem controleImagem = new ControleImagem();
		try {
			imagem.setAtributos(controleImagem.carregarAtributos("C:\\Users\\eeman\\Documents\\Eclipse\\Processamento-Img-OpenCV\\src\\Imagens teste\\photo-effect-359981_960_720.jpg"));
			System.out.println(imagem.getRotulo() + " - " + imagem.getAtributos());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

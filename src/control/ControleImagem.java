package control;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.HOGDescriptor;
import java.util.List;
import model.Imagem;

public class ControleImagem {
	//carrega imagem do sistema e já seta os atributos da imagem
	public void carregarImagem (String caminhoParaImagem, Imagem instancia) {
		Mat imagem = new Mat();
		imagem = Imgcodecs.imread(caminhoParaImagem, Imgcodecs.IMREAD_GRAYSCALE);
		Imgproc.resize(imagem, imagem, new Size(64,128), 0.5, 0.5, Imgproc.INTER_LINEAR);
		instancia.setAtributos(this.calculaHOG(imagem));
	}
	//Calcula o hog a partir de uma imagem Mat passada 
	private List<Float> calculaHOG (Mat imagem){
		HOGDescriptor hog = new HOGDescriptor();
		MatOfFloat atributos = new MatOfFloat();
		hog.compute(imagem, atributos);
		return atributos.toList();
	}
}

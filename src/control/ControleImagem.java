package control;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ControleImagem {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		}
	/*public void redimensionar() {
	}*/
	
	public static void main(String[] args) {
		Mat img = new Mat();
		img = Imgcodecs.imread("C:\\Users\\eeman\\Documents\\Eclipse\\Processamento-Img-OpenCV\\src\\Imagens teste\\photo-effect-359981_960_720.jpg", Imgcodecs.IMREAD_GRAYSCALE);
		Imgproc.resize(img, img, new Size(64,128), 0.5, 0.5, Imgproc.INTER_LINEAR);
		Imgcodecs.imwrite("C:\\Users\\eeman\\Documents\\Eclipse\\Processamento-Img-OpenCV\\src\\Imagens teste\\teste.png", img);
	}
}

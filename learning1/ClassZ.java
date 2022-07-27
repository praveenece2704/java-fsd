package learning1;
import Learning.ClassM;
import Learning.ClassN;
public class ClassZ extends ClassM {

	public static void main(String[] args) {
		new ClassX().methodofpublicX();
		new ClassZ().methodofprotectedM();
		new ClassZ().methodofpublicM();
		new ClassN().methodofpublicN();
	}
}

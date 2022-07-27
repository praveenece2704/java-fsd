package learning1;
import Learning.ClassN;
import Learning.ClassM;
	
public class ClassY extends ClassN{

	public static void main(String[] args) {
		new ClassX().methodofpublicX();
		new ClassY().methodofpublicN();
		new ClassY().methodofprotectedN();
		new ClassM().methodofpublicM();
	}
	
}

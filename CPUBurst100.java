import java.util.ArrayList;

public class CPUBurst100 {

	public static void main(String[] args) {
			
		for (int i = 1; i <10000000; i++) {
			double zahl1 = Math.random()*1000000;
			double zahl2 = Math.sin(zahl1);
			System.out.println(i);
		}
		
	}

}

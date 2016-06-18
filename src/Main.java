import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File ("monFichier.csv");
		Random r = new Random(); 
		
		
		if (!f.exists()){
			f.createNewFile();
		}
	
        //FileWriter write = new FileWriter(f, false);
        PrintStream ps = new PrintStream(f);
        
        ArrayList<Integer> maListe= new ArrayList<Integer>();
        
        for (int i = 0 ; i <= 100; i++){
        	
        	maListe.add(r.nextInt(100)+ 1 );
        }
        for (Integer integer : maListe) {
        	ps.println(integer);
		}
    	//ps.println("=SOMME(A1:A100)");
        

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class mtgcardsorter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner fileReader = new Scanner(new File("src/first150pokemon"));
		
		while (fileReader.hasNext()){
			System.out.println(fileReader.nextLine());
			
		} fileReader.close();
	}

}

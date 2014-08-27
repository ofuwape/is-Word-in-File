import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {

		check();
	}

	public static void check() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
		String fileName = scan.next();
		// System.out.println(1);
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Check your file name");
			System.out.println("Invalid file; please re-enter the file name");
			check();
		}
		// System.out.println(2);
		System.out.println("Enter the word you are looking for: ");
		String word = scan.next();
		// TODO Auto-generated catch block

		// continue;

		Scanner inFile = new Scanner(reader);
		boolean found = false;
		while (inFile.hasNext() && !found) {
			// String newW = inFile.next();

			found = word.equals(inFile.next());
			if (found) {
				found = true;
			}
		}
		System.out.println(found);

	}

}

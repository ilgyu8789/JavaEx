package miniproject;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class PhoneNumberBook {

	public static void PhoneBook() {

		try {
			File file = new File("../../../files/phonbook.txt");

			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {

				String[] split = scan.nextLine().split(", ");
//				System.out.println(Arrays.toString(split));

			}

			scan.close(); // try-catch를 쓸 때 scan은 try문 끝에서 닫아준다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
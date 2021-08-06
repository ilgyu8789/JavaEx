package miniproject;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class PhoneNumberBook {

	public static void PhoneBook() {

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> hp = new ArrayList<>();
		ArrayList<String> tel = new ArrayList<>();

		try {
			File file = new File("C:\\Users\\NDW\\git\\JavaEx\\files\\phonbook.txt");

			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {

				String[] split = scan.nextLine().split(", ");
//				System.out.println(Arrays.toString(split));
				name.add(split[0]);
				hp.add(split[1]);
				tel.add(split[2]);
			}

			scan.close(); // try-catch를 쓸 때 scan은 try문 끝에서 닫아준다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package miniproject;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class PhoneNumberBook {

	static File file = new File("./files/phonbook.txt");
	
	public ArrayList<HashMap<String, String>> PhoneBook_read() {
		ArrayList<HashMap<String, String>> pb_list = new ArrayList<HashMap<String, String>>();
		try {
			Scanner scan = new Scanner(file);
			
			int idx = 1;
			
			while (scan.hasNextLine()) {

				String[] split = scan.nextLine().split(", ");
//				System.out.println(Arrays.toString(split));

				HashMap<String, String> map = new HashMap<String, String>();
				map.put("num", Integer.toString(idx));
				map.put("name", split[0]);
				map.put("hp", split[1]);
				map.put("tel", split[2]);
				
				pb_list.add(map);
				idx++;
			}
			scan.close(); // try-catch를 쓸 때 scan은 try문 끝에서 닫아준다
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return pb_list;
	}
	
	public static void PhoneBook_write(String type) {
		
	}

}
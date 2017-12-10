package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList();
		// 2. Add five Strings to your list
		names.add("hie");
		names.add("hi1e");
		names.add("hi2e");
		names.add("hi3");
		names.add("hi4e");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String string : names) {
			System.out.println(string);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i = i + 2) {
			System.out.println(names.get(i));
		}
		// 6. Print all the Strings in reverse order.
		for (int i = names.size() - 1; i > -1; i--) {
			System.out.println(names.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).contains("e")) {
				System.out.println(names.get(i));
			}

		}

	}
}

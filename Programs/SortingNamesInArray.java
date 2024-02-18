package Programs;

// 4. Write a Java Program for sorting a given list of names in ascending order.

/*
public class SortingNamesInArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Charlie", "Bob", "Eve"};

        sortNames(names);

        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void sortNames(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
*/
import java.util.Scanner;

class Experiment4 {
	Scanner sc = new Scanner(System.in);

	public void sortStrings() {
		System.out.print("How many Names ");
		int i, j, n;
		n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter " + n + " Strings");
		for (i = 0; i < n; i++) {
			str[i] = new String(sc.next());
		}
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Given Strings in Alphabetical Order");
		for (i = 0; i < n; i++)
			System.out.println(str[i]);
		
	}
}

class Mainclass {
	public static void main(String args[]) {
		Experiment4 obj = new Experiment4();
		obj.sortStrings();
	}
}
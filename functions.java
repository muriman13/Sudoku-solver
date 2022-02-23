import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class functions {
	public static boolean findRepating(String name) {
		int repeating = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int p = 0; p < name.length(); p++) {
				if (name.charAt(i) == name.charAt(p) && i != p) {
					repeating++;

				}
			}
		}
		System.out.println(repeating + "   :   " + name);

		if (repeating > 0) {
			System.out.println("There are repeating characters");

			return true;
		}
		System.out.println("There are no repeating characters");

		return false;
	}

	public static void FirstNonRepeating(String name) {
		for (int i = 1; i < name.length(); i++) {
			if (name.charAt(i) - 1 != name.charAt(i) && name.charAt(i) != name.charAt(i) + 1) {
				System.out.println(name.charAt(i));

			}
		}
	}

	public static void FirstNonRepeating(StringBuffer name) {
		for (int i = 0; i < name.length(); i++) {
			for (int p = i + 1; p <= name.length(); p++) {

				System.out.println(name.substring(i, p));

			}
		}

	}

	public static void length(String name) {
		int counter = 0;
		while (name.charAt(counter) != 'a') {
			counter++;
		}
	}

	public static void fibonachi() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(0);
		test.add(1);
		for (int i = 1; i < 100; i++) {
			test.add(test.get(i) + test.get(i - 1));
		}
		System.out.println(test);

	}

	public static void palindromr(String name) {
		boolean isit = false;
		for (int i = 0; i < name.length() / 2; i++) {
			if (name.charAt(i) == name.charAt(name.length() - (i + 1))) {
				isit = true;
			} else {
				isit = false;
			}
		}
		if (isit) {
			System.out.println("Its palinroime");
		} else {
			System.out.println("Its Megagay");
		}

	}

	public static void palindromints(int palindrome) {
		boolean isit = false;
		int reverse = 0;
		int palindrome2 = palindrome;
		while (palindrome != 0) {
			int remainer = palindrome % 10;
			reverse = reverse * 10 + remainer; // 5665 5, 566
			palindrome /= 10;
		}

		System.out.println(palindrome2 + "  :  " + reverse);
		if (palindrome2 == reverse) {
			System.out.println("Its palinroime");
		} else {
			System.out.println("Its Megagay");
		}
	}

	public static void ArmstrongNumber(int number) {
		int sum = 0;
		String num = "";
		num = String.valueOf(number);
		for (int i = num.length() - 1; i >= 0; i--) {
			sum += Math.pow(Character.getNumericValue(num.charAt(i)), num.length());

		}
		if (sum == number) {
			System.out.println(number);
		} else {

		}
	}

	public static int factorialrecursion(int num) {
		int sum = 0;
		if (num > 1) {
			System.out.println(num);
			return num * factorialrecursion(num - 1);

		} else {
			return 1;
		}

	}

	public static void reverseLinkedList(LinkedList<Integer> test) {
		Iterator<Integer> i = test.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

	public static void binarySearch(ArrayList<Integer> test, int search) {
		Collections.sort(test);
		System.out.println(test);
		int mid = test.size() / 2;
		int numberOfSteps = 0;
		while (test.get(mid) != search) {
			numberOfSteps++;
			if (test.get(mid) > search) {
				mid /= 2;
			} else if (test.get(mid) < search) {
				mid = (mid * 2) - 1;
			}
			if (numberOfSteps > 22) {
				break;
			}
		}
		System.out.println(mid);
		System.out.println(numberOfSteps);
		System.out.println(test);

	}

	public static int getRandomNumberUsingNextInt(int min, int max) {
		Random random = new Random();
		return (int) random.nextInt(max - min) + min;
	}

	public static int sumof2darray(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int p = 0; p < arr[i].length; p++) {
				sum += arr[i][p];
			}
		}
		return sum;
	}

	public static void reverseWithNoNewVar(int a, int b) {// 3 , 5
		a = a + b;// 8, b = 5
		b = a - b; // a = 8, b =3
		a = a - b;// a=5
	}

	public static void fibonachiWithRecur() {
		int Numberofinterations = 100;
		long previus = 0;
		long current = 1;// 0,1 1,2 3,5
		System.out.println(previus + " " + current);
		previus = previus + current;
		current = current + previus;
		Numberofinterations--;
		if (Numberofinterations > 0) {
			fibonachiWithRecur();
		}

	}

	public static void pyramidscheme() {
		int i = 0;
		int j = 0;
		int p = i;
		while (p < 5) {
			for (i = i; i < 5; i++) {
				System.out.print('*');
			}
			System.out.print('o');
			for (j = j; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
			p++;
			i = p;
			j = p;
		}
	}

	public static void hangman(String word) {
		boolean complete = true;
		int numberoftries = 0;
		StringBuffer covered = new StringBuffer();
		for (int i = 0; i < word.length(); i++) {
			covered.append('-');
		}
		System.out.println(covered);
		Scanner scanner = new Scanner(System.in);
		while (complete) {
			char guess = scanner.next().charAt(0);
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == guess) {
					System.out.println("Yes there is a letter " + "'" + word.charAt(i) + "'");
					covered.replace(i, i + 1, Character.toString(word.charAt(i)));
					numberoftries--;
				}
			}
			numberoftries++;
			System.out.println(covered);
			if (numberoftries > 5) {
				System.out.println("no more tries sorry");
				System.out.println("the word was: " + word);
				System.out.println("***o***dead");
				System.out.println("*--|--*");
				System.out.println("***|***");
				System.out.println("**o*o**");
				System.out.println("*o***o*");
				return;
			}
		}

	}

	public static String readFromFile() {
		String WORD_FILE = "filename.txt";
		File file = new File(WORD_FILE);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<>();
		while (scanner.hasNext() == true) {
			list.add(scanner.next());

		}
		int when = getRandomNumberUsingNextInt(1, list.size());
		return list.get(when);
	}

	public static void SorthashMap(HashMap<Integer, String> map) {
		for (int i = 0; i < 100; i++) {
			map.put(i, readFromFile());
		}
		System.out.println(map);
	}

	public static void permutations(int[] arr, int low) {
		// 5*4*3*2*1
		if (low == arr.length - 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int p = low; p < arr.length; p++) {
			swapForArray(arr, p, low); 
			permutations(arr, low + 1);
			swapForArray(arr, p, low);

		}

	}

	public static void swapForArray(int[] arr, int pre, int next) {
		int temp = 0;
		temp = arr[next];
		arr[next] = arr[pre];
		arr[pre] = temp;
	}
	public static void sudoku (ArrayList<ArrayList<Integer>> matrix) {
		
		
		return;
	}
	public static ArrayList<ArrayList<String>> generateSodoku(ArrayList<ArrayList<String>> matrix){
		for(int i=0; i<matrix.size();i++) {
			matrix.add(new ArrayList<String>());
			for(int p=0;p<matrix.get(i).size();p++) {
				if(functions.getRandomNumberUsingNextInt(0, 4)==2) {
					matrix.get(i).set(p, Integer.toString( functions.getRandomNumberUsingNextInt(1,9)));
				}
			}
		}
	//	check if 2 numbers i one samll box
		int required=0;
				while(required<17) {
					int l = getRandomNumberUsingNextInt(0,8);
					int k =getRandomNumberUsingNextInt(0,8);
					int theNumber = getRandomNumberUsingNextInt(1,9);
					
	}
				
				//printing 
				for(int i=0; i<matrix.size();i++) {
					for(int p=0;p<matrix.get(i).size();p++) {
					System.out.print(matrix.get(i).get(p));	
					
						System.out.print(" | ");
					
					}	
					System.out.println();
					System.out.println("------------------------------------");
					}
		return matrix;
	}
	
	public static boolean checkForOk(int[][] sudoku, int test,int currentL, int currentK) {
		//check red
		for (int i = 0; i < sudoku.length; i++) {
		if(sudoku[currentL][i] == test && i!= currentK) {
			return false;
		}
		for (int a = 0; a < sudoku.length; a++) {
		if(sudoku[a][currentK] == test && a!= currentL) {
			return false;
		}
		}
		int l=0,k=0;
		l= currentL;
		k = currentK;
		while(l%3!=0) {
			l--;
		}
		while(k%3!=0) {
			k--;
		}
		if(l<0) {
			l=0;
		}
		if(k<0) {
			k=0;
		}
		for (int p = l; p < l+3; p++) {
			for (int a = k; a <k+3; a++) {
				if(sudoku[p][a]==test && p!=currentL && a!=	currentK ) {
					return false;
				}
			}
		}
		
		
	}
		return true;
	}
	
	public static void sudoku2 (int [][] sudoku ) {
			for (int i = 0; i < sudoku.length; i++) {
				for (int p = 0; p < sudoku[i].length; p++) {
						sudoku[i][p] =  0;
					}
				}
			
			
			
			int required=0, counter =0;
			while(required<40) {
				if(counter >1000000) {
					System.out.println("fuck");
					break;
				}
				int l = getRandomNumberUsingNextInt(0,8);
				int k =getRandomNumberUsingNextInt(0,8);
				int theNumber = getRandomNumberUsingNextInt(1,9);
				if(sudoku[l][k]==0 && checkForOk(sudoku,theNumber,l,k) && sudoku2solver(sudoku)) {
					sudoku[l][k]= theNumber;
					required++;
				}
				else {
					counter++;
				}
				
			}
	printSudoku(sudoku);
	sudoku2solver((sudoku));
	}
		public static void printSudoku(int sudoku[][]) {	//printing
			for (int i = 0; i < sudoku.length; i++) {
				for (int p = 0; p < sudoku[i].length; p++) {
						System.out.print(sudoku[i][p]);
						if((p+1)%3==0 && p<8) {
							System.out.print(" || ");
						}
						else {
						System.out.print(" | ");
						}
					}
				System.out.println();
				if((i+1)%3==0) {
					
					System.out.println("------------------------------------");
				}
				else {
					System.out.println();
				}
				
				}
			// check fopr solutions
			System.out.println();
			System.out.println();
			System.out.println();
		
	}
	
	public static boolean sudoku2solver (int [][] sudoku ) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int p = 0; p < sudoku[i].length; p++) {
				if(sudoku[i][p]==0) {
					for (int a = 1; a < 10; a++) {
						if(checkForOk(sudoku,a,i,p)) {
							sudoku[i][p]= a;
						}
					}
				}
			}
			}
	printSudoku(sudoku);
		for (int i = 0; i < sudoku.length; i++) {
			for (int p = 0; p < sudoku[i].length; p++) 
			{
				if(sudoku[i][p]==0) {
					return false;
				}
			}
		}
		//print 
		printSudoku(sudoku);
		return true;
	}
	
}



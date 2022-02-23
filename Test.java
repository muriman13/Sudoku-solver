import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		//StringBuffer strb = new StringBuffer(scanner.nextLine());
		//String test = scanner.nextLine();
		//for(int i=0; i<5;i++) {
		//	Threads thread = new Threads();		
		//	thread.start();
		//}
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i=0; i<1000; i++) {
//			list.add(functions.getRandomNumberUsingNextInt(1,1000));
//		}
//		functions.binarySearch(list,300);
		//functions.hangman(functions.readFromFile());
//		HashMap<Integer, String> test = new HashMap<>();
//		functions.SorthashMap(test);
//		int[] test = {10,20,30,40};
//		functions.permutations(test,0);
//		System.out.println();
//		machine test = new machine();
//		test.add();
//		test.getell(3, 3);
//		test.print();
//		test.sortbynumber();
//		test.print();
		
		int [][] test = new int [9][9];
		int [][] test2 =  { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
		         { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
		         { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
		         { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
		         { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
		         { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
		         { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
		         { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
		         { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };
		//functions.sudoku2(test);
		functions.sudoku2solver(test2);
		//while(functions.sudoku2solver(test)) {
		//	functions.sudoku2(test);

		//};
	}

}

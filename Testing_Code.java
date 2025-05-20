public class Testing_code {
	
	

	public static void main(String[] args) {
	 
		int[] arr = {1, 2, 3, 4, 5, 6};	
		shifter(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		/*
		System.out.println("");
		
		int[] copyArr = copySort(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(copyArr[i] + " ");
		} */
	}
	
	public static void shifter(int[] nums)
	{
		int temp = 0;
		for(int i = nums.length-1; i >0; i--)
		{
			temp = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = temp;
		}
	}
	
	public static int[] copySort(int[] nums)
	{
		//variable used to keep the index of the smallest number
		int minIndex = 0;
		int temp = 0;
		int[] copyNums = new int[nums.length];
		for(int i = 0; i<nums.length; i++)
		{
			copyNums[i] = nums[i];
		}
				
		//goes through each number in the array
		for(int i = 0; i < copyNums.length; i++)
		{
			minIndex = i;
			//Separates the array into a sorted and not sorted areas
			for(int j = i; j<copyNums.length; j++)
			{
				if(copyNums[j] < copyNums[minIndex])
				{
					//finds the min in the unsorted array
					minIndex = j;							
				}
			}
			//swaps smaller number into place in the unsorted array
			temp = copyNums[i];
			copyNums[i] = copyNums[minIndex];
			copyNums[minIndex] = temp;
		}
		return copyNums;
	}
}










/* 
 * Print Min and Max
 * System.out.println(Integer.MIN_VALUE);
 * System.out.print(Integer.MAX_VALUE);
 * 
 * find the cube root of a number
 * double base = 2+2;
 * double thrice = base*base*base;
 * System.out.print("The cube of " + base + " is " + thrice + ".");
 * 
 * Casting ints
 * double x = (int) (7.5 - 3.5);
 * double y = (int) 7.5 - 3.5;
 * System.out.print(x - y);
 * 
 * Scanner
 * import java.util.Scanner;
 * Scanner myReader = new Scanner(System.in);
 * System.out.print("Your input is " + myReader.nextLine());
 * myReader.close();
 * 
 * exceptions
 *System.out.print("\"Hello World\"");
 *System.out.print("\n\"Hello\n World\"");
 *System.out.print("\n\"Hello\\World\"");
 *
 *Print out random #
 *System.out.print((int) (Math.random()*20)+40);
 *
 * if Statements
 * if (true||false && true)
 *		{
 * 			System.out.println("true");
 *		}
 *		
 *		if (false && true||true)
 *		{
 *			System.out.println("true");
 *		}
 *		
 *		if (4 >= 3 && false)
 *		{
 *			System.out.println("true");
 *		}
 *		else
 *		{
 *			System.out.println("false");
 *		}
 *		
 *loops practice
 * int x = 0;
 *		while (x <10)
 *		{
 *			System.out.println(x);
 *			x++;
 *		}
 *
 *
 *
 *boolean stop = false;
		int count = 0;
		while(stop == false)
		{
			System.out.println("Please input a number");
			String num = userInput.nextLine();
			if(num.equalsIgnoreCase("Stop"))
			{
				stop = true;
			}
			else
			{
				count++;
				System.out.println(num + " " + count);
			}
		}
		
		userInput.close();
	}
	
	public static String giveBackwards(String str)
	{
		String newStr = "";
		String chara = "";
		int len = str.length();
		for(int i = 0; i<=len-1;i++)
		{
			chara = str.substring(i,i+1);
			newStr = chara + newStr;
		}
		return newStr;
	}
	
	Text color
	static Scanner userInput = new Scanner(System.in);
	private static final String textReset = "\u001B[0m";
	private static final String textAelar = textReset + "\033[38;2;178;102;225m";
	System.out.print(textAelar +"Test");
	
	import java.util.Scanner;
import java.util.ArrayList;
	ArrayList<String> cars = new ArrayList<String>();
		cars.add("McQueen");
		cars.add("Mater");
		cars.add("Luigi");
		cars.add("Guido");
		cars.add(1, "Doc");
		System.out.println(cars.toString());
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Alice");
		arr.add("Bob");
		arr.add("Charlie");
		arr.add("Derek");
		
		arr.remove(0);
		arr.add("Alice");
		System.out.print(arr.toString());
		}		
 */

import java.util.Scanner;

public class Main {
	
	private static Scanner playerInput = new Scanner(System.in);
	public static double validCheck;
	
	
	public static void main(String[] args) {
	
		Dialouge.welcome();
		Dialouge.checkChoiceOne();
		Dialouge.checkChoiceTwo();
		playerInput.close();
		
	}

	
}

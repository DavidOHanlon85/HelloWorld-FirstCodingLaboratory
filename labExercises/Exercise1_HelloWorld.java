package labExercises;

public class Exercise1_HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		System.out.println("Hello World! I am alive\n\nI can write on two lines!\n");
		
		System.out.println("       *\n      ***\n     *****\n    *******\n   *********\nHappy Christmas\n");
		
		System.out.println("Macbeth");
		System.out.println("____________________________\n");
		System.out.println("First Witch\tWhen shall we three meet again?\n\n\t\tIn thunder, lightning, or in rain?\n");
		System.out.println("Second Witch\tWhen the hurlyburly's done,\n\n\t\tWhen the battle's lost and won.\n");
		System.out.println("Third Witch\tThat will be ere the set of sun\n");
		System.out.println("____________________________");

		String myName = "David O'Hanlon";
		
		System.out.println("The input String: " +myName);
		System.out.println("The number of characters in the string: " +myName.length());
		System.out.println("The first character in the string is  " +myName.charAt(0) + " the last character in the string is " +myName.charAt(13));
		System.out.println("The string in uppercase: " +myName.toUpperCase());
		System.out.println("The string with the letter a replaced with * is: " +myName.replace("a", "*"));
		System.out.println("The character 'n' first occurs in position: " +myName.indexOf("n"));

		int size = 6;
		int area = (int) Math.pow(size, 2);
		
		System.out.println(area);
		
		double radius = 9;
		double areaOfCircle = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("Area of Circle = %.3f", areaOfCircle);

		int number1 = 44;
		int number2 = 44;

		System.out.println("Numbers to compare are " + number1 + " and " + number2);

		if (number1 > number2) {
			System.out.println("Biggest number is : " + number1);
		}

		if (number1 < number2) {
			System.out.println("Biggest number is : " + number2);
		}

		if (number1 == number2) {
			System.out.println("Numbers are the same");
		}

	}

}

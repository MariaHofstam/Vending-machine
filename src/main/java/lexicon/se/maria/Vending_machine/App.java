package lexicon.se.maria.Vending_machine;

import java.util.Scanner;

/**
 * Vending machine
 *
 */
public class App {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static String getStringFromUser() {						//method: getStringFromUser	
		String text = scanner.nextLine();
	return text;
	}
	
	private static int getIntFromUser() {							//method getIntFromUser
		
		boolean valid = false;
		int number = 0;
		while(!valid) {
			try {
				number = Integer.parseInt(getStringFromUser());
				valid = true;				
			}catch(NumberFormatException e) {
				System.out.println("Input was not a number");
			}
		}
		return number;
	}
	
	private static void denominationValue() {
		Denomination oneSek = Denomination._1KR;
    	Denomination twoSek = Denomination._2KR;
    	Denomination fiveSek = Denomination._5KR;
    	Denomination tenSek = Denomination._10KR;
    	Denomination twentySek = Denomination._20KR;
    	Denomination fiftySek = Denomination._50KR;
    	Denomination oneHundredSek = Denomination._100KR;
    	Denomination twoHundredSek = Denomination._200KR;
    	Denomination fiveHundredSek = Denomination._500KR;
    	Denomination oneThousandSek = Denomination._1000KR;
    	
    	System.out.println("\nAccepted denominations: \n" 
    	        + oneSek + "\t" + twoSek + "\t" + fiveSek + "\t" 
    	        + tenSek + "\t" + twentySek + "\t" + fiftySek + "\t"
    	        + oneHundredSek + "\t" + twoHundredSek + "\t"
    	        + fiveHundredSek + "\t" + oneThousandSek + "\n");
	}
	
	
    public static void main( String[] args ){
    	

//		Declaration of objects for the class Snack in the Vending machine   	
    	Snack product_1 = new Snack(1, "Chocolate cake", 10, "100 g");
    	Snack product_2 = new Snack(2, "Protein Bar", 15, "50 g");
    	Snack product_3 = new Snack(3, "Peanuts ", 10, "100 g");
    	Snack product_4 = new Snack(4, "Potato Chips", 15, "100 g");
    	Snack product_5 = new Snack(5, "Chocolate ball", 5, "30 g");
//   	Declaration of objects for the class Drink in the Vending machine
    	Drink product_6 = new Drink(6, "Coca cola", 15, "33 ml");
    	Drink product_7 = new Drink(7, "Pepsi cola", 15, "33 ml");
    	Drink product_8 = new Drink(8, "Fanta\t", 15, "33 ml");
    	Drink product_9 = new Drink(9, "Loka\t", 10, "33 ml");
    	Drink product_10 = new Drink(10, "Energy drink", 20, "50 ml");
//		Declaration of objects for the class Food in the Vending machine    	
    	Food product_11 = new Food(11, "Sandwich", 20, "200 g");
    	Food product_12 = new Food(12, "Lasagna\t", 45, "400 g");
    	Food product_13 = new Food(13, "Pizza slice", 30, "150 g");
    	Food product_14 = new Food(14, "Meat pie", 25, "300 g");
    	Food product_15 = new Food(15, "Pasta sallad", 40, "400 g");
    	
//		Printing the content of the Vending machine
    	
    	System.out.println("\n/// Vending machine ///\n");
    	System.out.println("Place Id: \tProduct \tWeight \tPrice");
    	System.out.println("-----------------------------------------------");
    	System.out.println(product_1 + "\n" + product_2 + "\n" + product_3 + "\n" + product_4 + "\n" + product_5 + "\n"
    					+ product_6 + "\n" + product_7 + "\n" + product_8 + "\n" + product_9 + "\n" + product_10 + "\n"
    					+ product_11 + "\n" + product_12 + "\n" + product_13 + "\n" + product_14 + "\n" + product_15);
    	
//		Printing the accepted denomination values    	
    	denominationValue();	
    	
    	
//		Testing getting and printing the fields of the products    	
    	System.out.println("Product name: "+ product_2.getName());
    	System.out.println("Product Price: "+ product_2.getPrice());
    	
    	System.out.println("Product name: "+ product_6.getName());
    	System.out.println("Product Price: "+ product_6.getPrice());
    	
    	System.out.println("Product name: "+ product_13.getName());
    	System.out.println("Product Price: "+ product_13.getPrice());
    	
    	//System.out.println("Choose your product (Place Id)");
    	//int choice = getIntFromUser();
    	//System.out.println(choice);
    	
    	product_1.setPlaceId(16);
    	System.out.println("Place Id: "+ product_1.getName() + "\t" + product_1.getPlaceId());
    	
    	
    }
}

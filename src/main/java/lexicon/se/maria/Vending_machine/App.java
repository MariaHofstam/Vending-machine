package lexicon.se.maria.Vending_machine;

import java.util.Scanner;

import lexicon.se.maria.Vending_machine.Products.Drink;
import lexicon.se.maria.Vending_machine.Products.Food;
import lexicon.se.maria.Vending_machine.Products.Product;
import lexicon.se.maria.Vending_machine.Products.Snack;


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
	
	
    public static void main( String[] args ){
    	
    	boolean keepLooping = true;
    	int selection;
    	
//		Declaration of objects for the classes Snack, Drink and Food in the Vending machine   
		Product[] content = new Product[15];
    	content[0] = new Snack(1, "Chocolate cake", 10, "100 g");
    	content[1] = new Snack(2, "Protein Bar", 15, "50 g");
    	content[2] = new Snack(3, "Peanuts ", 10, "100 g");
    	content[3] = new Snack(4, "Potato Chips", 15, "100 g");
    	content[4] = new Snack(5, "Chocolate ball", 5, "30 g");
    	content[5] = new Drink(6, "Coca cola", 15, "33 ml");
    	content[6] = new Drink(7, "Pepsi cola", 15, "33 ml");
    	content[7] = new Drink(8, "Fanta\t", 15, "33 ml");
    	content[8] = new Drink(9, "Loka\t", 10, "33 ml");
    	content[9] = new Drink(10, "Energy drink", 20, "50 ml");
    	content[10] = new Food(11, "Sandwich", 20, "200 g");
    	content[11] = new Food(12, "Lasagna\t", 45, "400 g");
    	content[12] = new Food(13, "Pizza slice", 30, "150 g");
    	content[13] = new Food(14, "Meat pie", 25, "300 g");
    	content[14] = new Food(15, "Pasta sallad", 40, "400 g");
    	
    	//Declaration of valid Denomination values
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
    	
    	
    	while (keepLooping) {
    		System.out.println("\n/// Marias Vending-machine ///\n");
        	System.out.println("Place Id: \tProduct \tWeight \tPrice");
        	System.out.println("-----------------------------------------------");
        	System.out.println(content[0] + "\n" + content[1] + "\n" + content[2] + "\n" + content[3] + "\n" + 
        			content[4] + "\n" + content[5] + "\n" + content[6] + "\n" + content[7] + "\n" + content[8] + 
        			"\n" + content[9] + "\n" + content[10] + "\n" + content[11] + "\n" + content[12] + "\n" + 
        			content[13] + "\n" + content[14] + "\n");
        	
        	System.out.println("Accepted denominations: \n" 
        	        + oneSek + "\t" + twoSek + "\t" + fiveSek + "\t" 
        	        + tenSek + "\t" + twentySek + "\t" + fiftySek + "\n"
        	        + oneHundredSek + "\t" + twoHundredSek + "\t"
        	        + fiveHundredSek + "\t" + oneThousandSek + "\n");
        	
        	System.out.println("\t-------- Menue --------\n"
        			+ "\t" + "1. Add money\n"
        			+ "\t" + "2. Buy Product\n"
        			+ "\t" + "3. Examine Product\n"
        			+ "\t" + "4. Cash out\n"
        			+ "\t" + "5. Leave\n");
        	
        	//Ej klart ännu vilka menyval jag ska ha
        	
//        	boolean addMoney(int money);
//        	Product buy(int money, int prodNum);
//        	int returnChange();
//        	void presentProducts();
//        	int getBalance();
        	
        	System.out.println("Your choice:_");
    		
        	selection = getIntFromUser();
        	
        	switch (selection) {
        	case 1:
        		break;
        	case 2:
        		break;
        	case 3:
        		break;
        	case 4:
        		break;	
        	default:
        		break;
        	}
    	}
    	
    	
    	
    	//Test av metoderna examine och use
    	System.out.println(content[0].examine());
    	content[0].use();
    	
    

    }
    
    
}

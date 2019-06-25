package lexicon.se.maria.Vending_machine;

import lexicon.se.maria.Vending_machine.Products.Product;

public interface VendingMachine {
	boolean addMoney(int money);
	Product buy(int money, int prodNum);
	int returnChange();
	void presentProducts();
	int getBalance();
}

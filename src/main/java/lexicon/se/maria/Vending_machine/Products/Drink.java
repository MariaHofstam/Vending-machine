package lexicon.se.maria.Vending_machine.Products;


public class Drink extends Product {
	private String volume;

	public Drink(int placeId, String name, int price, String volume) {
		super(placeId, name, price);
		this.volume = volume;
	}
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	@Override
	public String toString() {
		return 	placeId + "\t \t" + name + "\t" + volume + "\t" + price + " Sek";
	
	}

}


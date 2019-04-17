package lexicon.se.maria.Vending_machine.Products;


public class Food extends Product {
	private String weight;

	public Food(int placeId, String name, int price, String weight) {
		super(placeId, name, price);
		this.weight = weight;
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
		return 	placeId + "\t \t" + name + "\t" + weight + "\t" + price + " Sek";
	
	}
}


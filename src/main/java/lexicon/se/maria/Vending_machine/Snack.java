package lexicon.se.maria.Vending_machine;

public class Snack extends Product{
	//Fields
	private String weight;

	//Constructor
	public Snack(int placeId, String name, int price, String weight) {
		super(placeId, name, price);
		this.weight = weight;
	}
	
	
	//Getters and Setters	
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

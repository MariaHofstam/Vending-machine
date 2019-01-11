package lexicon.se.maria.Vending_machine;

//Super class

public abstract class Product {
		//Fields
		protected int placeId;
		protected String name;
		protected int price;
		
		//Constructor
		public Product(int placeId, String name, int price) {
			this.placeId = placeId;
			this.name = name;
			this.price = price;	
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

		
		
	

}

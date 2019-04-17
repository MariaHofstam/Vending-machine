package lexicon.se.maria.Vending_machine.Products;

//Super class

public abstract class Product {
			protected int placeId;
			protected String name;
			protected int price;
			
			public Product(int placeId, String name, int price) {
				this.placeId = placeId;
				this.name = name;
				this.price = price;	
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

}

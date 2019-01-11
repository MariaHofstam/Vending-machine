package lexicon.se.maria.Vending_machine;

/*************************************************************
 * 
 * I am using the ENUM method for konstants of denominations,
 * i.e the accepted values for the vending-machine.
 * I will use it for printing out accepted values and perhaps
 * controlling the values.
 * 
 **************************************************************/

public enum Denomination {
	_1KR(1),
	_2KR(2),
	_5KR(5),
	_10KR(10),
	_20KR(20),
	_50KR(50),
	_100KR(100),
	_200KR(200),
	_500KR(500),
	_1000KR(1000);
	
	private int value;
	
	private Denomination(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.value + "kr";
	}



}

package gamerCom.Entity;

public class Game {
	private int id;
	private int price;
	private String name;
	
	public Game() {
		
	}

	public Game(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

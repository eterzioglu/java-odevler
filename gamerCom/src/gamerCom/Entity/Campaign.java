package gamerCom.Entity;

public class Campaign {
	private int id;
	private String name;
	private int discount;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, int dicount) {
		this.id = id;
		this.name = name;
		this.discount = dicount;
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

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}

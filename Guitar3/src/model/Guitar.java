package model;

public class Guitar {
	 private int id;
	  private double price;
	  GuitarSpec spec;

	  public Guitar(int id, double price, GuitarSpec spec) {
	    this.id = id;
	    this.price = price;
	    this.spec = spec;
	  }

	  public int getId() {
	    return id;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }

	  public GuitarSpec getSpec() {
	    return spec;
	  }
}

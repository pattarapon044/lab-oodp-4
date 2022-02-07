package lab.oodp.moreclass.mobilephone;

public class MobilePhone {

	//TODO: declare instance variables here
	private String brand;
	private String model;
	private double price;
		
    public MobilePhone(String brand, String model, double price) {
        //TODO: complete this constructor
    	this.setBrand(brand);
    	this.setModel(model);
    	this.setPrice(price);
    }

    public boolean isCheaperThan(MobilePhone other) {
        //TODO: complete this method to compare price
    	if (this.price < other.getPrice()) {
    		return true;
    	}
    	return false;
    }

    @Override
    public String toString() {
    	//TODO: complete this method to print out mobile phone info.
    	return brand+" "+model+" which cost $"+price;
    }

    @Override
    public boolean equals(Object obj) {
       //TODO: complete this method to compare mobile phone object
        if (obj instanceof MobilePhone) {
        	MobilePhone classObj = (MobilePhone) obj;
        	return classObj.getBrand().equals(this.brand) && 
        			classObj.getModel().equals(this.model) && 
        			classObj.getPrice() == (this.price);
        }
        return false;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}



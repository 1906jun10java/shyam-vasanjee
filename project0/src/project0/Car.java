package project0;

public class Car {
	private String Make;
	private String Model;
	private int yearManufactured;
	private String color;
	private String chassisType;
	private Double cost;
	
	public Car() {
		super();
	}
	
	public Car(String Make, String Model, int yearManufactured, String color, String chassisType, Double cost) {
		super();
		this.Make = Make;
		this.Model = Model;
		this.yearManufactured = yearManufactured;
		this.chassisType = chassisType;
		this.cost = cost;
		this.color = color;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		this.Make = make;
	}
	public String getModel() {
		return Model;
	}
	public String getColor() {
		return color;
	}
	public String getChassisType() {
		return chassisType;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setChassisType(String chassisType) {
		this.chassisType =chassisType;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	
	@Override
	public String toString() {
		return "Car [Make=" + Make + ", Model=" + Model + ", yearManufactured=" + yearManufactured + ", color=" + color
				+ ", chassisType=" + chassisType + ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Make == null) ? 0 : Make.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		result = prime * result + ((chassisType == null) ? 0 : chassisType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + yearManufactured;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Make == null) {
			if (other.Make != null)
				return false;
		} else if (!Make.equals(other.Make))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		if (chassisType == null) {
			if (other.chassisType != null)
				return false;
		} else if (!chassisType.equals(other.chassisType))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (yearManufactured != other.yearManufactured)
			return false;
		return true;
	}

		
	
	

}

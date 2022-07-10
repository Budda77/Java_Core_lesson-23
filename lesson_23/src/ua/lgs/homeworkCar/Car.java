package ua.lgs.homeworkCar;

public class Car {
	private String model;
	private int yearOfIssue;
	
	public Car(String model, int yearOfIssue) {
		super();
		this.model = model;
		this.yearOfIssue = yearOfIssue;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + yearOfIssue + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + yearOfIssue;
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
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (yearOfIssue != other.yearOfIssue)
			return false;
		return true;
	}

}

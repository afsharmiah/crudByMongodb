package CarStoreByCrud.CarStore.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CarDetails")
public class Car {
	private String ownerName;
	private int id;
	private String carName;
	private String carModel;
	private String carYear;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String ownerName, int id, String carName, String carModel, String carYear, String carPrice) {
		super();
		this.ownerName = ownerName;
		this.id = id;
		this.carName = carName;
		this.carModel = carModel;
		this.setCarYear(carYear);
		this.carPrice = carPrice;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarYear() {
		return carYear;
	}

	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}

	private String carPrice;

}

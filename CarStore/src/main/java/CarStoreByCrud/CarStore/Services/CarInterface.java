package CarStoreByCrud.CarStore.Services;

import java.util.List;
import java.util.Optional;

import CarStoreByCrud.CarStore.Entity.Car;

public interface CarInterface {

	List<Car> findAll();

	Car createCar(Car carAdd);

	Car updateCar(Car carUpdate);

	Optional<Car> retrieveCarByid(int carRetrieveByid);

	Optional<Car> findById(int id);

	void deleteCar(int uid);

}

package CarStoreByCrud.CarStore.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CarStoreByCrud.CarStore.Entity.Car;
import CarStoreByCrud.CarStore.Repository.CarRepository;

@Service
public class CarServices implements CarInterface {

	@Autowired
	private CarRepository repository;

	@Override
	public List<Car> findAll() {
		return (List<Car>) repository.findAll();
	}

	@Override
	public Car createCar(Car carAdd) {
		return repository.save(carAdd);
	}

	@Override
	public Car updateCar(Car carUpdate) {

		return repository.save(carUpdate);
	}

	@Override
	public Optional<Car> findById(int id) {
		return repository.findById(id);
	}

	@Override
	public Optional<Car> retrieveCarByid(int id) {
		return repository.findById(id);
	}

	@Override
	public void deleteCar(int uid) {
		repository.deleteById(uid);

	}

}

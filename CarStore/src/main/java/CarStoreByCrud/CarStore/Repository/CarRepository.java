package CarStoreByCrud.CarStore.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import CarStoreByCrud.CarStore.Entity.Car;

public interface CarRepository extends MongoRepository<Car, Integer> {

}

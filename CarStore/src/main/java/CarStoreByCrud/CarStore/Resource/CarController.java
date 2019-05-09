package CarStoreByCrud.CarStore.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CarStoreByCrud.CarStore.Entity.Car;
import CarStoreByCrud.CarStore.Services.CarInterface;

@RestController
public class CarController {

	@Autowired
	private CarInterface carService;

	@PostMapping("/addCar")
	public String saveCar(@RequestBody Car car) {
		carService.createCar(car);
		return "Car added with OwnerName " + car.getOwnerName();
	}

	@GetMapping("/allCars")
	public List<Car> getCars() {
		return carService.findAll();
	}

	// @GetMapping("/allCars/{id}")
	// public Optional<Car> getCars(@PathVariable int id) {
	// return carService.findById(id);
	// }

	@GetMapping("/allCars/{id}")
	public Optional<Car> getCars(@PathVariable int id) {
		return carService.findById(id);
	}

	@DeleteMapping("/allCars/{id}")
	public void deleteCar(@PathVariable("id") int uid) {
		carService.deleteCar(uid);
	}

	/*
	 * @PutMapping("/allCars/{id}") public ResponseEntity<Object>
	 * CarUpdate(@RequestBody Car car, @PathVariable int id) { Optional<Car>
	 * carOptional = carService.findById(id); if (!carOptional.isPresent()) return
	 * ResponseEntity.notFound().build(); carService.createCar(car); return
	 * ResponseEntity.noContent().build(); }
	 */

	@PutMapping("/allCars/{id}")
	public void CarUpdate(@RequestBody Car car, @PathVariable int id) {
		carService.findById(id);
		carService.createCar(car);
	}

}

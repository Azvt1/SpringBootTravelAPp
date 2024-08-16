import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping("/carRentals")

public class CarRentalsController {
	

    @Autowired
	
    private CarRentalsService carRentalsService;


    @GetMapping
	
	
    public List<CarRentals> getAllCarRentals() {
		
		
        return carRentalsService.getAllCarRentals();
		
    }
	

    @PostMapping
	
    public CarRentals createCarRental(@RequestBody CarRentals carRental) {
		
        return carRentalsService.createCarRental(carRental);
		
    }
	
}

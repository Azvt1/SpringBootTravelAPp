import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/hotelBookings")

public class HotelBookingController {

    @Autowired
    private HotelBookingService hotelBookingService;
	

    @GetMapping
	
    public List<HotelBooking> getAllHotelBookings() {
		
        return hotelBookingService.getAllHotelBookings();
    }


    @PostMapping
	
    public HotelBooking createHotelBooking(@RequestBody HotelBooking hotelBooking) {
		
        return hotelBookingService.createHotelBooking(hotelBooking);
    }
}

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class HotelBookingService {
	

    @Autowired
	
    private HotelBookingRepository hotelBookingRepository;
	

    public List<HotelBooking> getAllHotelBookings() {
		
        return hotelBookingRepository.findAll();
		
    }

    public HotelBooking createHotelBooking(HotelBooking hotelBooking) {
		
        return hotelBookingRepository.save(hotelBooking);
		
    }
}

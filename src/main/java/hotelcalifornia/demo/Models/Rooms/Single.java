package hotelcalifornia.demo.Models.Rooms;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Single extends Room {


    public Single() {
    }

    public Single(Integer roomNumber, boolean isAvailable, BigDecimal price, BigDecimal m2, Integer beds, Integer bathrooms) {
        super(roomNumber, isAvailable, price, m2, beds, bathrooms);
    }
}

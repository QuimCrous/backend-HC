package hotelcalifornia.demo.Models.Rooms;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Matrimonial extends Room{

    private boolean hasJacuzzi;

    public Matrimonial() {
    }

    public Matrimonial(Integer roomNumber, boolean isAvailable, BigDecimal price, BigDecimal m2, Integer beds, Integer bathrooms, boolean hasJacuzzi) {
        super(roomNumber, isAvailable, price, m2, beds, bathrooms);
        this.hasJacuzzi = hasJacuzzi;
    }
}

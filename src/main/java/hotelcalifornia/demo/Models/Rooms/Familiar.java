package hotelcalifornia.demo.Models.Rooms;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Familiar extends Room{

    private Integer bunkBeds;

    private boolean hasCrib;

    public Familiar() {
    }

    public Familiar(Integer roomNumber, boolean isAvailable, BigDecimal price, BigDecimal m2, Integer beds, Integer bathrooms, Integer bunkBeds, boolean hasCrib) {
        super(roomNumber, isAvailable, price, m2, beds, bathrooms);
        this.bunkBeds = bunkBeds;
        this.hasCrib = hasCrib;
    }

    public Integer getBunkBeds() {
        return bunkBeds;
    }

    public void setBunkBeds(Integer bunkBeds) {
        this.bunkBeds = bunkBeds;
    }

    public boolean isHasCrib() {
        return hasCrib;
    }

    public void setHasCrib(boolean hasCrib) {
        this.hasCrib = hasCrib;
    }
}

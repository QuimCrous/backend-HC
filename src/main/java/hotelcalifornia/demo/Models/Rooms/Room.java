package hotelcalifornia.demo.Models.Rooms;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    private Integer roomNumber;

    private boolean isAvailable;

    private BigDecimal price;

    private BigDecimal m2;

    private Integer beds;

    private Integer bathrooms;

    public Room() {
    }

    public Room(Integer roomNumber, boolean isAvailable, BigDecimal price, BigDecimal m2, Integer beds, Integer bathrooms) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        this.price = price;
        this.m2 = m2;
        this.beds = beds;
        this.bathrooms = bathrooms;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getRoomId() {
        return roomId;
    }

    public BigDecimal getM2() {
        return m2;
    }

    public void setM2(BigDecimal m2) {
        this.m2 = m2;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }
}

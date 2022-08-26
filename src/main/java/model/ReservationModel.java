package model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Reservation")
public class ReservationModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    @ManyToOne()
    private Customer customer;

    @ManyToOne
    private PlanetModel planetModel;

    @Temporal(TemporalType.TIME)
    private LocalDateTime timeFrame;

    public ReservationModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PlanetModel getPlanetModel() {
        return planetModel;
    }

    public void setPlanetModel(PlanetModel planetModel) {
        this.planetModel = planetModel;
    }

    public LocalDateTime getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(LocalDateTime timeFrame) {
        this.timeFrame = timeFrame;
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "id=" + id +
                ", customer=" + customer +
                ", planetModel=" + planetModel +
                ", timeFrame=" + timeFrame +
                '}';
    }
}

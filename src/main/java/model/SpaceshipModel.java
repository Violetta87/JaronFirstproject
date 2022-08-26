package model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Entity
@Table(name="spaceship name")
public class SpaceshipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String spaceshipName;
    private Long maxSpeed;
    private Long capacities;

    public SpaceshipModel(Long id, String spaceshipName, Long maxSpeed, Long capacities) {
        this.id = id;
        this.spaceshipName = spaceshipName;
        this.maxSpeed = maxSpeed;
        this.capacities = capacities;
    }

    public SpaceshipModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpaceshipName() {
        return spaceshipName;
    }

    public void setSpaceshipName(String spaceshipName) {
        this.spaceshipName = spaceshipName;
    }

    public Long getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Long getCapacities() {
        return capacities;
    }

    public void setCapacities(Long capacities) {
        this.capacities = capacities;
    }

    @Override
    public String toString() {
        return "SpaceshipModel{" +
                "id=" + id +
                ", spaceshipName='" + spaceshipName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", capacities=" + capacities +
                '}';
    }
}

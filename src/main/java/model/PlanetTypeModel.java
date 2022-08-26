package model;

import javax.persistence.*;

@Entity
@Table(name="planetTypelModel")

public class PlanetTypeModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String planetType;

    public PlanetTypeModel(String planetTypeModel){
        this.planetType= planetTypeModel;
    }

    public PlanetTypeModel() {

    }

    public String getPlanetType() {
        return planetType;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    @Override
    public String toString() {
        return "PlanetTypeModel{" +
                "planetType='" + planetType + '\'' +
                '}';
    }
}

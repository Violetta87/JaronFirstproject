package model;
import javax.persistence.*;

@Entity
@Table(name="PlanetModels")
public class PlanetModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private double id;

    private double mass;
    private double diameter;
    private int density;
    private double gravity;
    private double lenghtOfDay;
    private double distanceFromSun;
    private int meanTemp;
    private int numberOfMoons;

    @ManyToOne
    private PlanetTypeModel planetTypeModel;

    public PlanetModel(double mass, double diameter, int density, double gravity, double lenghtOfDay, double distanceFromSun, int meanTemp, int numberOfMoons) {
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.lenghtOfDay = lenghtOfDay;
        this.distanceFromSun = distanceFromSun;
        this.meanTemp = meanTemp;
        this.numberOfMoons = numberOfMoons;
    }

    public PlanetModel() {
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public void setLenghtOfDay(double lenghtOfDay) {
        this.lenghtOfDay = lenghtOfDay;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public void setMeanTemp(int meanTemp) {
        this.meanTemp = meanTemp;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getDensity() {
        return density;
    }

    public double getGravity() {
        return gravity;
    }

    public double getLenghtOfDay() {
        return lenghtOfDay;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getMeanTemp() {
        return meanTemp;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
    public String toString() {
        return "PlanetModel{" +
                "mass=" + mass +
                ", diameter=" + diameter +
                ", density=" + density +
                ", gravity=" + gravity +
                ", lenghtOfDay=" + lenghtOfDay +
                ", distanceFromSun=" + distanceFromSun +
                ", meanTemp=" + meanTemp +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}

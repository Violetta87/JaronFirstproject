package com.example.jaronfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JaronFirstprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaronFirstprojectApplication.class, args);
    }
/*
    @Bean
    public CommandLineRunner importData(

            CustomerRepository customerRepository,
            PlanetRepository planetRepository,
            PlanetTypeRepository planetTypeRepository,
            ReservationRepository reservationRepository,
            SpaceshipRepository spaceshipRepository) {

        return (args) -> {


            final List<ReservationModel> reservationModels = new ArrayList<>();
            reservationModels.add(new ReservationModel("Jack", "Bauer"));
            reservationModels.add(new ReservationModel("Chloe", "O'Brian"));
            reservationModels.add(new ReservationModel("Kim", "Bauer"));
            reservationModels.add(new ReservationModel("David", "Palmer"));
            reservationModels.add(new ReservationModel("Michelle", "Dessler"));
            customerRepository.saveAll(reservationModels);
        }
    }*/
}

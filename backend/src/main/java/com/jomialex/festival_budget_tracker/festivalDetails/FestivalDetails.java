package com.jomialex.festival_budget_tracker.festivalDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class FestivalDetails {
    @Id 
    @SequenceGenerator (
        name = "festival_id_generator",
        sequenceName = "festival_id_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "festival_id_generator"
    )
    private Long id;
    private String name;
    private double ticketGA;
    private double ticketVIP;
    private double campCost;
    private double hotelCost;
    private double bnbCost;
    private double carParkingCost;

    public FestivalDetails() {
    }

    public FestivalDetails(String name, double ticketGA, double ticketVIP, double campCost, double hotelCost, double bnbCost, double carParkingCost) {
        this.name = name;
        this.ticketGA = ticketGA;
        this.ticketVIP = ticketVIP;
        this.campCost = campCost;
        this.hotelCost = hotelCost;
        this.bnbCost = bnbCost;
        this.carParkingCost = carParkingCost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getTicketGA() {
        return ticketGA;
    }
    public void setTicketGA(double ticketGA) {
        this.ticketGA = ticketGA;
    }

    public double getTicketVIP() {
        return ticketVIP;
    }
    public void setTicketVIP(double ticketVIP) {
        this.ticketVIP = ticketVIP;
    }

    public double getCampCost() {
        return campCost;
    }
    public void setCampCost(double campCost) {
        this.campCost = campCost;
    }

    public double getHotelCost() {
        return hotelCost;
    }
    public void setHotelCost(double hotelCost) {
        this.hotelCost = hotelCost;
    }

    public double getBnbCost() {
        return bnbCost;
    }
    public void setBnbCost(double bnbCost) {
        this.bnbCost = bnbCost;
    }

    public double getCarParkingCost() {
        return carParkingCost;
    }
    public void setCarParkingCost(double carParkingCost) {
        this.carParkingCost = carParkingCost;
    }

    @Override
    public String toString() {
        return "FestivalDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ticketGA=" + ticketGA +
                ", ticketVIP=" + ticketVIP +
                ", campCost=" + campCost +
                ", hotelCost=" + hotelCost +
                ", bnbCost=" + bnbCost +
                ", carParkingCost=" + carParkingCost +
                '}';
    }
}

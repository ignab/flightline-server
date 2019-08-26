package com.flightco.flightline.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flightco.flightline.audit.AuditModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "passengers")
public class Passenger extends AuditModel {


    private static final long serialVersionUID = -9122525523572514957L;

    @Id
    @GeneratedValue(generator = "passenger_generator")
    @SequenceGenerator(
            name = "passenger_generator",
            sequenceName = "passenger_sequence",
            initialValue = 1000
    )
    @JsonIgnore
    private Long id;

    @NotBlank
    @Column(columnDefinition = "name")
    private String name;
    
    @NotBlank
    @Column(columnDefinition = "lastname")
    private String lastname;

    @NotBlank
    @Column(columnDefinition = "seat")
    private String seat;

    @NotBlank
    @Column(columnDefinition = "flight_code")
    private String flightCode;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    // public String getFlightCode() {
    //     return flightCode;
    // }

    // public void setFlightCode(String flightCode) {
    //     this.flightCode = flightCode;
    // }

  

}
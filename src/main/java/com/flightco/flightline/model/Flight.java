package com.flightco.flightline.model;

import com.flightco.flightline.audit.AuditModel;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "flights")
public class Flight extends AuditModel {

    private static final long serialVersionUID = 4968887219352279029L;

	@Id
    @GeneratedValue(generator = "flight_generator")
    @SequenceGenerator(
            name = "flight_generator",
            sequenceName = "flight_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 255)
    private String flightCode;

    @Column(columnDefinition = "company")
    private String company;

	public Flight(Long id, String flightCode, String company) {
        this.id = id;
        this.flightCode = flightCode;
        this.company = company;
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getCompany() {
		return company;
	}

	public void setNotation(String company) {
		this.company = company;
	}


}
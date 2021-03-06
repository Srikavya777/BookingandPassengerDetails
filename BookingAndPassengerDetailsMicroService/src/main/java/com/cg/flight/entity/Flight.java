package com.cg.flight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="flight")
public class Flight {
@Id
@Column(name="flight_code",length=10)
private String flightCode;
@Column(name="airways_name",length=25)
private String flightName;
@Column(name="seat_capacity")
private int seatcapacity;
public String getFlightCode() {
	return flightCode;
}
public void setFlightCode(String flightCode) {
	this.flightCode = flightCode;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public int getSeatcapacity() {
	return seatcapacity;
}
public void setSeatcapacity(int seatcapacity) {
	this.seatcapacity = seatcapacity;
}
@Override
public String toString() {
	return "Flight [flightCode=" + flightCode + ", flightName=" + flightName + ", seatcapacity=" + seatcapacity + "]";
}

}

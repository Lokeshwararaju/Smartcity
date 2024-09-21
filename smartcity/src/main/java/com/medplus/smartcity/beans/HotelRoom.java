package com.medplus.smartcity.beans;

import org.springframework.stereotype.Component;

@Component
public class HotelRoom {
	private int roomId;
	private String roomType;
	private double pricePerNight;
	private int hotelId;
	private int guestCapacity;
	private int numberOfrooms;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getGuestCapacity() {
		return guestCapacity;
	}
	public void setGuestCapacity(int guestCapacity) {
		this.guestCapacity = guestCapacity;
	}
	public int getNumberOfrooms() {
		return numberOfrooms;
	}
	public void setNumberOfrooms(int numberOfrooms) {
		this.numberOfrooms = numberOfrooms;
	}
	
}

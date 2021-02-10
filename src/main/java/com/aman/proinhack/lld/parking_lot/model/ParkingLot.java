package com.aman.proinhack.lld.parking_lot.model;

public class ParkingLot {
  private String id;
  private Vehicle vehicle;
  private boolean isOccupied;

  public ParkingLot(String id) {
    this.id = id;
  }

  public boolean isOccupied() {
    return isOccupied;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public String getId() {
    return id;
  }
}

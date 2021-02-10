package com.aman.proinhack.lld.parking_lot.model;

import java.util.List;

public class Parking {
  private String id;
  private Integer capacity;
  private List<ParkingLot> parkingLots;
  private Integer currentCapacity;
  private Boolean isFull = false;

  public Parking(String id, int capacity, List<ParkingLot> parkingLots) {
    this.id = id;
    this.capacity = capacity;
    this.parkingLots = parkingLots;
  }

  public Boolean getFull() {
    return isFull;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Integer getCurrentCapacity() {
    return currentCapacity;
  }

  public void setCurrentCapacity(Integer currentCapacity) {
    this.currentCapacity = currentCapacity;
  }

  public void setFull(Boolean full) {
    isFull = full;
  }

  public List<ParkingLot> getParkingLots() {
    return parkingLots;
  }
}

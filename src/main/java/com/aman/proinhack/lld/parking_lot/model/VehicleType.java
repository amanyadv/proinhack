package com.aman.proinhack.lld.parking_lot.model;

public enum VehicleType {
  CAR(10),
  BIKE(5);

  private Integer capacity;

  VehicleType(Integer capacity) {
    this.capacity = capacity;
  }

  public Integer getCapacity() {
    return capacity;
  }
}

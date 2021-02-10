package com.aman.proinhack.lld.parking_lot.model;

public class Vehicle {
  private String no;
  private VehicleType vehicleType;

  public Vehicle(String vehicleNo, VehicleType vehicleType) {
    this.no = vehicleNo;
    this.vehicleType = vehicleType;
  }

  public String getNo() {
    return no;
  }

  public void setNo(String no) {
    this.no = no;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }
}

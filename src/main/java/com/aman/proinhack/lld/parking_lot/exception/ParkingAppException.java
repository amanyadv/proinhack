package com.aman.proinhack.lld.parking_lot.exception;

public class ParkingAppException extends Exception {

  public ParkingAppException(String empty_or_invalid_vehicleNo) {
    super(empty_or_invalid_vehicleNo);
  }
}

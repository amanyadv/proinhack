package com.aman.proinhack.lld.parking_lot.exception;

public class ParkingLotFullException extends Exception {

  public ParkingLotFullException(String parking_is_full) {
    super(parking_is_full);
  }
}

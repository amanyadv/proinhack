package com.aman.proinhack.lld.cab_booking.service;

public interface DriverService {

  String registerDriver();

  /**
   * @param driverId
   * @return
   */
  String addCab(String driverId);

  String removeCab(String cabId);
}

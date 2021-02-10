package com.aman.proinhack.lld.cab_booking.service;

import com.aman.proinhack.lld.cab_booking.model.Location;

public interface BookingService {

  /**
   * @param customerId customer id
   * @param location city info where the cab is being booked
   * @return
   */
  String bookCab(String customerId, Location location);

  /**
   * @param bookingId
   * @return
   */
  Double endBooking(String bookingId);

}

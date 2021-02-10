package com.aman.proinhack.lld.cab_booking.model;

import java.time.LocalDateTime;

public abstract class Cab {
  private String cabId;
  private String driverId;
  private CabStatus cabStatus;
  private Location location;
  private LocalDateTime lastBookingTime;
}

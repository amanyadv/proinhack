package com.aman.proinhack.lld.cab_booking.model;

import java.time.LocalDateTime;

public class Booking {
  private String id;
  private String cabId;
  private String customerId;
  private Location startLocation;
  private Location endLocation;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private Double charges;
}

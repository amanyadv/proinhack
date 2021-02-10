package com.aman.proinhack.lld.parking_lot.model;

import java.time.LocalDateTime;

public class ParkingTicket {
  private String id;
  private String lotId;
  private Vehicle vehicle;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private Long charges;

  public ParkingTicket(String ticketId, String lotId, Vehicle vehicle, LocalDateTime startTime) {
    this.id = ticketId;
    this.lotId = lotId;
    this.vehicle = vehicle;
    this.startTime = startTime;
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

  public String getLotId() {
    return lotId;
  }

  public void setLotId(String lotId) {
    this.lotId = lotId;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }

  public Long getCharges() {
    return charges;
  }

  public void setCharges(Long charges) {
    this.charges = charges;
  }

  public Long getCharges(long timeDiffInHours, VehicleType vehicleType) {
    Long c;
    if(timeDiffInHours <= 2) {
      if(VehicleType.CAR == vehicleType) {
        c = RateCard.TILL_2.getCarRateCard().getCharge();
      }else {
        c = RateCard.TILL_2.getBikeRateCard().getCharge();
      }
    }else if(timeDiffInHours <= 4) {
      if(VehicleType.CAR == vehicleType) {
        c = RateCard.FROM_2_4.getCarRateCard().getCharge();
      }else {
        c = RateCard.FROM_2_4.getBikeRateCard().getCharge();
      }
    }else {
      if(VehicleType.CAR == vehicleType) {
        c = RateCard.FROM_4.getCarRateCard().getCharge();
      }else {
        c = RateCard.FROM_4.getBikeRateCard().getCharge();
      }
    }
    c = c * timeDiffInHours;
    return c;
  }
}

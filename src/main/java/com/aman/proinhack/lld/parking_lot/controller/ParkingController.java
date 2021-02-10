package com.aman.proinhack.lld.parking_lot.controller;

import com.aman.proinhack.lld.parking_lot.exception.ParkingAppException;
import com.aman.proinhack.lld.parking_lot.exception.ParkingLotFullException;
import com.aman.proinhack.lld.parking_lot.model.ParkingTicket;
import com.aman.proinhack.lld.parking_lot.model.Vehicle;
import com.aman.proinhack.lld.parking_lot.model.VehicleType;
import com.aman.proinhack.lld.parking_lot.service.ParkingService;
import com.aman.proinhack.lld.parking_lot.util.StringUtil;

public class ParkingController {

  private final ParkingService parkingService;

  public ParkingController(ParkingService parkingService) {
    this.parkingService = parkingService;
  }

  public String parkVehicle(String vehicleNo, String vehicleType)
      throws ParkingAppException, ParkingLotFullException {
    if (!StringUtil.hasLength(vehicleNo)) {
      throw new ParkingAppException("Empty or invalid vehicleNo");
    }
    VehicleType vehicleType1;
    try {
      vehicleType1 = VehicleType.valueOf(vehicleType);
    } catch (IllegalArgumentException exp) {
      throw new ParkingAppException("Empty or invalid vehicle type");
    }
    return parkingService.parkVehicle(new Vehicle(vehicleNo, vehicleType1));
  }

  public Long exitVehicle(String ticketId) throws ParkingAppException {
    if (!StringUtil.hasLength(ticketId)) {
      throw new ParkingAppException("Empty or invalid ticketId");
    }
    return parkingService.exitVehicle(ticketId);
  }

  public ParkingTicket getVehicleHistory(String vehicleNo) throws ParkingAppException {
    if (!StringUtil.hasLength(vehicleNo)) {
      throw new ParkingAppException("Empty or invalid vehicleNo");
    }
    return parkingService.getVehicleHistory(vehicleNo);
  }
}

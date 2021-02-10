package com.aman.proinhack.lld.parking_lot.service;

import com.aman.proinhack.lld.parking_lot.exception.ParkingAppException;
import com.aman.proinhack.lld.parking_lot.exception.ParkingLotFullException;
import com.aman.proinhack.lld.parking_lot.model.ParkingTicket;
import com.aman.proinhack.lld.parking_lot.model.Vehicle;

public interface ParkingService {

  String parkVehicle(Vehicle vehicle) throws ParkingLotFullException;

  Long exitVehicle(String ticketId) throws ParkingAppException;

  ParkingTicket getVehicleHistory(String vehicleNo) throws ParkingAppException;
}

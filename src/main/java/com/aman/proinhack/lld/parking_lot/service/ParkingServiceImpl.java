package com.aman.proinhack.lld.parking_lot.service;

import com.aman.proinhack.lld.parking_lot.exception.ParkingAppException;
import com.aman.proinhack.lld.parking_lot.exception.ParkingLotFullException;
import com.aman.proinhack.lld.parking_lot.model.Parking;
import com.aman.proinhack.lld.parking_lot.model.ParkingLot;
import com.aman.proinhack.lld.parking_lot.model.ParkingTicket;
import com.aman.proinhack.lld.parking_lot.model.Vehicle;
import com.aman.proinhack.lld.parking_lot.repository.ParkingRepository;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class ParkingServiceImpl implements ParkingService {
  ParkingRepository parkingRepository;

  public ParkingServiceImpl() {
    parkingRepository = ParkingRepository.getInstance();
  }

  @Override
  public String parkVehicle(Vehicle vehicle) throws ParkingLotFullException {
    Parking parking = parkingRepository.getParking();
    System.out.println("parking - "+parking);
    if (parking.getFull()) {
      throw new ParkingLotFullException("Parking is full");
    }
    ParkingLot parkingLot = parkingRepository.getUnOccupiedParking(parking);
    //
    String ticketId = UUID.randomUUID().toString();
    ParkingTicket parkingTicket = new ParkingTicket(ticketId, parkingLot.getId(), vehicle, LocalDateTime.now());
    parkingRepository.saveParkingTicket(parkingTicket);
    return parkingTicket.getId();
  }

  @Override
  public Long exitVehicle(String ticketId) throws ParkingAppException {
    ParkingTicket parkingTicket = parkingRepository.getParkingTicket(ticketId);
    if(parkingTicket == null) {
      throw new ParkingAppException("Invalid parking ticket");
    }
    LocalDateTime parkedTime = parkingTicket.getStartTime();
    LocalDateTime currentTime = LocalDateTime.now();
    long timeDiffInHours = parkedTime.until(currentTime, ChronoUnit.HOURS);
    System.out.println("timeDiffInHours - "+timeDiffInHours);
    if(timeDiffInHours <= 0) {
      timeDiffInHours = 1;
    }
    Long charges = parkingTicket.getCharges(timeDiffInHours, parkingTicket.getVehicle().getVehicleType());
    parkingTicket.setEndTime(currentTime);
    parkingTicket.setCharges(charges);
    //free lot
    return charges;
  }

  @Override
  public ParkingTicket getVehicleHistory(String vehicleNo) throws ParkingAppException {
    ParkingTicket parkingTicket = parkingRepository.getVehicleParkingTicket(vehicleNo);
    if(parkingTicket == null) {
      throw new ParkingAppException("Vehicle history not found");
    }
    return parkingTicket;
  }
}

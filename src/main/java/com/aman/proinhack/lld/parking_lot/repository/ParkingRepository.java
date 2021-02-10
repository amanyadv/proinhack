package com.aman.proinhack.lld.parking_lot.repository;

import com.aman.proinhack.lld.parking_lot.model.Parking;
import com.aman.proinhack.lld.parking_lot.model.ParkingLot;
import com.aman.proinhack.lld.parking_lot.model.ParkingTicket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingRepository {
  final Parking parking;
  final Map<String, ParkingLot> occupiedParkingLots;
  final Map<String, ParkingTicket> ticketsWithVehicleNo;
  final Map<String, ParkingTicket> ticketsWithticketId;
  private static ParkingRepository parkingRepository;

  private ParkingRepository() {
    parking = new Parking("parking-1", 50, getParkingLots());
    occupiedParkingLots = new HashMap<>();
    ticketsWithVehicleNo = new HashMap<>();
    ticketsWithticketId = new HashMap<>();
  }

  public static ParkingRepository getInstance() {
    if (parkingRepository == null) {
      parkingRepository = new ParkingRepository();
    }
    return parkingRepository;
  }

  public Parking getParking() {
    return parking;
  }

  public ParkingLot getUnOccupiedParking(Parking parking) {
    for (ParkingLot parkingLot : parking.getParkingLots()) {
      if (!parkingLot.isOccupied()) {
        return parkingLot;
      }
    }
    return null;
  }

  public void saveParkingTicket(ParkingTicket parkingTicket) {
    ticketsWithticketId.put(parkingTicket.getId(), parkingTicket);
    ticketsWithVehicleNo.put(parkingTicket.getVehicle().getNo(), parkingTicket);
  }

  public ParkingTicket getParkingTicket(String ticketId) {
    return ticketsWithticketId.get(ticketId);
  }

  public ParkingTicket getVehicleParkingTicket(String vehicleNo) {
    return ticketsWithVehicleNo.get(vehicleNo);
  }

  private List<ParkingLot> getParkingLots() {
    List<ParkingLot> parkingLots = new ArrayList<>();
    parkingLots.add(new ParkingLot("parking-1"));
    parkingLots.add(new ParkingLot("parking-2"));
    parkingLots.add(new ParkingLot("parking-3"));
    parkingLots.add(new ParkingLot("parking-4"));
    parkingLots.add(new ParkingLot("parking-5"));
    parkingLots.add(new ParkingLot("parking-6"));
    parkingLots.add(new ParkingLot("parking-7"));
    parkingLots.add(new ParkingLot("parking-8"));
    parkingLots.add(new ParkingLot("parking-9"));
    parkingLots.add(new ParkingLot("parking-10"));
    return parkingLots;
  }
}
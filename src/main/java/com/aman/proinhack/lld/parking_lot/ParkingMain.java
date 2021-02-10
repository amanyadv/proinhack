package com.aman.proinhack.lld.parking_lot;


import com.aman.proinhack.lld.parking_lot.controller.ParkingController;
import com.aman.proinhack.lld.parking_lot.model.ParkingTicket;
import com.aman.proinhack.lld.parking_lot.service.ParkingServiceImpl;
import com.aman.proinhack.lld.parking_lot.util.StringUtil;

public class ParkingMain {

  public static void main(String[] args) {
    //
    ParkingController parkingController = new ParkingController(new ParkingServiceImpl());

    String ticketId = "";
    try {
      ticketId = parkingController.parkVehicle("101", "CAR");
      System.out.println("id - "+ticketId);
    }catch (Exception e) {
      e.printStackTrace();
    }

    try {
      ParkingTicket ticket = parkingController.getVehicleHistory("101");
      System.out.println("ticket id - "+ticket.getId()+", lot id - "+ticket.getLotId()+", vehicle type - "+ticket.getVehicle().getVehicleType());
    }catch (Exception e) {
      e.printStackTrace();
    }

    try {
      if(StringUtil.hasLength(ticketId)) {
        Long charges = parkingController.exitVehicle(ticketId);
        System.out.println("charges - "+charges);
      }
    }catch (Exception e) {
      e.printStackTrace();
    }

    try {
      parkingController.parkVehicle("101", "TRA");
    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}

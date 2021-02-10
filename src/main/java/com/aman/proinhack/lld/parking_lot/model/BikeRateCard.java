package com.aman.proinhack.lld.parking_lot.model;

public enum BikeRateCard {
  TILL_2(10l),
  FROM_2_4(20l),
  FROM_4(30l);

  private Long charge;

  BikeRateCard(Long charge) {
    this.charge = charge;
  }

  public Long getCharge() {
    return charge;
  }
}

package com.aman.proinhack.lld.parking_lot.model;

public enum CarRateCard {
  TILL_2(20l),
  FROM_2_4(40l),
  FROM_4(50l);

  private Long charge;

  CarRateCard(Long charge) {
    this.charge = charge;
  }

  public Long getCharge() {
    return charge;
  }
}

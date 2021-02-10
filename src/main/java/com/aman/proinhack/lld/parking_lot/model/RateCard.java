package com.aman.proinhack.lld.parking_lot.model;

public enum RateCard {
  TILL_2(CarRateCard.TILL_2, BikeRateCard.TILL_2),
  FROM_2_4(CarRateCard.FROM_2_4, BikeRateCard.FROM_2_4),
  FROM_4(CarRateCard.FROM_4, BikeRateCard.FROM_4);

  private CarRateCard carRateCard;
  private BikeRateCard bikeRateCard;

  RateCard(CarRateCard carRateCard, BikeRateCard bikeRateCard) {
    this.carRateCard = carRateCard;
    this.bikeRateCard = bikeRateCard;
  }

  public CarRateCard getCarRateCard() {
    return carRateCard;
  }

  public BikeRateCard getBikeRateCard() {
    return bikeRateCard;
  }
}

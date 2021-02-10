package com.aman.proinhack.lld.cab_booking.strategy;

import com.aman.proinhack.lld.cab_booking.model.Location;

public interface PriceStrategy {

  Double calculatePrice(Location locationA, Location locationB);
}

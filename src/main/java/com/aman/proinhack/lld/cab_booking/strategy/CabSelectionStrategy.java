package com.aman.proinhack.lld.cab_booking.strategy;

import com.aman.proinhack.lld.cab_booking.model.Cab;
import java.util.List;

public interface CabSelectionStrategy {

  Cab selectCab(List<Cab> cabList);
}

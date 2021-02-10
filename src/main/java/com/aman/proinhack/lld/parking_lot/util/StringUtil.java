package com.aman.proinhack.lld.parking_lot.util;

import org.springframework.lang.Nullable;

public class StringUtil {

  public static boolean hasLength(@Nullable String str) {
    return (str != null && !str.isEmpty());
  }

}

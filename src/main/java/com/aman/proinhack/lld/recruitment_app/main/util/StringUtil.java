package com.aman.proinhack.lld.recruitment_app.main.util;

import org.springframework.lang.Nullable;

public class StringUtil {

  public static boolean hasLength(@Nullable String str) {
    return (str != null && !str.isEmpty());
  }

}

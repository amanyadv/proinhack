package com.aman.proinhack.lld.recruitment_app.main.repository;

import java.util.HashMap;
import java.util.Map;

public class PanelRepository {

  private final Map<String, Long> hourMap;

  public PanelRepository() {
    hourMap = new HashMap<>();
  }

  public Long getPanelHours(String panelId) {
    return hourMap.get(panelId);
  }

  public void addPanelHour(String panelId, Long timeInHours) {
    hourMap.put(panelId, hourMap.getOrDefault(panelId, 0l) + timeInHours);
  }
}

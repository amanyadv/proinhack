package com.aman.proinhack.lld.recruitment_app.main.service;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import java.util.Date;

public interface PanelService {

  long getPanelHours(String panelId, Date sDate, Date eDate) throws RecruitmentException;
}

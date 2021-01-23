package com.aman.proinhack.lld.recruitment_app.main.controller;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.service.PanelService;
import com.aman.proinhack.lld.recruitment_app.main.util.DateUtil;
import com.aman.proinhack.lld.recruitment_app.main.util.StringUtil;
import java.util.Date;

public class PanelController {
  private final PanelService panelService;

  public PanelController(PanelService panelService) {
    this.panelService = panelService;
  }

  /**
   *
   * @param panelId
   * @param sDateStr start date (format dd/mm/yyyy)
   * @param eDateStr end date (format dd/mm/yyyy)
   * @return
   * @throws RecruitmentException
   */
  public long getPanelHourCount(String panelId, String sDateStr, String eDateStr) throws RecruitmentException {
    if (!StringUtil.hasLength(panelId)) {
      throw new RecruitmentException("Empty panel id");
    }
    if (!StringUtil.hasLength(sDateStr)) {
      throw new RecruitmentException("Empty sDate");
    }
    Date sDate;
    try {
      sDate = DateUtil.convertDate(sDateStr);
    } catch (Exception exp) {
      throw new RecruitmentException("Invalid sDate");
    }
    if (!StringUtil.hasLength(eDateStr)) {
      throw new RecruitmentException("Empty eDate");
    }
    Date eDate;
    try {
      eDate = DateUtil.convertDate(eDateStr);
    } catch (Exception exp) {
      throw new RecruitmentException("Invalid eDate");
    }
    if (sDate.after(eDate)) {
      throw new RecruitmentException("Start date should be less then end date");
    }
    return panelService.getPanelHours(panelId, sDate, eDate);
  }
}

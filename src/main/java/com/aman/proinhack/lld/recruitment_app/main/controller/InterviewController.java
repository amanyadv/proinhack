package com.aman.proinhack.lld.recruitment_app.main.controller;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.model.BusinessUnit;
import com.aman.proinhack.lld.recruitment_app.main.model.CandidateLevel;
import com.aman.proinhack.lld.recruitment_app.main.model.InterviewResult;
import com.aman.proinhack.lld.recruitment_app.main.service.InterviewService;
import com.aman.proinhack.lld.recruitment_app.main.util.DateUtil;
import com.aman.proinhack.lld.recruitment_app.main.util.StringUtil;
import java.util.Date;

public class InterviewController {

  private final InterviewService interviewService;

  public InterviewController(InterviewService interviewService) {
    this.interviewService = interviewService;
  }

  /**
   * @param candidateId candidate id
   * @param panelId interview panel id
   * @param bu business unit
   * @param level candidate level
   * @param result interview result (YES_FOR_NEXT_ROUND/REJECT/HIRE)
   * @param dateStr date with format dd/mm/yyyy
   */
  public void addInterview(String candidateId, String panelId, String bu, String level,
      String result, String dateStr)
      throws RecruitmentException {
    if (!StringUtil.hasLength(candidateId)) {
      throw new RecruitmentException("Empty or invalid candidate id");
    }
    if (!StringUtil.hasLength(panelId)) {
      throw new RecruitmentException("Empty or invalid panel id");
    }
    BusinessUnit businessUnit;
    try {
      businessUnit = BusinessUnit.valueOf(bu);
    } catch (IllegalArgumentException exp) {
      throw new RecruitmentException("Empty or invalid business unit");
    }
    CandidateLevel candidateLevel;
    try {
      candidateLevel = CandidateLevel.valueOf(level);
    } catch (IllegalArgumentException exp) {
      throw new RecruitmentException("Empty or invalid candidate level");
    }
    InterviewResult interviewResult;
    try {
      interviewResult = InterviewResult.valueOf(result);
    } catch (IllegalArgumentException exp) {
      throw new RecruitmentException("Empty or invalid interview result");
    }
    if (!StringUtil.hasLength(dateStr)) {
      throw new RecruitmentException("Empty date");
    }
    Date date;
    try {
      date = DateUtil.convertDate(dateStr);
    } catch (Exception exp) {
      throw new RecruitmentException("Invalid date");
    }
    interviewService
        .addInterview(candidateId, panelId, businessUnit, candidateLevel, interviewResult, date);
  }

}

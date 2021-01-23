package com.aman.proinhack.lld.recruitment_app.test;


import com.aman.proinhack.lld.recruitment_app.main.controller.InterviewController;
import com.aman.proinhack.lld.recruitment_app.main.controller.PanelController;
import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.service.InterviewServiceImpl;
import com.aman.proinhack.lld.recruitment_app.main.service.PanelServiceImpl;

public class PanelControllerTest {

  public static void main(String[] arg) {
    InterviewController interviewController = new InterviewController(
        new InterviewServiceImpl());
    PanelController panelController = new PanelController(
        new PanelServiceImpl());
    //success test
    try {
      String panelId = "pan1";
      interviewController
          .addInterview("can1", panelId, "BU1", "L1", "YES_FOR_NEXT_ROUND", "20/01/2021");
      interviewController
          .addInterview("can1", panelId, "BU1", "L1", "HIRE", "21/01/2021");
      System.out.println(panelId + " hours - " + panelController
          .getPanelHourCount(panelId, "20/01/2021", "25/01/2021"));
    } catch (RecruitmentException e) {
      e.printStackTrace();
    }

    // invalid date test
    try {
      String panelId = "pan10";
      panelController
          .getPanelHourCount(panelId, "25/01/2021", "20/01/2021");
    } catch (RecruitmentException e) {
      e.printStackTrace();
    }
  }
}

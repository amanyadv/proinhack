package com.aman.proinhack.lld.recruitment_app.test;


import com.aman.proinhack.lld.recruitment_app.main.controller.InterviewController;
import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.service.InterviewServiceImpl;

public class InterviewControllerTest {

  public static void main(String[] arg) {
    InterviewController interviewController = new InterviewController(
        new InterviewServiceImpl());
    //success test
    try {
      interviewController
          .addInterview("can1", "pan1", "BU1", "L1", "YES_FOR_NEXT_ROUND", "20/01/2021");
      interviewController
          .addInterview("can2", "pan2", "BU2", "L2", "HIRE", "21/01/2021");
    } catch (RecruitmentException e) {
      e.printStackTrace();
    }

    // candidate id null test
    try {
      interviewController
          .addInterview(null, "pan2", "BU2", "L2", "HIRE", "21/01/2021");
    } catch (RecruitmentException e) {
      e.printStackTrace();
    }

    // invalid interview result test
    try {
      interviewController
          .addInterview("can3", "pan2", "BU2", "L2", "H", "21/01/2021");
    } catch (RecruitmentException e) {
      e.printStackTrace();
    }
  }
}

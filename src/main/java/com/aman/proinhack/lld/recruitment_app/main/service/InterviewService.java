package com.aman.proinhack.lld.recruitment_app.main.service;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.model.BusinessUnit;
import com.aman.proinhack.lld.recruitment_app.main.model.CandidateLevel;
import com.aman.proinhack.lld.recruitment_app.main.model.InterviewResult;
import java.util.Date;

public interface InterviewService {

  void addInterview(String candidateId, String panelId,
      BusinessUnit businessUnit,
      CandidateLevel candidateLevel,
      InterviewResult interviewResult,
      Date date) throws RecruitmentException;

}

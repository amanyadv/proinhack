package com.aman.proinhack.lld.recruitment_app.main.service;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.model.BusinessUnit;
import com.aman.proinhack.lld.recruitment_app.main.model.CandidateLevel;
import com.aman.proinhack.lld.recruitment_app.main.model.Interview;
import com.aman.proinhack.lld.recruitment_app.main.model.InterviewResult;
import com.aman.proinhack.lld.recruitment_app.main.repository.InterviewRepository;
import java.util.Date;

public class InterviewServiceImpl implements InterviewService {

  private final InterviewRepository interviewRepository;

  public InterviewServiceImpl() {
    this.interviewRepository = InterviewRepository.getInstance();
  }

  @Override
  public void addInterview(String candidateId, String panelId,
      BusinessUnit businessUnit,
      CandidateLevel candidateLevel,
      InterviewResult interviewResult,
      Date date) throws RecruitmentException {
    Interview interview = new Interview(candidateId, panelId, businessUnit, candidateLevel,
        interviewResult, date);
    interviewRepository.addInterview(interview);
    interviewRepository.addInterviewByDate(date, interview);
  }
}

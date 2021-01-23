package com.aman.proinhack.lld.recruitment_app.main.service;

import com.aman.proinhack.lld.recruitment_app.main.exception.RecruitmentException;
import com.aman.proinhack.lld.recruitment_app.main.model.Interview;
import com.aman.proinhack.lld.recruitment_app.main.repository.InterviewRepository;
import com.aman.proinhack.lld.recruitment_app.main.repository.PanelRepository;
import java.util.Date;
import java.util.List;

public class PanelServiceImpl implements PanelService {

  private final InterviewRepository interviewRepository;
  private final PanelRepository panelRepository;

  public PanelServiceImpl() {
    this.interviewRepository = InterviewRepository.getInstance();
    this.panelRepository = new PanelRepository();
  }

  @Override
  public long getPanelHours(String panelId, Date sDate, Date eDate) throws RecruitmentException {
    List<Interview> interviewList = interviewRepository.getInterviewsBetweenDates(sDate, eDate);
    if (interviewList.isEmpty()) {
      throw new RecruitmentException("No interview available b/t these days");
    }
    long panelHours = interviewList.stream().filter(s -> s.getPanel().getId().equals(panelId))
        .mapToLong(Interview::geTimeInHours).sum();
    return panelHours;
  }
}

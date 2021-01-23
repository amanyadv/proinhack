package com.aman.proinhack.lld.recruitment_app.main.repository;

import com.aman.proinhack.lld.recruitment_app.main.model.Interview;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class InterviewRepository {

  private final List<Interview> interviewList;
  private final TreeMap<Date, List<Interview>> interviewsByDate;
  private static InterviewRepository interviewRepository;

  private InterviewRepository() {
    interviewList = new ArrayList<>();
    interviewsByDate = new TreeMap<>();
  }

  public static InterviewRepository getInstance() {
    if (interviewRepository == null) {
      interviewRepository = new InterviewRepository();
    }
    return interviewRepository;
  }

  public void addInterview(Interview interview) {
    interviewList.add(interview);
  }

  public List<Interview> getInterviews() {
    return interviewList;
  }

  public void addInterviewByDate(Date date, Interview interview) {
    List<Interview> interviews = interviewsByDate.getOrDefault(date, new ArrayList<>());
    interviews.add(interview);
    interviewsByDate.put(date, interviews);
  }

  public List<Interview> getInterviewsBetweenDates(Date date1, Date date2) {
    SortedMap<Date, List<Interview>> ibd = interviewsByDate.subMap(date1, date2);
    List<Interview> interviews = new ArrayList<>();
    ibd.values().forEach(interviews::addAll);
    return interviews;
  }
}

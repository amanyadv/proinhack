package com.aman.proinhack.lld.recruitment_app.main.model;

import java.util.Date;
import java.util.UUID;

public class Interview {

  private String id;
  private Candidate candidate;
  private Panel panel;
  private BusinessUnit bu;
  private CandidateLevel level;
  private InterviewResult result;
  private Date date;
  private Long timeInHours;

  public Interview() {
  }

  public Interview(String candidateId, String panelId, BusinessUnit businessUnit,
      CandidateLevel candidateLevel, InterviewResult interviewResult, Date date) {
    this.id = UUID.randomUUID().toString();
    this.candidate = new Candidate(candidateId);
    this.panel = new Panel(panelId);
    this.bu = businessUnit;
    this.level = candidateLevel;
    this.result = interviewResult;
    this.date = date;
    this.timeInHours = 1l; //fixed 1 hour
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Candidate getCandidate() {
    return candidate;
  }

  public void setCandidate(Candidate candidate) {
    this.candidate = candidate;
  }

  public Panel getPanel() {
    return panel;
  }

  public void setPanel(Panel panel) {
    this.panel = panel;
  }

  public BusinessUnit getBu() {
    return bu;
  }

  public void setBu(BusinessUnit bu) {
    this.bu = bu;
  }

  public CandidateLevel getLevel() {
    return level;
  }

  public void setLevel(CandidateLevel level) {
    this.level = level;
  }

  public InterviewResult getResult() {
    return result;
  }

  public void setResult(InterviewResult result) {
    this.result = result;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Long geTimeInHours() {
    return timeInHours;
  }

  public void setTimeInHours(Long timeInHours) {
    this.timeInHours = timeInHours;
  }
}

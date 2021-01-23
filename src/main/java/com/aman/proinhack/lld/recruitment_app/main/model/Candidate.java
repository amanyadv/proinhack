package com.aman.proinhack.lld.recruitment_app.main.model;

public class Candidate {
  private String id;
  private String name;
  // other metadata

  public Candidate(String candidateId) {
    this.id = candidateId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

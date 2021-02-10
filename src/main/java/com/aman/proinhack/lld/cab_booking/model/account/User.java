package com.aman.proinhack.lld.cab_booking.model.account;

public abstract class User {
  private String id;
  private String name;
  // other meta-data

  public User(String id){
    this.id = id;
  }

  public String getId() {
    return id;
  }
}

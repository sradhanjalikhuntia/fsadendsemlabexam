package com.klef.fsad.exam;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Vehicle {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 private String name;
 private String status;
 private LocalDate date;

 public Vehicle() {}

 public Vehicle(String n,String s){
  name=n; status=s; date=LocalDate.now();
 }

 public int getId(){ return id; }
 public void setName(String n){ name=n; }
 public void setStatus(String s){ status=s; }
}

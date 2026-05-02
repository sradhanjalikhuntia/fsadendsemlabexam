package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
 public static void main(String[] args) {

  SessionFactory sf = new Configuration()
    .configure()
    .addAnnotatedClass(Vehicle.class)
    .buildSessionFactory();

  Session s = sf.openSession();
  Transaction t = s.beginTransaction();

  // Insert
  Vehicle v = new Vehicle("Car","Available");
  s.persist(v);
  t.commit();

  System.out.println("Inserted ID: " + v.getId());

  // Update
  t = s.beginTransaction();
  Vehicle obj = s.get(Vehicle.class, v.getId());
  obj.setStatus("Sold");
  t.commit();

  System.out.println("Updated");

  s.close(); sf.close();
 }
}

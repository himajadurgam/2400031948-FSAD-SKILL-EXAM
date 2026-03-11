package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo
{
 public static void main(String[] args)
 {
  SessionFactory sf = new Configuration().configure().buildSessionFactory();
  Session s = sf.openSession();
  Transaction t = s.beginTransaction();

  // Insert
  Inventory i = new Inventory();
  i.name="Laptop";
  i.description="Dell Laptop";
  i.status="Available";
  s.save(i);

  // Delete by ID
  Inventory obj = s.get(Inventory.class,1);
  if(obj!=null)
  {
   s.delete(obj);
  }

  t.commit();
  s.close();
  sf.close();

  System.out.println("Operations completed");
 }
}

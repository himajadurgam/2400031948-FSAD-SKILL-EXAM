package com.klef.fsad.exam;

import javax.persistence.*;

@Entity
@Table(name="inventory")
public class Inventory
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;

 String name;
 String description;
 String status;
}

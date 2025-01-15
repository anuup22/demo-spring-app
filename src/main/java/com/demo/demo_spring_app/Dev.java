package com.demo.demo_spring_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

  // Laptop laptop; Error: null pointer exception

  // @Autowired DI-1: Field Injection
  Laptop laptop;

  // DI-2: Constructor Injection
  // @Autowired Optional(Default)
  // public Dev(Laptop laptop) {
  // this.laptop = laptop;
  // }

  // DI-3: Setter Injection
  @Autowired
  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public void build() {

    laptop.compile();
    System.out.println("Building the project");
  }
}

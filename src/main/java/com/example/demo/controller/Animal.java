package com.example.demo.controller;

import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

public class Animal {
    private int age;

TreeSet<Animal> set = new TreeSet<>();

    public int getAge(){
        set.add(new Animal());
        return age;
    }

    @Override
    public boolean equals(Object o) {
      if(this == o)
          return true;
      if(!(o instanceof Animal))
          return false;
      return this.age ==  ((Animal) o).age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int hashCode() {
        return new Random().nextInt();
    }
}

class Lion extends Animal{
    public int go(int x, String y){
        return x;
    }
    public int go(String x, int y){
        return y;
    }
    
    @Override
    public int getAge() {
        return super.getAge();
    }
}
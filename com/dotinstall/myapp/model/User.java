package com.dotinstall.myapp.model; //ファイル階層をパッケージとしてこのように表す

public class User {
  protected String name;

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
}
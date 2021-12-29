package com.dotinstall.myapp.model; //ファイル階層をパッケージとしてこのように表す

public class AdminUser extends User {
  public AdminUser(String name) {
    super(name);
  }

  public void sayHello() {
    System.out.println("hello! " + this.name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}
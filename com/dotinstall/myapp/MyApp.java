package com.dotinstall.myapp; //ファイル階層をパッケージとしてこのように表す
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
// import com.dotinstall.myapp.model.*; model以下のファイルを全て読み込みたい場合はこのように書くこともできる

public class MyApp {
  public static void main(String[] args) {

    /*com.dotinstall.myapp.model.User*/ User tom = new User("Tom"); //本来であればcom.~と記述しなければいけないが、
    tom.sayHi();                                                    //ファイル上部のimportで他ファイルへのアクセス権を付与している為、不要

    AdminUser bob = new AdminUser("Bob");
    bob.sayHello();
    bob.sayHi();
  }
}
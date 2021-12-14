class User {
  // String name = "Me!"; //もう初期化する必要がなくなる
  String name;

  User(String name) { //コンストラクタ(クラスと同じ名前で作る)
    this.name = name; //Userクラスのnameフィールドに設定するため
  }                   //メソッド内からクラスのフィールドにthisを使ってアクセスさせる

  //引数なしでインスタンス化された場合(メソッドのオーバーロード)
  User() {
    this.name = " Me!";
  }

  void sayHi() {
    System.out.println("hi!" + this.name);
  }
}

public class MyApp {
  public static void main(String[] args) {
    User tom;
    tom = new User("Tom"); //インスタンス化される時に名前を渡す
    tom = new User(); //インスタンス化される時に名前を渡さない場合

    System.out.println(tom.name);
    tom.sayHi();
  }
}
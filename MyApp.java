/*
//継承元のクラスを親クラス、もしくはスーパークラスという
class User {
  String name;

  //今回は親クラスのコンストラクタに引数があるため、
  //子クラスのコンストラクタにも同じ引数を渡す
  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

//継承するクラスを子クラスまたはサブクラスという
class AdminUser extends User { //extendsで指定したクラスの継承ができる
                        //継承したことでAdminUserクラスがUserクラスのメソッドや変数を使えるようになる
  //コンストラクタ
  AdminUser(String name) {
  //コンストラクタを作ると自動的に親クラスのコンストラクタが呼ばれる
  //親クラスのコンストラクタはsuper();という特殊なメソッドで、
  //親クラスのコンストラクタに引数がなければこれを省略することもできる
  super(name);
  }

  void sayHello() {
    System.out.println("hello! " + this.name);
  }

  //メソッドのオーバーライド
  @Override //アノテーション(オーバーライドしていることを明示的に示せるので、
            //メソッド名を間違えていたり引数を間違えているとエラーにしてくれる)
  void syHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}

public class MyApp {
  public static void main(String[] args) {
    User tom = new User("tom");
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}
*/

public class MyApp {

  public static String sayHi(String name) {
    return "Hi! " + name;
  }

  public static void main(String[] args) {
    String msg = sayHi("Bob");
    System.out.println(msg);
  }
}
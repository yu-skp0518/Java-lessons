class User {
  String name = "Me!"; //Userクラスの変数。とりあえずMeで初期化
                      //クラスに属する変数を"フィールド"と呼ぶ
  void sayHi() { //Userクラスが持つメソッド
    System.out.println("hi!");
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom; //classも参照型のため、宣言しただけではメモリ領域にデータは作らない
    tom = new User(); //なので実際に領域にデータを置くには配列同様newする必要がある
                      //newするとそのclassがもつ変数やメソッドを持った領域を確保して
                      //tomにはその領域の番地が格納される。
                      //newして領域を確保することをインスタンスを作るという
                      //実際に作られたtomはUserクラスのインスタンスと呼ぶ
    System.out.println(tom.name);
    tom.sayHi();
  }

}
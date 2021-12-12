- JDK（Open JDK）
JDKとはJava Development Kitの略で、その中には実行環境であるJREや
JAVAを動作させるための仮想マシンであるJVMも含まれる。

- JRE
JREとはJava Runtime Environmentの略

- JVM
Java Virtual Machineの略


Javaのファイルの拡張子は.javaで、そのままだと動作しないので
コンパイルする必要がある。

コンパイル後の拡張子が.classで、.classファイルであればJRE上で動作させることができる。

Javaでは一度コードを書けばどの環境でも動作するということを目指して、WindowsやMacなど他の環境でもJREさえ用意できれば
.classファイルをコピーして動作させることができる。 - "Write once, run anywhere"

-------------------------------------------------

$ javac [ファイル名].javaでコンパイル
    ↓
.classファイルができる
    ↓
java [ファイル名]で実行

-------------------------------------------------

- 変数
変数を使うには必ず宣言が必要
宣言するにはそこに入れるデータの型と変数名を書く

例) String msg;
    msg = "hello world";

    上記の宣言は以下のように書くこともできる

    String msg = "hello world";

-------------------------------------------------

- さまざまなデータ型

・文字列 - String
  例)  String msg = "hello world"; //ダブルクォーテーションで囲む


・単数文字 - char
  例)  char a = 'a'; //シングルクォーテーションで囲む


・整数 - byte short int long //全て整数(右に行くほど桁が大きい ※通常はintを使う)
  例)  int x = 10;
       long y = 555555555555L; //longの場合のみ末尾にLをつける(小文字でも構わないが大文字が慣習)


・浮動小数点数 - float double //通常は扱える桁数の大きいdoubleを使う
  例)  double d = 23423.344;
       float f = 32.33F; //floatの場合のみ末尾にFをつける(小文字でも構わないが大文字が慣習)


・論理値(真偽値) - boolean
  例)  boolean flag = true;

・特殊文字 - (\n = 改行,  \t = タブ)
  例)  String msg = "hello wo\nrld again\t!";
           ↓
       hello wo
       rld again       !
   といったように出力される

  ===========================
    public class MyApp {
      public static void main(String[] args) {
    
        String msg = "hello world again!";
        System.out.println(msg);
        
        String message = "hello wo\nrld again\t!";
        System.out.println(message);
      }
    }
  ===========================

-------------------------------------------------

 - 演算
 - 四則演算
 -> + - * / %
 => ++(1を足す) --(1を引く)
 
 ===========================
    public class MyApp {
      public static void main(String[] args) {
    
        int i; //intはあくまでも整数型なので10を3で割っても小数点以下は切り捨てられて3が返ってくる
        i = 10 / 3;
        System.out.println(i); //=3
    
        i = 10 % 3; //%はあまりを返す
        System.out.println(i); //=1
    
        int x = 5;
        x++; //++は1を足すなので今回は6
        System.out.println(x); //=6
    
        x--; //++は1を引くなので上で足された1を再度引いて今回は5が返ってくる
        System.out.println(x); //=5
      }
    }    
  ===========================

 - 代入を伴う演算子
 
  ===========================
    public class MyApp {
      public static void main(String[] args) {
        
        int x = 5;
        // x = x + 12; //よくある処理だが、下記のようなより短い書き方が用意されている
        
        x += 12; //もちろん+以外にも*など他の記号にも使用できる
        System.out.println(x);
      }
    }    
  ===========================

 - 文字列の連結

  ===========================
      public class MyApp {
        public static void main(String[] args) {
          
          String s;
          s = "hello" + "world";
          System.out.println(x);
        }
      }
  =========================== 

-------------------------------------------------

 - データ型の変換
    以下のような他のデータ型への変換を「キャストする」という

  ===========================
  public class MyApp {
    public static void main(String[] args) {
      
      double d = 52343.231;
      // int i = d; //型の違うデータを代入したい場合は以下のように明示的に変換したい型を記載する必要がある
      int i = (int)d;
      
      System.out.println(i); //52343
    }
  }
  =========================== 
  
 - よくある間違い
  
  ===========================
  public class MyApp {
    public static void main(String[] args) {
      
      int i = 10;
      // double d = i / 4; //i / 4が計算された時点ではiは整数型なので整数の10を4で割っても
                        //小数点以下が切り捨てられた2が返り、dに代入されるのは2.0であるため
      //System.out.println(d); //この場合は2.5ではなく2.0が返される
                        
      double d = (double)i /4; //このように2.5を返してほしい場合はiの前に
                               //明示的に変換する型である(double)を記述する必用がある
      System.out.println(d); //2.5
    }
  }
  ===========================   
  
-------------------------------------------------
  
 - ifによる条件分岐
 
 if / else if/ elseによって条件を分岐させて処理させることができる。
 その際に下記のような比較演算子、論理演算子を用いる
 
 比較演算子 =>  > >= < <= == != //より大きい、以上、未満、以下、等しい、等しくない
 論理演算子 =>  && || ! //and , or , not
 
   ===========================
   public class MyApp {
    public static void main(String[] args) {
      
      score = 90;
      if (score > 85) {
        System.out.println("great!");
      } else if (score > 70) {
        System.out.println("good!");
      } else {
        System.out.println("so so...");
      }
      
    }
   }
   ===========================
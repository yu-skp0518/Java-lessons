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

-------------------------------------------------


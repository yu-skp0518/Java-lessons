public class MyApp {

  public static void sayHi(String name) {
    System.out.println("Hi! " + name);
  }

  public static void sayHi() {
    System.out.println("Hi! Nobody!");
  }

  public static void main(String[] args) {
    sayHi("Steve");
    sayHi();
  }

}
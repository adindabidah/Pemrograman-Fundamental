import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    
    for ( int i =0; i < 10; i++) {
      for ( int j = 0; j < 10; j++) {
        System.out.print( " * ");
      }
      System.out.println();
    }
  }
}
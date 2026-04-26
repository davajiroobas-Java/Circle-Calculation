public class Scanner {
  public static void main(StringManipulation[] args){

    System.out.println(" Write your age: ");
    java.util.Scanner scan= new java.util.Scanner(System.in);

    int age=scan.nextInt();

    int month= age * 12;
    int day= age * 365;
    int minute = age * 365 * 24 * 60;

    System.out.println("Age " + age);
    System.out.println("Month " + month);
    System.out.println("Day " + day);
    System.out.println("Minute " + minute);

    scan.close();

  }
}

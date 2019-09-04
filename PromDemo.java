// A promotion surprise!
class PromDemo {
  public static void main(String args[]) {
    byte b;
    int i;

    b = 10;
    i = b * b; // ok, no cast needed

    b = 10;
    i = (byte) (b * b); //cast needed !!!

    System.out.println("i and b: " + i + " " + b);
  }
}
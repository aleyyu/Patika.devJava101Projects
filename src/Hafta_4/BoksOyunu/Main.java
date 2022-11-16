package Hafta_4.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter mark = new Fighter("Mark", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 100, 100, 0);
        Ring ring = new Ring(mark, alex, 90, 100);
        ring.run();
    }



}

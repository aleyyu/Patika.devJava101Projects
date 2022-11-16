package Hafta_4.BoksOyunu;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            System.out.println("MAÇ BAŞLIYOR. Yazı tura atıldı.");
            int prob = Math.round((float) Math.random());

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("===========YENİ ROUND===========");

                if(prob == 0){
                    System.out.println("probability: " + prob + ", " + f2.name + " başlayacak.");
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }
                else if(prob == 1){
                    System.out.println("probability: " + prob + ", " + f1.name + " başlayacak.");
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }
                printScore();
            }
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public void printScore() {

    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        }
        return false;
    }
}

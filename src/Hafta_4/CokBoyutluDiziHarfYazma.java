package Hafta_4;

public class CokBoyutluDiziHarfYazma {

    /*
              j j j j
              0 1 2 3
        i: 0- * * * *      0. indeks dolu
        i: 1- *     *      1 ve 3. indeks
        i: 2- *     *      2 ve 3. indeks
        i: 3- * * * *      3. indeks dolu
        i: 4- *     *      4. ve 3. indeks
        i: 5- *     *      5. ve 3. indeks
        i: 6- * * * *      6. indeks dolu
    */

    public static void main(String[] args) {

        String[][] letter = new String[7][4];

        for(int i = 0; i < letter.length; i++){
            for(int j = 0; j < letter[i].length; j++){
                if(i == 0 || i == (letter.length - 1) || i == ((letter.length - 1) / 2) ){  // i = 0
                    letter[i][j] = " * ";
                }
                else if(j == 0 || j == 3){
                    letter[i][j] = " * ";
                }
                else{
                    letter[i][j] = "   ";
                }
            }
        }

        for(int i = 0; i< letter.length; i++){
            for(int j = 0; j<letter[i].length; j++){
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}

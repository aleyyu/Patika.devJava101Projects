package Hafta_4;

public class DizideTekrarEdenSayilar {

    static boolean exist(int[] arr, int value){
        for(int i:arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 1, 7, 5, 2, 2, 1,};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!exist(duplicate, list[j])){
                        duplicate[startIndex] = list[i];
                        startIndex++;
                    }
                    break;
                }
            }
        }

        for(int value:duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}

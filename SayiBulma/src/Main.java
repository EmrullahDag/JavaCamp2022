public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int toFind = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == toFind) {
                isThere = true;
                break;
            }

        }
            if (isThere) {
            System.out.print("sayı mevcut");


            }else{
                System.out.print("Sayı mevcut değil");


        }


    }
}
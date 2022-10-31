public class Main {
    public static void main(String[] args) {

        int sayi1 = 2100;
        int sayi2 = 20;
        int sayi3 = 252;

        int enBuyuk= sayi1;

        if(enBuyuk<sayi2){
            enBuyuk= sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk= sayi3;
        }
        System.out.println("en büyük sayı:" + enBuyuk);

    }
}
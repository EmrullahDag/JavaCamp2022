public class Main {
    public static void main(String[] args) {

        //double [] myList = new double[4];
        //veya:
        double[] myList = {1.2 , 2.7 , 3.6 , 4.3 , 5.8};
        double total=0;
        double max = myList[0];
        for(double number:myList){
            if(max<number){
                max=number;
            }
            total=total + number;
            System.out.println(number);
            System.out.println("toplam:"+ total);

        } System.out.println("toplam:"+ total);
          System.out.println("En büyük sayı:" + max);
    }
}
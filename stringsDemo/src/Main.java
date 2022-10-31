public class Main {
    public static void main(String[] args) {
        String mesaj= "bugün hava çok güzel";

        System.out.println(mesaj);

        /*System.out.println("eleman sayısı:" + mesaj.length());
        System.out.println("5. Eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));  //concat komutu birleştirmeye yarar.
        System.out.println(mesaj.startsWith("A")); // Bu komut mesajımız A ile başlıyo mu onun sonucunu True/False verir.
        System.out.println(mesaj.endsWith("A")); // üstteki komutun A ile bitiyo mu versiyonu.
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); //mesajdaki karateklerden 0 dan başla 5 e kadar (5 dahil değil) "karakterlere" ata.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("va")); // a karaterinin mesajda kaçıncı eleman olduğunu söyler. İlk bulduğunu verir.
        System.out.println(mesaj.lastIndexOf("e")); // bu da karakterin sondan itibaren kaçıncı eleman olduğunu gösterir.*/

        System.out.println(mesaj.replace(' ', '-')); //mesajdaki boşlukları orta çizgi ile değiştirir.

        System.out.println(mesaj.substring(2,4)); //mesajın ikinci indexinden 4. indexine kadar(4 dahil değil) al demiş oluyoruz.

        for(String kelime : mesaj.split(" ")){  //boşluklardan ayır dizi halinde ver
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //bütün harfleri küçük harfe döndürür.
        System.out.println(mesaj.toUpperCase()); //bütün harfleri büyük harfe döndürür.

        System.out.println(mesaj.trim()); //mesajımızın başındaki ve sonundaki boşlukları alır.

    }
}
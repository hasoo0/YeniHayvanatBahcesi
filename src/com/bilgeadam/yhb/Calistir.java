package com.bilgeadam.yhb;

public class Calistir {

    //public void seslendir(Kopek kopek)
   // {
    //    kopek.sesCikar();
    //}

   // public void seslendir(Kedi kedi)
    //{
    //    kedi.sesCikar();
   // }

    public void seslendir(Hayvan hayvan)
    {
       hayvan.sesCikar();
    }

    public static void main(String[] args) {

        Calistir calistir = new Calistir();

        // Kopek kopek = new Kopek();

        // Polymorphisim
        // Alt class objesini, ust class degiskeniyle olusturma




        Kopek kopek1 = new Kopek();
        kopek1.setNo(1);
        kopek1.setAd("Garip");
        kopek1.setAgirlik(30);
        kopek1.setUzunluk(1.5);

        calistir.seslendir(kopek1);

        Kedi kedi1 = new Kedi();

        kedi1.setNo(2);
        kedi1.setAd("Gariban");
        kedi1.setAgirlik(20);
        kedi1.setUzunluk(1.1);

        calistir.seslendir(kedi1);

        Essek essek1 = new Essek();

        essek1.setNo(2);
        essek1.setAd("Gariban");
        essek1.setAgirlik(20);
        essek1.setUzunluk(1.1);

        calistir.seslendir(essek1);



    }
}

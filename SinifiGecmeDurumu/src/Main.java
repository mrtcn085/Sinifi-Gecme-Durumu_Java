import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;

        //Scanner Sınıfı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

       double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
               if (avarage <=55) {
                   System.out.println("Sınıfta Kaldınız, Dönem Tekrarı");
               }else{
                   System.out.println("Tebrikler Sınıfı Geçtiniz.");

       }
    }
}
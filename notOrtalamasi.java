import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz");
        muzik = input.nextInt();

        int dersler = mat+fizik+kimya+turkce+tarih+muzik;

        double ortalama = dersler/6;

        System.out.println("Not Ortalamanız :" +ortalama);
        String durum= (ortalama >= 60)? "Tebrikler Geçtiniz":"Maalesef Kaldınız";
        System.out.println(durum);


    }
}

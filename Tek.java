package tekbagli;

import java.util.Scanner;

public class Tek {

	public static void main(String[] args) {
		Liste listem = new Liste();
		int m,c,d;
		Scanner sorgu = new Scanner(System.in);
		System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçin");
		System.out.println("0- Çıkış 1- Başa Ekleme 2- Sona Ekleme 3- Araya ekleme 4- Baştan Silme 5- Sondan Silme 6- Aradan Silme 7- Yazdırma");
		m = sorgu.nextInt();
		while (m != 0) {
			switch (m) {
			case 0:
				System.out.println("Çıkışı Seçtiniz!");
				break;
			case 1:
				System.out.println("Eklenecek Sayıyı Seçin!");
				c = sorgu.nextInt();
				listem.basaEkle(c);
				System.out.println("Basa Ekleniyor!");
				break;	
			case 2:
				System.out.println("Sona Eklenecek Sayıyı Seçin!");
				c = sorgu.nextInt();
				listem.sonaEkle(c);
				System.out.println("Sona Ekleniyor!");
				break;
			case 3:
				System.out.println("Araya Eklenecek Sayıyı Seçin (0'dan başlayarak)!");
				System.out.println("ILK EKLENECEK SAYI SONRA SIRASI OLARAK GIRIS YAPINIZ!");
				d = sorgu.nextInt();
				c = sorgu.nextInt();
				listem.araEkle(d, c);
				System.out.println("Araya eklendi!");
				break;
			case 4:
				System.out.println("Baştan Silmeyi Seçtiniz!");
				listem.basSil();
				System.out.println("Bastan Sil!");
				break;
			case 5:
				System.out.println("Sondan Silmeyi Seçtiniz!");
				listem.sonSil();
				System.out.println("Sondan Sil!");
				break;
			case 6:
				System.out.println("Aradan Sayı Silmeyi Seçtiniz!");
				listem.araSil();
				System.out.println("Aradan Sil!");
				break;
			case 7:
				System.out.println("Sona Eklenecek Sayıyı Seçin!");
				c = sorgu.nextInt();
				listem.yazdir();
				System.out.println("Yazdır!");
				break;
			}
		}
	}

}

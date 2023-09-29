package sifre_dogrulama_degistirme_kontrolu;

import java.util.Scanner;

public class sifre_dogrulama_degistirme_kontrolu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Kullanıcı adınızı girin: ");
		String kullaniciadi = scan.nextLine();

		System.out.print("Şifrenizi girin: ");
		String sifre = scan.nextLine();

		// bilgiler doğru

		if (kullaniciadi.equals("aysenursarun") && sifre.equals("aysenur2009")) {
			System.out.println("Giriş başarılı.");

			// kullanıcı adı yanlış

		} else if (!(kullaniciadi.equals("aysenursarun")) && sifre.equals("aysenur2009")) {
			System.out.println("Kullanıcı adı veya şifre yanlış. Tekrar deneyin.");
			
			//tüm bilgiler yanlış
		} else if (!(kullaniciadi.equals("aysenursarun")) && !(sifre.equals("aysenur2009"))) {
			System.out.println("Kullanıcı adı ve şifre yanlış. Tekrar deneyin.");

			// şifre yanlış

		} else if ((kullaniciadi.equals("aysenursarun")) && !(sifre.equals("aysenur2009"))) {
			System.out.println("Hatalı şifre girildi. Şifreniz sıfırlansın istiyorsanız E'ye basın. Giriş ekranına dönmek için G'ye basın.");
			System.out.print("Seçiminiz: ");
			String secim = scan.nextLine();

			// seçime göre yönlendirme

			if (secim.equals("E")) {
				System.out.print("Yeni şifre oluşturun: ");
				String yenisifre = scan.nextLine();

				if (yenisifre.equals("aysenur2009")) {
					System.out.println("Yeni şifre eskisiyle aynı olamaz. Başka bir şifre oluşturun.");
					
					} else {
					System.out.println("Şifre başarıyla değiştirildi.");
				}

			// giriş ekranına yönlendirme

			} else if (secim.equals("G")) {
				System.out.println("Giriş ekranına yönlendiriliyorsunuz.");
				
			//hatalı seçim
				
			} else {
				System.out.print("Hata. Lütfen sadece E ve G seçeneklerinden birini giriniz.");
			}

		}

	}
}

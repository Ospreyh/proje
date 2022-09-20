package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan sayılara
		// arkadaş sayılar denir. en küçük arkadaş sayılar 220 ve 284'tür.

		int number1 = 222;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;

		if (number1 <= 1) {
			System.out.println("Geçersiz sayı girildi.");
			return;
		}
		if (number2 <= 1) {
			System.out.println("Geçersiz sayı girildi.");
			return;
		}

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				total2 = total2 + j;
			}
		}
		if (number1 == total2 && number2 == total1) {
			System.out.println("Arkadaş sayılardır.");
		}
		else {
			System.out.println("Arkadaş sayılar değillerdir.");
		}

	}

}

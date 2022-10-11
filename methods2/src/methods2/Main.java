package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi = toplam(4,6);
		System.out.println(sayi);
		System.out.println(mesajVer());
		int toplam = toplam(1,2,3,4,5,6,7,8,9);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi!");
	}
	
	public static void sil() {
		System.out.println("Silindi!");
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi!");
	}
	
	public static int toplam(int num1,int num2) {
		return num1 + num2;
		
	}
	
	public static int toplam(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
		
	}
	
	public static String mesajVer() {
		return "Hava bugün çok güzel";
		
	}
	
}

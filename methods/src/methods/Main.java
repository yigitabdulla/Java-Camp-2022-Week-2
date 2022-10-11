package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma();

	}
	
	public static void sayiBulma() {
		int[] numbers = new int[] {10,9,8,6,4,3,2};
		int aranacak = 4;
		boolean varMi = false;
		
		for(int i=0;i<7;i++) {
			if(aranacak == numbers[i]) {
				varMi=true;
				mesajYaz("Sayi mevcut");
			}
			
		}
		
		if(varMi==false) {
			mesajYaz("Sayi mevcut degil");
		}
	}
	
	public static void mesajYaz(String mesaj) {
		System.out.println(mesaj);
	}

}

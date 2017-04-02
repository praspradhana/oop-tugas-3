public class kalkulator {
	int z;

	public void tambah(int x, int y){
	z = x + y;
	System.out.println("Hasil :" + z);
	}

	public void kurang(int x, int y){
	z = x - y;
	System.out.println("Hasil :" + z);
	}
}

 class kalkulatormain extends kalkulator {
	
	public void kali(int x, int y){
	z = x * y;
	System.out.println("Hasil :" + z);
	}

	public static void main(String args[]) {
	int a = 20,b =10;
	kalkulatormain cal = new kalkulatormain();	
	cal.tambah (a,b);
	cal.kurang (a,b);
	cal.kali(a,b);
	}
}
public class Mahaswa {
	 public String nama;

		Mahaswa(String nama) {
		this.nama = nama;

	} 
}
class Panggil {
	public static void main (String [] args) {
	Mahaswa mhs  = new Mahaswa("Naon");
	System.out.println(mhs.nama);
	}
}
	
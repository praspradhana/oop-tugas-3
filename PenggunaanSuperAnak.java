public class PenggunaanSuperAnak extends PenggunaanSuper {
	int num = 10;
	public void tampilkan(){
	System.out.println("ini tampilan dari sub kelas");
	}
	public void penggunaanSuper(){
	tampilkan ();
	super.tampilkan();// memanggil method tampilkan dari induk
	System.out.println("Nilai variabel num pada sub kelas" + num);
	System.out.println("Nilai variabel num pada super kelas" + super.num); //menampilkan isi dari class induk 
	
	}
	public static void main (String args[]){
	PenggunaanSuperAnak obj = new PenggunaanSuperAnak();
	obj.penggunaanSuper();
	}
}
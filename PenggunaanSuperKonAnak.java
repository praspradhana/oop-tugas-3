public class PenggunaanSuperKonAnak extends PenggunaanSuperKon{
	public PenggunaanSuperKonAnak(int umur){
	super(umur);
	}
	
	public static void main (String []args){
	PenggunaanSuperKonAnak s = new PenggunaanSuperKonAnak(24);
	s.getAge();
	}
	}
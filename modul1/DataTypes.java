import javax.swing.JOptionPane;

public class  DataTypes{
	public static void main(String [] args){
		String namaDepan = "Ahmad";
		String namaTengah = "Naufal";
		String namaBelakang = "Alfarizi";
		int usia = 19;
		int targetTahunKuliah = 4;
		double ipk = 3.98765432;
		char nilaiAbjad = 'A';
		boolean ganteng = true;
		
		System.out.println("Nama Depan : " + namaDepan);
		System.out.println("Nama Tengah : " + namaTengah);
		System.out.println("Nama Belakang : " + namaBelakang);
		System.out.println("Usia : " + usia);
		System.out.println("Target Tahun Kuliah" + targetTahunKuliah + "Tahun");
		System.out.println("IPK : " + ipk);
		System.out.println("Nilai Praktikum : " + nilaiAbjad);
		System.err.println("Ganteng : " + ganteng);
	
		JOptionPane.showMessageDialog(null, "Hai, "+ namaDepan + namaTengah + namaBelakang);
	}
}
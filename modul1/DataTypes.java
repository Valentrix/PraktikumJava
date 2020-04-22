import javax.swing.JOptionPane;
import java.util.Scanner;

public class  DataTypes{
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String namaDepan = "Ahmad";
		String namaTengah = "Naufal";
		String namaBelakang = "Alfarizi";
		int usia = 19;
		int targetTahunKuliah = 4;
		double ipk = 3.98765432;
		char nilaiAbjad = 'A';
		boolean ganteng = true;
		
		System.out.print("Input Nama Depan : ");
		namaDepan = scanner.nextLine();
		
		namaBelakang = JOptionPane.showInputDialog(“Nama Belakang : “);
		
		System.out.print("input Usia : ");
		usia = scanner.nextint();
		
		System.out.print("Input IPK : ");
		ipk = scanner.nextDouble();
		
		System.out.print("");
		
		System.out.print("Input Nilai Abjad : ");
		nilaiAbjad = scanner.next().charAt(0);
		
		System.out.print("Ganteng ? : ");
		ganteng = scanner.nextBoolean();
		
		System.out.println("============OUTPUT============");
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
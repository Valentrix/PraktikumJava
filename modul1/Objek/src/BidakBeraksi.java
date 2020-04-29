public class BidakBeraksi {
    public static void main(String[] args) {
        Bidak pionHitam = new Bidak();

        pionHitam.bentuk= "Pion";
        pionHitam.warna = "Hitam";

        System.out.println("Bentuk : " + pionHitam.bentuk);
        System.out.println("Warna : " + pionHitam.warna);

        pionHitam.caraJalan();
    }
}

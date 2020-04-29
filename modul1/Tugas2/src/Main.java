public class Main {
    public static void main(String[] args) {

        //instance
        Shooter player1 = new Shooter();
        Shooter player2 = new Shooter();

        player1.nama = "Naufal";
        player1.jumlahKill = 0;
        player1.winner = true;

        player2.nama = "Arslan";

        System.out.println("Nama Player : " + player1.nama);
        for (int i=1 ; i>=1 ; i--) {
            player1.killOtherPlayer(player2);
            System.out.println("Naufal mengalahkan " + player2.nama);
            int k = i - 1;
            if (k == 0) {
                System.out.println(player1.nama +" Menang");
            }else{
                System.out.println("Satu Pemain terbunuh, Tersisa : " + k);
            }
        }
        System.out.println("Jumlah Kill Yang Berhasil DiDapat : " + player1.jumlahKill);
    }
}
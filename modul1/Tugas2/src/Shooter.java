public class Shooter {
        //atribute
        String nama;
        int jumlahKill;
        boolean winner;

        //behavior
        void killOtherPlayer(Shooter shooter){
            jumlahKill += 1;
        }
}
public class Worm {
    //atribute
    String uerName;
    int score;
    double length;

    //behavior
    void eatSnack(){
        System.out.println("Nom...nom...nom...");
    }
    void eatOthers(Worm worm){
        score += 500;
    }
}

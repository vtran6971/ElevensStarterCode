package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args) {


    //Creation of cards
    Card heartTen = new Card("ten", "heart", 10);
    Card clubSix = new Card("six", "club", 6);
    Card spadeAce = new Card("ace", "spade", 1);

    System.out.println("rank is "+heartTen.rank()+ "suit is " +heartTen.suit()+ "point value is "+ heartTen.pointValue() );
        System.out.println("rank is " + "suit is " + "point value is " );
        System.out.println("rank is " + "suit is " + "point value is " );

}
}

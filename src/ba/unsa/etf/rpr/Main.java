package ba.unsa.etf.rpr;

public class Main {

     public static boolean daLiJeIspravnaPozicija(String s) {
         String s1 = ("ABCDEFGH");
         String s2 = ("12345678");
         if(s.length() != 2) return false;
         else if(!(s1.indexOf(s.charAt(0)) >=  0 || s1.indexOf(s.charAt(0) - 32) >=  0)) return false;
         else if(!(s2.indexOf(s.charAt(1)) >= 0 || s2.indexOf(s.charAt(1) - 32) >= 0)) return false;
         return true;
     }
     public static void main(String[] args) {
        King kralj = new King("H3", ChessPiece.Color.WHITE);
        Queen kraljica = new Queen("D4", ChessPiece.Color.BLACK);
        try {
            kraljica.move("D4");
           // kralj.move("h4");
        } catch (IllegalChessMoveException izuzetak) {
            System.out.print("Bacen je izuzetak");
        }
        System.out.print(kralj.getPosition() + " " + kraljica.getPosition());
    }
}

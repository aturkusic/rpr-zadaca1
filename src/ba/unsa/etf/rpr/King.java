package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.Program.daLiJeIspravnaPozicija;
import static java.lang.Math.abs;

public class King extends ChessPiece{

    public King(String poz, Color col) { super(poz, col); }

    @Override
    public void move(String position) throws IllegalChessMoveException {
        String tmp = position.toUpperCase();
        String pozTmp = pozicija.toUpperCase();
        if(!daLiJeIspravnaPozicija(position)) throw new IllegalArgumentException("Nepostojeca pozicija");
        else if(tmp.equals(pozTmp)) throw new IllegalChessMoveException("Niste nista pomjerili");
        else if(abs(pozTmp.charAt(0) - tmp.charAt(0)) > 1 || abs(pozTmp.charAt(1) - tmp.charAt(1)) > 1) throw new IllegalChessMoveException("Kralj se ne moze tu pomjeriti");
        pozicija = position;
    }
    public Object dajKopiju(){
        return new King(pozicija,boja);
    }
}

package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.Program.daLiJeIspravnaPozicija;
import static java.lang.Math.abs;

public class Bishop extends ChessPiece {
    public Bishop(String poz, Color col) { super(poz, col); }

    @Override
    public void move(String position) throws IllegalChessMoveException {
        String tmp = position.toUpperCase();
        String pozTmp = pozicija.toUpperCase();
        if(!daLiJeIspravnaPozicija(position)) throw new IllegalArgumentException("Nepostojeca pozicija");
        if((abs(pozTmp.charAt(0) - tmp.charAt(0)) != abs(pozTmp.charAt(1) - tmp.charAt(1)))) throw new IllegalChessMoveException("Lovac ne moze na tu poziciju");
        else if(tmp.equals(pozTmp)) throw new IllegalChessMoveException("Niste nista pomjerili");
        pozicija = position;
    }
    public Object dajKopiju(){
        return new Bishop(pozicija,boja);
    }
}

package adapter;

import adapter.exits_system.RoundHole;
import adapter.exits_system.RoundPeg;

public class App {
    public static void main(String[] args) {
        // Vong tron
        RoundHole roundHole = new RoundHole(5);

        // 2 round peg
        RoundPeg roundPeg1 = new RoundPeg(4);
        RoundPeg roundPeg2 = new RoundPeg(6);

        // Kiem tra xem cai nao se lot dc vao vong tron?
        System.out.println("Kiem tra round peg1:");
        System.out.println(roundHole.fits(roundPeg1));

        System.out.println("Kiem tra round peg2:");
        System.out.println(roundHole.fits(roundPeg2));

        // Kiem tra Square Peg
        SquarePeg squarePeg = new SquarePeg(5);
//        roundHole.fits(squarePeg);
        System.out.println("Kiem tra xem co lot khong ?");
        System.out.println(roundHole.fits(new SquarePegAdapter(squarePeg)));

    }
}

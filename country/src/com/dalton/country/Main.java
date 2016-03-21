package com.dalton.country;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dalton Lima - on 3/15/16.
 */
public class Main {
    public static void main(String[] args) {
        Country bra = new Country("Brazil", "Brasilia", 8514877);
        Country bra2 = new Country("Brazil", "Brasilia", 500);  // two "Brazil's" for testing purposes
        Country bra3 = new Country("Brazil", "HUE HUE", 1000);

        Country arg = new Country("Argentina", "Buenos Aires", 2766890);
        Country bol = new Country("Bolivia", "Bogota", 1098580);
        Country chi = new Country("Chile", "Santiago", 756950);
        Country col = new Country("Colombia", "Bogota", 1141748);
        Country ecu = new Country("Ecuador", "Quito", 283560);
        Country fal = new Country("Falkland Islands", "Stanley", 12173);
        Country frg = new Country("French Guiana", "Cayenne", 91000);
        Country guy = new Country("Guyana", "Georgetown", 214999);
        Country par = new Country("Paraguay", "Asuncion", 406752);
        Country per = new Country("Peru", "Lima", 1285220);
        Country sge = new Country("South Georgia", "King Edward Point", 3093);
        Country sur = new Country("Suriname", "Paramaribo", 163270);
        Country uru = new Country("Uruguay", "Montevideo", 176215);
        Country ven = new Country("Venezuela", "Caracas", 916445);

        //outputting data from a Country and comparing for equals Countries.
        System.out.println("Name: " + bra.getName() + " - Capital: " + bra.getCapital() + " - Area: " + bra.getArea());
        System.out.println (bra.equals(bra2) );   // br == br2  (true)
        System.out.println (bra.equals(bra3) );   // BR != br3  (false)

        //Brazil borders with: Suriname, Guyana, Venezuela, Colombia, Peru, Bolivia, Paraguay, Argentina, Uruguay
        bra.borders.addAll(Arrays.asList(sur, guy, ven, col, per, bol, par, arg, uru) );

        //Argentina borders with: Chile, Paraguay, Brazil, Bolivia, Uruguay
        arg.borders.addAll(Arrays.asList(chi, par, bra, bol, uru) );

        //Bolivia Borders with: Brazil, Paraguay, Argentina, Chile, Peru;
        bol.borders.addAll(Arrays.asList(bra, par, arg, chi, per ) );

        //Chile borders with: Peru, Bolivia, Argentina
        chi.borders.addAll(Arrays.asList(per, bol, arg));

        //Colombia borders with: Venezuela, Brazil, Ecuador, Peru
        col.borders.addAll(Arrays.asList(ven, bra, ecu, per));

        //Ecuador borders with: Colombia, Peru
        ecu.borders.addAll(Arrays.asList(col, per));

        //Falkland Islands borders with: NONE - it's an island =)
        fal.borders = null;

        //French Guiana borders with: Brazil, Suriname
        frg.borders.addAll(Arrays.asList(bra, sur));

        //Guyana borders with: Brazil, Venezuela
        guy.borders.addAll(Arrays.asList(bra, ven));

        //Paraguay borders with: Argentina, Brazil, Bolivia
        par.borders.addAll(Arrays.asList(arg, bra, bol) );

        //Peru borders with: Ecuador, Colombia, Brazil, Bolivia, Chile
        per.borders.addAll(Arrays.asList(ecu, col, bra, bol, chi));

        //South Georgia borders with NONE - another Island
        sge.borders = null;

        //Suriname borders with: French Guiana, Guyana, Brazil
        sur.borders.addAll(Arrays.asList(frg, guy, bra));

        //Uruguay borders with: Argentina, Brazil
        uru.borders.addAll(Arrays.asList(arg, bra) );

        //Venezuela  borders with: Colombia, Brazil, Guyana
        ven.borders.addAll(Arrays.asList(col, bra, guy));

        // Displaying borders
        System.out.println(bra.getName() + " borders with: " + bra.getBorders() );
        System.out.println(arg.getName() + " borders with: " + arg.getBorders() );
        System.out.println(bol.getName() + " borders with: " + bol.getBorders() );

        System.out.print("Common borders between Brazil and Argentina: ");
        System.out.println(arrayListToString(bra.commonBorders(arg)) );

        System.out.print("Common borders between Brazil and Suriname: ");
        System.out.println(arrayListToString(bra.commonBorders(sur)) );

        System.out.print("Common borders between Brazil and Brazil: ");
        System.out.println(arrayListToString(bra.commonBorders(bra)) );

    }

    // this method converts an ArrayList<Country> in a serialized String
    private static String arrayListToString(ArrayList<Country> _array) {
        StringBuilder output = new StringBuilder();

        if ( _array == null ) return ("vazio");

        for (Country temp : _array) {
            output.append(" - ");
            output.append(temp.getName());
        }
        return output.toString();
    }
}

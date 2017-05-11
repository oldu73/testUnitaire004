package main.java.com.company;

/**
 * Created by OLDU on 11/05/2017.
 */
public class Operations {

    public static long add(final long... numbers) {
        long result = 0;
        for(final long number: numbers) result += number;
        return result;
    }

    public static long diviser(final long...pNombres) {
        if(pNombres.length < 2) {
            throw new IllegalArgumentException(
                    "Il faut au moins deux nombres en entrée");
        }
        long lRetour = pNombres[0];
        for(int i=1;i<pNombres.length;i++) {
            lRetour /= pNombres[i];
        }
        return lRetour;
    }

}

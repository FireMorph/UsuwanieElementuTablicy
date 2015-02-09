/**
 * Created by Mac on 09.02.15.
 * Time: 21:26
 */
public class Glowna {

    public static void main(String[] args) {
        int[] tablica = {1, 3, 5, 7, 9, 11};

        for (int x : tablica)
            System.out.print(x + " ");

        new Glowna().metoda(tablica);

        for (int x : tablica)
            System.out.print(x + " ");
    }

    public int[] metoda(int[] tab) {
        int[] temp = new int[tab.length];
        int i = 0;

        for (int x : tab)
            temp[i++] = x;

        return temp;

    }
}
/**
 * Created by Mac on 09.02.15.
 * Time: 21:26
 */
// Lepiej to rozbic na dwie metody z ktorych jedna tylko wyszukuje element, a druga usuwa podany indeks w podanej tablicy

public class Glowna {

    public static void main(String[] args) {
        int[] tablica = {1, 3, 5, 7, 9, 11};
        int element = 5;

        for (int x : tablica)
            System.out.print(x + " ");
        System.out.println("\nRozmiar tablicy: " + tablica.length);

        tablica = new Glowna().metoda(tablica, element);

        for (int x : tablica)
            System.out.print(x + " ");
        System.out.println("\nRozmiar tablicy po wywolaniu metody: " + tablica.length);
    }

    public int[] metoda(int[] tab, int szukana) {
        int[] temp = new int[tab.length];
        int indeks;
        int q = 0;

        for (int x : tab)
            temp[q++] = x;

        for (int i = 0; i < tab.length; i++)
            if (tab[i] == szukana) {
                indeks = i;
                System.out.println("Indeks elementu szukanego: [" + indeks + "]");
                q = 0;

                temp = new int[tab.length - 1];
                while (q < indeks) {
                    temp[q] = tab[q];
                    q++;
                }

                while (q < temp.length) {
                    temp[q] = tab[q + 1];
                    q++;
                }
                return temp;
            }
        return tab;
    }
}
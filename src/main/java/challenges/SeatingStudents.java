package challenges;

import java.util.Arrays;

/*
Zadanie z testu programistycznego w ramach rekrutacji
Zadanie pochodzi z CoderByte.

Dane: tablica liczb. Pierwsza liczba (zawsze parzysta) określa ilość ławek w klasie.
Kolejne liczby to zajęte miejsca
Lawki ustawione są w 2 kolumnach i numerowane od przodu od lewej.

Należy wyznaczyć ilość możliwych rozsadzeń dla 2 nowych studentów w taki sposób aby mogli oni usiąść obok siebie lub
tuż za sobą.

Przykład: [12, 2, 6, 7, 11]
odp: 6
 */
public class SeatingStudents {

    public static int seatCombinations(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr[0] < 0) {
            return 0;
        }
        if (arr.length > 1) {
            Arrays.sort(arr, 1, arr.length);
        }

        int count = 0;
        for (int seat = 1; seat <= arr[0]; seat++) {
            if (seat%2 == 1) {
                if (arrContains(arr, seat)) {
                    continue;
                }
                if (!arrContains(arr, seat+1)) {
                    count++;
                }
                if (arr[0] - seat > 2) {
                    if (!arrContains(arr, seat+2)) {
                        count++;
                    }
                }
            } else {
                if (arrContains(arr, seat)) {
                    continue;
                }
                if (arr[0] - seat > 1) {
                    if (!arrContains(arr, seat+2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean arrContains(int[] arr, int searched) {
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] == searched) {
                return true;
            }
        }
        return false;
    }
}

package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> notaMusicas = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        int nota = 0;
        int op = 0;
        while (op != 0) {
            System.out.printf("Nota da musica: ");
            nota = input.nextInt();
            notaMusicas.add(nota);
            System.out.print("Adicionar? (1-SIM / 2-NAO): ");
            op = input.nextInt();
        }

        for (int i = 0; i < notaMusicas.size(); i++) {
            if (notaMusicas(i) > notaMusicas(i)) {
                if (i % 2 == 0) {
                    result.add(i, nota);
                }
            } else {
                if (i % 2 == 1) {
                    result.add(i, nota);
                }
            }

        }

        for (Integer maioresNotas : result) {
            System.out.print(maioresNotas);
        }

        input.close();
    }
}

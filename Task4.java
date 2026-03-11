import java.util.*;

class Visitor {
    String name;
    int money;

    Visitor(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

public class Task4 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            String[] names = sc.nextLine().split(", ");
            String[] moneyInput = sc.nextLine().split(", ");

            Queue<Visitor> queue = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                if (names[i].equals("Jeff")) continue;

                int money = Integer.parseInt(moneyInput[i]);
                queue.add(new Visitor(names[i], money));
            }

            Queue<Visitor> result = new LinkedList<>();

            while (!queue.isEmpty()) {

                int size = queue.size();
                Visitor richest = null;

                for (int i = 0; i < size; i++) {

                    Visitor v = queue.remove();

                    if (richest == null || v.money > richest.money) {
                        if (richest != null) queue.add(richest);
                        richest = v;
                    } else {
                        queue.add(v);
                    }
                }

                result.add(richest);
            }

            Queue<Visitor> finalQueue = new LinkedList<>();
            Visitor ellie = null;

            while (!result.isEmpty()) {
                Visitor v = result.remove();

                if (v.name.equals("Ellie")) {
                    ellie = v;
                } else {
                    finalQueue.add(v);
                }
            }

            if (ellie != null) {
                finalQueue.add(ellie);
            }

            System.out.print("[");
            while (!finalQueue.isEmpty()) {
                Visitor v = finalQueue.remove();
                System.out.print(v.name);
                if (!finalQueue.isEmpty()) System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
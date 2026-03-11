import java.util.*;

class Mail {
    String name;
    int priority;
    int remain;

    Mail(String name, int duration, int priority) {
        this.name = name;
        this.priority = priority;
        this.remain = duration;
    }
}

public class Task1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;

            int n = sc.nextInt();

            List<Mail> inputList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                inputList.add(new Mail(
                        sc.next(),
                        sc.nextInt(),
                        sc.nextInt()
                ));
            }

            int smallest = Integer.MAX_VALUE;
            for (Mail m : inputList) {
                if (m.priority < smallest) {
                    smallest = m.priority;
                }
            }

            List<Mail> waiting = new ArrayList<>();
            Queue<Mail> queue = new ArrayDeque<>();
            List<Mail> sent = new ArrayList<>();

            for (Mail m : inputList) {
                if (m.priority == smallest) {
                    queue.add(m);
                } else {
                    waiting.add(m);
                }
            }

            int time = 1;

            while (sent.size() < n) {

                printState(time, waiting, queue, sent);

                int size = queue.size();
                boolean finishedSomething = false;

                for (int i = 0; i < size; i++) {

                    Mail current = queue.remove();
                    current.remain--;

                    if (current.remain == 0) {
                        sent.add(current);
                        finishedSomething = true;
                    } else {
                        queue.add(current);
                    }
                }

                if (finishedSomething && !waiting.isEmpty()) {
                    for (Mail m : waiting) {
                        queue.add(m);
                    }
                    waiting.clear();
                }

                time++;
            }

            printState(time, waiting, queue, sent);
        }
    }

    static void printState(int t, List<Mail> waiting, Queue<Mail> queue, List<Mail> sent) {

        System.out.print(t + " ");

        for (Mail m : waiting) {
            System.out.print(m.name + " ");
        }

        System.out.print("| ");

        List<Mail> q = new ArrayList<>(queue);
        q.sort(Comparator.comparing(a -> a.name));

        for (Mail m : q) {
            System.out.print(m.name + " ");
        }

        System.out.print("| ");

        List<Mail> s = new ArrayList<>(sent);
        s.sort(Comparator.comparing(a -> a.name));

        for (Mail m : s) {
            System.out.print(m.name + " ");
        }

        System.out.println();
    }
}
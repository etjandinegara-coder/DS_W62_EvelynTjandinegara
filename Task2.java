import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                
                int n = sc.nextInt();
                
                if (n < 1 || n > 1000) {
                    continue;
                }
                
                Stack<Integer> stack = new Stack<>();
                Queue<Integer> queue = new ArrayDeque<>();
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                
                boolean isStack = true;
                boolean isQueue = true;
                boolean isPQ = true;
                
                for (int i = 0; i < n; i++) {
                    
                    int type = sc.nextInt();
                    int x = sc.nextInt();
                    
                    if (type == 1) {
                        // add
                        stack.push(x);
                        queue.add(x);
                        pq.add(x);
                        
                    } else if (type == 2) {
                        
                        if (isStack) {
                            if (stack.isEmpty() || stack.pop() != x)
                                isStack = false;
                        }
                        
                        if (isQueue) {
                            if (queue.isEmpty() || queue.remove() != x)
                                isQueue = false;
                        }
                        
                        if (isPQ) {
                            if (pq.isEmpty() || pq.poll() != x)
                                isPQ = false;
                        }
                    }
                }
                
                int count = 0;
                if (isStack) count++;
                if (isQueue) count++;
                if (isPQ) count++;
                
                if (count == 0) {
                    System.out.println("tidak ada");
                }
                else if (count > 1) {
                    System.out.println("tidak yakin");
                }
                else {
                    if (isStack) {
                        System.out.println("stack");
                    }
                    else if (isQueue) {
                        System.out.println("queue");
                    }
                    else {
                        System.out.println("priority queue");
                    }
                }
            }
        }
    }
}

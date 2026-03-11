import java.util.*;

class Student {
    String name;
    int chance;

    Student(String name, int chance) {
        this.name = name;
        this.chance = chance;
    }
}

public class Task3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int line = sc.nextInt();
            sc.nextLine();
            
            
            String[] names = sc.nextLine().split(" ");
            String[] chancesInput = sc.nextLine().split(" ");
            
            Queue<Student> queue = new ArrayDeque<>();
            
            for (int i = 0; i < line; i++) {
                
                String name = names[i];
                
                if (!name.matches("[a-zA-Z]+")) {
                    System.out.println("Invalid name");
                    return;
                }
                
                int chance = Integer.parseInt(chancesInput[i]);
                
                if (chance < 1 || chance > 10) {
                    System.out.println("Chance must be between 1 and 10");
                    return;
                }
                
                queue.add(new Student(name, chance));
            }
            
            while (!queue.isEmpty()) {
                
                Student current = queue.remove();
                current.chance--;
                
                if (current.chance > 0) {
                    System.out.println(current.name + "|Try Again|" + current.chance);
                    queue.add(current);
                } else {
                    System.out.println(current.name + "|Get Out|0");
                }
            }
        }
    }
}
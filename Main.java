import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> student = new HashMap<>();
    static ArrayList<Integer> marks = new ArrayList<>();

    public static void add() {
        System.out.println("Please enter a Roll no to add:");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter a name to add:");
        String name = sc.nextLine();
        student.put(rollno, name);
        System.out.println("Successfully Added");
    }

    public static void update() {
        System.out.println("Please enter a Roll no to update:");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the new name:");
        String name = sc.nextLine();
        student.put(rollno, name);
        System.out.println("Successfully Updated");
    }

    public static void delete() {
        System.out.println("Please enter a Roll no to delete:");
        int rollno = sc.nextInt();
        student.remove(rollno);
        System.out.println("Successfully Removed");
    }

    public static void search() {
        System.out.println("Please enter a Roll no to search:");
        int rollno = sc.nextInt();
        if (student.containsKey(rollno)) {
            System.out.println("Name: " + student.get(rollno));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void list() {
        Set<String> sortname = new TreeSet<>(student.values());
        System.out.println("Sorted Names: " + sortname);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. List All Names (Sorted)");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: add(); break;
                case 2: update(); break;
                case 3: delete(); break;
                case 4: search(); break;
                case 5: list(); break;
                case 6: System.out.println("Thank you!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}

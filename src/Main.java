import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Group group = new Group("com18");

    public static void main(String[] h) {
        boolean c = true;
        while (c){
            String command = s.nextLine();
            switch (command) {
                case "exit":
                    c = false;
                    System.out.println("bye");
                    break;
                case "add":
                    addMember();
                    break;
                case "gus":
                    getUsers();
                    break;
                case "kik":
                    kikUser();
                    break;
                default:
                    System.out.println("command not found");
            }
        }
    }

    public static void addMember(){

        System.out.print("name: ");
        String name = s.nextLine();
        System.out.print("id: ");
        int id = Integer.parseInt(s.nextLine());
        Student student = new Student(id, name);
        group.addToGroup(student);
        System.out.println("New student added: " + student);

    }

    static public void getUsers(){
        for (String s: group.getMembersNames()) {
            System.out.println(s + ",");
        }
        if(group.getMembersNames().size() == 0){
            System.out.println("no members");
        }
    }

    static public void kikUser(){
        System.out.print("Choose user: ");
        for (Student s: group.getMembers()) {
            System.out.printf("%d: %s \n", s.getId(), s.getName());
        }
        int id = Integer.parseInt(s.nextLine());
        Student s = group.deleteStudent(id);
        if(s == null){
            System.out.println("student not found");
        }else{
            System.out.println("student deleted");
        }
    }
}
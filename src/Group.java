import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> members;

    public Group(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public void addToGroup(Student s){
        this.members.add(s);
    }

    public ArrayList<String> getMembersNames(){
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < members.size(); i++){
            Student s = members.get(i);
            result.add(s.getName());
        }

        return result;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public Student deleteStudent(int id){
        for (Student s: members) {
            if(id == s.getId()){
                members.remove(s);
                return s;
            }
        }
        return null;
    }

    public Student findStudentByName(String name){

        for(int i = 0; i < members.size(); i++){
            Student s = members.get(i);
            if (s.getName() == name) {
                return s;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}

package vo;

public class Student {
    private int id;
    private String name;
    public Student(int a,String b){
        id = a;
        name = b;
    }
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}

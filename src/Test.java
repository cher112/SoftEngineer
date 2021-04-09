import vo.Student;
import tools.csvstreamTest;
public class Test{
    public static void main(String[] args){
        Student a = new Student(1,"chen zhi");
        //csvstreamTest.write("test.csv", new String[]{"4","YAGHO"});
        //csvstreamTest.read("test.csv");
        Student[] stu = csvstreamTest.search("test.csv","1",2,0);
        for(int i = 0;i < stu.length; i++){
            System.out.println(stu[i].getName());
        }
        //csvstreamTest.create("chenzhi");
    }
}
/*Read student Object details into file "StudentData.txt" */
import java.io.*;

class Student{
    String name;
    int percentage;
    public Student(int p, String n){
        name = n;
        percentage = p;
    }
    public String toString(){
        return "Name : " + name + "Percentage : " + percentage;
    }
}
class ObjectIoTest{
    public static void main(String[] args) {
        ObjectInputStream os = null;
        Student s1 = new Student(90,"Student1");
        try{
            os = new ObjectOutputStream(new FileInputStream("StudentData.txt"));
                System.out.println();
        }catch(Exception e){

        }finally{
            try{
                os.close();
            }catch(Exception e){}
        }
    }
}

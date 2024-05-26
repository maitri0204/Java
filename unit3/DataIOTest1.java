/*DataInputStream for writing primitive tyoes to the file 
 * wap to read primitive types from the file "DataIO.txt"
*/
import java.io.*;

/*Serializable is a markup(empty) interface */
class DataIOTest1{
    public static void main(String[] args) {
        DataInputStream din = null;
        int id = 25;
        String name = "Emp1";
        try{
            // FileInputStream fs = new FileInputStream("DataIO.txt");
            // do = new DataOutputStream(fs);
            din = new DataInputStream(new FileInputStream("DataIO.txt"));
            System.out.println("ID : " + din.readInt());
            System.out.println("Name : " + din.readUTF());
            System.out.println("Reading Complete!!");
        }catch(IOException e){
            System.out.println("File Handling Error!!!");
        }
    }
}
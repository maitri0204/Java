/*DataOutputStream for writing primitive tyoes to the file 
 * wap to store primitive types to the file "DataIO.txt"
*/
import java.io.*;

class DataIOTest{
    public static void main(String[] args) {
        DataOutputStream dos = null;
        int id = 25;
        String name = "Emp1";
        try{
            // FileOutputStream fs = new FileOutputStream("DataIO.txt");
            // do = new DataOutputStream(fs);
            dos = new DataOutputStream(new FileOutputStream("DataIo.txt"));
            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeInt(++id);
            dos.writeUTF("EMP2");
            dos.writeInt(++id);
            dos.writeUTF("EMP3");
            System.out.println("Writing Complete!!");
        }catch(IOException e){
            System.out.println("File Handling Error!!!");
        }
    }
}

import java.io.*;
class FileTest{
    public static void main(String[] args) {
        FileInputStream fs = null;

        try{
            fs = new FileInputStream("File.java");
            while(fs.available() > 0){
                System.out.println((char)fs.read());
            }
        }
        catch(IOException e){
            System.out.println("File not available for reading!!!");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            fs.close();
        }
    }
}
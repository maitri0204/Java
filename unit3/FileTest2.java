import java.io.*;
class FileTest{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fs = null;
        FileInputStream fo = null;

        try{
            fs = new FileInputStream("File.java");
            fo =new FileInputStream("File2.java");
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
            fo.close();
        }
    }
}
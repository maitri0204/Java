import java.io.*;
class Lowercase{
    public static void main(String[] args) throws Exception{
        BufferedReader rb = null;
        BufferedWriter rw = null;

        try{
            rb = new BufferedReader(new FileReader("Text1.txt"));
            rw = new BufferedWriter(new FileWriter("Text2.txt"));
            String name = rb.readLine();
            while(name != null){
                rw.write(name.toLowerCase());
                rw.write("\n");
                name = rb.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            rb.close();
            rw.close();
        }
    }
}
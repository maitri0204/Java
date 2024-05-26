import java.io.*;

class code4{
    public static void main(String[] args) throws Exception{
        BufferedReader rb = null;
        BufferedWriter rw = null;

        try{
            rb = new BufferedReader(new FileReader("Text1.txt"));
            rw = new BufferedWriter(new FileWriter("Text2.txt"));
            String name = rb.readLine();
            while(name != null){
                name = name.replaceAll("Myself","I");
                rw.write(name);
                rw.write("\n");
                name = rb.readLine();
                System.out.println("Words Replaced:" + "Text2.txt");
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

import java.io.*;
import java.util.*;
class code5{
    public static void main(String[] args) throws Exception{
        BufferedReader rb = null;
        BufferedWriter rw = null;

        try{
            rb = new BufferedReader(new FileReader("Text1.txt"));
            rw = new BufferedWriter(new FileWriter("Text2.txt"));
            Set<String> unique = new LinkedHashSet<String>();
            String name = rb.readLine();
            while(name != null){
                if(unique.add(name)){
                    rw.write(name);
                    rw.write("\n");
                    name = rb.readLine();
                }
                else{
                    name = rb.readLine();
                }
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

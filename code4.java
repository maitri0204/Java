import javax.swing.plaf.synth.SynthTextAreaUI;

public class code4 {
    public static void main(String[]args){
        String name1 = "java Programming";
        String name2 = "java Programming";
        String name3 = new String("java Programming");
        
        if(name1 == name2)
            System.out.println(name1 + "\t" + name2 + " equal");
        if(name1 == name3)
            System.out.println(name1 + "\t" + name3 + " equal");
        else    
            System.out.println(name1 + "\t" + name3 + " not equal");
        if(name1.equals(name3))
            System.out.println(name1 + "\t" + name3 + " equal");
    }
}

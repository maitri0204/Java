import java.nio.file.attribute.FileOwnerAttributeView;

import javax.naming.NameAlreadyBoundException;

public class code3 {
    public static void main(String[]args){
        String name1 = "Java Programming";
 
        String name2 = name1.concat(" is easy!!");
        System.out.println(name2);
        int len = name1.length();

        char firstChar = name1.charAt(0);
        boolean isUpper = Character.isUpperCase(firstChar);

        if(isUpper)
            System.out.println(name1 + "starts with capital letter");
        else    
            System.out.println(name1 + "does not start with capital letter");

        System.out.println("Length of:" + name1 + " is : " + len);
        String upperName = name1.toUpperCase();
        System.out.println(upperName + "\t" + name1.toLowerCase());
    }
}

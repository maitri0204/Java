public class ConsonantsVowels {
    public static void main(String[] args){
        String line = "My name is Maitri Patel";
        int vowels = 0;
        int consonants = 0;

        line = line.toLowerCase();
        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels = vowels + 1;
            }
            else
            {
                consonants = consonants + 1;
            }
        }

        System.out.println("Vowels is:" + vowels);
        System.out.println("Consonants is:" + consonants);
    }
}

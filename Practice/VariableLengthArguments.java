import javax.naming.ldap.ManageReferralControl;

class VariableLengthArguments{
    public static int addNumber(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = addNumber(1,2,3,4,5);
        System.out.println("Sum: " + sum);
    }
}

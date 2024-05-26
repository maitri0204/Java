public class code3 {
    public static void main(String[] args){
        int arr[] = new int[]{95,96,88,91,98,90};
        int sum = 0;
        for(int i=0;i<6;i++){
            sum = sum + arr[i];
        }
        System.out.println("Percentage is:" + (sum/6));
    }
}

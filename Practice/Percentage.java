import java.util.*;
class PercentM
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
double totalMarks = 0.0;
double percentage = 0.0;
for (int i = 1; i <= 6; i++)
{
System.out.printf("Enter marks of subject %d: ", i);
double marks = scan.nextDouble();
totalMarks += marks;
}
percentage = (totalMarks / 600.0) * 100.0;
System.out.printf("Percentage marks: %.2f%%", percentage);
}
}
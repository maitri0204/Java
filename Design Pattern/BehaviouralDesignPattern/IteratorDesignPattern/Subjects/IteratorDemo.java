package BehaviouralDesignPattern.IteratorDesignPattern.Subjects;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for(Iterator iter = repository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }   
}

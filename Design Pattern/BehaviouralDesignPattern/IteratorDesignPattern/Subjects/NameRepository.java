package BehaviouralDesignPattern.IteratorDesignPattern.Subjects;

public class NameRepository implements Container {

    public String names[] = {"Maths", "Physics", "Histroy", "Chemistry"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
    
}

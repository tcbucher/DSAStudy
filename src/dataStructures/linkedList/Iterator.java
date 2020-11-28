package dataStructures.linkedList;

public interface Iterator<T>
{
    public boolean hasNext();
    public T getNext();
    public int size();
    public void reset();
}

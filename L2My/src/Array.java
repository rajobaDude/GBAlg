public interface Array {
    boolean add(int value);

    boolean remove(int value);

    boolean removeByIndex(int index);

    boolean find(int value);

    boolean isEmpty();

    boolean isFull();

    void display();


    int getMaxSize();

    void setData(int[] data);
    int[] getData();

    int getSize();

    int get(int index);
}

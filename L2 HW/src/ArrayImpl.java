import java.util.Arrays;

public class ArrayImpl implements Array {

    private int[] data;
    private int size;

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    public ArrayImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    @Override
    public int getMaxSize(){
        return this.data.length;
    }

    @Override
    public boolean add(int value) {
        if(isFull()) return false;

        this.data[size++] = value;

        return true;
    }

    @Override
    public boolean remove(int value) {
        for (int i = 0; i < size; i++) {
            if(data[i] == value)
                return removeByIndex(i);
        }
        return false;
    }

    @Override
    public boolean removeByIndex(int index) {
        if(index < 0 || index >= size) return false;

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return true;
    }

    @Override
    public boolean find(int value) {
        for (int i = 0; i < size; i++) {
            if(data[i] == value) return true;
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return this.data.length == size;
    }

    @Override
    public void display() {
        for (int i : data) {
            System.out.println(i);
        }
    }

}

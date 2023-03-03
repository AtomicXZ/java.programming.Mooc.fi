public class List<T> {
    private T[] objects;
    private int pointer;

    public List() {
        this.objects = (T[]) new Object[10];
        this.pointer = 0;
    }

    public void add(T value) {
        if (pointer == this.objects.length) this.grow();
        this.objects[pointer] = value;
        this.pointer++;
    }

    private void grow() {
        T[] objects = (T[]) new Object[this.objects.length + this.objects.length/2];

        for (int i = 0; i < this.objects.length; i++) {
            objects[i] = this.objects[i];
        }

        this.objects = objects;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.pointer; i++) {
            if (this.objects[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.pointer - 1; i++) {
            this.objects[i] = this.objects[i + 1];
        }
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }

        moveToTheLeft(indexOfValue);
        this.pointer--;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public T value(int index) {
        if (index < 0 || index >= this.pointer) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.pointer + "]");
        }

        return this.objects[index];
    }

    public int size(){
        return this.pointer;
    }
}

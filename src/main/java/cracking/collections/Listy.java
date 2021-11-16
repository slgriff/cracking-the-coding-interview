package cracking.collections;

public class Listy {
    private final int[] data;

    public Listy(int[] data) {
        this.data = data;
    }

    public int elementAt(int i) {
        if (i >= data.length) {
            return -1;
        }

        return data[i];
    }
}

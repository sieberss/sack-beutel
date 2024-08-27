import java.util.Arrays;
import java.util.Objects;

public class Sack {

    private int[] elements;
    private int length;

    public Sack(int[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }

    public Sack(){
        this.elements = new int[0];
        length = 0;
    }

    public int size(){
        return length;
    }

    public void add(int newElement){
        int[] biggerArray = Arrays.copyOf(elements, elements.length + 1);
        biggerArray[length] = newElement;
        length = length + 1;
        elements = biggerArray;
    }

    public int get(int index){
        return elements[index];
    }

    public void removeLastElement(){
        elements = Arrays.copyOf(elements, elements.length - 1);
        length = length - 1;
    }

    public void removeByIndex(int index){
        int[] smallerArray = new int[length-1];
        for (int i=0; i < index; i++) {
            smallerArray[i] = elements[i];
        }
        for (int i = index; i < elements.length - 1; i++){
                smallerArray[i] = elements[i+1];
        }
        length = length - 1;
        elements = smallerArray;
    }

    public void addToIndex(int index, int newElement){
        int[] biggerArray = new int[length+1];
        for (int i=0; i < index; i++) {
            biggerArray[i] = elements[i];
        }
        biggerArray[index] = newElement;
        for (int i = index; i < elements.length; i++) {
            biggerArray[i + 1] = elements[i];
        }
        elements = biggerArray;
        length = length + 1;
    }

    public int[] getElements() {
        return elements;
    }

    public int getLength() {
        return length;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sack sack)) return false;
        return getLength() == sack.getLength() && Objects.deepEquals(getElements(), sack.getElements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(getElements()), getLength());
    }

    @Override
    public String toString() {
        return "Sack{" +
                "elements=" + Arrays.toString(elements) +
                ", length=" + length +
                '}';
    }
}

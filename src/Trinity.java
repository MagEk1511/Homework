import java.util.Arrays;
public class Trinity<T>{

    private T first;
    private T second;
    private T third;

    private Comparable[] arr;

    public Comparable[] getArr() {
        return arr;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Trinity(T first, T second, T third) {
        boolean isComparable = Comparable.class.isAssignableFrom(first.getClass());


        arr = new Comparable[]{(Comparable) first, (Comparable) second, (Comparable) third};

        if(isComparable) Arrays.sort(arr);


        this.first = (isComparable ? (T) arr[2] : first);
        this.second = (isComparable ? (T) arr[1] : second);
        this.third = (isComparable ? (T) arr[0] : third);
    }
}
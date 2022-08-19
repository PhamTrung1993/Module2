package demo1;

public class Simpson implements Comparable<Simpson> {
    String name;

    public Simpson(String name) {
        this.name = name;
    }
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

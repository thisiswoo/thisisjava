package ch15.collection_framwork;

public class ComparablePerson implements Comparable<ComparablePerson> {

    public String name;
    public int age;

    public ComparablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparablePerson o) {
        if (age > o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}

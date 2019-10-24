package Collections.ComparatorAndComparable;

class MyClass implements Comparable<MyClass> {
    private String label, value;

    MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    String getLabel() {
        return label;
    }

    String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label + " | " + value;
    }

    @Override
    public boolean equals(Object o) {
        MyClass other = (MyClass) o;
        return value.equalsIgnoreCase(other.value);
    }


    @Override
    public int compareTo(MyClass o) {
        return value.compareToIgnoreCase(o.value);
    }
}

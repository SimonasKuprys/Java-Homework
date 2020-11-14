package edu;

public class CustomList {
    private int[] ints;


    public void add(int number) {
        int[] newArray = new int[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            newArray[i] = ints[i];
        }
        newArray[newArray.length - 1] = number;
        this.ints = newArray;
    }

    public void removeAt(int index) {
        int[] smallerArray = new int[ints.length - 1];
        for (int i = 0; i < ints.length; i++) {
            if (i == index) {
                continue;
            }
            smallerArray[i] = ints[i];
        }
        ints = smallerArray;
    }

    public CustomList() {
        ints = new int[0];
    }

    public CustomList(int[] ints) {
        this.ints = ints;
    }

    public boolean any() {
        return ints.length > 0;
        // don't do this:
        // return !(ints.length < 1)
    }

    public int[] getAll() {
        return ints;
    }


}

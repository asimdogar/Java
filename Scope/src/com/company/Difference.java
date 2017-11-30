package com.company;

class Difference {
    public int maximumDifference;
    private int[] elements;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        int tempDiff = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                tempDiff = Math.abs(elements[i] - elements[j]);
                if (maximumDifference < tempDiff) {
                    maximumDifference = tempDiff;
                }
            }
        }
    }
}
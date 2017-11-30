package com.company;

class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
        int shift = 0b100000;
        System.out.println((shift >>> 3));
        System.out.println((shift << 3));
    }
}

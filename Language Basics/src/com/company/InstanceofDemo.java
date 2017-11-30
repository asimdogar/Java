package com.company;

interface MyInterface {
}

class InstanceofDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        String obj3 = new String();
        String obj4 = null;

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
        System.out.println("obj3 instanceof MyInterface: "
                + (obj3 instanceof String));
        System.out.println("obj3 instanceof MyInterface: "
                + (obj3 instanceof String));
    }
}

class Parent {
}

class Child extends Parent implements MyInterface {
}

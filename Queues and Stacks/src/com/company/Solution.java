package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    Stack<Character> characterStack = new Stack<Character>();
    Queue<Character> characterQueue = new LinkedList<Character>();

    public void pushCharacter(char a) {
        characterStack.push(a);
    }

    public char popCharacter() {
        return characterStack.pop();
    }

    public void enqueueCharacter(char a) {
        characterQueue.add(a);
    }

    public char dequeueCharacter() {
        return characterQueue.poll();
    }


}

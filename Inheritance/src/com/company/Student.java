package com.company;

class Student extends Person{
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName,String lastName,int idNumber,int [] testScores ){
        super(firstName,lastName,idNumber);
        this.testScores = testScores;

    }
    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int scoresSum=0;
        for (int i=0;i<testScores.length;i++){
           scoresSum+=testScores[i];
        }
        int averageScore=scoresSum/testScores.length;

        if (averageScore >= 90 && averageScore <= 100) {
            return 'O';
        } else if (averageScore >= 80 && averageScore < 90) {
            return 'E';
        } else if (averageScore >= 70 && averageScore < 80) {
            return 'A';
        } else if (averageScore >= 55 && averageScore < 70) {
            return 'P';
        } else if (averageScore >= 40 && averageScore < 55) {
            return 'D';
        }
        else {
            return 'T';
        }
    }

}
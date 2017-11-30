package com.company;

import java.util.Arrays;

public class Test {

    public String solution(int a,int b, int c , int d , int e, int f){
        int [] timeArray = {a,b,c,d,e,f};
        int count=0;
        //sort Array first then

        Arrays.sort(timeArray);
        return time(timeArray,0);
    }

    /**
     * Sort numbers in low -> High
     iterate over each digit [i] and search through the list until you find the highest number that fits the requirements.
     *[0] must be <=2
     *[1] must be <=3 if [0]==2
     *[2] must be <=5
     *[3] can be anything
     *[4] must be <=5
     *[5] can be any thing
     * @param timeArray Sorted Array
     * @param count for count how many backtrack if number did not fit time requirements
     * @return time String
     */

    public String time(int []timeArray,int count){
        String time="";

        if(timeArray[0]<=2){
            if((timeArray[0]==2 && timeArray[1] <= 3) || timeArray[0]<2){
                if (timeArray[2]<=5){
                    if (timeArray[4]<=5){
                        time=timeArray[0]+""+timeArray[1]+":"+timeArray[2]+timeArray[3]+":"+timeArray[4]+timeArray[5];
                    }else {
                        if(count == 0){
                            int temp;
                            temp=timeArray[4];
                            timeArray[4]=timeArray[3];
                            timeArray[3]=temp;
                            //System.out.println(timeArray[0]+" , "+timeArray[1]+" , "+timeArray[2]+" , "+timeArray[3]+" , "+
                                  //  timeArray[4]+" , "+timeArray[5]);
                            return time(timeArray,1);

                        }
                       else{
                            int temp;
                            temp=timeArray[4];
                            timeArray[4]=timeArray[2];
                            timeArray[2]=temp;
                            //System.out.println(timeArray[0]+" , "+timeArray[1]+" , "+timeArray[2]+" , "+timeArray[3]+" , "+
                                 //   timeArray[4]+" , "+timeArray[5]);
                            return time(timeArray,0);
                        }
                    }
                }
                else {
                    if(count == 0){
                        int temp;
                        temp=timeArray[2];
                        timeArray[2]=timeArray[1];
                        timeArray[1]=temp;
                       // System.out.println(timeArray[0]+" , "+timeArray[1]+" , "+timeArray[2]+" , "+timeArray[3]+" , "+
                                //timeArray[4]+" , "+timeArray[5]);
                        return time(timeArray,1);
                    }
                    else {
                        int temp;
                        temp=timeArray[2];
                        timeArray[2]=timeArray[0];
                        timeArray[0]=temp;
                       // System.out.println(timeArray[0]+" , "+timeArray[1]+" , "+timeArray[2]+" , "+timeArray[3]+" , "+
                               // timeArray[4]+" , "+timeArray[5]);
                        return time(timeArray,0);
                    }
                }
            }else {
                int temp;
                temp=timeArray[1];
                timeArray[1]=timeArray[0];
                timeArray[0]=temp;
                //System.out.println(timeArray[0]+" , "+timeArray[1]+" , "+timeArray[2]+" , "+timeArray[3]+" , "+
                        //timeArray[4]+" , "+timeArray[5]);
                return time(timeArray,0);
            }
        }
        else {
            time="Not Possible";
        }

        return time;
    }
    public static void main(String[] args) {

        Test test = new Test();
        System.out.print(test.solution(2,1,3,9,1,1));
    }

}

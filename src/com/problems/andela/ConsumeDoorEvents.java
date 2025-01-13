package com.problems.andela;

public class ConsumeDoorEvents {





    public static void main(String[] args) {
        //expected: <1232222100> but was: <1232345555>
        //expected: <12345554321000> but was: <12345666666666>
        //expected: <1223445> but was: <1223334>
        //expected: <000001222222222234555> but was: <000001222222222233333>
        //expected: <122234555> but was: <122233333>
        //expected: <0000012345554333321000> but was: <0000012345666677777777>
        String str="P.P..";
        System.out.println(consumeDoorEvents(str));
    }
    public static String consumeDoorEvents(String events) {
        String result = "";
        int count=0;
        boolean push=false;
        boolean pause=false;
        for(int i=0; i<events.length(); i++){
            if('.' == events.charAt(i)){
                if(!pause && push && count<=5){
                    count++;
                } else if(!pause && !push && count>0){
                    count--;
                }
                result+=String.valueOf(count);
            } else if('P' == (events.charAt(i))){
                if(!push){
                    push=true;
                    count++;
                }else {
                    push=false;
                    pause=true;
                }

                result+=String.valueOf(count);
            }else if('O' == (events.charAt(i))){
                push=false;
                count--;
                result+=String.valueOf(count);
            }

        }

        return result;
    }
}

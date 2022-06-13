package com.problems.toptal;

public class Q2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String x = solution("Codility We",14);

        System.out.println(x);
    }
    public static String solution(String message, int K) {
        if(K > 500 || K <1) {
            return "";
        }

        if(message == null || message.length() < 1 || message.length() > 500) {
            return "";
        }

        if(K > message.length()) {
            return message;
        }

        String [] arrString = message.split(" ");

        StringBuilder finalString =new StringBuilder();;
        String messageRange= message.substring(0,K);
        String [] newSplit = messageRange.split(" ");

        for(int i=0; i<newSplit.length;i++) {
            if(arrString[i].equals(newSplit[i])) {
                finalString.append(newSplit[i]);
                finalString.append(" ");
            }
        }
        StringBuilder f= new StringBuilder();
        if(finalString.charAt(finalString.length()-1) == ' ') {
            f.append(finalString.substring(0, finalString.length()-1));
            System.out.println(finalString);
        }else {
            f.append(finalString);
        }


        return f.toString();




    }
}

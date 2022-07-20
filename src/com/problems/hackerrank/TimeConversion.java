package com.problems.hackerrank;

public class TimeConversion {
    public static void main(String[] args) {

        String s = "06:40:03AM";
        String returnedTime = timeConversion(s);
        System.out.println(returnedTime);
    }

    public static String timeConversion(String s) {
        String convertedTime = null;
        String arr[];
        arr = s.split(":");
        int hour = Integer.parseInt(arr[0]);
        if (s.contains("PM")) {
            if (hour > 0 && hour < 12) {
                convertedTime = String.valueOf(Integer.parseInt(arr[0]) + 12);
            } else {
                convertedTime = "12";
            }

        } else {
            if (hour > 0 && hour < 12) {
                convertedTime = String.valueOf(Integer.parseInt(arr[0]));
                if(convertedTime.length()==1){
                    convertedTime="0"+convertedTime;
                }
            } else {
                convertedTime = "00";
            }
        }
        convertedTime += ":" + arr[1] + ":" + arr[2].substring(0, 2);
        return convertedTime;
    }
}

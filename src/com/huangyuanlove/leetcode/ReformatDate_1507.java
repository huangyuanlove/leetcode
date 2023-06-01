package com.huangyuanlove.leetcode;

public class ReformatDate_1507 {
    public static void main(String[] args) {

    }

    public String reformatDate(String date) {
        StringBuilder result = new StringBuilder();
        String[] dateArr = date.split(" ");
        result.append(dateArr[2]);
        result.append("-");
        switch(dateArr[1]){
            case "Jan":
                result.append("01");
                break;
            case "Feb":
                result.append("02");
                break;
            case "Mar":
                result.append("03");
                break;
            case  "Apr":
                result.append("04");
                break;
            case "May":
                result.append("05");
                break;
            case "Jun":
                result.append("06");
                break;
            case "Jul":
                result.append("07");
                break;
            case "Aug":
                result.append("08");
                break;
            case "Sep":
                result.append("09");
                break;
            case "Oct":
                result.append("10");
                break;
            case "Nov":
                result.append("11");
                break;
            case "Dec":
                result.append("12");
                break;
        }
        result.append("-");
        if(dateArr[0].length() == 3){
            result.append("0").append(dateArr[0].charAt(0));
        }else{
            result.append(dateArr[0], 0, 2);
        }

        return result.toString();

    }
}

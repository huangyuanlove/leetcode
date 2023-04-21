package com.huangyuanlove.leetcode;

public class CountDaysSpentTogether_2409 {
    public static void main(String[] args) {
        int result =
        countDaysTogether("03-05",
                "07-14",
                "04-14",
                "09-21");
        System.out.println(result);
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int result = 0;
        int[] dayOfMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String maxArrive = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;
        String minLeave = leaveAlice.compareTo(leaveBob) > 0 ? leaveBob : leaveAlice;
        System.out.println(maxArrive + "   " + minLeave);

        //取到达时间最大，离开时间最小 统计时间就好

        String [] arrive = maxArrive.split("-");
        String [] leave = minLeave.split("-");

        int arriveMonth = Integer.parseInt(arrive[0]);
        int arriveDay = Integer.parseInt(arrive[1]);
        int leaveMonth = Integer.parseInt(leave[0]);
        int leaveDay = Integer.parseInt(leave[1]);

        if(leaveMonth < arriveMonth){
            return 0;
        }else
        if(leaveMonth == arriveMonth){
            if(leaveDay < arriveDay){
                return 0;
            }else{
                return leaveDay - arriveDay + 1;
            }
        }else{
            result +=dayOfMonth[arriveMonth-1] - arriveDay +1+ leaveDay;
            if(leaveMonth - arriveMonth == 1){
                //相差1月
              return   result;
            }else {
                for (int i = arriveMonth; i < leaveMonth-1; i++) {
                    result += dayOfMonth[i];
                }
            }
        }


        return result;


    }


}

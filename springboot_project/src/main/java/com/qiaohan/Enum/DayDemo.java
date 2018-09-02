package com.qiaohan.Enum;

public class DayDemo{

   public static void main(String[] args) {
      Day day = Day.MONDAY;
      System.out.println(day);
      System.out.println(day.name());
      System.out.println(day.ordinal());
   }
}

 enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}

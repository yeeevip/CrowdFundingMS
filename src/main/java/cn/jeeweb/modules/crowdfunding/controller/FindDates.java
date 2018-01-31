package cn.jeeweb.modules.crowdfunding.controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;  
import java.util.Calendar;  
import java.util.Date;  
import java.util.List;  
  
public class FindDates  
{  
  
/* public static void main(String[] args) throws Exception  
 {  
  
   
  String start = "2012-03-01 08";  
  String end = "2012-03-02 08";  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh");  
  Date dBegin = sdf.parse(start);  
  Date dEnd = sdf.parse(end);  
  System.out.println(start);  
  //List<String> lDate = findDates(dBegin, dEnd);  
  List<String> lDate = findTimes(dBegin, dEnd);  
  for (String date : lDate)  
  {  
   System.out.println(date);  
  }  
 }  */
  
 public static List<String> findDates(Date dBegin, Date dEnd)  
 {  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
  List<String> lDate = new ArrayList<String>();  
  lDate.add(sdf.format(dBegin));  
  Calendar calBegin = Calendar.getInstance();  
  // 使用给定的 Date 设置此 Calendar 的时间  
  calBegin.setTime(dBegin);  
  Calendar calEnd = Calendar.getInstance();  
  // 使用给定的 Date 设置此 Calendar 的时间  
  calEnd.setTime(dEnd);  
  // 测试此日期是否在指定日期之后  
  while (dEnd.after(calBegin.getTime()))  
  {  
   // 根据日历的规则，为给定的日历字段添加或减去指定的时间量  
   calBegin.add(Calendar.DAY_OF_MONTH, 1);  
   lDate.add(sdf.format(calBegin.getTime()));  
  }  
  return lDate;  
 }  
 
 public static List<String> findTimes(Date dBegin, Date dEnd)  
 {  
  SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:00:00");  
  List<String> lDate = new ArrayList<String>();  
  //lDate.add(sdf.format(dBegin));  
  Calendar calBegin = Calendar.getInstance();  
  // 使用给定的 Date 设置此 Calendar 的时间  
  calBegin.setTime(dBegin);  
  Calendar calEnd = Calendar.getInstance();  
  // 使用给定的 Date 设置此 Calendar 的时间  
  calEnd.setTime(dEnd);  
  // 测试此日期是否在指定日期之后  
  while (dEnd.after(calBegin.getTime()))  
  {  
   // 根据日历的规则，为给定的日历字段添加或减去指定的时间量  
   calBegin.add(Calendar.HOUR_OF_DAY, 1);  
   lDate.add(sdf.format(calBegin.getTime()));  
  }  
  return lDate;  
 }  
}  
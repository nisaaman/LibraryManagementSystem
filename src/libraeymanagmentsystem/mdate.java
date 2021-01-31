/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */
import java.*;
import java.util.*;


public class mdate{

public static String days[]={" ","sun","mon","tue","wed","thur","fri","sat"};
public static String month[]={"jan" ,"feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
public static StringBuffer todaydate=new StringBuffer();
public static StringBuffer returndate=new StringBuffer();
public static StringBuffer todaydatee=new StringBuffer();;
public static StringBuffer returndatee=new StringBuffer();;
public static void main(String[] args){
mdate dddd=new mdate();
dddd.ccdate();

System.out.println(todaydate);
System.out.println(todaydatee);
System.out.println(returndate);
System.out.println(returndatee);

}


public void  ccdate(){

try{


GregorianCalendar g=new GregorianCalendar();

int da=g.get(Calendar.DAY_OF_WEEK);
String daay=days[da];

int todate=g.get(Calendar.DAY_OF_MONTH);


int valofmonth=g.get(Calendar.MONTH);
String mon=month[valofmonth];

int valofyear=g.get(Calendar.YEAR);

todaydate.append(daay +"-");
todaydate.append(todate);
todaydate.append("-"+mon);
todaydate.append("-"+valofyear);

todaydatee.append(todate);
todaydatee.append("-"+valofmonth);
todaydatee.append("-"+valofyear);


g.add(Calendar.DAY_OF_MONTH,21);
int val=g.get(Calendar.DAY_OF_MONTH);

int valmonth=g.get(Calendar.MONTH);
int valyear=g.get(Calendar.YEAR);

returndate.append(val);
returndate.append("-"+valmonth);
returndate.append("-"+valyear);




}catch(Exception e){e.printStackTrace();}
}


}

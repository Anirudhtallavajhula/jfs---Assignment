package java2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int authorID();
	String date() ;
	String time();
	double version();
}

@info(authorID = 626, date = "12-09-2000", time = "06.26", version = 6.26)
class mall
{
	int authorID;
	String date;
	String time;
	double version;
	public mall(int authorID, String date, String time, double version)
	{
		this.authorID = authorID;
		this.date = date;
		this.time = time;
		this.version = version;
	}
}

public class Assignment7Q2 {
	public static void main(String[] args) {
		mall a = new mall(626,"12-09-2000","6.26",6.26);
		System.out.println("Author ID : " + a.authorID);
		System.out.println("Date : " + a.date);
		System.out.println("Time : " + a.time);
		System.out.println("Version : " + a.version);
		Class c = a.getClass();
        java.lang.annotation.Annotation d = c.getAnnotation(info.class);
        info i = (info)d;
        System.out.println(i);

	}

}
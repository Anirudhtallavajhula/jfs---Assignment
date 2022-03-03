package java2;

abstract class name 
{
	    String name;
	    name(String name)
	    {
	        this.name =name;
	    }
	    public  abstract String getname();
	}
	class person extends name
	{
	    person(String name) 
	    {
	        super(name);
	    }
	    public  String getname()
	    {
	        return ("Hi "+this.name);
	    }
	}
	 abstract class MyClass 
	 {
	    public abstract void dis1();
	}

	class  AbstClassP3 extends MyClass
	{
	    
	    public void dis1()
	    {
	        System.out.println("-->This is the subclass implementation of the display method");
	    }
	}
	abstract class MyClass2 
	{
	    public abstract void dis2();
	}

	class AbstClassP4 extends MyClass2
	{
	    public void dis2()
	    {
	        System.out.println("-->Abstract class cannot be private.");
	    }
	}
	abstract class MyClass3
	{
	    public void dis3()
	    {
	        System.out.println("-->You can declare a class abstract without having any abstract method.");
	    }
	}
	class AbstClassP6 extends MyClass3
	{
	}
	public class Assignment2Q4 {
	    public static void main(String[] args) {
	        person user1 = new person("Anirudh");
	        System.out.println(user1.getname());
	        new AbstClassP3().dis1();
	        new AbstClassP4().dis2();
	        new AbstClassP6().dis3();
	        

	    }
	}
package java2;

class number{
	int num1,num2;
	double addition,subtraction,multiplication,division;
	public number(int num1,int num2,double addition,double subtraction,double multiplication,double division)
	{
		
		this.num1=num1;
		this.num2=num2;
		this.addition=addition;
		this.subtraction=subtraction;
		this.multiplication=multiplication;
		this.division=division;
	}
}

interface myadd{
	int add(int a,int b);
}

interface mysub{
	int sub(int a,int b);
}

interface mymul{
	int sub(int a,int b);
}

interface mydiv{
	int sub(int a,int b);
}

public class Assignment8Q1 {

	
		
		void addition(int num1,int num2){
			 
			@SuppressWarnings("unused")
			myadd addFunction= (int a,int b)-> num1+num2;
			
		 }
		    @SuppressWarnings("unused")
			public void subtraction(int num1,int num2){
		    	mysub subFunction = (int a,int b)-> num1-num2;
		    }
		    @SuppressWarnings("unused")
			public void multiplication(int num1,int num2){
		    	mymul mulFuction = (int a,int b)-> num1*num2;
		    }
		    @SuppressWarnings("unused")
			public void division(int num1,int num2){
		    	mydiv divFunction = (int a,int b)-> num1/num2;
		    }
		    public static void main(String[] args) {
		    	int num1=45;
				int num2=10;
				float addFunction = num1+num2;
				System.out.println(addFunction);
				float subFunction = num1-num2;
				System.out.println(subFunction);
				float mulFunction = num1*num2;
				System.out.println(mulFunction);
				float divFunction = num1/num2;
				System.out.println(divFunction);
		    }

	}
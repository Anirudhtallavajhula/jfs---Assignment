package java2;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
    	boolean valueFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue)
                valueFound=true;
        }
        return valueFound;
    }
}


public class Assignment1Q7 {
	public static void main(String[] args) {
		 int arr[] = {2,6,9,15,19,22,26,28,30,31,35,37,40};
	        int valueToCheck = 25;
        SearchArray searchArray = new SearchArray();
        if (searchArray.searchArray(arr, valueToCheck)) 
        {
            System.out.println("element is present in array");
        } 
		else 
		{
            System.out.println("element is not present in array");
        }
	}
}

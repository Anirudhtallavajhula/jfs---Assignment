package java2;

class BubbleSort{
    public int[] bubbleSort(int arr[]) 
    {
    	 for(int i=0;i<arr.length-1;i++)
    	 {
             for(int j=0;j<arr.length-1-i;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
         return arr;
    }
}

public class Assignment1Q8 {
	public static void main(String[] args) 
	{
		 int arr[] = {75,26,22,83,45,6,14,18,25,20,10,17,30,33,35};
		 BubbleSort bubbleSort = new BubbleSort();
		 int sortedarr[] = bubbleSort.bubbleSort(arr);
		 
		 for(int i:sortedarr){
	            System.out.print(i+" ");
	        }
	}

}
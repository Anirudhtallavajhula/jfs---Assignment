package java2;

class swapping<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
}
public class Assignment5Q3 {

	public static void main(String[] args) {
		Integer arr[] = {22,26,65,32,84};
		swapping<Integer> obj = new swapping<>();
		Integer[] arr1=obj.swap(arr, 2, 4);
		for(int i : arr1) {
			System.out.println(i);
		}
	}
}
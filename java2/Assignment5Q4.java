package java2;

class pair<K, V>
{
	K Key;
	V value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		this.Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class Assignment5Q4 {
	public static void main(String[] args)
	{
		pair<String, String> ob1=new pair<>();
		ob1.setKey("0626");
		ob1.setValue("Anirudh");
		pair<String, java.util.Date> ob2=new pair<>();
		ob2.setKey("Today Date is");
		ob2.setValue(new java.util.Date());
		System.out.println(ob1.getKey()+" "+ob1.getValue());
		System.out.println(ob2.getKey()+" "+ob2.getValue());
	}

}
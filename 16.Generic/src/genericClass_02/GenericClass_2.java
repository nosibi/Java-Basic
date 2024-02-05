package genericClass_02;

/*제너릭 타입 변수가 2개인 경우 
 */
class KeyValue<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class GenericClass_2 {
	public static void main(String[] args) {
		KeyValue<Integer, String> kv = new KeyValue<>();
		kv.setKey(404);
		kv.setValue("Not Found");
		
		System.out.println(kv.getKey() + " " + kv.getValue());
		System.out.println("요청하신 페이지를 찾을 수 없습니다");
	}

}

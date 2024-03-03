package setCollectionInterface_05;
import java.util.TreeSet;
import java.util.Comparator;

/*TreeSet<E> 데이터 크기 비교
 *크기 비교의 기준을 제공
 *1.Comparable<T> 제네릭 인터페이스 구현
 *2.TreeSet<E> 객체 생성 시 생성자 매개변수로 Comparator<T>를 제공
 */
class Myclass{
	int data1;
	int data2;
	public Myclass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	//override
	public int compareTo(MyComparableClass o) {
		if(this.data1 < o.data1) {
			return -1;
		}
		else if(this.data1 == o.data1) {
			return 0;
		}
		else
			return 1;
	}
}


public class SetCollectionInterface_5 {
	public static void main(String[] args) {
		TreeSet<Integer> treeset1 = new TreeSet<>();
		Integer intvalue1 = new Integer(20);
		Integer intvalue2 = new Integer(10);
		treeset1.add(intvalue1);
		treeset1.add(intvalue2);
		System.out.println(treeset1.toString());
		
		TreeSet<String> treeset2 = new TreeSet<>();
		String str1 = "A";
		String str2 = "B";
		treeset2.add(str1);
		treeset2.add(str2);
		System.out.println(treeset2.toString());
		
		//MyComparableClass 객체 크기 비교 방법1
		TreeSet<MyComparableClass> treeset3 = new TreeSet<>();
		MyComparableClass mc1 = new MyComparableClass(2,5);
		MyComparableClass mc2 = new MyComparableClass(3,3);
		treeset3.add(mc1);
		treeset3.add(mc2);
		for(MyComparableClass mcc : treeset3) {
			System.out.println(mcc.data1);
		}
		
		//MyComparableClass 객체 크기 비교 방법2
		TreeSet<Myclass> treeset4 = new TreeSet<Myclass>(new Comparator<Myclass>() {
			//override
			public int compare(Myclass o1,Myclass o2) {
				if(o1.data1 < o2.data1) {
					return -1;
				}
				else if(o1.data1 == o2.data1) {
					return 0;
					}
				else
					return 1;
			}
		});
		Myclass myclass1 = new Myclass(2,5);
		Myclass myclass2 = new Myclass(3,3);
		treeset4.add(myclass1);
		treeset4.add(myclass2);
		for(Myclass mcc : treeset4) {
			System.out.println(mcc.data1);
		}
		
	}

}

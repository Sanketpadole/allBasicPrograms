package src.Java_Programs;

public class Generics {

//	The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.
//	It makes the code stable by detecting the bugs at compile time.
//
//	Before generics, we can store any type of objects in the collection, i.e., non-generic.
//	Now generics force the java programmer to store a specific type of objects.

//1)	Without Generics, we can store any type of objects.
//
//	List list = new ArrayList();
//	list.add(10);
//	list.add("10");
//	With Generics, it is required to specify the type of object we need to store.
//	List<Integer> list = new ArrayList<Integer>();
//	list.add(10);
//	list.add("10");// compile-time error  

//
//	Type casting is not required: There is no need to typecast the object.
//
//	Before Generics, we need to type cast.
//
//	List list = new ArrayList();
//	list.add("hello");
//	String s = (String) list.get(0);//typecasting
//	After Generics, we don't need to typecast the object.
//	List<String> list = new ArrayList<String>();
//	list.add("hello");
//	String s = list.get(0);
//	

//	eg
//
//	import java.util.*;
//	class TestGenerics1{
//	public static void main(String args[]){
//	ArrayList<String> list=new ArrayList<String>();
//	list.add("rahul");
//	list.add("jai");
//	//list.add(32);//compile time error
//
//	String s=list.get(1);//type casting is not required
//	System.out.println("element is: "+s);
//
//	Iterator<String> itr=list.iterator();
//	while(itr.hasNext()){
//	System.out.println(itr.next());
//	}
//	}
//	}
//	

}

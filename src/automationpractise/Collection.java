package automationpractise;

import java.util.ArrayList;
import java.util.List;

public class Collection
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(10);//
		a.add(20);//1
		a.add(30);//2
		a.add(40);//3
		a.add('D');//4
		a.add("this is arraylist");//5
		System.out.println(a);
//		a.set(3, 'P');
//		System.out.println(a);
//		a.remove(5);
//		System.out.println(a);
		//a.get(4);
		//System.out.println("array list with heterogeneous data type only" +" "+a);

		//System.out.println("=============================================");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Pihu");
		b.add("mihu");
		b.add("hihu");
		b.add("kihu");
		System.out.println(b.get(2));
		System.out.println("array list with string data type only" +" "+b);
		System.out.println("=======================================");
		
		
		
	}

}

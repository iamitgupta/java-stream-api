package com.dev.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		
		// to add values in Stream<>
		//Directly using Stream.of()
		Stream<Integer> streamUsingofMethod = Stream.of(1,2,3,4,5,6,7,8,9);
		
		//converting collection into Stream using stream() methods
		List<Integer> listValue = Arrays.asList(1, 6, 5, 9, 7, 4);
		Stream<Integer> streamUsingCollection=listValue.stream();
		
		streamUsingofMethod.forEach(p -> System.out.print(p+" "));
        System.out.println();
        streamUsingCollection.forEach(p -> System.out.print(p+" "));
        System.out.println();

		// Eg. 1
		List<String> list = Arrays.asList("Amit", "Manish", "Dev", "Arbaaz", "Jeet", "Sachin");
		Stream<String> st = list.stream();
		// filter method
		List<String> fList = st.filter(x -> x.startsWith("A")).collect(Collectors.toList());
		System.out.println(fList);

		// Eg. 2
		List<Integer> iList = Arrays.asList(1, 6, 5, 9, 7, 4);
		Stream<Integer> st1 = iList.stream();

		// sorted() method with List<>
		//for custom sorting use Comparator
		List<Integer> sort = st1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);

		// Eg. 3

		// sorted() method with filter() method Set<>
		Stream<Integer> st2 = iList.stream();
		Set<Integer> sort1 = st2.filter(x-> x>4).sorted().collect(Collectors.toSet());
		//sort1.forEach(System.out::print);
		System.out.println(sort1);
		
		//Eg. 4
		//map() to perform some operation on elements of stream
		Stream<Integer> sq=iList.stream();
		sq.map(x->x*x).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//Eg. 5
		Stream<Integer> sumStream=iList.stream();
		int value=0;
		int sum = sumStream.reduce(value, (x,y) -> x+y);
  	  System.out.println("sum is:"+sum);		

	}

}

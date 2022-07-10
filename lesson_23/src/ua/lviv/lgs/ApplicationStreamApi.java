package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationStreamApi {
	public static void main(String[] args) {
		
		Collection<String> collection = Arrays.asList("a1", "a2","a3","a3","a4","a4","a5","a6","a7","a8","a9","a10");
		
		//How to create Streams
		Stream<String> s1 = collection.stream();
		
		Stream<String> s2 = Stream.of("1","2","3");
		
		String[] array = {"3", "4", "5"};
		Stream<String> s3 = Arrays.stream(array);
		
		Stream<Object> s4 = Stream.builder().add("1").add("2").add("3").add("4").build();
		
		//transit method
		
		long count = collection.stream().filter("a3"::equals).count();
		System.out.println(count);
		
		String skip = collection.stream().skip(collection.size()-1).findFirst().orElse("10000");
		System.out.println("Skip = "+skip);
		
		System.out.println(collection);
		List<String> distincted = collection.stream().distinct().collect(Collectors.toList());
		System.out.println(distincted);
		
		List<String> map = collection.stream().map(s->s+"_><><").collect(Collectors.toList());
		System.out.println(map);
		
		List<String> peek = collection.stream().map(x-> x.toUpperCase()).peek(e->System.out.println(e))
				.collect(Collectors.toList());
		System.out.println(peek);
		
		List<String> limit = collection.stream().limit(2).collect(Collectors.toList());
		System.out.println(limit);
		
		List<String> sort = collection.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);
		
		String[][]data = new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		
		System.out.println(Arrays.stream(data).flatMap(x->Arrays.stream(x)).collect(Collectors.toList()));
//		List<String> data1 =Arrays.stream(data).flatMap(x->Arrays.stream(x)).collect(Collectors.toList());
//		System.out.println(data1);
		
		Stream<String[]> arrayStream = Arrays.stream(data);
		Stream<String> flatMap = arrayStream.flatMap(x->Arrays.stream(x)); 
		List<String> flatMapFiltered = flatMap.filter(x->"a".equals(x.toString())).collect(Collectors.toList());
		System.out.println(flatMapFiltered);
		
		//Terminal methods
		String orElse = collection.stream().findFirst().orElse("a1");
		System.out.println(orElse);
		String orElse2 = collection.stream().findAny().orElse("1");
		System.out.println(orElse2);
		
		boolean anyMatch = collection.stream().anyMatch("a1"::equals);
		System.out.println(anyMatch);
		
		boolean noneMatch = collection.stream().noneMatch("a1"::equals);
		System.out.println(noneMatch);
		
		boolean allMatch = collection.stream().allMatch("a1"::equals);
		System.out.println(allMatch);
		
		String min = collection.stream().min(String::compareTo).get();
		System.out.println(min);
		
		String max = collection.stream().max(String::compareTo).get();
		System.out.println(max);
		
		String reduce = collection.stream().reduce((e1, e2)->e1+e2).get();
		System.out.println(reduce);
		
	}

}

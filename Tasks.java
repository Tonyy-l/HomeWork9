package HomeWork9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import fmi.informatics.extending.Student;

public class Tasks extends Student {

	public static void main(String[] args) {
		Task1();
		Task2();
		Task3();
		Task4();
		}
	public static void Task1() {
		Stream.of(Student.StudentGenerator.make(), 
				Student.StudentGenerator.make(),
				Student.StudentGenerator.make())
			.filter(s -> s.getName().length() >= 5)
			.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
			.forEach(System.out::println);
	}
	public static void Task2() {
		Stream.of("cat", "dog", "cow", "bird")
	      .map(String::toUpperCase)
	      .collect(Collectors.toList())
	      .forEach(System.out::println);
	}
	
	public static void Task3() {
		
List<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 5; ++i) {
			students.add(Student.StudentGenerator.make());
		}
		
		String studentsNames = students.stream()
			.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
			.map(s -> s.getName())
			.reduce((s1, s2) -> { 
				if (s2 != null) return s1 + ", " + s2;
				return s1;
			})
			.get();
		System.out.println(studentsNames);
	}
	
	
	public static void Task4() {
		IntStream.iterate(0, i -> i + 1)
		.skip(5)
		.limit(10)
		.forEach(i -> {
			if (i%2 == 0) System.out.println(i); else System.err.println(i);
		});
	}

}

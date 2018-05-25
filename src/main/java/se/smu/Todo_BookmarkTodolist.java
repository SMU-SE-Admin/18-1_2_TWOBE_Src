package se.smu;
import java.util.Comparator;


import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Todo_BookmarkTodolist {
	public static void bookMark(Todolist[] arr){
		List<Todolist> ImportantList=Stream.of(arr)
				.filter(s->s.gettdlImportant()==true)
				.collect(Collectors.toList());
		ImportantList.stream()
			.forEach(s->System.out.println(s.gettdlImportant()));
		
	}

}

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */

/**
 * @author M1034567
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		//System.out.println("Welcome to Java Programming !");
		
	  List<User> userList = Arrays.asList(new User(3, "Three"), new User(1, "One"), new User(2, "Two"));
		System.out.println("Before Sorting using the comparable :");
		for(User user : userList) {
			System.out.println(user);
		}
		
		System.out.println("After Sorting using the comparable :");
		Collections.sort(userList);
		
		for(User user :userList) {
			System.out.println(user);
		}
		
		System.out.println("After Sorting using the comparator:");
		Collections.sort(userList, new Comparator<User>() {

			@Override
			public int compare(User user1, User user2) {
				// TODO Auto-generated method stub
				if(user1.getId() < user2.getId())
					return 1;
				else 
					return -1;
			}
		});
		for(User user : userList) {
			System.out.println(user);
		}
		String s = returnType("") ;
		String s1 = returnType("");
	}

	public static <T> T returnType(T argument) {
		
		return argument;
	}
}

import java.util.*;
public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []blah = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(blah);
		for (int n = 0; n < blah.length; n++){
			System.out.println(blah[n]);
		}
	}

}

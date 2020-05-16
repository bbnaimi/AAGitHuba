package noorteck;

import java.util.LinkedList;

public class GitHub {

	public static void main(String[] args) {

		
		LinkedList<String> state = new LinkedList<String>();
		
		state.add("VA");
		state.add("CA");
		state.add("TX");
		state.add("FL");
		
		for(int i = 0; i< state.size();i++) {
			System.out.println(state.get(i));
		}
	}

	}



import java.util.*;


public class LRUImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX_ENTRIES;
		Scanner scan = new Scanner(System.in);
		
//LOOP through untill SIZE is provided once.		
		while(true) {
			String[] in = scan.nextLine().split(" ");
			if(!in[0].equals("SIZE")) {
				continue;
			}else {
				MAX_ENTRIES = Integer.parseInt(in[1]);
				System.out.println("SIZE OK");
				break;
			}
		}
		
		
		LinkedHashMap<String, String> lihama =  
				new LinkedHashMap<String, String>() { 
			protected boolean removeEldestEntry(Map.Entry<String, String> eldest) 
			{ 
				return size() > MAX_ENTRIES; 
			} 
		};

//LOOP through the main execution for GET, SET and EXIT.
		while(true) {
			String[] in = scan.nextLine().split(" ");

			if((in[0].equals("GET") && in.length == 2)||(in[0].equals("SET") && in.length == 3)||(in[0].equals("EXIT") && in.length == 1)){
			if(in[0].equals("EXIT"))
				break;
			else if(in[0].equals("GET")) {
				if(lihama.get(in[1]) != null)
					System.out.println("GOT " + lihama.get(in[1]));
				else
					System.out.println("NOTFOUND");
			}
			else if(in[0].equals("SET")) {
				lihama.put(in[1],in[2]);
				System.out.println("SET OK");
			}
			}
			else {
			System.out.println("ERROR");
			continue;
			}
		}

		scan.close();

	}
}



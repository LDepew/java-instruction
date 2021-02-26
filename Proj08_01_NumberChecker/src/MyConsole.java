
public class MyConsole extends Console {

	
	
	
	@Override
	 public String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  
        sc.nextLine();  
        return s;
}

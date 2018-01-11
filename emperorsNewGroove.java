import java.util.ArrayList;
public class emperorsNewGroove {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emperorsCast = new ArrayList<String>();
		emperorsCast.add("Kuzco");
		emperorsCast.add("Pacha");
		emperorsCast.add("Yzma");
		emperorsCast.add("Kronk");
		System.out.println("Original List: " + emperorsCast);
		emperorsCast.remove("Pacha");
		emperorsCast.add(2, "Chaca");
		emperorsCast.add(3, "Tipo");
		emperorsCast.add(5, "Bucky");
		emperorsCast.add("Pacha");
		System.out.println("Modified List: " + emperorsCast);
	}
	
}
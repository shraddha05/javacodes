import java.util.*;
public class DuplicateElimination {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		 ArrayList<Integer>a = new ArrayList();
		 int p;
		 System.out.println("Enter 6 numbers to be displayed in the list5 6 ");
		 for(int i=0;i<7;i++){
		 p=inp.nextInt();
		 if(!a.contains(p))
		 {
			 a.add(p);
		 }
		 }
		 System.out.println("The complete set of unique values in the list:");
		 for(int j=0;j<a.size();j++){
		 System.out.print(a.get(j)+" ");
		 }
		 System.out.print("\n");
		 }
		 
	}
	



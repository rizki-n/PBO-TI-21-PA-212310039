package praktikum05;
import java.util.ArrayList;

public class LatihanLab {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > matrix_a = new ArrayList<ArrayList<Integer> >();
		ArrayList<ArrayList<Integer> > matrix_b = new ArrayList<ArrayList<Integer> >();
		
		matrix_a.add(new ArrayList<Integer>());
		matrix_a.get(0).add(0, 1);
		matrix_a.get(0).add(1, 3);
		
		matrix_a.add(new ArrayList<Integer>());
		matrix_a.get(1).add(0, 9);
		matrix_a.get(1).add(1, 5);
		
		matrix_b.add(new ArrayList<Integer>());
		matrix_b.get(0).add(0, 4);
		matrix_b.get(0).add(1, 5);
		
		matrix_b.add(new ArrayList<Integer>());
		matrix_b.get(1).add(0, 3);
		matrix_b.get(1).add(1, 6);
		
		System.out.println("Matrix A");
		for(int i = 0; i<matrix_a.size(); i++) {
			for(int j=0; j<matrix_a.size(); j++) {
				System.out.print(matrix_a.get(i).get(j)+" ");
			}System.out.println();
		}
		System.out.println("Matrix B");
		for(int k = 0; k<matrix_b.size(); k++) {
			for(int l=0; l<matrix_b.size(); l++) {
				System.out.print(matrix_b.get(k).get(l)+" ");
			}System.out.println();
		}
	}
}

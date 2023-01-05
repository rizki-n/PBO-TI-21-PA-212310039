package praktikum05;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class latihan02{


public static void main(String[] args) {

		
		JOptionPane jop = new JOptionPane();
		ArrayList<ArrayList<Integer>> Matrix_A = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Matrix_B = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Matrix_C = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				String value = jop.showInputDialog(null, "Masukkan Angka :","Matriks A["+i+"]["+j+"]",JOptionPane.QUESTION_MESSAGE);
				Matrix_A.add(new ArrayList<Integer>());
				Matrix_A.get(i).add(j, Integer.parseInt(value));
			}
		}
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				String value = jop.showInputDialog(null, "Masukkan Angka :","Matrix B["+i+"]["+j+"]",JOptionPane.QUESTION_MESSAGE);;
				Matrix_B.add(new ArrayList<Integer>());
				Matrix_B.get(i).add(j, Integer.parseInt(value));
			}
		}
		String output = "";
		System.out.println("Matrix A");
		output += "Matrix A \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output+= Matrix_A.get(i).get(j)+"";
			}	output+= "\n";
		}
		String output2 = "";
		System.out.println("Matrix B");
		output2 += "\nMatrix B \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output2+= Matrix_B.get(i).get(j)+"";
			} 	output2+= "\n";
		}
		String output3 = "";
		System.out.println("Matrix C");
		output3 += "\nMatrix C \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output3+= Matrix_A.get(i).get(j) * Matrix_B.get(i).get(j);
			} 	output3+= "\n" ;
				
				
		}
		
	jop.showMessageDialog(null, output+output2+output3);
	}
}

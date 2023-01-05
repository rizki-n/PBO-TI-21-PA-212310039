package praktikum05;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class latihan03 {
    
    public static ArrayList<String> fields = new ArrayList<String>();

    public static void main(String[] args) {
        fields.add("Nama Lengkap");
        fields.add("Alamat");
        fields.add("No. Telp");

        ArrayList<ArrayList<String>> fields_values = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < fields.size(); i++) {
            fields_values.add(new ArrayList<String>());
            for(int j = 0; j < fields.size(); j++) {
                String values = JOptionPane.showInputDialog(null,
                                "Masukkan " + fields.get(j) + ":",
                                "Data input ke - " + i,
                                JOptionPane.QUESTION_MESSAGE);
                fields_values.get(i).add(j, values);
            }
        }

        Collections.sort(fields_values, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        String print_data = PrintArr(fields_values);

        JOptionPane.showMessageDialog(null, print_data, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String PrintArr(ArrayList<ArrayList<String>> val) {
        String output = "";

        for(int i = 0; i < fields.size(); i++) {
            for(int j = 0; j < fields.size(); j++) {
                output += fields.get(j) + ": " + val.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        return output;
    }

}
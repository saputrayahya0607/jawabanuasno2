import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1 {
    public static void main (String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("InputJumlah data yang akan di proses: ");
        int u = Integer.parseInt(reader.readLine());
        karakter_pertama = new char[u];
        int counter=0;
        for(int index = 0; index<u;index++){
            counter++;
            System.out.print("Masukan Nama" + counter + " : ");
            String name = reader.readLine();
            g.add(name);
            karakter_pertama[index] = g.get(index).charAt(index);
        }
        for (String name: g ){
            System.out.println(g + " ");
        }
        for (char karakter : karakter_pertama){
            System.out.println(karakter);
        }
    }
}

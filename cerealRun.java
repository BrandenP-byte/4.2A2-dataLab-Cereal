import java.util.*;
import java.io.*;
public class cerealRun{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("CerealData.csv"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList
        double[][] dataLine = new double[15];
        for (int i = 0; i < 15; i++){
            dataLine[i] = Integer.parseInt(st.nextToken());
        }
        Cereal cereal1 = new Cereal(dataLine[0], dataLine[1], ... );
        

    }
}
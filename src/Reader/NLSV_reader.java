package reader;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Taron on 03/25/17.
 */
public class NLSV_reader extends DataReader {

    @Override
    public int[] makeArray(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(new File(path));
        int count = 0;
        String str;
        int i = 0;
        while (bufferedReader.readLine() != null)
            count++;
        int[] numbers = new int[6];
        try {
            while ((str = scanner.nextLine()) != null) {
                numbers[i] = Integer.parseInt(str.trim());
                i++;
            }
        }catch (Exception e){
            return numbers;
        }

        return numbers;
    }
}

import action.Action;
import action.Action1;
import action.Action2;
import action.Action3;
import reader.CSV_reader;
import reader.DataReader;
import reader.NLSV_reader;
import reader.TSV_reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Taron on 03/25/17.
 */
public class Client {
    final String FILEPATH = "D:\\projects\\FileReader\\src\\";
    Action obj;
    int[] numbres;
    String str= "";
    public void start() throws IOException {
        System.out.println("Enter file name.");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("Enter task number.");
        int numberId = scanner.nextInt();
        DataReader dataReader = fileExtention(fileName);
        try {
            numbres = dataReader.makeArray(FILEPATH + fileName);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        switch (numberId){
            case 1: {
                obj = new Action1();
                System.out.println("action 1: ");
                str = "After action 1: ";
                break;
            }
            case 2: {
                obj = new Action2();
                System.out.println("action 2: ");
                str = "After action 2: ";
                break;
            }
            case 3: {
                obj = new Action3();
                System.out.println("action 3: ");
                obj.doAction(numbres);
                break;
            }
        }
        if (numberId != 3)
        System.out.println(str + obj.doAction(numbres));
    }

    public DataReader fileExtention(String filename){
        switch (filename.substring(filename.indexOf('.') + 1,filename.length())){
            case "csv" : {
                System.out.println("csv file");
                return new CSV_reader();
            }
            case "tsv": {
                System.out.println("tsv file");
                return new TSV_reader();
            }
            case "nlsv": {
                System.out.println("nlsv file");
                return new NLSV_reader();
            }
        }
        return null;
    }
}

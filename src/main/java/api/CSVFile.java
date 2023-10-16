package api;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVFile {

    public static void readAndWriteCSV() throws IOException {
        FileWriter writer = new FileWriter("src/test/resources/Files/test.csv");
        CSVWriter csv = new CSVWriter(writer);
        csv.writeNext(new String[]{"name", "role", "image"});
        csv.writeNext(new String[]{"Roja","sdet","black"});
        csv.flush();
        csv.close();
        FileReader reader = new FileReader("src/test/resources/Files/test.csv");
        CSVReader csvReader = new CSVReader(reader);
        String[] s;

        while((s=csvReader.readNext())!=null){
            System.out.println(Arrays.toString(s));
//            for(int i=0;i<s.length;i++){
//                System.out.println( s[i]);
//            }

        }

    }

    public static void text() throws IOException {
        FileWriter writer= new FileWriter("src/test/resources/Files/testdata.txt");
        writer.write("test");
        writer.write("test1");
        writer.flush();
        writer.close();
        FileReader reader = new FileReader("src/test/resources/Files/testdata.txt");
        BufferedReader read= new BufferedReader(reader);
        String s=null;
        while ((s=read.readLine())!=null){
            System.out.println(s);
        }

    }





    public static void xl(){
       // FileWriter writer= new FileWriter("src/test/resources/Files/Test.")
    }

    public static void main(String[] args) throws IOException {
       //readAndWriteCSV();
        text();
    }
}

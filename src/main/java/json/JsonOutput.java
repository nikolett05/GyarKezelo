package json;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import szolgaltatas.interfaces.DolgozokSzolgaltatas;

public class JsonOutput
{
    public static void main(String args[])
    {
        try
        {
            // Create a new JSONObject
            JSONObject elsoGyarDolgozoi = new JSONObject();
            JSONObject masodikGyarDolgozoi = new JSONObject();

            // Add the values to the elsoGyarDolgozoi
            elsoGyarDolgozoi.put("Name", "Carrie");
            elsoGyarDolgozoi.put("Age", "23");
            elsoGyarDolgozoi.put("Born", "1979.04.15");

            masodikGyarDolgozoi.put("Name", "Steve");
            masodikGyarDolgozoi.put("Age", "25");
            masodikGyarDolgozoi.put("Born", "1976.02.13");


            // Create a new JSONArray object
            JSONArray elsoGyarArray = new JSONArray();
            JSONArray masodikGyarArray = new JSONArray();

            // Create a new FileWriter object
            FileWriter fileWriter = new FileWriter("d:\\sample.json");

            // Writting the elsoGyarDolgozoi into sample.json
            fileWriter.write("Elso gyar"+ System.getProperty("line.separator") + '\t');
            fileWriter.write(elsoGyarDolgozoi.toJSONString()+ System.getProperty("line.separator"));
            fileWriter.write("Masodik gyar"+ System.getProperty("line.separator") + '\t');
            fileWriter.write(masodikGyarDolgozoi.toJSONString()+ System.getProperty("line.separator"));
            fileWriter.close();

            System.out.println("JSON Object Successfully written to the file!!");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
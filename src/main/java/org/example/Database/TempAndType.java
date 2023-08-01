package org.example.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class TempAndType {
    URL url ;
    HttpURLConnection connection;

    String type ;

    int DegreesKelvin;

    ArrayList result = new ArrayList<>();

    public TempAndType(String type) throws IOException {
        this.url= new URL("http://localhost:3000/api/star/details/"+type);
        this.connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String output;
        while ((output = input.readLine()) != null){
            output= output.replace("[","").replace("]","");
            processor(output);
        }
        generateValues();
    }
    public void generateValues () {
        for (Object valid_name:result) {
            String[] name_only = valid_name.toString().replace("{","").replace("}","").split(":");
            if(name_only[0].equals("\"type\"")) {
                this.type = name_only[1].replace("\"","");
            }else {
                this.DegreesKelvin = Integer.parseInt(name_only[1].replace("\"", ""));
            }
        }
    }

    public void processor(String output){
        String[] raw = output.split(",");
        for(String element : raw){
            result.add(element);
        }
    }

    public String getType() {
        return type;
    }

    public int getDegreesKelvin() {
        return DegreesKelvin;
    }

    public static void main(String[] args) throws IOException {
        TempAndType type = new TempAndType("Yellow%20Dwarf");
        System.out.println(type.getType());
        System.out.println(type.getDegreesKelvin());
    }
}

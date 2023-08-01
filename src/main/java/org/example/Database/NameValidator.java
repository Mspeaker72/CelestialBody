package org.example.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;

public class NameValidator {
    URL url = new URL("http://localhost:3000/api/names/");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    String name;
    private String Userinput;

    ArrayList result = new ArrayList<>();


    public NameValidator(String userInput) throws IOException {
        this.Userinput= userInput;
        connection.setRequestMethod("GET");
        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String output;
        while ((output = input.readLine()) != null){
            output= output.replace("[","").replace("]","");
            processor(output);
        }
        validate();
    }

    public void validate () {
        for (Object valid_name:result) {
            String[] name_only = valid_name.toString().replace("{","").replace("}","").split(":");
            String format =name_only[1].replace("\"","");
            if(format.equals(Userinput)){
                this.name= format;
            }
        }
    }

    public void processor(String output){
        String[] raw = output.split(",");
        for(String element : raw){
            result.add(element);
        }
    }

    public static void main(String[] args) throws IOException {
        NameValidator http = new NameValidator("Alpha Sirius");
    }


    public String getName() {
        return name;
    }
}

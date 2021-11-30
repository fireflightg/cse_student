

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        String linee = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        int count = 0;
        ArrayList<Student> sudarray = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = in.nextLine();
        try {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext())
            {

                String line = inputFile.nextLine();
                try{
                    
                }
                catch (NumberFormatException e){

                }
                if(Integer.parseInt(line) > 0 && count > 2){
                    line4 = line;
                    count++;
                }
                else if(Integer.parseInt(line) > 0 && count >1){
                    line3 = line;
                    count++;
                }
                else if(Integer.parseInt(line) > 0 ){
                    line2 = line;
                    count++;
                }
                else{
                    if(line2 != "" && line3 != "" && line4 != ""){
                        sudarray.add(new Student(linee,line2,line3,line4));
                    }

                    linee = line;
                    count = 0;
                }

            }


            inputFile.close();
        } catch (IOException e) {
            System.out.println(
                    "There was a problem reading from " + fileName);
        }  finally {

        }
        Student dex[] = new Student[sudarray.size()-1];
        for(int i = 0; i<sudarray.size(); i++){
            dex[i]=sudarray.get(i);
        }

    }
    public Student(String line ,String line1,String line2, String line3 ) {
        int  l1   = Integer.parseInt(line1);
        int  l2   = Integer.parseInt(line2);
        int  l3   = Integer.parseInt(line3);


    }
}


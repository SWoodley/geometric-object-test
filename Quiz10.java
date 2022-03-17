/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz10;
import java.util.*;
import java.lang.*;
import java.io.*;



public class Quiz10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter rectangle length: ");
        double length = input.nextDouble();
        
        System.out.println("Please enter rectangle width: ");
        double width = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(length,width);
        
        rectangle.printObject();
        
        
        try{
            File file = new File("randomString100.txt");
            file.createNewFile();
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file));
            
            for(int i=0;i<100;i++){
                fileWriter.write(randomString((int)(Math.random()*100)));
                fileWriter.newLine();
            }
            fileWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        try {
            Scanner output = new Scanner(new File("randomString100.txt"));
            //Scanner output = new Scanner(new BufferedReader(new FileReader("randomString100.txt")));
            String a[] = new String[100];
            for(int i=0;i<100;i++){
            a[i] = output.nextLine();//input strings to array
            }
            
            Arrays.sort(a, (b,c)->Integer.compare(b.length(), c.length()));//sort string by length
            
            for(int i=0;i<100;i++){
                System.out.println(a[i]);//print strings
            }
            
            output.close();
        }
        catch(Exception g){
            System.out.println("could not find file");
        }
        

    }
    
    public static String randomString(int count) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        
        for(;count>0;count--){
        int character = (int)(Math.random()*alphabet.length());
        builder.append(alphabet.charAt(character));
        }
        
        return builder.toString();
    }
}

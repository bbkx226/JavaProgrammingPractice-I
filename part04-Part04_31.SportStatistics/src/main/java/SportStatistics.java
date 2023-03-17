
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count = 0, win = 0, loss = 0;
        try (Scanner fileHandler = new Scanner(Paths.get(file))){
            while(fileHandler.hasNextLine()){
                String line = fileHandler.nextLine();
                String[] arr = line.split(",");
                if(arr[0].equals(team) || arr[1].equals(team)){
                    count += 1;
                    if(arr[0].equals(team)){
                        if(Integer.valueOf(arr[2]) > Integer.valueOf(arr[3])){
                            win += 1;
                        } else {
                            loss += 1;
                        }
                    }

                    if(arr[1].equals(team)){
                        if(Integer.valueOf(arr[3]) > Integer.valueOf(arr[2])){
                            win += 1;
                        } else {
                            loss += 1;
                        }
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}

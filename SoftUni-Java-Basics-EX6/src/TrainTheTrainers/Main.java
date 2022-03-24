package TrainTheTrainers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int members=Integer.parseInt(scan.nextLine());
        double markMid=0;
        int count=0;
        while(true){
            double questMarks=0;
            String presentation=scan.nextLine();
            if (presentation.equals("Finish")){
                markMid=markMid/count;
                System.out.printf("Student's final assessment is %.2f.",markMid);
                break;
            }else {
                for (int j = 0; j < members; j++) {
                    double mark = Double.parseDouble(scan.nextLine());
                    questMarks += mark;
                }

                questMarks = questMarks / members;
                markMid += questMarks;
                count++;
                System.out.printf("%s - %.2f.%n", presentation, questMarks);
            }
        }
    }
}

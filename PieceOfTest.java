import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PieceOfTest {
    private String name;
    private List<String> askingQ = new ArrayList(); // Запитаня -> ?
    private List<String> pieceQest;  // відповідь на запитання
    private List<List> question = new ArrayList(); // куча, де є відповіді

    private String pieceAns[];
    private List<List> rightAns = new ArrayList();

    void setName(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
    }

    protected void addQuestion(){

        Scanner sc = new Scanner(System.in);
        boolean stopList = true;
        boolean stopBloc = true;
        String quest = "";
        int qCount = 1;
        int aCount = 1;

        while(stopBloc){

            System.out.print("Enter question "+(qCount++)+" : ");
            askingQ.add(sc.next());

            while(stopList){

                System.out.print("Enter answer "+(aCount++)+" : ");
                if((quest = sc.next()).compareToIgnoreCase("exit") == 0)
                    stopList = false;

                else if(quest.compareToIgnoreCase("exitBloc") == 0){
                    stopBloc = false;
                    stopList = false;
                }

                else{
                    pieceQest = new ArrayList();
                    pieceQest.add(quest);
                }
            }
            aCount = 1;
            question.add(pieceQest);
            stopList = true;
        }
        System.out.println("Done!");
    }

    void addAnswer(){




    }
}

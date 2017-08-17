import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dawid on 03.08.2017.
 */
public class UserInterface {

    private Scanner input;
    private List<Jumper> jumperList;
    private int round;

    public UserInterface()
    {
        this.input = new Scanner(System.in);
        this.jumperList = new ArrayList<Jumper>();
        this.round = 1;
    }

    public void start()
    {
        System.out.println("Kumpula ski jumping week\n");
        participantsInput(input);
        System.out.println("\nThe tournament begins!\n");
        boolean check = true;
        while(check)
        {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            check = isCommandCorrect(this.input);
            if(check == false)
            {
                break;
            }
            System.out.println("\nRound "+this.round+"\n");
            printInOrder();
            System.out.println("Results of round "+this.round);
            for(Jumper item: this.jumperList)
            {
                jump(item);
            }
            this.round++;
            System.out.println();
        }
        System.out.println("Thanks!\n");
        Collections.sort(this.jumperList);
        Collections.reverse(this.jumperList);
        finalPrint();


    }

    public void participantsInput(Scanner add)
    {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String added = "example";
        while(!added.isEmpty())
        {
            System.out.print("  Participant name: ");
            added = add.nextLine();
            if(!added.isEmpty())
            {
                this.jumperList.add(new Jumper(added));
            }
        }
    }

    private boolean isCommandCorrect(Scanner add)
    {
        String command = add.nextLine();
        if(command.equals("jump"))
            return true;
        else
            return false;
    }

    private void printInOrder()
    {
        Collections.sort(this.jumperList);
        System.out.println("Jumping order:");
        for(Jumper item: this.jumperList)
        {
            System.out.println("  "+(this.jumperList.indexOf(item)+1)+". "+item);
        }
        System.out.println();
    }

    private void jump(Jumper jumper)
    {
        Jump jump = new Jump();
        jump.goJump();

        jumper.addJump(jump.getLength(),jump.getScore());
        System.out.println("  "+jumper.getName());
        System.out.println(jump);
    }

    private void finalPrint()
    {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(Jumper jumper: this.jumperList)
        {
            System.out.println((this.jumperList.indexOf(jumper)+1)+"           "+jumper);
            System.out.print("            jump lengths: ");
            jumper.printJumpLengths();
            System.out.println();
        }
    }



}

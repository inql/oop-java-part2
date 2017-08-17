
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString)
    {
        String smile = ":)";
        if(characterString.length()%2==1)
            characterString = " "+characterString+"  ";
        else
            characterString = " "+characterString+" ";
        int len = characterString.length()/smile.length()+2;
        for(int i = 0; i<3; i++)
        {
            if(i==1)
            {
                System.out.print(smile+characterString+smile);
            }
            else
            {
                for(int j=0; j<len; j++)
                {
                    System.out.print(smile);
                }
            }
            System.out.println();
        }
    }

}

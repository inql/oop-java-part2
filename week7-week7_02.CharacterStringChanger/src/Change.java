/**
 * Created by Dawid on 12.07.2017.
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter)
    {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString)
    {
        int i = 0;
        while(i <= characterString.lastIndexOf(fromCharacter))
        {
            int index = characterString.indexOf(fromCharacter,i);
            characterString = characterString.substring(0,index) + toCharacter + characterString.substring(index+1);
            i=index;
        }
        return characterString;
    }


}

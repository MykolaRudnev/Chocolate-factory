/**
 * Created by Николай on 16.05.2017.
 */
public class Chocolate {

    protected String about;
    protected void addChocolate(){
        System.out.println("Chocolate add");
    }
    public Chocolate getChocolate() { addChocolate(); return this; }
}

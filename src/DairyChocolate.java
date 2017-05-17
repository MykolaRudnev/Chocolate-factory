/**
 * Created by Николай on 16.05.2017.
 */
public class DairyChocolate extends Chocolate {

    public DairyChocolate() {
        about = "Milky";
    }

    public  void addMilk(){
        System.out.println("Milk added");
    }
    public  void addSugar(){
        System.out.println("Sugar added");
    }

    @Override
    protected void addChocolate() {
        super.addChocolate();
        addMilk();
        addSugar();
         return;
    }

    @Override
    public Chocolate getChocolate() {
        return super.getChocolate();
    }
}

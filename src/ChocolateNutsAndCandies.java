/**
 * Created by Николай on 16.05.2017.
 */
public class ChocolateNutsAndCandies extends Chocolate {


    public ChocolateNutsAndCandies() {
        about="With nuts";
    }
    public void AddNuts(){
        System.out.println("Add Nuts");
    }
    public void AddCandy(){
        System.out.println("Add Candy");
    }
    public  void AddSugar(){
        System.out.println("Sugar added");
    }

    @Override
    protected void addChocolate() {
        super.addChocolate();
        AddNuts();
        AddCandy();
        AddSugar();
        return;
    }

    @Override
    public Chocolate getChocolate() {
        return super.getChocolate();
    }
}

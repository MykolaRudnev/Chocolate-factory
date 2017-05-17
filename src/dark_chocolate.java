/**
 * Created by Николай on 16.05.2017.
 */
public class dark_chocolate extends Chocolate
{

    public void addDark(){
        System.out.println("Dark add");

    }
    public  void addExtraVanilla(){
        System.out.println("Add Extra Vanilla");
    }

    @Override
    protected void addChocolate() {
        super.addChocolate();
        addDark();
        addExtraVanilla();
    }

    @Override
    public Chocolate getChocolate() {
        return super.getChocolate();
    }


}

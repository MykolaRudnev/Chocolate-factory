import java.util.Scanner;

/**
 * Created by Николай on 16.05.2017.
 */
public class ChocolateMaker  extends Chocolate{
        public static  void main(String str[]){
            ChocolateNutsAndCandies cnac;
            DairyChocolate dairyChoco;
            dark_chocolate darkChoco;

            System.out.println("1.Chocolate Nuts And Candies\n2.Dairy Chocolate\n3.Dark Chocolate");
            System.out.print("Choose what kind of chocolate should : ");
            Scanner sc = new Scanner(System.in);
            int i=  sc.nextInt();

            switch (i) {
                case 1:
                    cnac = new ChocolateNutsAndCandies();
                    cnac.getChocolate();
                    break;
                case 2:
                    dairyChoco = new DairyChocolate();
                    dairyChoco.getChocolate();
                    break;
                case 3:
                    darkChoco = new dark_chocolate();
                    darkChoco.getChocolate();
                    break;

                default:
                    break;
            }

            }

        }



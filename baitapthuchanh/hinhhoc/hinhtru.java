package hinhhoc;

import java.util.Scanner;

public class hinhtru extends hinhhoc {

    public float chieucao;

    public hinhtru(){
        ten = "hinh tru";
    }

    public void nhapchieucao(){
        nhapbankinh();

        System.out.println("chieu cao =");
        Scanner sc = new Scanner.nextFloat();
    }
    
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich *chieucao;
    }
}

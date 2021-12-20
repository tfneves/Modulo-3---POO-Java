import java.sql.Date;
import java.util.Calendar;

public class exercicio3 {
    public static void main(String args[]){

        double valorEmpresaX = 1.13;
        double crescimentoEmpresaX = 1.48;

        double valorEmpresaY = 18.4;
        double crescimentoEmpresaY = 0.32;

        //get current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        while(valorEmpresaX < valorEmpresaY){
            System.out.println("Empresa X - 01/01/" + currentYear + " - Valor da empresa: " + valorEmpresaX);
            System.out.println("Empresa Y - 01/01/" + currentYear + " - Valor da empresa: " + valorEmpresaY + "\n");

            valorEmpresaX+=crescimentoEmpresaX*valorEmpresaX;
            valorEmpresaY+=crescimentoEmpresaY*valorEmpresaY;
            currentYear+=1;
        }

        System.out.println("Empresa X - 01/01/" + currentYear + " - Valor da empresa: " + valorEmpresaX);
        System.out.println("Empresa Y - 01/01/" + currentYear + " - Valor da empresa: " + valorEmpresaY + "\n");
    }
}

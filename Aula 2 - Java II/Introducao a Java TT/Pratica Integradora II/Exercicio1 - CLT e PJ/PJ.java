import java.util.Scanner;

public class PJ implements interface_salario{

    private double salarioBase;
    private double horasSemanais;

    @Override
    public double pagarSalario() {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = s.next();
        System.out.println("");

        if(cargo.toLowerCase().equals("tecnico")){
            this.salarioBase = 3200;
            this.horasSemanais = 40;
        }
        else if(cargo.toLowerCase().equals("analista")){
            this.salarioBase = 4000;
            this.horasSemanais = 40;
        }
        else if(cargo.toLowerCase().equals("gerente")){
            this.salarioBase = 6000;
            this.horasSemanais = 36;
        }
        else if(cargo.toLowerCase().equals("diretor")){
            this.salarioBase = 15000;
            System.out.println("Digite a quantidade de horas trabalhadas por semana");
            double horas = s.nextDouble();
            System.out.println("");

            s.close();
            return this.salarioBase * (horas*4);
        }
        else{
            s.close();
            return 0;
        }

        s.close();
        return this.salarioBase * (horasSemanais*4);
    }

}

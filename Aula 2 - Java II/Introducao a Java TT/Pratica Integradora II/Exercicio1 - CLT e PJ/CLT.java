import java.util.Scanner;

public class CLT implements interface_salario{

    private double salarioBase = 0;
    private double bonificacao = 0;

    @Override
    public double pagarSalario() {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = s.next();
        s.close();
        System.out.println("");

        if(cargo.toLowerCase().equals("tecnico")){
            this.salarioBase = 3200;
            this.bonificacao = 0.05;
        }
        else if(cargo.toLowerCase().equals("analista")){
            this.salarioBase = 4000;
            this.bonificacao = 0.08;
        }
        else if(cargo.toLowerCase().equals("gerente")){
            this.salarioBase = 6000;
            this.bonificacao = 0.125;
        }
        else if(cargo.toLowerCase().equals("diretor")){
            this.salarioBase = 15000;
            this.bonificacao = 0.03;
        }
        else{
            return 0;
        }

        return this.salarioBase + (this.salarioBase*this.bonificacao);
    }
}

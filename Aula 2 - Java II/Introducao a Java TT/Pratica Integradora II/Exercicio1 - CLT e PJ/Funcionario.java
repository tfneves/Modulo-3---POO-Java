public class Funcionario {
    
    private String nome;
    private int matricula;
    private String tipoFuncionario;

    public Funcionario(String nome, int matricula, String tipoFuncionario){
        this.nome = nome;
        this.matricula = matricula;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getTipoFuncionario(){
        return this.tipoFuncionario;
    }

    public void setTipoFuncionario(String tipo){
        this.tipoFuncionario = tipo;
    }


    public double calculaSalario(){
        if(this.tipoFuncionario.toLowerCase().equals("clt")){
            return new CLT().pagarSalario();
        }
        else if(this.tipoFuncionario.toLowerCase().equals("pj")){
            return new PJ().pagarSalario();
        }
        return -1;
    }


    public void showInfos(){

        double response = calculaSalario();

        if(response == 0){
            System.out.println("Cargo Inexistente!");
            return;
        }
        else if(response == -1){
            System.out.println("Tipo de funcionário Inválido!");
            return;
        }
        else{
            if(this.tipoFuncionario.toLowerCase().equals("clt")) this.setTipoFuncionario("CLT");
            else this.setTipoFuncionario("PJ");
        }

        System.out.println(
            "Nome: " + this.getNome() + "\n" +
            "Matrícula: " + this.getMatricula() + "\n" +
            "Tipo Funcionário: " + this.tipoFuncionario + "\n" + 
            "Salário Final: R$ " + response
        );
    }
}

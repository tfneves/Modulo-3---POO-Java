public class PasswordFraca extends Senha{
    
    // Mínimo de oito caracteres, pelo menos uma letra e um número
    private static String weakRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

    public PasswordFraca() {
        super(weakRegex);
    }
}

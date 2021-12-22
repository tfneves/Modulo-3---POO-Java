public class PasswordMedia extends Senha{

    // Mínimo de oito caracteres, pelo menos uma letra, um número e um caractere especial
    private static String mediumRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    
    public PasswordMedia() {
        super(mediumRegex);
    }
    
}

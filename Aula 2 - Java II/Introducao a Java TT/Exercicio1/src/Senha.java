import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Senha {
    
    private String regex;
    
    public Senha(String regex) {
        this.regex = regex;
    }

    public void setValue(String pwd) throws PatternSyntaxException {
        
        try{
            Pattern p = Pattern.compile(this.regex);
            Matcher m = p.matcher(pwd);
            boolean matchFound = m.find();

            if(matchFound) {
                System.out.println("Senha alterada com sucesso!");
                return;
            }
            throw new PatternSyntaxException("Senha não cumpre os requisitos necessários do regex", regex, 0);
        }catch(PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }
    }
}

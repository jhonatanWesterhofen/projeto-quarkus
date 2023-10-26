package main.exercicios.aula131.testSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que não or digito(caracteres especiais e etc)
        // \s = espacos em branco \t \n \f \r todos esses representam espacos em branco
        // \S = todos os espacos em branco
        // \w = traz tudo que for de a-z e A-Z, digitos 0 a 9 e __anderlaine
        // \W = contrario do \w , tudo que nao for incluso
        String regex = "\\d";
        // String texto = "abaaba";
        String texto2 = "jjkhsf33ni839da";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        
        System.out.println("Texto:  "+texto2);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.println (matcher.start() +" "+ matcher.group()+"\n");
        }
    }
    
}

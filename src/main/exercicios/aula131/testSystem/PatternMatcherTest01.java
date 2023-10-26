package main.exercicios.aula131.testSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        // String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        
        System.out.println("Texto:  "+texto2);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.println (matcher.start() + " ");
        }
    }
    
}

package main.exercicios.aula131.testSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que não or digito(caracteres especiais e etc)
        // \s = espacos em branco \t \n \f \r todos esses representam espacos em branco
        // \S = todos os espacos em branco
        // \w = traz tudo que for de a-z e A-Z, digitos 0 a 9 e __anderlaine
        // \W = contrario do \w , tudo que nao for incluso
        // [] = retorna tudo que tiver aqui dentro
        // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        // String texto = "abaaba";
        String texto2 = "12 0x 0x 0X 0xFFABC 0x109 0x1";
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

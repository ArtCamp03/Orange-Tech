package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int soma1, int soma2){
        return soma1+soma2;
    }
}

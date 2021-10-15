import empregados.*;

public class Teste {
    public static void main(String[] args) {
        Gerente ricardo = new Gerente("Ricardo", "121200", 5000);
        Assistente evelyn = new Assistente("Evelyn", "20201090", 1550.99);
        Vendedor jonas = new Vendedor("Jonas", "20201040", 2000, 450);

        System.out.printf("A remuneração do empregado %s é de R$%,.2f\n", ricardo.getNome(), ricardo.calculaSalario());
        System.out.printf("A remuneração da empregada %s é de  R$%,.2f\n", evelyn.getNome(), evelyn.calculaSalario());
        System.out.printf("A remuneração do empregado %s é de   R$%,.2f\n", jonas.getNome(), jonas.calculaSalario());

        System.out.printf("O valor total que a empresa arrecadou com esses três funcionários foi de R$%,.2f\n", ricardo.getSalario() + jonas.getSalario() + evelyn.getSalario());
        
        
    }
    
}

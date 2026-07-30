import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(27);
        numeros.add(15);
        numeros.add(2);
        numeros.add(12);
        numeros.add(6);
        numeros.add(54);

        Integer soma = 0;

        for (int i = 0;i <= numeros.size()-1;i++){
            Integer numero = numeros.get(i);

            if (numero %2 == 0){
                soma += numero;
            }
        }

        System.out.println("A soma total foi dos números pares foi de:"+soma);
    }
}
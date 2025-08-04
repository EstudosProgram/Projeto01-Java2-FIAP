package br.com.fiap.main;

public class TesteVetores {
    public static void main(String[] args) {
        String[] carros = {"Volvo","BMW","Ford","Mazda"};
        System.out.println(carros.length);
        System.out.println(carros[2]);
        int[] numeros = new int[3];
        numeros[0] = 23;
        numeros[1] = 17;
        numeros[2] = 45;
        //System.out.println(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //FOR-EACH
        for (String i : carros) {
            System.out.println(i);
        }
    }
}

package src.br.edu.iftm.calculadora.classes;

import java.util.ArrayList;

public class Calculadora {

    public String Calcula(String expressao){
        String resultado = "";
        ArrayList<Double> listaNumeros = new ArrayList<Double>();
        ArrayList<Character> listaOperadores = new ArrayList<Character>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calculaValor(listaNumeros, listaOperadores);
        return resultado;
    }

    private String calculaValor(ArrayList<Double> listaNumeros, 
        ArrayList<Character> listaOperadores) {
            String resultado = "";
            double total = 0.0d;
            int j=0;
            for (int i = 0; i < listaNumeros.size()-1; i++) {
                if(total == 0.0){
                    double numero1 = listaNumeros.get(i).doubleValue();
                    double numero2 = listaNumeros.get(i+1).doubleValue();
                    char operador = listaOperadores.get(i).charValue();
                    total = executarOperacao(numero1, operador, numero2);
                }else if(total>0.0){
                    double numero2 = listaNumeros.get(i+1).doubleValue();
                    char operador = listaOperadores.get(j+1).charValue();
                    total = executarOperacao(total, operador, numero2);
                    j++;
                }
            }
            resultado = ""+total;
        return resultado;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;
        
        if(operador == '+'){
            resultado = numero1 + numero2;
        }else if(operador == '-'){
            resultado = numero1 - numero2;
        }else if(operador == '/'){
            resultado = numero1 / numero2;
        }else if(operador == '*'){
            resultado = numero1 * numero2;
        }
        return resultado;
    }

    private ArrayList<Character> obterOperadores(String expressao) {
        ArrayList<Character> listaOperadores = new ArrayList<Character>();
        for (int i = 0; i < expressao.length(); i++) {
            if(eOperador(expressao.charAt(i))){
                listaOperadores.add(expressao.charAt(i));
            }
        }
        return listaOperadores;
    }

    private ArrayList<Double> obterNumeros(String expressao) {
        ArrayList<Double> listaNumeros = new ArrayList<Double>();
        String numeroNaString = "";
        for (int i = 0; i < expressao.length(); i++) {
            if(eOperador(expressao.charAt(i))){
                Double numero = Double.valueOf(numeroNaString);
                listaNumeros.add(numero);
                numeroNaString = "";
            }else{
                numeroNaString = numeroNaString.concat(""+expressao.charAt(i));
            }
        }
        if(!numeroNaString.isEmpty()){
            Double numero = Double.valueOf(numeroNaString);
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }

    private boolean eOperador(char character) {
        boolean eOperador = false;
        if(character == '-' || character == '+' || character == '/' || 
             character == '*' ){
            eOperador = true;
        }
        return eOperador;
    }
    
}

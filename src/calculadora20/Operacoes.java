package calculadora20;

public class Operacoes {
    
    static double resultado;
    
    public static void somar(double x1, double x2){
        resultado = x1+x2;
        System.out.println("Resultado = " + resultado);
    }
    
    public static void subtrair(double x1, double x2){
        resultado = x1-x2;
        System.out.println("Resultado = " + resultado);
    }
    
    public static void multiplicar(double x1, double x2){
        resultado = x1*x2;
        System.out.println("Resultado = " + resultado);
    }
    
    public static void dividir(double x1, double x2){
        if(x2 != 0){
            resultado = x1/x2;
            System.out.println("Resultado = " + resultado);
        } else {
            System.out.println("ERROR");
        }
        
        
    }
}

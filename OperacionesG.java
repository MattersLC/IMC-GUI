package POO;

public class OperacionesG {
    public double result;
    
    public void imc(double peso, double altura) {
        result = (peso/(Math.pow(altura,2)));
    }
}

class Calculadora { //SUPERCLASSE
    public int somar(int a, int b) { //MÉTODO INTEIRO
      return a + b; //RETORNO DA SOMA
    }
  
    public double somar(double a, double b) { //MÉTODO DECIMAL
      return a + b;//RETORNO DA SOMA
    }
  }
  
  public class PolimorfismoSobrecarga { //SUBCLASSE
    public static void main(String[] args) { //MÉTODO PRINCIPAL
      Calculadora calculadora = new Calculadora(); //INSTÂNCIA DA CLASSE CALCULADORA
  
      int somaInteiros = calculadora.somar(2, 3); // Polimorfismo por tipo de parâmetro
      double somaDecimais = calculadora.somar(5.5, 3.2); // Polimorfismo por tipo de retorno
  
      System.out.println("Soma de inteiros: " + somaInteiros);//EXIBIÇÃO DOS RESULTADOS
      System.out.println("Soma de decimais: " + somaDecimais);//EXIBIÇÃO DOS RESULTADOS
    }
  }
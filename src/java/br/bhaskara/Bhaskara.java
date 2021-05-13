package br.bhaskara;

public class Bhaskara {
   
    private int CoeA;
    private int CoeB;
    private int CoeC;
    private double x1;
    private double x2;
    private float calculaX;
    private float Delta;
    private float calxulaX1;
    private float calculaDeltaMenor;
    private String resultadoDelta;
    

    public int getCoeA() {
        return CoeA;
    }

    public void setCoeA(int coeA) {
        this.CoeA = coeA;
    }

    public int getCoeB() {
        return CoeB;
    }

    public void setCoeB(int coeB) {
        this.CoeB = coeB;
    }

    public int getCoeC() {
        return CoeC;
    }

    public void setCoeC(int coeC) {
        this.CoeC = coeC;
    }
        public String getresultadoDelta() {
            resultadoDelta = String.format("Coeficientes {a: %d; b: %d; c: %d}\n", CoeA, CoeB, CoeC) +
                             String.format("Delta: %.2f\n", Delta);
        return resultadoDelta;
        }

    public float Delta(int CoeA, int CoeB, int CoeC) {
        Delta = (CoeB * CoeB) + (-4 * (CoeA * CoeC));
         calculaDelta();
        return Delta;
    }

  public String calculaDelta() {
       if ( Delta < 0) {
            resultadoDelta = "Não existem Resultados Reais";
           
        } else if (Delta == 0) { 
           resultadoDelta = resultadoDelta + String.format("x¹ e x² = %.2f\n", getCalculaX());
           
        } else if (Delta > 0) {
            resultadoDelta = resultadoDelta + String.format("x¹ = %.2f\n", x1);
            resultadoDelta = resultadoDelta + String.format("x² = %.2f\n", x2);       
        }
     return resultadoDelta;
    }

    public String getCalculaX() {
         calculaX = (-CoeB / ( 2 * CoeA));
          resultadoDelta = resultadoDelta + String.format("x¹ e x² = %.2f\n", calculaX);
          return resultadoDelta;
    }

    public void setCalculaX(float calculaX) {
        this.calculaX = calculaX;
    }

    public String getCalxulaX1() {
         x1 = (-CoeB + Math.sqrt(Delta)) / (2 * CoeA);
         x2 = (-CoeB - Math.sqrt(Delta)) / (2 * CoeA);
         resultadoDelta = resultadoDelta + String.format("x¹ = %.2f\n", x1);
         resultadoDelta = resultadoDelta + String.format("x = %.2f\n", x2);  
         return resultadoDelta;
    }

    public void setCalxulaX1(float calxulaX1) 
    {
        this.calxulaX1 = calxulaX1;
    }

   // private float resultadoDelta() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }






package sesion02_mul_a;


public class Esferica {
    private float p; //Distancia desde el origen a un punto P.
    private float anguloTheta; //Ángulo con respecto al eje x de la proyección de punto sobre el plano xy.
    private float anguloFi; //Ángulo del vector formado por el punto y el origen con respecto al eje z.

    public Esferica(float p, float anguloTheta, float anguloFi) {
        this.p = p;
        this.anguloTheta = anguloTheta;
        this.anguloFi = anguloFi;
    }

    public Esferica() {
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getAnguloTheta() {
        return anguloTheta;
    }

    public void setAnguloTheta(float anguloTheta) {
        this.anguloTheta = anguloTheta;
    }

    public float getAnguloFi() {
        return anguloFi;
    }

    public void setAnguloFi(float anguloFi) {
        this.anguloFi = anguloFi;
    }

    

   

    
    
    
}

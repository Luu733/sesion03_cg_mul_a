
package sesion02_mul_a;


public class Cilindrica {
    private float angulo, radio, altura;

    public Cilindrica(float radio, float angulo, float altura) {
        this.angulo = angulo;
        this.radio = radio;
        this.altura = altura;
    }

    public Cilindrica() {
    }
    
    public Esferica cilindrica_esferica(float radio, float angulo, float z){
        float p= (float) Math.sqrt(Math.pow(radio, 2)+Math.pow(z, 2));
        float anguloFi = angulo;
        float anguloTheta = (float) Math.atan(radio/z);
        return new Esferica(p, anguloTheta, anguloFi);
    }
    
    public Esferica cilindrica_esferica(Cilindrica e){
        return cilindrica_esferica(e.getRadio(), e.getAngulo(), e.getAltura());
    }
    
    public Cilindrica esferica_cilindrica(float p, float anguloTheta, float anguloFi){
        float radio= (float) (p*Math.sin(anguloTheta));
        float angulo = anguloFi;
        float z= (float) (p *Math.cos(anguloTheta));
        return new Cilindrica(radio, angulo, z);
    }
    
   public Cilindrica esferica_cilindrica(Esferica f){
       return esferica_cilindrica(f.getP(), f.getAnguloTheta(), f.getAnguloFi());
   }
    

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}


package sesion02_mul_a;


public class Cartesiano {
	private float x; 
	private float y;
        private float z;
	
	public Cartesiano (float x, float y) {
		this.x=x; 
		this.y=y; 
	}

    public Cartesiano(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
        
	public Cartesiano() {
	
	}
        
	public Cartesiano polar_cartesiano (float radio, float angulo) { //Convierte de polares a cartesianas.
		float x= (float) (radio * Math.cos(angulo)); 
		float y=(float) (radio * Math.sin(angulo)); 
		
		return new Cartesiano(x,y); 
                //return new Cartesiano ((radio * Math.cos(angulo)), (radio * Math.sin(angulo)));
	}
        
        public Cartesiano polar_cartesiano (Polar p) {
           /* float x= (float) (p.getRadio() * Math.cos(p.getAngulo())); 
		float y=(float) (p.getRadio() * Math.sin(p.getAngulo())); 
            return new Cartesiano(x,y);*/
            return polar_cartesiano(p.getRadio(), p.getAngulo());
        }
       
        
        public Polar cartesiano_polar(float x, float y){
            float radio = (float) Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
            float angulo = (float) Math.atan(y/x);
            return new Polar(radio, angulo);
        }
        
        public Polar cartesiano_polar (Cartesiano c) {
            /*float radio = (float) Math.sqrt(Math.pow(c.getX(),2) + Math.pow(c.getY(), 2));
            float angulo = (float) Math.atan(c.getY()/c.getX());
            
            return new Polar(radio, angulo);*/
            return cartesiano_polar(c.getX(), c.getY());
        }
        
        
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	} 
	
	

}

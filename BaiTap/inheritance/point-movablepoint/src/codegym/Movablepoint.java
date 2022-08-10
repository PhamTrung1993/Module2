package codegym;

public class Movablepoint extends Point{
   private float xSpeed = 0.0f, ySpeed = 0.0f;

   public Movablepoint() {
   }

   public Movablepoint (float xSpeed, float ySpeed){
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
   }

   public Movablepoint(float x,float y,float xSpeed,float ySpeed){
       super(x, y);
       this.ySpeed = ySpeed;
       this.xSpeed = xSpeed;
   }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
       float[] array = new float[2];
       array[0] = xSpeed;
       array[1] = ySpeed;
       return array;
    }

    public String toString() {
       return super.toString() + ", speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    public void Move(){
       super.setXY(super.getX() + xSpeed, super.getX() + ySpeed);
    }
}

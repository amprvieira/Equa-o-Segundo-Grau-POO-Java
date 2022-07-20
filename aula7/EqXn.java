package aula7;

public class EqXn extends Equacao{
    private double xn;
    private double xp;

    public double calculaXn(Delta delta) {
        xn = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xn;
    }

    public double calculaXp(Delta delta) {
        xp = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xp;
    }

    
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }


    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

}
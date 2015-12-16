
public class QSVU_UEbung3_0947919_Delalic_Salmir_Triangle {

    private double a, b;
    private double hyp; //hyp.. Hypothenuse

    /**
     * Calculates the hypothenuse of the triangle by knowing the other two lenghts
     */
    public void calcHyp(double a, double b) {
        this.hyp = Math.sqrt((a*a) + (b*b));
    }

    /**
     * Calculates the 3rd angle of the triangle, with a second known angle as input
     * @param knownAngle not the right Angle! (less then 90)
     */
    public double calcAngle(double knownAngle) {

        return 90-knownAngle;
    }

    /**
     * Calculates the surface of the triangle
     * @return the surface of the triangle
     */
    public double calcArea(double a, double b) {

        return (a*b) / 2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getHyp() {
        return hyp;
    }
}
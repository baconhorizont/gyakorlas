public class Triangle {
    private int sideA;
    private int sideB;

    public Triangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateCSide() {
         double sideC = (sideA * sideA + sideB * sideB);

        return Math.sqrt(sideC);
    }

}

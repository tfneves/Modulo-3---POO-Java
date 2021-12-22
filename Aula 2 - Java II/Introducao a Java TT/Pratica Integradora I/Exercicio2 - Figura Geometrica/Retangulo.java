public class Retangulo extends FiguraGeometrica {
    
    private double lado;

    public Retangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

}

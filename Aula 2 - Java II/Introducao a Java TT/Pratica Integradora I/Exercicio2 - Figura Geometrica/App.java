public class App {
    public static void main(String[] args) throws Exception {
        Circulo c = new Circulo(2);
        Retangulo r = new Retangulo(2);
        Triangulo t = new Triangulo(3, 4);

        FiguraGeometrica[] figs = new FiguraGeometrica[3];
        figs[0] = c;
        figs[1] = r;
        figs[2] = t;

        System.out.println(Utils.areaMedia(figs));
    }
}

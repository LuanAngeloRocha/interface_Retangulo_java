

public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(6);
        retangulo.setAltura(4);
        retangulo.setLado1(10);
        retangulo.setLado2(5);
        System.out.println(retangulo.getPerimetro());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getNomeFigura());
    }
    
}

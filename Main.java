public class Main {

    abstract static class FiguraGeometrica {
        public abstract double calcularArea();
        public abstract double calcularPerimetro();
    }

    static class Circulo extends FiguraGeometrica {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }
    }

    static class Quadrado extends FiguraGeometrica {
        private double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }

        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    }

    static class Triangulo extends FiguraGeometrica {
        private double base;
        private double altura;
        private double ladoA;
        private double ladoB;
        private double ladoC;

        public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
            this.base = base;
            this.altura = altura;
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        @Override
        public double calcularPerimetro() {
            return ladoA + ladoB + ladoC;
        }
    }

    public static void main(String[] args) {
        FiguraGeometrica c = new Circulo(5);
        FiguraGeometrica q = new Quadrado(4);
        FiguraGeometrica t = new Triangulo(6, 4, 6, 5, 4);

        System.out.println("Círculo:");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + q.calcularArea());
        System.out.println("Perímetro: " + q.calcularPerimetro());

        System.out.println("\nTriângulo:");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
    }
}

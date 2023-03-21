public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.setCor("Amarelo");
        car.setModelo("HB20");
        car.setCapacidadeTanque(80);

        System.out.println("Cor: "+car.getCor());
        System.out.println("Modelo: "+car.getModelo());
        System.out.println("Capacidade: "+car.getCapacidadeTanque());
        System.out.println("Total: "+car.totalValorTanque(30));

        System.out.println(" ");

        Carro car2 = new Carro("Vermelho", "Chevet", 150);
        System.out.println("Cor: "+car2.getCor());
        System.out.println("Modelo: "+car2.getModelo());
        System.out.println("Capacidade: "+car2.getCapacidadeTanque());
        System.out.println("Total: "+car2.totalValorTanque(30));

    }
}

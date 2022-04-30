package adapter;

public class BuracoRedondo {
	private double raio;

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public boolean cabe(PinoRedondo pino) {
        boolean resultado;
        resultado = (this.getRaio() >= pino.getRaio());
        return resultado;
    }
}

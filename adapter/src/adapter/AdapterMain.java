package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuracoRedondo buraco = new BuracoRedondo(10);
		PinoRedondo pinoR = new PinoRedondo(10);
		if (buraco.cabe(pinoR)) {
			System.out
					.println("Pino redondo com raio: " + pinoR.getRaio() + ", cabe no buraco raio " + buraco.getRaio());
		} else if (buraco.cabe(pinoR)) {
			System.out
					.println("Pino redondo com raio: " + pinoR.getRaio() + ", não cabe no buraco raio " + buraco.getRaio());
		}

		PinoQuadrado pinoQuadradoPequeno = new PinoQuadrado(14);
		PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(15);

		PinoQuadradoAdapter pinoQuadradoPequenoAdapter = new PinoQuadradoAdapter(pinoQuadradoPequeno);
		PinoQuadradoAdapter pinoQuadradoGrandeApapter = new PinoQuadradoAdapter(pinoQuadradoGrande);

		if (buraco.cabe(pinoQuadradoPequenoAdapter)) {
			System.out.println("Pino quadrado com a largura: " + pinoQuadradoPequeno.getLargura()
					+ ", cabe no buraco raio " + buraco.getRaio());
		} else if (!buraco.cabe(pinoQuadradoPequenoAdapter)) {
			System.out.println("Pino quadrado com a largura: " + pinoQuadradoPequeno.getLargura()
					+ ", não cabe no buraco raio " + buraco.getRaio());
		}

		if (buraco.cabe(pinoQuadradoGrandeApapter)) {
			System.out.println("Pino quadrado com a largura: " + pinoQuadradoGrande.getLargura()
					+ ", cabe no buraco raio " + buraco.getRaio());
		} else if (!buraco.cabe(pinoQuadradoGrandeApapter)) {
			System.out.println("Pino quadrado com a largura " + pinoQuadradoGrande.getLargura()
					+ ", não cabe no buraco raio " + buraco.getRaio());
		}
	}

}

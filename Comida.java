public class Comida extends Juego{
    char simb;

    public Comida(char simb) {
        setSimbolo(simb);
    }
   public void anadirComida(Marco marc, Comida com) {
		marc.setLocalizacion(com, (int) (Math.random() * (marc.getAncho() - 1)),
				(int) (Math.random() * (marc.getAltura() - 1)));
	}
    
}
public class Pared extends Juego{
    public Pared(){
    setSimbolo('#');
    }
    public Pared(char par){
        setSimbolo(par);
    }
    public void anadirFilas(Marco mar, Pared pared, int filaColum) {
		for (int i = 0; i < mar.getAncho(); i++) {
			mar.setLocalizacion(pared, i, filaColum);
		}
	}

	
	public void anadirColumna(Marco mar, Pared pared, int numeroColum) {
		for (int i = 0; i < mar.getAltura(); i++) {
			mar.setLocalizacion(pared, numeroColum, i);
		}
	}
}

public class Marco {
    private int ancho;
    private int altura;
    private char [][] pantalla;

    public Marco(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;
        this.pantalla = pantalla;
    }
    public void pantalla() {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.ancho; j++) {
				this.pantalla[i][j] = ' ';
			}
		}
	}

	
	public void ImpriPantalla() {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.ancho; j++) {
				System.out.print(this.pantalla[i][j]);
			}
			System.out.println();
		}
	}
    public void ClearScreenLocation(int x, int y) {
		this.pantalla[y][x] = ' ';
	}

    public int getAncho() {
        return this.ancho;
    }

    public int getAltura() {
        return this.altura;
    }

    public char getObjectOnLocation(int x, int y) {
		return this.pantalla[x][y];
	}

    public void setObjectOnLocation(Juego objeto, int x, int y) {
		this.pantalla[x][y] = objeto.getSimbolo();
	} 
}

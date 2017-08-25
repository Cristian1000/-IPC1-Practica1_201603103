public class Serpiente extends Juego{
       int posisionx;
       int posisiony;
       char sim;

    public Serpiente(int posisionx, int posisiony, char sim) {
        setSimbolo(sim);
        setX(posisionx);
        setY(posisiony);
    }
    public void izquierda(Marco mar, Serpiente snake) {
		snake.setX(getX() - 1);
		mar.setLocalizacion(snake, snake.getX(), snake.getY());
                if(sim =='*'){
                    System.out.println(sim+sim);
                }else{
                mar.limpiar(snake.getX() + 1, snake.getY());
                }
	}
	
	public void derecha(Marco mar, Serpiente snake) {
		snake.setX(getX() + 1);
		mar.setLocalizacion(snake, snake.getX(), snake.getY());
                if(sim == '*'){System.out.println(sim+sim);}else{
                mar.limpiar(snake.getX() - 1, snake.getY());
                }
	}
	
	public void arriba(Marco mar, Serpiente snake) {
		snake.setY(getY() - 1);
		mar.setLocalizacion(snake, snake.getX(), snake.getY());
                if(sim == '*'){System.out.println(sim+sim);}else{
                mar.limpiar(snake.getX(), snake.getY() + 1);
                }
                }
	
	public void abajo(Marco mar, Serpiente snake) {
		snake.setY(getY() + 1);
		mar.setLocalizacion(snake, snake.getX(), snake.getY());
                if(sim == '*'){System.out.println(sim+sim);}else{
                mar.limpiar(snake.getX(), snake.getY() - 1);
                }
	}
        
}

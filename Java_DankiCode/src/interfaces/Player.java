package interfaces;

public class Player {
	public int life = 100;
	
	public void AtacarInimigo (Inimigo inimigo) {
		inimigo.life --;
		
	}// fim do metado atacaInimigo

}

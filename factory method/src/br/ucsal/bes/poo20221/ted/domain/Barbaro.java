package br.ucsal.bes.poo20221.ted.domain;

public class Barbaro extends Personagem {
	public Barbaro() {
		super();
	}
	
	public Barbaro(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean esquivaN, boolean furia, boolean reducaoDano) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.esquivaN = esquivaN;
		this.furia = furia;
		this.reducaoDano = reducaoDano;
		
	}
	
	// habilidades unicas de barbaro
	// achei melhor colocar s� 3 habilidades por classe de personagem, pra n�o ficar
	// muita coisa desnecess�ria
	// minha ideia foi colocar boolean pra tipo, se o personagem tiver essa
	// habilidade, coloca true
	private boolean esquivaN; // esquiva natural
	private boolean furia;
	private boolean reducaoDano;
	

	public boolean isEsquivaN() {
		return esquivaN;
	}

	public void setEsquivaN(boolean esquivaN) {
		this.esquivaN = esquivaN;
	}

	public boolean isFuria() {
		return furia;
	}

	public void setFuria(boolean furia) {
		this.furia = furia;
	}

	public boolean isReducaoDano() {
		return reducaoDano;
	}

	public void setReducaoDano(boolean reducaoDano) {
		this.reducaoDano = reducaoDano;
	}

	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRa�a: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nN�vel: "
				+ this.getNivel() + "\nFor�a: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstitui��o: " + this.getCon() + "\n Intelig�ncia: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Esquiva Natural? " + isEsquivaN()
				+ "\nTem a skill F�ria?" + isFuria() + "\nTem a skill Redu��o de dano? " + isReducaoDano();
		return ficha;
	}
}

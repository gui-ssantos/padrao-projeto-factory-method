package br.ucsal.bes.poo20221.ted.domain;

public class Ladino extends Personagem {
	
	public Ladino() {
	super();
	}
	
	public Ladino(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean ataqueFurtivo, boolean esquivaSN, boolean furtiSuperior) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.ataqueFurtivo = ataqueFurtivo;
		this.esquivaSN = esquivaSN;
		this.furtiSuperior = furtiSuperior;
		
	}

	// habilidades unicas de ladino
	private boolean ataqueFurtivo;
	private boolean esquivaSN; // esquiva sobrenatural
	private boolean furtiSuperior;

	// getters e setters
	public boolean isAtaqueFurtivo() {
		return ataqueFurtivo;
	}

	public void setAtaqueFurtivo(boolean ataqueFurtivo) {
		this.ataqueFurtivo = ataqueFurtivo;
	}

	public boolean isEsquivaSN() {
		return esquivaSN;
	}

	public void setEsquivaSN(boolean esquivaSN) {
		this.esquivaSN = esquivaSN;
	}

	public boolean isFurtiSuperior() {
		return furtiSuperior;
	}

	public void setFurtiSuperior(boolean furtiSuperior) {
		this.furtiSuperior = furtiSuperior;
	}

	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRa�a: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nN�vel: "
				+ this.getNivel() + "\nFor�a: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstitui��o: " + this.getCon() + "\n Intelig�ncia: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Ataque Furtivo? " + isAtaqueFurtivo()
				+ "\nTem a skill Esquiva Sobrenatural?" + isEsquivaSN() + "\nTem a skill Furtividade Superior? " + isFurtiSuperior();
	return ficha;
	}
}
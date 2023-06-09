package br.ucsal.bes.poo20221.ted.domain;

public class Mago extends Personagem {
	
	public Mago() {
	super();
	}

	public Mago(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean fireball, boolean persuasao, boolean curaFeitico) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.fireball = fireball;
		this.persuasao = persuasao;
		this.curaFeitico = curaFeitico;
		
	}

	// habilidades unicas de mago
	private boolean fireball;
	private boolean persuasao;
	private boolean curaFeitico;

	// getters and setters
	public boolean isFireball() {
		return fireball;
	}

	public void setFireball(boolean fireball) {
		this.fireball = fireball;
	}

	public boolean isPersuasao() {
		return persuasao;
	}

	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}

	public boolean isCuraFeitico() {
		return curaFeitico;
	}

	public void setCuraFeitico(boolean curaFeitico) {
		this.curaFeitico = curaFeitico;
	}
	
	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRa�a: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nN�vel: "
				+ this.getNivel() + "\nFor�a: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstitui��o: " + this.getCon() + "\n Intelig�ncia: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Bola de Fogo? " + isFireball()
				+ "\nTem a skill Persuas�o?" + isPersuasao() + "\nTem a skill Feiti�o de Cura? " + isCuraFeitico();
	return ficha;
	}
}
package br.ucsal.bes.poo20221.ted.factory;

import br.ucsal.bes.poo20221.ted.domain.Personagem;

public abstract class PersonagemFactory {
	
	//Método de criar personagem, que será utilizado pelas classes herdeiras.
	public abstract Personagem criarPersonagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean habilidade1, boolean habilidade2, boolean habilidade3);
}

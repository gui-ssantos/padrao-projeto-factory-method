package br.ucsal.bes.poo20221.ted.factory;

import br.ucsal.bes.poo20221.ted.domain.Barbaro;
import br.ucsal.bes.poo20221.ted.domain.Personagem;

public class BarbaroFactory extends PersonagemFactory {

	//Método de criar personagem herdado da classe mãe, nesse caso especificamente para Barbaro.
	@Override
	public Personagem criarPersonagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel, int frc,
			int des, int con, int itl, int sab, int car, boolean esquivaN, boolean furia,
			boolean reducaoDano) {
		Barbaro barbaro = new Barbaro(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
				esquivaN, furia, reducaoDano);
		return barbaro;
	}

}

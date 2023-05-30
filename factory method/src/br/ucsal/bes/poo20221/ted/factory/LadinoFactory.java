package br.ucsal.bes.poo20221.ted.factory;


import br.ucsal.bes.poo20221.ted.domain.Ladino;
import br.ucsal.bes.poo20221.ted.domain.Personagem;

public class LadinoFactory extends PersonagemFactory {

	//Método de criar personagem herdado da classe mãe, nesse caso especificamente para Ladino.
	@Override
	public Personagem criarPersonagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel, int frc,
			int des, int con, int itl, int sab, int car, boolean ataqueFurtivo, boolean esquivaSN,
			boolean furtiSuperior) {
		Ladino ladino = new Ladino(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
				ataqueFurtivo, esquivaSN, furtiSuperior);
		return ladino;
	}

}

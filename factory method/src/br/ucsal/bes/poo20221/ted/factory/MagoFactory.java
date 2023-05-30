package br.ucsal.bes.poo20221.ted.factory;


import br.ucsal.bes.poo20221.ted.domain.Mago;
import br.ucsal.bes.poo20221.ted.domain.Personagem;

public class MagoFactory extends PersonagemFactory{

	//Método de criar personagem herdado da classe mãe, nesse caso especificamente para Mago.
	@Override
	public Personagem criarPersonagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel, int frc,
			int des, int con, int itl, int sab, int car, boolean fireball, boolean persuasao,
			boolean curaFeitico) {
		Mago mago = new Mago(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
				fireball, persuasao, curaFeitico);
		return mago;
	}

}

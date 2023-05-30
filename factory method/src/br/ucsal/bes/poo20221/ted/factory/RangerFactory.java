package br.ucsal.bes.poo20221.ted.factory;


import br.ucsal.bes.poo20221.ted.domain.Personagem;
import br.ucsal.bes.poo20221.ted.domain.Ranger;

public class RangerFactory extends PersonagemFactory {

		//Método de criar personagem herdado da classe mãe, nesse caso especificamente para Ranger.
		@Override
		public Personagem criarPersonagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel, int frc,
				int des, int con, int itl, int sab, int car, boolean rastreadorEficaz, boolean rastroInvisivel,
				boolean camuflagem) {
			Ranger ranger = new Ranger(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
					rastreadorEficaz, rastroInvisivel, camuflagem);
			return ranger;
		}
	
}

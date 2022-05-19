package treTest;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.InternationalFormatter;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {//solução para thread ficar operando em subnivel
		Iterator iteracao = pilha_fila.iterator();
		while(iteracao.hasNext()) {
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
			
			///processar 10 mil notas fiscais 
			//gerar uma lista enorme de pdf
			//gerar um envio em massa de email 
		}

	}
}

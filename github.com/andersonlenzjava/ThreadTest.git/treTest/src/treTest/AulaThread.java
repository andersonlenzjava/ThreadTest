package treTest;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
//------------------------------------------DIVISÃO DAS THREADS
		// Thread enviando nota fiscal
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		System.out.println(" Chegou no fim do thread ");
		JOptionPane.showMessageDialog(null, "sistema continua executando para o usuário");
	}

	private static Runnable thread1 = new Runnable(){

		public void run(){
		// TODO Auto-generated method stub
			for(int pos=0;pos<10;pos++){
	
				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executa uma rotina de envio de nota fiscal");
	
				try{Thread.sleep(1000);}catch(InterruptedException e){// se der um erro na thread ele aciona o cath
					// TODO Auto-generated catch block
					e.printStackTrace();// pode acionar alguma rotina de erro
				} // contador de tempo
			}
			
		}	

	};
	
	private static Runnable thread2 = new Runnable() {

		public void run() {
			// TODO Auto-generated method stub
			for (int pos = 0; pos < 10; pos++) {

				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executa uma rotina de envio de e-mail");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {// se der um erro na thread ele aciona o cath
					// TODO Auto-generated catch block
					e.printStackTrace();// pode acionar alguma rotina de erro
				} // contador de tempo
			}
		}
	
	};
	
}

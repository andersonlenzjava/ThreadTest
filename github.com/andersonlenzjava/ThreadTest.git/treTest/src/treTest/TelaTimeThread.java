package treTest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());// painel de componentes

	private JLabel descricaoHora = new JLabel("time thread 1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("time thread 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	//***********************************************
	private  Runnable thread1 = new Runnable() {
		
		public void run() {
			while(true) { //Fica sempre rodando 
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread thread1Time;
//*******************************************************
	
	public TelaTimeThread() {// Executa o que estiver dentro no momento da instânciação do objeto
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Primeira parte concluida

		GridBagConstraints gridBagConstraints = new GridBagConstraints();// Controlador de posicionamento de compones
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);

		// ***************************************************

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		//--------------------------------------função botão start
		jButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {//execua o clique no botão 
				// TODO Auto-generated method stub
				
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
			}
		});
		
		//--------------------------------------função botão stop
		
		jButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
			}
		});
		

		add(jPanel, BorderLayout.WEST);
		// Sempre será o ultimo comando
		setVisible(true);// Torna a tela visivel para o usuário
	}

}

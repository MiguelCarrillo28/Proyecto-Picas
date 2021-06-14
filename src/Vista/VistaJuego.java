package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controlador.ControladorJuego;
import Modelo.Juego;


public class VistaJuego extends JFrame {
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 500;
	public static final String VERIFICAR = "VERIFICAR";
	public static final String LIMPIAR = "LIMPIAR";
	private ControladorJuego ControladorJuego;
	private Juego juego;
	private JButton verificar;
	private JButton limpiar;
	private JLabel lNom;
	private JLabel ins;
	private JLabel nUno;
	private JLabel nDos;
	private JLabel nTres;
	private JLabel nCuatro;
	private JLabel lOportunidades;
	private JLabel lPicas;
	private JLabel lFijas;
	private JLabel lTit;
	private JTextField jTNom;
	private JTextField nOne;
	private JTextField nTwo;
	private JTextField nThree;
	private JTextField nFour;
	private JTextField jPicas;
	private JTextField jFijas;
	private JTextField jOportunidades;
	private ActionListener listener;
	
	
	public VistaJuego(ControladorJuego pControl ) {
			listener = new BotonListener();
			ControladorJuego = pControl;
		    crearPanel();
		    setSize(FRAME_WIDTH, FRAME_HEIGHT);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
		    }
	class BotonListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {  
			 if (e.getActionCommand().equalsIgnoreCase(VERIFICAR)){
			
			 } else
			     if (e.getActionCommand().equalsIgnoreCase(LIMPIAR)){
				  limpiarCampos();
			   }
	
		}
		
	}
	private void crearPanel() {
		jTNom = new JTextField(10);
        nOne = new JTextField(5);
        nTwo = new JTextField(5);
        nThree = new JTextField(5);
        nFour = new JTextField(5);
        jOportunidades = new JTextField(5);
        jPicas = new JTextField(5);
        jFijas= new JTextField(5);
        lNom = new JLabel();
        ins = new JLabel();
        nUno = new JLabel();
        nDos = new JLabel();
        nTres = new JLabel();
        nCuatro = new JLabel ();
        lPicas = new JLabel();
        lFijas = new JLabel();
        lOportunidades = new JLabel();
        lTit = new JLabel();
        limpiar = new JButton(LIMPIAR);
        limpiar.setActionCommand(LIMPIAR);
        verificar = new JButton(VERIFICAR);
        verificar.setActionCommand(VERIFICAR);
        jTNom.setText("");
        nOne.setText("");
        nTwo.setText("");
        nThree.setText("");
        nCuatro.setText("");
        jFijas.setText("");
        jPicas.setText("");
        jOportunidades.setText("10");
        lTit.setText("Picas y Fijas");
        lNom.setText("Digite su nombre");
        ins.setText("Adivina el número de 4 cifras");
        nUno.setText("#1");
        nDos.setText("#2");
        nTres.setText("#3");
        nCuatro.setText("#4");
        lOportunidades.setText("Oportunidades");
        jPicas.setText("Picas");
        jFijas.setText("Fijas");
        limpiar.setText("Limpiar");
        verificar.setText("Verificar");
        limpiar.addActionListener(listener);
        verificar.addActionListener(listener);
        setLayout(new GridLayout(2, 1));
        JPanel pantit = new JPanel();
        pantit.add(lTit);
        add(pantit);
        JPanel panel = new JPanel();
        panel.add(lNom);
        panel.add(jTNom);
        panel.add(ins);
        panel.add(nUno);
        panel.add(nOne);
        panel.add(nDos);
        panel.add(nTwo);
        panel.add(nTres);
        panel.add(nThree);
        panel.add(nCuatro);
        panel.add(nFour);
        panel.add(lOportunidades);
        panel.add(jOportunidades);
        panel.add(verificar);
        panel.add(limpiar);
        add(panel);
        
	}
	public void limpiarCampos() {
		nOne.setText("");
		nTwo.setText("");
		nThree.setText("");
		nFour.setText("");
	}
	
	public String darNombre() {
    	return jTNom.getText();
    	
    }
	public void listar(String lista) {
    	JOptionPane.showMessageDialog(this,lista,"", JOptionPane.INFORMATION_MESSAGE);
    }
    public int darPrimerNumero() {
    	return Integer.parseInt(nOne.getText());
    }
    public int darSegundoNumero() {
    	return Integer.parseInt(nTwo.getText());
    }
    public int darTercerNumero() {
    	return Integer.parseInt(nThree.getText());
    }
    public int darCuartoNumero() {
    	return Integer.parseInt(nFour.getText());
    }
    
 
	

}
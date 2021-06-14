package Controlador;
import java.util.Scanner;

import Modelo.MundoDelJuego;
import Vista.VistaJuego;
import Modelo.Juego;


public class ControladorJuego {
    private VistaJuego gui;
    private MundoDelJuego mun;
    Scanner sc;
    Juego p;
    String nombre; 
    
	public ControladorJuego() {
		mun = new MundoDelJuego();
		gui = new VistaJuego(this);
		gui.setVisible(true);		
	}
	public void verificar() {
		Juego p = crearJuego();
		mun.verificarNum(p);
	}
	public void listare() {
		gui.listar(mun.listarJugador());
	}
	public Juego crearJuego() {
		Juego j = null;
		String nom = gui.darNombre();
		int n1 = gui.darPrimerNumero();
		int n2 = gui.darSegundoNumero();
		int n3 = gui.darTercerNumero();
		int n4 = gui.darCuartoNumero();
		j = new Juego(nom,n1,n2,n3,n4);
		gui.limpiarCampos();
		return j;
	}
	
		
	}
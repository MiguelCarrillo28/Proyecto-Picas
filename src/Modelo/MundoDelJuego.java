package Modelo;

import javax.swing.JOptionPane;

import Modelo.Juego;

public class MundoDelJuego {
	private Juego j;
	
	
	public MundoDelJuego() {
		j = null;
		
	}
	public Juego getJ() {
		return j;
	}

	public void setJ(Juego j) {
		this.j = j;
	}
	public String listarJugador() {
		String cad =" \n";
		if(j!=null)
		  cad = cad+j.toString()+"\n";
		return cad;
	}

	


	public void verificarNum(Juego pJ) {
		if(j == null)
		   j = pJ;
			 else
			   System.out.println("Procesando");
	}
	
	
	}
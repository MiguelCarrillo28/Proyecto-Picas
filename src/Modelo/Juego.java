 package Modelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Juego {
	
	private String nombre;
	private int c1,c2,c3,c4;
	private int j1,j2,j3,j4;
	private int picas;
	private int fijas;
	private int oportunidades = 10;
	
	public Juego(String pNombre,int pC1,int pC2,int pC3,int pC4, int pJ1,int pJ2, int pJ3, int pJ4, int pPicas, int pFijas, int pOportunidades  ) {
		nombre = pNombre;
		c1 = pC1;
		c2 = pC2;
		c3 = pC3;
		c4 = pC4;
		j1 = pJ1;
		j2 = pJ2;
		j3 = pJ3;
		j4 = pJ4;
		picas = pPicas;
		fijas = pFijas;
		oportunidades = pOportunidades;
		
		
	}
	
	
	public Juego(String nom, int n1, int n2, int n3, int n4) {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	public int getC3() {
		return c3;
	}
	public void setC3(int c3) {
		this.c3 = c3;
	}
	public int getC4() {
		return c4;
	}
	public void setC4(int c4) {
		this.c4 = c4;
	}
	public int getJ1() {
		return j1;
	}
	public void setJ1(int j1) {
		this.j1 = j1;
	}
	public int getJ2() {
		return j2;
	}
	public void setJ2(int j2) {
		this.j2 = j2;
	}
	public int getJ3() {
		return j3;
	}
	public void setJ3(int j3) {
		this.j3 = j3;
	}
	public int getJ4() {
		return j4;
	}
	public void setJ4(int j4) {
		this.j4 = j4;
	}
	public int getPicas() {
		return picas;
	}
	public void setPicas(int picas) {
		this.picas = picas;
	}
	public int getFijas() {
		return fijas;
	}
	public void setFijas(int fijas) {
		this.fijas = fijas;
	}
	public int getOportunidades() {
		return oportunidades;
	}
	public void setOportunidades(int oportunidades) {
		this.oportunidades = oportunidades;
	}
	Random a = new Random();



	public void numeroAleatorio() {
		
		c1 = (int)(a.nextInt()*9);
		do {
			c2 = (int)(a.nextInt()*9);
		}while(c1==c2);
		do {
			c3 = (int)(a.nextInt()*9);
			}while(c1==c3||c2==c3);
		do {
			c4 = (int)(a.nextInt()*9);
		}while(c1==c4||c2==c4||c3==c4);
		
		JOptionPane.showMessageDialog(null, c1 +" "+c2+" "+c3+" "+c4);
	}
	public void compararNum() {
		
		if(j1==c1) {
			fijas++;
			}else 
				if(j1==c2||j1==c3||j1==c4) {
					picas ++;
				}
		if(j2==c2) {
			fijas++;
		}else 
			if(j2==c1||j2==c3||j3==c4) {
				picas++;
			}
		if(j3==c3) {
			fijas++;
		}else 
			if (j3==c1||j3==c2||j3==c4) {
				picas++;
			}
		
	}
	

	@Override
	public String toString() {
		return "Jugador"+nombre+j1+j2+j3+j4+"Picas"+picas+"Fijas"+fijas+"Oportunidades"+oportunidades;
	}
}
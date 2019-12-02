package web;

import java.io.Serializable;

import pols.Polinomio;

public class PolinomioDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double x = 0;
	private double y = 0;
	private int [] coeficientes = new int[0];
	
    public PolinomioDTO() {}
	
	public PolinomioDTO(Polinomio p) {
		this(p,0);
	}
	
	public PolinomioDTO(Polinomio p, double v) {
		x = v;
		y = p.getValor(v);
		coeficientes = p.getCoeficientes();
	}
	
	public PolinomioDTO(int [] c) {
		x = 0;
		y = c[0];
		coeficientes = c;
	}

	public double getX() {
		return x;
	}

	
	public void setX(double x) {
		this.x = x;
	}
	

	public double getY() {
		return y;
	}

	
	public void setY(double y) {
		this.y = y;
	}
	

	public int [] getCoeficientes() {
		return coeficientes;
	}

	
	public void setCoeficientes(int [] coeficientes) {
		this.coeficientes = coeficientes;
	}
	
}

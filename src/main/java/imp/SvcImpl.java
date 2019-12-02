/**
 * 
 */
package imp;

import java.util.List;

import polinomios.ISvcPolinomios;
import pols.Polinomio;

/**
 * @author japf0
 *
 */
public class SvcImpl implements ISvcPolinomios {

	@Override
	public double getValor(Polinomio p, double x) {
		return p.getValor(x);
	}

	@Override
	public Polinomio getSuma(Polinomio p, Polinomio q) {
		return p.sumar(q);
	}
	
	@Override
	public void load (Polinomio p) {}
	
	@Override
	public List<Polinomio> getAllPolinomios(){
		return null;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

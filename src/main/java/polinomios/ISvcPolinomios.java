package polinomios;

import pols.Polinomio;
import java.util.List;

public interface ISvcPolinomios {
	
	public double getValor(Polinomio p, double x);
	public Polinomio getSuma(Polinomio p, Polinomio q);
	public void load (Polinomio p);
	public List<Polinomio> getAllPolinomios();

}

package polinomios;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import imp.SvcImpl;
import pols.Polinomio;
import response.SvcResponse;
import response.SvcResponseStatus;
import web.PolinomioDTO;
import response.MatrixDTO;


@RestController
//@RequestMapping("/pols")
public class SvcResource {
	
	private ISvcPolinomios svc = new SvcImpl();
	private final AtomicLong counter = new AtomicLong();
	
	public SvcResource() {}
	
	public SvcResource(ISvcPolinomios svc) {
		this.svc = svc;
	}
	

	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public SvcResponse getValue(@RequestBody PolinomioDTO p) {
		p.setY(new Polinomio(p.getCoeficientes()).getValor(p.getX()));
		//return new SvcResponse(SvcResponseStatus.OK, p);
		return new SvcResponse(SvcResponseStatus.OK, new Double(new Polinomio(p.getCoeficientes()).getValor(p.getX())));
	}
	
	@RequestMapping(value = "/matrix", method = RequestMethod.GET)
	public SvcResponse getMatrix(@RequestBody PolinomioDTO p) {
		int [] c = p.getCoeficientes();
		int filas = (int) p.getX();
		int [][] m = new int[filas][c.length];
		for (int i = 0; i < filas; i++) {
			m[i] = c;
		}
		MatrixDTO matrix = new MatrixDTO(m);
		return new SvcResponse(SvcResponseStatus.OK, m);
	}
	
	@RequestMapping("/greetings")
	public SimpleResponse getGreeting() {
		return new SimpleResponse(counter.incrementAndGet(), "Hello my friend");
	}
}

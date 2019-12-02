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
		return new SvcResponse(SvcResponseStatus.OK, p);
	}
	
	@RequestMapping("/greetings")
	public SimpleResponse getGreeting() {
		return new SimpleResponse(counter.incrementAndGet(), "Hello my friend");
	}
}

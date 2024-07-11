package it.corso;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

// JAX-RS è una specifica Java per creare servizi web RESTful;
// è parte della JavaEE ed è inserita dentro JakartaEE.
// Jersey è un'implementazione di riferimento di JAX-RS.

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		packages("it.corso");
	}

}

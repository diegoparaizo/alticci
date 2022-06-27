package br.com.paraizo;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.cache.CacheResult;

//escopo do serviço
@ApplicationScoped
public class AlticciService {
	
	final Logger log = LoggerFactory.getLogger(AlticciService.class);
	
	//anotação do método com @CacheResult isto confere um cache dos resultados, ou seja,
	//todas as vezes que o método for invocado, com o mesmo parâmetro, ele não fará a requisição 
	//e retornará o resultado que está em cache 
	@CacheResult(cacheName = "alticci-cache")
	public Integer sequenciaAlticci(Integer n) {
		
		Integer valor = -1;
		
		if (n.equals(0)) {
			valor = 0;
		} else if (n.equals(1) || n.equals(2)) {
			valor = 1;
		} else if (n > 2) {
			valor = sequenciaAlticci(n - 3) + sequenciaAlticci(n - 2);
		}
		
		//log para identificar todas as vezes que a sequencia for chamada de fato
		log.info("Retorno da sequencia alticci: " + valor);
		
		return valor;		
	}

}

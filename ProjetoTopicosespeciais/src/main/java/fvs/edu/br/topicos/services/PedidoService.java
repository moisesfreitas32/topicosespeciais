package fvs.edu.br.topicos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fvs.edu.br.topicos.domain.Pedido;
import fvs.edu.br.topicos.repositories.PedidoRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Pedido buscar(Integer id)
	throws ObjectNotFoundException{
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
}

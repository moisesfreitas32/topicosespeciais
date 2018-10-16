package fvs.edu.br.topicos.enums;

public enum TipoCliente {

	PESSOAFISICA(1),
	PESSOAJURIDICA(2);
	
	int tipopessoa;
	
	
	TipoCliente(int tipoPessoa){
		this.tipopessoa = tipoPessoa;
	}
}

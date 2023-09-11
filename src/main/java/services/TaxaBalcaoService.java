package services;

public class TaxaBalcaoService implements TaxaService {

	@Override
	public double taxa(double valor) {

		return valor < 10 ? 0.3 : 0.5;
	}

}

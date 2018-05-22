package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Carro {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// Carro
	public static Var DATA(Var Entidade) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.dateTime.Operations.getNow();
			}
		}.call();
	}

}

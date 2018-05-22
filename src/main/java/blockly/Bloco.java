package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// Bloco
	public static Var incrementar(Var Entidade) throws Exception {
		return new Callable<Var>() {

			private Var contador = Var.VAR_NULL;

			public Var call() throws Exception {
				contador = cronapi.math.Operations.sum(cronapi.list.Operations.getFirst((cronapi.database.Operations
						.query(Var.valueOf("app.entity.Carro"), Var.valueOf("select MAX(c.contador) from Carro c")))),
						Var.valueOf(1));
				return contador;
			}
		}.call();
	}

}

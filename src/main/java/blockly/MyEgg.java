package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MyEgg {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// MyEgg
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = Var.valueOf("Eggsss");
				item = Var.valueOf("Eggsss");
				item = Var.valueOf("Eggsss");
				return Var.VAR_NULL;
			}
		}.call();
	}

}

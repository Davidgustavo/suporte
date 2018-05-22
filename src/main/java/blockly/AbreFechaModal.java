package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AbreFechaModal {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// AbreFechaModal
	public static Var AbreModal() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
						Var.valueOf("modal22340"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Fechar_Modal() throws Exception {
		new Callable<Var>() {

			private Var valorcampo = Var.VAR_NULL;

			public Var call() throws Exception {
				valorcampo = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input7874"));
				cronapi.database.Operations.insert(Var.valueOf("app.entity.Fornecedor"),
						Var.valueOf("nome", valorcampo));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
						Var.valueOf("modal22340"));
				cronapi.util.Operations
						.callClientFunction(Var.valueOf("blockly.js.blockly.Fornecedores.atualizarRegistos"));
				blockly.AbreFechaModal.limpa_campo();
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void limpa_campo() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("vars.input7874"), Var.VAR_NULL);
				return Var.VAR_NULL;
			}
		}.call();
	}

}

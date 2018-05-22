window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Fornecedores = window.blockly.js.blockly.Fornecedores
		|| {};

/**
 * Fornecedores
 */
window.blockly.js.blockly.Fornecedores.atualizarRegistos = function() {
	this.cronapi.screen.refreshDatasource("Fornecedor", 'true');
}

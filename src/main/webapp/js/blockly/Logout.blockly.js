window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Logout = window.blockly.js.blockly.Logout || {};

/**
 * Logout
 */
window.blockly.js.blockly.Logout.Logout = function() {

	var item;
	this.cronapi.screen.logout();
}

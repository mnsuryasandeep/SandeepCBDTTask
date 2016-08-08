
$(document).ready(function() {
		$("#dob").datepicker();
	});
	function reset() {
		$('#name').setval(" ");
		$('#address').setval(" ");
		$('#pan').setval(" ");
		$('#dob').setval(" ");
		$('#aYear').setval(" ");
		$('#income').setval(" ");
		$('#tds').setval(" ");
		$('#taxDeducted').setval(" ");
	}
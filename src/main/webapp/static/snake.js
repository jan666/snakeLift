$(document).ready(function() {

	$('body').on('keyup', function(e) { 

		/** aka 1 / numpad 1 **/
		if (e.which == 49 || e.which == 97) {
			e.preventDefault();
			playVideo(videos[0]);
		}
		
		/** aka 2 / numpad 2 **/
		if (e.which == 50 || e.which == 98) {
			e.preventDefault();
			playVideo(videos[1]);
		}
		
		/** aka 3 / numpad 3 **/
		if (e.which == 51 || e.which == 99) {
			e.preventDefault();
			playVideo(videos[2]);
		}
		
		/** aka 8 / numpad 8 **/
		if (e.which == 56 || e.which == 104) {
			e.preventDefault();
			$('#btnUp').children(":first").click();
		}
	});
	
});

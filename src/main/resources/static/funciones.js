$(document).ready( function(){
	
	
	var client = filestack.init('A0LmlR8i1TBGRBTgBMfhgz');
	
	$('#botonSubirImagen').click( function(){
		client.pick({accept: 'image/*'}).then(function(result) {
			$('#inputUrlImagen').val(result.filesUploaded[0].url);
		});
	});
	
		
	
	$('#casa').click( function(){
	   window.location.href = "/padres";
	
	});
	
	$('#escuelaImg').click( function(){
		window.location.href = "/escuela";
	
	});
	
		$('#volver').click( function(){
		window.location.href = "/inicio";
	
	});
	
	 
      
} );


define( [
	"src/main/webapp/bower_components/jquery/src/var/pnum"
], function( pnum ) {

return new RegExp( "^(?:([+-])=|)(" + pnum + ")([a-z%]*)$", "i" );

} );

FlowRouter.route( '/login', {
  action: function() {
<<<<<<< HEAD
  	BlazeLayout.render( 'applicationLayout', { main: 'login' } ); 
=======
  	BlazeLayout.render( 'applicationLayout', { main: 'login' } );
>>>>>>> something
  },
  name: 'login'
});

FlowRouter.route( '/selectPerson', {
  action: function() {
  	BlazeLayout.render( 'applicationLayout', { main: 'selectPerson' } );
  },
  name: 'selectPerson'
});

FlowRouter.route( '/chat', {
  action: function() {
  	BlazeLayout.render( 'applicationLayout', { main: 'chat' } );
  },
  name: 'chat'
});

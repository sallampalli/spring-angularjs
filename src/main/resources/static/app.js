var clinicApp = angular.module('clinicalApp', ['ui.bootstrap','ngRoute']).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('/appointments', {
				templateUrl : 'listappointments.html',
				controller : 'Hello'
			});
			$routeProvider.when('/addappointment', {
				templateUrl : 'addappointment.html',
				controller : 'Hello'
			});
			$routeProvider.when('/updateappointment/:id', {
				templateUrl : 'updateappointment.html',
				controller : 'UpdateController'
			});
			$routeProvider.when('/adddoctor', {
				templateUrl : 'adddoctor.html',
				controller : 'Hello'
			});
			$routeProvider.otherwise({
				redirectTo : '/appointments'
			});
		} ]);

clinicApp.controller('Hello', ['$scope','$http', '$location', '$routeParams', '$window',
                                     function ($scope, $http, $location, $routeParams, $window) {
	$http.get('http://localhost:8040/clinic/appointments')
	.success(function(data) {
		$scope.greeting = data;
	});

$scope.addNewappointment = function(appointment) {
console.log("Entered Here");
$http.post('http://localhost:8040/clinic/appointment/create',
		appointment).success(function(data) {
	$location.path("/appointments");
});
};

$scope.doctors = [];
$http.get('http://localhost:8040/clinic/doctors')
.success(function(data) {
$scope.doctors = data;
});

$scope.addNewDoctor = function(doctor) {
console.log("Entered Here");
$http.post('http://localhost:8040/clinic/doctor/create',
		doctor).success(function(data) {
	$location.path("/appointments");
})
.error(function(data){
	
	$scope.sampleError = data;
});
};


$scope.goTo = function(hash) {
$location.path(hash);
};

$scope.updateappointmentWith = function(id) {
console.log('Im Here');
$location.path('/updateappointment/' + id);
};

$scope.logout = function(){

   $http.get('http://localhost:8040/app/logmeout')
   .success(function (data, status, headers, config) {
		var url = $window.location.protocol+"//"+$window.location.host;
    	$window.location.href=url+"/";
   });
};

$scope.deleteappointment = function(id){
$http.delete(
		'http://localhost:8040/clinic/appointment/'+id).success(function(data) {
			console.log("Entered Delete Service");
			console.log(JSON.stringify(data));
});

$http.get('http://localhost:8040/clinic/appointments')
.success(function(data) {
	$scope.greeting = data;
});
};

                                     }]);

clinicApp.controller('UpdateController', ['$scope','$http', '$location', '$routeParams',
function UpdateController($scope, $http, $location, $routeParams) {
	
	$scope.editappointmentTemp = $http.get(
			'http://localhost:8040/clinic/appointment/'+
			$routeParams.id).success(function(data) {
				console.log("Entered Update Service");
				console.log(JSON.stringify(data));
				$scope.editappointmentTemp = data;
	});
	
	$scope.updateappointment = function(editappointmentTemp){
		$http.put('http://localhost:8040/clinic/appointment/create',
				editappointmentTemp).success(function(data) {
			$location.path("/appointments");
		});
		
	}
	
	$scope.goTo = function(hash) {
		$location.path(hash);
	};

	
}]);


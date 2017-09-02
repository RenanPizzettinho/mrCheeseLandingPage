var app = angular.module('mrCheese', []);

app.controller('landPageController', function ($http) {
    var vm = this;
    var form = {
        nome: vm.nome,
        email: vm.email
    };

    $http.post('http://localhost:8080/mrCheese/rest/interessado', form)
        .then(success, error);

    function success(success) {
        console.log('SUCESSO: ', sucess);
    }

    function error(error) {
        console.log('ERRO: ', error);
    }
});
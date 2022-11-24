
    var n = prompt("Informe a quantidade de numeros: ");
    var numero;
    var soma = 0;
    var i = 0;

    while (i < n) {
        numero = parseInt(prompt("Informe um número: "));
        soma = soma + numero;
        i ++;
    }

    document.write("A soma dos " + n +" numero e: "+ soma );
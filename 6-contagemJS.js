

    var n = prompt("Informe a quantidade de numeros: ");
    var contador = 1;
    var i = 0;
    var teste, inteiro;


    for(i = 0; i < n; i++){
        teste = prompt("Digite um numero");
        inteiro = teste - Math.trunc(teste); 
        if (inteiro == 0) {
            document.write(teste + " ")
        }
    }


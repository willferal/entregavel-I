  
    var numero = prompt("digite o numero desejado: ");
    var i = 1;
    var contPrimo = 0;

    for(i = 1; i <= numero; i++){
        if(numero % i == 0) {
            contPrimo = contPrimo + 1;
        }
    }

    if (contPrimo == 2) {
        document.write("O numero digitado e primo.");
    }else{
        document.write("O numero digitado não é primo");
    }

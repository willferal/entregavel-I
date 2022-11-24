function mdc(num1, num2){
    
    var num1 = parseInt(prompt("Digite o primeiro numero"))
    var num2 = parseInt(prompt("Digite o segundo numero"))
    var restoDiv

    do{

        restoDiv = num1 % num2
        num1 = num2
        num2 = restoDiv

    }while (restoDiv != 0);

    document.write(num1)

}

mdc();
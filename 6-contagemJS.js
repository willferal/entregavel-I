

    var n = prompt("Informe a quantidade de notas: ")
    var nota
    var contNota = 0
    var i = 0

    while (i < n) {
       
        nota = prompt("Informe uma nota: ")
        
        if(nota >= 7){
            contNota = contNota + 1
        }
        i++
   
    }

    document.write("Numero de alunos que passaram no examo: "+ contNota)

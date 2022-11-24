
function quicksort(sequencia) {
    
    if (sequencia.length <= 1) {
      return sequencia;
    }
  
    var pivot = sequencia[0];
    var esquerda = []; 
    var direita = [];
  
    for (var i = 1; i < sequencia.length; i++) {
        sequencia[i] < pivot ? esquerda.push(sequencia[i]) : direita.push(sequencia[i]);
    }
  
    return quicksort(esquerda).concat(pivot, quicksort(direita));
  };
  
  var sequencia = [23, 45, 16, 37, 3, 99, 22];
  var sequenciaQS = quicksort(sequencia);
  console.log(sequenciaQS)
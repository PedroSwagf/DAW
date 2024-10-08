function pedirNumero() {
    // declaramos nuestra variable numero
    let numero;
    //ahora validamos si el numero introducido es correcto
    do {
        numero = prompt("Introduce un numero del 1 al 100:");
        if (numero === null){
            return;
        }
        numero = parseInt(numero);
    } while (isNaN (numero) || numero < 1 || numero > 100);

    return numero;
}

function generarPiramide (numero) {
    let listaPiramide = document.getElementById("piramide");
    listaPiramide.innerHTML ="";//aqui estamos limpiando el contenido previo ante de gerar la piramide

    // empezamos los bucles for para recorer las posiciones y numeros de la piramide
    for (let i = 1;i <= numero; i++) {
        let fila = document.createElement("p");// aqui estamos creando cada fila de nuestra lista
        let numeros = "";
        for (let j = 1; j <= i; j++) {
            numeros += j + " "; //aqui agregamos los numeros desde el 1 hasta el valor de i, que es el numero introducido.            
        }

        fila.textContent = numeros.trim();//aqui la funcion de js trim para eliminar los espacion en blanco antes y despues de los numeros de inicio y fin.
        listaPiramide.appendChild(fila);
    }
}

function mostrarPiramide () {
    let numero = pedirNumero(); //llamamos a la funcion mostrar numeros
    if (numero !== null) {
        generarPiramide(numero);
    }
}
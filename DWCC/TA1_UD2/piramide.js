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
    document.write ("<h1>Piramide de Numeros</h1>")

    // empezamos los bucles for para recorer las posiciones y numeros de la piramide
    for (let i = 1;i <= numero; i++) {
        //generamos un segundo bucle para ir incrementando las filas
        for (let j = 1; j <= i; j++) {
            document.write (j + " "); //aqui agregamos los numeros desde el 1 hasta el valor de i, que es el numero introducido.            
        }
        document.write("<br>"); //hacemos un salto de fila despues de cada linea
    }
}

function mostrarPiramide () {
    let numero = pedirNumero(); //llamamos a la funcion mostrar numeros
    if (numero !== null) {
        generarPiramide(numero);
    }
}

window.onload = mostrarPiramide();
Proceso FibonacciConFunciones
    Definir n, resultado Como Entero
    
    Escribir "Ingrese el número n de la sucesión Fibonacci: "
    Leer n
    
    Si n <= 0 Entonces
        Escribir "El número debe ser mayor que 0"
    Sino
        resultado = Fibonacci(n)
        Escribir "El término ", n, " de Fibonacci es: ", resultado
    FinSi
FinProceso

Funcion Fibonacci(n) Como Entero
    Definir a, b, fib, i Como Entero
    
    // Los dos primeros términos de la sucesión son 1
    a <- 1
    b <- 1
    
    Si n = 1 O n = 2 Entonces
        Fibonacci <- 1
        Retornar Fibonacci
    FinSi
    
    // Calcular el término n
    Para i <- 3 Hasta n Con Paso 1 Hacer
        fib <- a + b
        a <- b
        b <- fib
    FinPara
    
    Fibonacci <- fib
    Retornar Fibonacci
FinFuncion

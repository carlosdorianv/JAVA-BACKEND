# Clase 6

# **🏠 Estructuras de control “Try Catch”**

# **👋 Introducción**

**¡Hola! Bienvenido al paso donde trabajarás en el manejo de excepciones en Java utilizando las estructuras de control “try-catch”. Éste es un concepto crucial para construir aplicaciones robustas y confiables.**

**¿Qué es el Manejo de Excepciones con “try-catch”?**

**El manejo de excepciones es un mecanismo que nos permite lidiar con situaciones anómalas que pueden ocurrir durante la ejecución de un programa. La estructura “try-catch” es la forma en que Java nos permite capturar y manejar estos eventos inesperados, conocidos como excepciones, de una manera controlada.**

**La Importancia del Manejo de Excepciones radica en varios aspectos cruciales para el desarrollo de software. Por un lado, brinda Robustez al permitir que nuestros programas gestionen situaciones inesperadas sin colapsar de manera abrupta. Además, ofrece un Control de Flujo al otorgarnos la capacidad de dirigir el flujo del programa incluso en presencia de errores, lo que posibilita que la ejecución del programa continúe de manera ordenada. Por último, pero no menos importante, el Manejo de Excepciones contribuye a mejorar la Depuración y la Calidad del Código, ya que facilita la identificación y corrección de errores, incrementando así la calidad y la mantenibilidad del software desarrollado.**

---

# **📖 Material Descargable**

**Aquí encontrarás el material descargable correspondiente que te dará las bases para tus próximos pasos.**

**👉 [Teoría Estructuras de Control: try-catch](https://drive.google.com/file/d/1HH6bP5Pk7Pv8ynMMO1Zbv_joj5J_CjH9/view?usp=drive_link)**

**📢 ¡Importante!**

- **No debes memorizar conceptos o definiciones, concéntrate en entender el concepto. La práctica hará que luego puedas aplicarlo con más agilidad.**
- **Si hay algo que no comprendes, ¡no te preocupes! Anótalo y pregunta a tus compañeros o mentor en el encuentro en vivo.**

# **👣 Iniciando con el uso de bloque Try & Catch**

**Explorarás diferentes situaciones donde pueden ocurrir errores y aprenderás a implementar bloques "try-catch" para capturar y manejar estas excepciones. Mejorarás tu capacidad para controlar el flujo del programa y brindar una experiencia más robusta al usuario al anticipar y manejar posibles errores.**

---


> 💡 Aprendiendo de Excepciones en la Consola: Puedes aprovechar las excepciones que ocurren durante la ejecución del programa para aprender más sobre los posibles errores. Por ejemplo, si realizas una división por cero, puedes leer la excepción lanzada para entender mejor la causa del error. Verás que se produce una excepción ArithmeticException debido a la división por cero. El programa captura esta excepción y muestra un mensaje de error informativo en la consola. Al leer este mensaje, puedes comprender mejor el error y cómo evitarlo en el futuro.
> 

---

### **✏️ Actividad 1: Division Segura**

**Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.**
> [**💡Problema Resuelto**](Clase6/src/Actividad1.java)
---

### **✏️ Actividad 2: Resta con Manejo de Excepciones**

**Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.**

> 💡Recuerda, que en la documentación oficial, podrás conocer los tipos de excepciones existentes, te invitamos a acceder para investigar sobre las mismas.
> 

> [**💡Problema Resuelto**](Clase6/src/Actividad2.java)

# **👣 Continuando en el uso de bloque Try & Catch**

**La práctica con la implementación de este bloque se mejora con el uso. A medida que practiques, serás más capaz de identificar y manejar diversas excepciones, algunas específicas de la lógica que estés utilizando y otras más comunes.**

> 💡Atención
> 
> 
> **Antes de finalizar su sesión en equipo de hoy, un integrante deberá compartir su pantalla y explicar en detalle cómo resolvió los ejercicios propuestos. Puede ser el facilitador o cualquier compañero que se anime (puedes ser tú 💪).**
> 
> **Aprovecha esta oportunidad para enriquecer tu propia resolución y participa activamente haciendo preguntas.**
> 

---

### **✏️ Actividad 3: Conversión de Cadena a Entero**

**Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.**



> [**💡Problema Resuelto**](Clase6/src/Actividad3.java)
---

# Clase 9

# **🏠 Objetivos actividades integradoras**

# **👋 Introducción**

**¡Bienvenido a tu siguiente paso! En esta ocasión, pondremos a prueba tu comprensión de las estructuras de control en Java a través de la resolución de problemas prácticos y cotidianos. Estos ejercicios no solo solidificarán tu conocimiento teórico, sino que también mejorarán tu habilidad para aplicar lógica en situaciones reales de programación.**

**¿Cuáles deben ser tus objetivos?**

- **Descubrir que ya sabes y puedes resolver de manera individual.**
- **Identificar los elementos que aún necesitas consolidar.**
- **Transferir el conocimiento adquirido a situaciones novedosas.**

**Te deseamos un encuentro excelente y desafiante. ¡Que aproveches al máximo la oportunidad!**

# **👣 Desafío I**

**Te invitamos a leer la consigna completa de tu actividad integradora antes de comenzar, para que puedas ordenar los pasos y tener en cuenta los diversos puntos que deberás contemplar.**

---

### **✏️ Actividad 1: Conversión de unidades de temperatura**

**Escribe un programa que cumpla con las siguientes condiciones:**

**1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).**

**2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.**

| **De Celsius a Fahrenheit** | **De Fahrenheit a Celsius** |
| --- | --- |
| [°F] = ([°C] × 9 ⁄ 5) + 32 | [°C] = ([°F] − 32) × 5 ⁄ 9 |

**3. El programa debe manejar al menos las siguientes situaciones:**

- **Si ingresa una unidad de medida inválida, mostrará un mensaje de error.**
- **Si ingresa una temperatura no válida, mostrará un mensaje de error.**

**Te compartimos un ejemplo de ejecución del programa:**

```
Ingrese la temperatura: 25
Ingrese la unidad de medida (C/F): F
```

```
25 grados Celsius equivale a 77 grados Fahrenheit.
```

**Y aquí tienes otro ejemplo donde se muestra cómo manejar las situaciones de error:**

```
Ingrese la temperatura: abc
Ingrese la unidad de medida (C/F): C
```

```
Error: Temperatura no válida. Ingrese una temperatura numérica.
```

```
Ingrese la temperatura: 32
Ingrese la unidad de medida (C/F): K
```

```
Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.
```

**Puedes ampliar este ejercicio y agregar más validaciones o funcionalidades según tus necesidades y habilidades.**

**¡Diviértete resolviendo! 🙌**

> 💡[**Problema Resuelto**](Clase9/src/Actividad1.java)
---

# **👣 Desafío II**

> 💡Atención
> 
> 
> **Antes de finalizar su sesión en equipo de hoy, un integrante deberá compartir su pantalla y explicar en detalle cómo resolvió los ejercicios propuestos. Puede ser el facilitador o cualquier compañero que se anime (puedes ser tú 💪).**
> 
> **Aprovecha esta oportunidad para enriquecer tu propia resolución y participa activamente haciendo preguntas.**
> 

---

### **✏️ Actividad 2:Validación de contraseña**

**Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:**

- **La contraseña debe tener al menos 8 caracteres.**
- **La contraseña debe contener al menos una letra mayúscula y una letra minúscula.**
- **La contraseña debe contener al menos un número.**
- **La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).**

**El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.**

**Te compartimos un ejemplo de ejecución del programa:**

```
Ingrese su contraseña: Abc123!@#
¡Contraseña segura! Cumple con todos los criterios.
```

**Y aquí tienes otro ejemplo donde se muestra cómo manejar una contraseña no segura:**

```
Ingrese su contraseña: password123
Contraseña no segura. Debe tener al menos una letra mayúscula y un carácter especial.
```

**Puedes personalizar los criterios de seguridad de la contraseña y agregar más validaciones según tus necesidades. También puedes implementar un bucle para permitir que el usuario vuelva a ingresar la contraseña en caso de que no cumpla con los criterios de seguridad.**

**¡Diviértete resolviendo! 🙌**
> 💡[**Problema Resuelto**](Clase9/src/Actividad2.java)
---
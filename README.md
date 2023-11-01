# Aplicaciones del Cálculo Diferencial al Machine Learning.
## Hands-On 4.
### Instrucciones: 
- Dado el DataSet del caso Benetton, calcular los valores óptimos para los parámetros del Modelo Predicitivo (Coeficientes de Regresión).
- Solo utilizar las columnas **Sales** y **Advertising**.

### Entradas de la Aplicación:
- Un conjunto de observaciones o DataSet: $(x_1, y_1), (x_2,y_2),...,(x_n,y_n)$.
- El DataSet estará **hardcoded** (declarado a través de un constructor).
- Un valor **X** para predecir **Y**.
- **Importante.** No se capturan valores de entrada, se inyectan a través de la terminal (Command Prompt) al ejecutar la clase Main.

### Salidas de la Aplicación:
- Imprimir la Ecuación de Regresión: $\hat{y} = \beta_0 + \beta_1x_1$. reemplazando los valores óptimos, calculados, para los parámetros Beta.
- A partir de un valor 'X' de entrada, calcular e imprimir en la terminal del computador su respectivo valor 'Y' predecido.

### Diagrama UML:
```plantuml
@startuml
class  DataSet{
    -double[] advertising
    -double[] sales
    +DataSet()
    +getX(): double[]
    +getY(): double[] 
}

class LinearRegression{
    -double beta0
    -double beta1
    -double sumYY
    -double sumHatY
    -double xBar
    -double yBar
    -DataSet dataSet
    +LinearRegression(DataSet dataSet)
    +predict(double x): double
    +calculateHatY(): double[]
    // +getters and setters()
}

class LinearAlgebra {
    +static double calculateMean(data: double[])
    +static double calculateSum(data: double[])
}

class DiscrethsMaths {
    +static double calculateSumOfSquares(data: double[])
}

class Predicts {
    +static double[] calculateHatY(slr: LinearRegression)
    +static doyble predict(slr: LinearRegression, x: double)
}
@enduml
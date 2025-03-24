class Calculadora:
    
    def sumar(self, a, b):
        return a + b

    def restar(self, a, b):
        return a - b
    
    def multiplicar(self, a, b):
        return a * b
    
    def dividir(self, a, b):
        if(b == 0):
            return "No se puede dividir entre cero"
        else:
            return a / b
    
    # Método que calcula el promedio de N números
    # Metodo que calcula la potencia de un numero elevado a otro
    
    2^3=2*2*2
    2^(1/2) = 
        
    def promedio(self, a, b , c):
        return (a + b + c) / 3
    
    def raices(self, a, b, c):
        dis = b*b - 4*a*c
        if(dis < 0):
            return "NO TIENE RAICES REALES"
        elif(dis == 0):
            return -b/2*a
        else:
            x1 = (-b+dis**(1/2))/(2*a)
            x2 = (-b-dis**(1/2))/(2*a)
            return x1, x2

calc = Calculadora()
print(calc.sumar(3, 4))
print(calc.restar(5, 6))
print(calc.multiplicar(1, 9))
print(calc.dividir(3, 5))
print(calc.promedio(3, 4, 5))
print(calc.raices(4, 10, 3))
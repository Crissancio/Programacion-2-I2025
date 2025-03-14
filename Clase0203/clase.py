# variable = input("Ingrese un texto: ")
#variable_num = float(input(" Ingrese un número: "))

#lista = map(int, input("Ingrese una lista de numeros: ").split())

""" matriz = [
            [0,1,2],# 0
            [3,4,5],# 1
            [6,7,8],# 2
            [9,10,11]# 3
        ]"""

# print(list(matriz))
# print(list(lista))
# print(matriz[2][1])
# print(variable)
# print(variable_num)

# print("Hola mundo", end=":")
# print("python 3.12.3")
# && --> and
# || --> or
# ! --> not
# var = not True
# print(var)

suma = 4 + 5
res = 7 - 9
multi = 2 * 5
div = 21 / 5
mood = 34 % 2

expo = 2 ** (5)
div_ent = 21 // 8

string_var = "Hola" + "mundo" + "python"
# print(len())
# print(string_var[9:15])

vector = [0]*20
vector.append(4)
vector.append(5)
vector.append(6)

"""
print(len(vector))
print(list(vector))
"""

vector.pop()
"""
print(len(vector))
print(list(vector))

edad = 17
if edad >= 18:
    print("eres mayor")
elif edad >= 14:
    print("eres menor")
else:
    print("eres un niño")

# for (int i = 0; i< 10; i= i + 1)
lista = [3,4,45,3,2,15,5]
for i in range(0, 11, 1):
    print(i, end=" ")

print("\n")
for i in lista:
    print(i, end = " ")
print("\n")
print("e" in "Hola")



i = 1
while i <= 10 and i != 8:
    print(i, end=" ")
    i = i + 1 

def suma(a=10, b=20):
    print(a+b)

def operaciones(a,b):
    return a+b, a-b, a*b, a/b

a, b , c, d = operaciones(4,5)
print(a, b, c,d)
"""


class Persona:
    def __init__(self, nombre, edad, sexo):
        self.nombre = nombre
        self._edad = edad
        self.__sexo = sexo
    
    def saludo(self):
        print("Hola, soy ",self.nombre)
    
    def mostrarEdad(self):
        print("Tengo ", self._edad, " años")
    
    def cumpliAnios(self):
        self._edad = self._edad + 1
    
    def __str__(self):
        return "Nombre: " + self.nombre + " Edad: " + str(self._edad) + " Sexo: " + self.__sexo


p1 = Persona("Juan", 18, "M")

p1.saludo()
p1.mostrarEdad()
p1.cumpliAnios()
p1.mostrarEdad()

p1.nombre = "Pedro"
p1.__sexo = "F"
p1.saludo()
p1.mostrarEdad()
print(p1)

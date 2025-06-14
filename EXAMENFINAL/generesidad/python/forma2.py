class Par:
    def __init__(self, valor1, valor2):
        self.valor1 = valor1
        self.valor2 = valor2
    
    def __str__(self):
        return f'Par(valor1={self.valor1}, valor2={self.valor2})'
    def __eq__(self, otro):
        return self.valor1 == otro.valor1 and self.valor2 == otro.valor2

class VectorPares:
    def __init__(self):
        self.pares = []
    
    def agregar(self, par):
        self.pares.append(par)
    
    def mostrar(self):
        for par in self.pares:
            print(par)
    
    def existe(self, par_b):
        for par in self.pares:
            if par_b == par:
                return True
        return False

v1 = VectorPares()
v1.agregar(Par("ENERO", 5))
v1.agregar(Par("hola", 100))
v1.agregar(Par("Marzo", 15))
v1.agregar(Par("Septiembre", 8))
v1.agregar(Par("Lunes", 4))

v2 = VectorPares()
v2.agregar(Par(1.5, 'A'))
v2.agregar(Par(2.5, 'B'))
v2.agregar(Par(3.5, 'C'))
v2.agregar(Par(4.5, 'D'))
v2.agregar(Par(5.5, 'E'))
print("---Vector de Pares String-Integer:---")
v1.mostrar()
print("---Vector de Pares Double-Character:---")
v2.mostrar()
print("\n---Verificando existencia de pares en v1:---")
par_buscar_v1 = Par("ENERO", 5)
if v1.existe(par_buscar_v1):
    print(f"El par {par_buscar_v1} existe en v1.")
else:
    print(f"El par {par_buscar_v1} no existe en v1.")
    
print("\n---Verificando existencia de pares en v2:---")
par_buscar_v2 = Par(3.1, 'C')
if v2.existe(par_buscar_v2):
    print(f"El par {par_buscar_v2} existe en v2.")
else:
    print(f"El par {par_buscar_v2} no existe en v2.")

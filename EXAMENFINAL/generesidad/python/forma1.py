from typing import TypeVar, Generic

C = TypeVar('C')
V = TypeVar('V')

class Par(Generic[C, V]):
    def __init__(self, clave: C, valor: V):
        self.clave = clave
        self.valor = valor

    def __str__(self) -> str:
        return f'Par(clave={self.clave}, valor={self.valor})'

    def __eq__(self, value):
        return self.clave == value.clave and self.valor == value.valor


class VectorPares(Generic[C, V]):
    def __init__(self):
        self.pares = []

    def agregar(self, par: Par[C, V]) -> None:
        self.pares.append(par)

    def mostrar(self) -> None:
        for par in self.pares:
            print(par)

    def existe(self, par_b: Par[C, V]) -> bool:
        for par in self.pares:
            if par_b == par:
                return True
        return False
    


v1: VectorPares[str, int] = VectorPares()
v1.agregar(Par[str, int]("ENERO", 5))
v1.agregar(Par[str, int]("hola", 100))
v1.agregar(Par[str, int]("Marzo", 15))
v1.agregar(Par[str, int]("Septiembre", 8))
v1.agregar(Par[str, int]("Lunes", 4))

v2: VectorPares[float, str] = VectorPares()
v2.agregar(Par[float, str](1.5, 'A'))
v2.agregar(Par[float, str](2.5, 'B'))
v2.agregar(Par[float, str](3.5, 'C'))
v2.agregar(Par[float, str](4.5, 'D'))
v2.agregar(Par[float, str](5.5, 'E'))

print("---Vector de Pares String-Integer:---")
v1.mostrar()
print("---Vector de Pares Double-Character:---")
v2.mostrar()

print("\n---Verificando existencia de pares en v1:---")
par_buscar_v1 = Par[str, int]("ENERO", 5)
if v1.existe(par_buscar_v1):
    print(f"El par {par_buscar_v1} existe en v1.")
else:
    print(f"El par {par_buscar_v1} no existe en v1.")

print("\n---Verificando existencia de pares en v2:---")
par_buscar_v2 = Par[float, str](3.0, 'C')
if v2.existe(par_buscar_v2):
    print(f"El par {par_buscar_v2} existe en v2.")
else:
    print(f"El par {par_buscar_v2} no existe en v2.")
from typing import TypeVar, Generic
# pip install typing-extensions


T = TypeVar('TIPO')

class Caja(Generic[T]):
    def __init__(self, contenido: T):
        self.contenido = contenido
        
    def conseguir_contenido(self) -> T:
        return self.contenido
    
caja_int = Caja[int](123)
caja_str = Caja[str]("Hola Mundo")

print(caja_int.conseguir_contenido()*2)
print(caja_str.conseguir_contenido()*2)

v = 45
v = "jhjashfkjas"
v = False



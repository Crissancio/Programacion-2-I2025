from multimethod import multimethod
import math

class FiguraGeometrica:
    
    @multimethod
    def area(self, base:float, altura:float):
        return base * altura
    
    @multimethod
    def area(self, radio:float):
        return math.pi * radio ** 2
    
    @multimethod
    def area(self, base, altura, c = 2):
        return base * altura / c
    
    
figura = FiguraGeometrica()
print(figura.area(4,4))
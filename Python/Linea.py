import Punto
import matplotlib.pyplot as plt

class Linea:
    def __init__(self, p1:Punto, p2:Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea de {self.p1} a {self.p2}"
    
    def dibujaLinea(self):
        plt.plot([self.p1.getX, self.p2.getX], [self.p1.getY, self.p2.getY], marker='o', linestyle='-')
        plt.show()
        

    
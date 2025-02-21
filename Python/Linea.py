import Punto
import matplotlib.pyplot as plt

class Linea:
    def __init__(self, p1:Punto, p2:Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea de {self.p1} a {self.p2}"
    
    def dibujaLinea(self):
        plt.plot(self.p1.getPunto(), self.p2.getPunto(), 'o', color='green')
        

    
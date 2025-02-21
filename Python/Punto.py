class Punto:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"{self.p1} a {self.p2}"
    
    def getP1(self):
        return self.p1
    def getP2(self):
        return self.p2
    
    def getPunto(self):
        return [self.p1, self.p2]
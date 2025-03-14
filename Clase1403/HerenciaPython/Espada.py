class Espada:
    def __init__(self):
        self._daño = 10
        self._duracion = 30
    
    def atacar(self):
        print("Se ataco con espada base")
        self._duracion -= 1
        
    def __str__(self):
        return f"Daño: {self._daño}, Duracion: {self._duracion}"

class EspadaDeFuego(Espada):
    def __init__(self):
        super().__init__()
        self._efecto = "Fuego"
        self._daño = 15
        self._duracion = 50  
    
    def atacar(self):
        print("Se ataco con espada de fuego")
        self._duracion -= 2
        
    def __str__(self):
        return f"Daño: {self._daño}, Duracion: {self._duracion}, Efecto: {self._efecto}"

class EspadaDeHielo(Espada):
    def __init__(self):
        super().__init__()
        self._efecto = "Hielo"
        self._daño = 25
    
    def atacar(self):
        print("Se ataco con espada de hielo")
        self._duracion -= 1
    
    def __str__(self):
        return f"Daño: {self._daño}, Duracion: {self._duracion}, Efecto: {self._efecto}"
    

espada = Espada()
print(espada)

espadaFuego = EspadaDeFuego()
print(espadaFuego)

espadaHielo = EspadaDeHielo()
print(espadaHielo)

espada.atacar()
espadaFuego.atacar()
espadaHielo.atacar() 
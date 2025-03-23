class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"Producto: {self.nombre}, Precio: {self.precio}"
    
    def descuento(self):
        if(self.precio % 2 == 0):
            self.precio = self.precio-(self.precio*0.10)
        else:
            self.precio = self.precio-(self.precio*0.15)
    
    def getPrecio(self):
        return self.precio


p1 = Producto("Camisa", 100)
p2 = Producto("Pantalon", 20)
p3 = Producto("Calcetines", 41)
p4 = Producto("Zapatos", 33)

print(p1)
print(p2)
print(p3)
print(p4)

p1.descuento()
p2.descuento()
p3.descuento()
p4.descuento()
print('-----------------')
print(p1)
print(p2)
print(p3)
print(p4)
print('-----------------')
suma = p1.getPrecio() + p2.getPrecio() + p3.getPrecio() + p4.getPrecio()
print(f"El total de la compra es: {suma}")
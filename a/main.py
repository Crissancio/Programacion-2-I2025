from encapsulamiento.CajaAhorros import CajaAhorros

caja = CajaAhorros("Juan",1112, 100)
print("\t\t-->Acceso a atributos protegidos")
print(caja.__saldo)
caja.__saldo = 100000

print("\t\t-->Acceso a metodos protegidos")
caja.__transferencia(300)
print(caja.__saldo)




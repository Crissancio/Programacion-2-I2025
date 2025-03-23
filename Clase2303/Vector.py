class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        
    def __str__(self):
        return f"({self.x},{self.y})"
    
    def __add__(self, vector):
        return Vector(self.x + vector.x, self.y + vector.y)
    
    def __sub__(self, vector):
        return Vector(self.x - vector.x, self.y - vector.y)
    
    def __mul__(self, vector):
        return Vector(self.x*vector.x, self.y*vector.y)
    
    
v1 = Vector(2,3)

v2 = Vector(3,4)

v3 = v1+v2
v4 = v1-v2
v5 = v1*v2

print(v3)
print(v4)
print(v5)
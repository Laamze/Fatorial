def fatorial(n):
    fat = 1
    
    if (n > 0): 
        fat = n * fatorial(n-1)
	
    return fat

print("Hello HacktoberFest!")

n = int(input("Digite o valor desejado para calcular o fatorial: "))

print (fatorial(n))

print("\nFim do programa.")
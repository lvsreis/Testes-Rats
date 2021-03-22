import matplotlib.pyplot as plt

x = [] #Lista q armazena valores
y = []

dataset = open('saida.csv', 'r')

for line in dataset:
    line = line.strip()  #Tira o \n no final da linha
    X, Y = line.split(';') #Quebra a linha com o marcador ;
    x.append(X)
    y.append(int(Y))

dataset.close()

plt.bar(x, y)

plt.title('Tempo de Execução')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

plt.show()


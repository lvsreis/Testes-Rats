import matplotlib.pyplot as plt
import matplotlib.dates as mdates

x = []  # Lista q armazena valores
y = []
Z = []

dataset = open('./reports/Saida.csv', 'r')

for line in dataset:
    line = line.strip()  # Tira o \n no final da linha
    X, Y, Z = line.split(';')  # Quebra a linha com o marcador ;
    x.append(X)
    y.append(int(Y))

dataset.close()

plt.bar(x, y)

plt.title('Tempo de Execução')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

# plt.xticks(rotation=90)
#plt.xticks(rotation=45, ha='right')
plt.tick_params(axis='x', labelrotation=45)
plt.subplots_adjust(bottom=0.35)

plt.show()

import matplotlib.pyplot as plt
import matplotlib.dates as mdates

java = "java"
j = 0
closure = "closure"
c = 0
closure_xml = "closure_xml"
cx = 0
java_xml = "java_xml"
jx = 0
pair = "pair"
p = 0
pair_closure = "pair_closure"
pc = 0
pair_closure_xml = "pair_closure_xml"
pcx = 0
pair_xml = "pair_xml"
px = 0
xml = "xml"
xm = 0
cont = 0


dataset = open('./reports/Saida.csv', 'r')
for line in dataset:
    line = line.strip()  # Tira o \n no final da linha
    x, y, z = line.split(';')  # Quebra a linha com o marcador ;

    if x == java:
        cont += 1
        j += int(y)
    elif x == closure:
        c += int(y)
    elif x == closure_xml:
        cx += int(y)
    elif x == java_xml:
        jx += int(y)
    elif x == pair:
        p += int(y)
    elif x == pair_closure:
        pc += int(y)
    elif x == pair_closure_xml:
        pcx += int(y)
    elif x == pair_xml:
        px += int(y)
    elif x == xml:
        xm += int(y)

dataset.close()
X = []
Y = []
X.append(java)
X.append(closure)
X.append(closure_xml)
X.append(java_xml)
X.append(pair)
X.append(pair_closure)
X.append(pair_closure_xml)
X.append(pair_xml)
X.append(xml)
Y.append(j/cont)
Y.append(c/cont)
Y.append(cx/cont)
Y.append(jx/cont)
Y.append(p/cont)
Y.append(pc/cont)
Y.append(pcx/cont)
Y.append(px/cont)
Y.append(xm/cont)


plt.bar(X, Y)

plt.title('Tempo de Execução (ms)')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

# plt.xticks(rotation=90)
# plt.xticks(rotation=45, ha='right')
plt.tick_params(axis='x', labelrotation=45)
plt.subplots_adjust(bottom=0.35)

plt.show()

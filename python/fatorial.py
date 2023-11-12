
def fatorial(n):#n=5
  for i in range(1,n):#se n=5, o loop executará 5 vezes
    n=n*i #
  return n

fat_n = fatorial(60)
fat_p = fatorial(6)

chance_ms = fat_n/(fat_p*fatorial(60-6))

print(chance_ms)
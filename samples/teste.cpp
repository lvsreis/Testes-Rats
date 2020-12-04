// Programa em C/C++
#include <iostream>

typedef struct EvenOdd {
  int x;
};

bool even(int);

bool odd(int n) {
    if(n == 0)
	return false;
    else
	return even(n-1);
}

bool even(int n) {
    if(n == 0) return true;
    else
	return odd(n-1);
}

int main(int n, char** args) {
  EvenOdd um, dois;
  um.x = 10;
  dois.x = 20;

  //std::cout << args[1] << '\n';
  
  //std::cout << even(3) << '\n';
  return 0;
}

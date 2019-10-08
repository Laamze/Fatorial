#include <iostream>
using namespace std;

int fatorial(int n){
	int fat = 1;
	if(n == 0){
		fat = 1;	
	}else	if(n>0){
			fat = n * fatorial(n-1);
		}
	return fat;
}

int main(void){
	int n = 0, fat = 0;
	
	cout << "Please, enter a number for calcule the fatorial: ";
	cin >> n;
	cout << "\n";
	
	fat = fatorial(n);

	cout << "The fatorial(" << n << ") is: "  << fat << "\n";

	return 0;
}

// LessonThyCatch.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include <iostream>;



using namespace std;
int main()
{	
	double num1;
	double num2;
	int var = 2;//looper
	while (var--)
	{
		cout << "Enter value: Num1: ";
		cin >> num1;
		cout << "Enter value: Num2: ";
		cin >> num2;
		
		cout << "num1 + num2= " << num1 + num2 << endl;
		cout << "num1 / num2 = ";
		/*try
		{
			if (num2 == 0)
			{
				throw 123;
			}
			cout << num1 / num2 << endl;
		}
		catch (int i)
		{
			cout << "Error " << i<< ": Division by zero" << endl;
		} */
		
		try
		{
			if (num2 == 0)
			{
				throw "Error - Division by zero!!!!"; //генерировать символьную строку
			}
			cout << num1 / num2 << endl;
		}
		catch (char *str)//сюда передастся строка
		{
			cout << str << endl;
		}
		//Так же исключения можно включать в определения функций, как на примере деления, можно заранее вшить проверку деления на ноль
	/*	int division(int n1, int n2)
		{
			if (n2 == 0)
			{
				throw 99;
			}
			return n1 / n2;
		}*/
		//Вызов будет выглядит следущим образом 
		/*try
		{
			cout << division(5, 0);
			cout << endl;
		}
		catch (int i)
		{
			cout << "Error" << i << " : Division zero" << endl;
		}*/
		cout << "num1 - num2= " << num1 - num2 << endl;
		cout << "=========================" << endl << endl;
	}
	cout << "Jobs done!" << endl << endl;
    return 0;
}


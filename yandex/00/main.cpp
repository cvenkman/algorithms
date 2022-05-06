#include <iostream>
#include <map>
#include <string>
#include <fstream>
#include <algorithm>
// #include <vector>

int main()
{
	int lettersNum;
	std::cin >> lettersNum;

	std::map<int, char> letters;
	for (int i = 0, tmp; i < lettersNum; i++) {
		std::cin >> tmp;
		letters.insert(std::pair<int, char>(tmp, ' '));
	}

	for (auto it = letters.begin(); it != letters.end(); ++it)
	{
		std::cout << (*it).first << " : " << (*it).second << std::endl;
	}


	std::map<char, int> abc;
	char c;
	for (int i = 0, c = 'a'; c <= 'z'; ++i, ++c) {
		abc.insert(std::pair<char,int>(c, i));
		i++;
	}


	int W = 0;

    return 0;
}
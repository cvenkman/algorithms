#include <vector>
#include <iostream>
#include <fstream>
#include <algorithm>

int main()
{
    std::ifstream in("input.txt");
	if (!in.is_open())
		return 1;

	std::vector<char> jewelryV;
	char ch;

	while (in.get(ch) && ch != '\n') {
		jewelryV.push_back(ch);
	}

	int i = 0;
    std::string line;
	getline(in, line);

	for (int k = 0; k < line.length(); k++) {
		if (std::find(jewelryV.begin(), jewelryV.end(), line[k]) != jewelryV.end()) {
			std::cout << "--- " << line[k] << "\n";
			i++;
		}
	}

    in.close();

    std::ofstream out;
    out.open("output.txt");
    if (!out.is_open())
        return 1;
	out << i;
    return 0;
}

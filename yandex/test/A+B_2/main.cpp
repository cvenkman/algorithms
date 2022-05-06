#include <iostream>
#include <fstream>
 
int main()
{
    std::string line;
 
    std::ifstream in("input.txt");
	if (!in.is_open())
		return 1;

	getline(in, line);
	std::string a(line, 0, line.find_first_of(' '));
	std::string b(line, line.find_first_of(' ') + 1, line.length());
    in.close();

    std::ofstream out;
    out.open("output.txt");
    if (!out.is_open())
        return 1;
	out << atoi(a.c_str()) + atoi(b.c_str());
    return 0;
}
package main

import (
	"fmt"
)

func main() {
	fmt.Println(letterCombinations("2"))
	// fmt.Println(letterCombinations("23"))
}

func letterCombinations(digits string) []string {
	// len := len(digits)
	d := 3
	for range digits {
		d *= d
	}
    combinations := make([]string, d, d)

	alph := make(map[rune]string, 3)
	alph['2'] = "abc"
	alph['3'] = "def"
	alph['4'] = "ghi"

	for i, ch := range digits {
		for _, c := range alph[ch] {
			fmt.Println(alph[rune(digits[i + 1])])
			c=c
			// for _, h := range alph[rune(digits[i + 1])] {

			// }
		}
	}
	return combinations
}
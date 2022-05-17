package main

import "fmt"

// Большее число делим на меньшее.
// Если делится без остатка, то меньшее число и есть НОД.
// Если есть остаток, то большее число заменяем на остаток от деления.
// Переходим к первому пункту.
func EuclideanAlgorithm(max, min int) int {
	for {
		/* swap if max < min */
		if max < min {
			tmp := max
			max = min
			min = tmp
		}
		if max % min == 0 {
			return min
		}
		max = max % min
	}
	return -1
}

func main() {
	fmt.Println(EuclideanAlgorithm(30, 18))
	fmt.Println(EuclideanAlgorithm(2, 4))
}
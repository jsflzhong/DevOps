package main

import (
	"fmt"
	"time"
)

func main() {

	for {
		time.Sleep(time.Second * 1)
		fmt.Println("This is a loop")
	}
}

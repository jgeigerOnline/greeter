package main

import (
	"bytes"
	"log"
	"net/http"
)

func main() {
	_, err := http.Post("http://greeter", "text/plain", bytes.NewBufferString("Hello from Go!"))

	if err != nil {
		log.Fatal(err)
	}
}


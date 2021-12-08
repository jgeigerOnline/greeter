FROM golang:1.16-alpine

WORKDIR /greeter
COPY go.mod main.go ./
RUN go get -d -v ./...
RUN go install -v ./...

CMD ["greeter"]


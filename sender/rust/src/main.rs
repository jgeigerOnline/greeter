fn main() {
    let client = reqwest::blocking::Client::new();

    client.post("http://greeter")
        .body("Hello from Rust!")
        .send()
        .unwrap();
}

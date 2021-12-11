FROM rust:1.57.0

WORKDIR /greeter
COPY Cargo.toml .
COPY src/main.rs ./src/
RUN cargo build --release

CMD ["./target/release/rust"]

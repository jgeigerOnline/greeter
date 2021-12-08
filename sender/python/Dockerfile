FROM python:3.8-slim-buster

WORKDIR /greeter

COPY requirements.txt app.py ./
RUN pip3 install --no-cache-dir -r requirements.txt

ENTRYPOINT [ "python" , "app.py" ]


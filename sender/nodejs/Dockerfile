FROM node:16

WORKDIR /greeter
COPY package.json greeter.js ./
RUN npm install

CMD [ "node", "greeter.js" ]


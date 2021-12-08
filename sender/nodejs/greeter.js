const http = require('http')

const data = 'Hello from NodeJS!';

const options = {
    hostname: 'greeter',
    port: 80,
    path: '/',
    method: 'POST',
    headers: {
        'Content-Type': 'text/plain',
        'Content-Length': data.length
    }
}

const req = http.request(options, _ => {
})
req.write(data)
req.end()


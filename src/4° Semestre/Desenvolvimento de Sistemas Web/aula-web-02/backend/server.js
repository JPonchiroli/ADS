const express = require("express")
const cors = require("cors")
const fs =  require("fs")
const app = express()
const PORT = 3001

const writeMessage = (data) => {
    fs.writeFileSync("./messages.json", JSON.stringify(data, null, 2))
}

const readMessage = () => {
    const data = fs.readFileSync("./messages.json")
    const messages = JSON.parse(data)
}

app.use(cors())
app.use(express.json())

app.listen(PORT, () => {
    console.log("Servidor rodando na porta 3001")
})

app.get('/', (req, res) => {
    res.send("Servidor rodando na porta 3001 ")
})

app.post('/messages', (req, res) => {
    const messages  = readMessage()
    const formData = req.body

    const newMessage = {
        id: messages.length > 0 ? messages[messages.length -1].id + 1 : 1,
        ...formData
    }

    messages.push(newMessage)
    writeMessage(messages)
    res.status(201).json(newMessage)
})
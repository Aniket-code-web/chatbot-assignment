# WhatsApp Chatbot Backend (Spring Boot)

## Overview

This project is a simple backend simulation of a WhatsApp chatbot built using Spring Boot.
It receives messages via a REST API and responds with predefined replies.

---

## Features

* REST API endpoint `/webhook`
* Accepts JSON input simulating WhatsApp messages
* Returns predefined responses
* Logs all incoming messages
* Clean architecture using Controller + Service layer

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Maven

---

## API Endpoint

### POST /webhook

#### Request Body:

```json
{
  "message": "Hi"
}
```

#### Response:

```json
{
  "reply": "Hello"
}
```

---

## Supported Messages

| Input         | Response                   |
| ------------- | -------------------------- |
| Hi            | Hello                      |
| Bye           | Goodbye                    |
| Myself Aniket | Hello Aniket, How are you? |

---

## ▶️ How to Run Locally

1. Clone the repository
2. Run:

```
mvnw.cmd clean package
mvnw.cmd spring-boot:run
```

3. Test using Postman at:

```
http://localhost:8080/webhook
```

---

## 🌐 Live Demo

https://chatbot-assignment-lh0l.onrender.com

---

## 📂 GitHub Repository

(Add your repo link here)

# 📝 Blog Post REST API

A simple RESTful API built with **Spring Boot** to manage blog posts. Supports full **CRUD** operations with an H2 in-memory database.

---

## 🚀 Features

- Create, Read, Update, Delete blog posts
- RESTful endpoints using Spring Boot
- In-memory H2 database
- JSON request/response structure
- Layered architecture (Controller → Service → Repository → Model)

---

## 🔧 Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Gradle**
- **Postman** (for API testing)

---

🌐 API Endpoints
Method	Endpoint	Description
POST	/api/posts	Create new blog post
GET	/api/posts	Get all posts
GET	/api/posts/{id}	Get post by ID
PUT	/api/posts/{id}	Update blog post
DELETE	/api/posts/{id}	Delete blog post

📥 Sample JSON (POST/PUT)
json
Copy
Edit
{
  "title": "My First Blog Post",
  "content": "This is the content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"]
}

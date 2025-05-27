# Job Tracker

A full-stack job tracking app to help you manage your job applications efficiently.

## Features

- ✅ Create, view, update, and delete job entries   
- ⚙️ RESTful API built with Spring Boot  
- 💾 MySQL for persistent data storage  
- ✔️ Data validation using Jakarta Validation  
- 🎨 Frontend (React + Vite + Tailwind) coming soon

---

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 17 or higher  
- Maven  
- MySQL

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/jobtracker.git
   cd jobtracker
2. Configure the MySQL database
3. 
   Open src/main/resources/application.properties and add your DB info:
   
   spring.datasource.url=jdbc:mysql://localhost:3306/jobtracker
   
   spring.datasource.username=yourUsername
   
   spring.datasource.password=yourPassword
   
   spring.jpa.hibernate.ddl-auto=update
   
5. Run the app
   Use Maven to build and run the app:
   mvn clean install
   mvn spring-boot:run

API Endpoints
| Method | Endpoint     | Description            |
| ------ | ------------ | ---------------------- |
| GET    | `/jobs`      | Get all jobs           |
| POST   | `/jobs`      | Add a new job          |
| PUT    | `/jobs/{id}` | Update an existing job |
| DELETE | `/jobs/{id}` | Delete a job           |

## API Documentation

### Get All Jobs
```http
GET /jobs
```
Returns a list of all job entries.

**Response**
```json
[
  {
    "id": 1,
    "position": "Software Engineer",
    "company": "Tech Corp",
    "status": "Applied",
    "notes": "Applied through LinkedIn"
  },
  {
    "id": 2,
    "position": "Full Stack Developer",
    "company": "Startup Inc",
    "status": "Interview",
    "notes": "Technical interview scheduled"
  }
]
```

### Create a New Job
```http
POST /jobs
Content-Type: application/json
```
Creates a new job entry.

**Request Body**
```json
{
  "position": "Software Engineer",
  "company": "Tech Corp",
  "status": "Applied",
  "notes": "Applied through LinkedIn"
}
```

**Response**
```json
{
  "id": 1,
  "position": "Software Engineer",
  "company": "Tech Corp",
  "status": "Applied",
  "notes": "Applied through LinkedIn"
}
```

### Update a Job
```http
PUT /jobs/{id}
Content-Type: application/json
```
Updates an existing job entry.

**Request Body**
```json
{
  "position": "Senior Software Engineer",
  "company": "Tech Corp",
  "status": "Interview",
  "notes": "Technical interview scheduled"
}
```

**Response**
```json
{
  "id": 1,
  "position": "Senior Software Engineer",
  "company": "Tech Corp",
  "status": "Interview",
  "notes": "Technical interview scheduled"
}
```

### Delete a Job
```http
DELETE /jobs/{id}
```
Deletes a job entry.

**Response**
- 204 No Content (success)
- 404 Not Found (if job doesn't exist)

### Validation Rules
- All fields (position, company, status, notes) are required
- Fields cannot be blank

### Error Responses
```json
{
  "position": "Position is required",
  "company": "Company is required",
  "status": "Status is required",
  "notes": "Notes is required"
}
```

Tech Stack
Backend
Java 17
Spring Boot
Spring Data JPA
MySQL
Lombok

Frontend (coming soon)
React
Vite
Tailwind CSS

Future Improvements
Frontend integration
Job filtering by status
Pagination and search
User authentication

Author
Chris Miller
Built with love and a whole lot of mvn spring-boot:run


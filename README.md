# Job Tracker

A full-stack job tracking app to help you manage your job applications efficiently.

## Features

* ✅ Create, view, update, and delete job entries
* ⚙️ RESTful API backend with Java & Spring Boot
* 📱 Mobile frontend built with Flutter

## Tech Stack

### Backend 
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

### Frontend
- Flutter (mobile app)

## Getting Started

### Backend Setup

1. Clone this repository.
2. Set up your MySQL database and configure your connection details in `application.properties`.
3. Build and run the backend:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup

1. Navigate to the frontend directory:
    ```bash
    cd jobtracker_frontend
    ```
2. Ensure you have [Flutter](https://flutter.dev/docs/get-started/install) installed.
3. Run the Flutter app:
    ```bash
    flutter pub get
    flutter run
    ```

## API Endpoints

### List All Jobs
```
GET /jobs
```
Returns a list of all job entries. You can optionally filter by status:

```
GET /jobs?status=Interview
```

#### Response Example
```json
[
  {
    "id": 1,
    "position": "Software Engineer",
    "company": "Tech Corp",
    "status": "Applied",
    "notes": "Applied through LinkedIn"
  }
]
```

### Create a New Job
```
POST /jobs
Content-Type: application/json
```
#### Request Body Example
```json
{
  "position": "Software Engineer",
  "company": "Tech Corp",
  "status": "Applied",
  "notes": "Applied through LinkedIn"
}
```
#### Response Example
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
```
PUT /jobs/{id}
Content-Type: application/json
```
#### Request Body Example
```json
{
  "position": "Senior Software Engineer",
  "company": "Tech Corp",
  "status": "Interview",
  "notes": "Technical interview scheduled"
}
```
#### Response Example
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
```
DELETE /jobs/{id}
```
#### Response Codes
- 204 No Content (success)
- 404 Not Found (if job doesn't exist)

## Validation Rules

- All fields (position, company, status, notes) are required.
- Fields cannot be blank.

### Error Responses
```json
{
  "position": "Position is required",
  "company": "Company is required",
  "status": "Status is required",
  "notes": "Notes is required"
}
```

## Future Improvements

- Frontend integration (Flutter)
- Pagination and search
- User authentication

## Author

Chris Miller  
Built with ❤️ and a whole lot of `mvn spring-boot:run`

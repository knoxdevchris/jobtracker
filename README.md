# Job Tracker  A full-stack job tracking app to help you manage your job applications efficiently.  ## Features  * ✅ Create, view, update, and delete job entries * ⚙️ RESTful API built with **Spring Boot** * 💾 **MySQL** for persistent data storage * ✔️ Data validation using **Jakarta Validation** * 📱 Frontend (Flutter) coming soon  ---  ## Getting Started  ### Prerequisites  Make sure you have the following installed:  * **Java 17** or higher * **Maven** * **MySQL** * **Flutter SDK** (for the frontend, once available)  ### Setup  1.  **Clone the repository**      ```bash     git clone [https://github.com/your-username/jobtracker.git](https://github.com/your-username/jobtracker.git)     cd jobtracker     ```  2.  **Configure the MySQL database**      Open `src/main/resources/application.properties` and add your database information:      ```properties     spring.datasource.url=jdbc:mysql://localhost:3306/jobtracker     spring.datasource.username=yourUsername     spring.datasource.password=yourPassword     spring.jpa.hibernate.ddl-auto=update     ```  3.  **Run the Backend App**      Use Maven to build and run the Spring Boot application:      ```bash     mvn clean install     mvn spring-boot:run     ```  4.  **Frontend Setup (Coming Soon)**      Instructions for setting up and running the Flutter frontend will be provided here once it's available. This will likely involve navigating to the frontend directory and running `flutter pub get` and `flutter run`.  ---  ## API Endpoints  | Method | Endpoint     | Description            | | :----- | :----------- | :--------------------- | | `GET`  | `/jobs`      | Get all jobs           | | `POST` | `/jobs`      | Add a new job          | | `PUT`  | `/jobs/{id}` | Update an existing job | | `DELETE` | `/jobs/{id}` | Delete a job           |  ### Get All Jobs  ```http GET /jobs 
Returns a list of all job entries.
Response Example
[   {     "id": 1,     "position": "Software Engineer",     "company": "Tech Corp",     "status": "Applied",     "notes": "Applied through LinkedIn"   },   {     "id": 2,     "position": "Full Stack Developer",     "company": "Startup Inc",     "status": "Interview",     "notes": "Technical interview scheduled"   } ] 
Create a New Job
POST /jobs Content-Type: application/json 
Creates a new job entry.
Request Body Example
{   "position": "Software Engineer",   "company": "Tech Corp",   "status": "Applied",   "notes": "Applied through LinkedIn" } 
Response Example
{   "id": 1,   "position": "Software Engineer",   "company": "Tech Corp",   "status": "Applied",   "notes": "Applied through LinkedIn" } 
Update a Job
PUT /jobs/{id} Content-Type: application/json 
Updates an existing job entry.
Request Body Example
{   "position": "Senior Software Engineer",   "company": "Tech Corp",   "status": "Interview",   "notes": "Technical interview scheduled" } 
Response Example
{   "id": 1,   "position": "Senior Software Engineer",   "company": "Tech Corp",   "status": "Interview",   "notes": "Technical interview scheduled" } 
Delete a Job
DELETE /jobs/{id} 
Deletes a job entry.
Response
	•	204 No Content (success)
	•	404 Not Found (if job doesn't exist)
Validation Rules
	•	All fields (position, company, status, notes) are required.
	•	Fields cannot be blank.
Error Responses
{   "position": "Position is required",   "company": "Company is required",   "status": "Status is required",   "notes": "Notes is required" } 
Tech Stack
Backend
	•	Java 17
	•	Spring Boot
	•	Spring Data JPA
	•	MySQL
	•	Lombok
Frontend (Coming Soon)
	•	Flutter
Future Improvements
	•	Frontend integration
	•	Job filtering by status
	•	Pagination and search
	•	User authentication
Author
Chris Miller Built with ❤️ and a whole lot of mvn spring-boot:run


# RentVideo API Documentation

## Overview
RentVideo is a RESTful API service built with Spring Boot for managing an online video rental system. It uses MySQL for data persistence and implements authentication and authorization using Basic Auth.

---

## Features

### Authentication & Authorization
- **Basic Auth** is used for authentication.
- Two roles: `CUSTOMER` and `ADMIN`.
- Public endpoints: Registration, Login.
- Private endpoints: Require authentication and, in some cases, specific roles.

### User Management
- **Register**: Users can register with email, password, first name, last name, and role (defaults to CUSTOMER).
- **Login**: Users log in with email and password (Basic Auth).
- Passwords are hashed using BCrypt.

### Video Management
- **Fields**: Title, Director, Genre, Availability Status.
- **Browse Videos**: Any user can view available videos.
- **Manage Videos**: Only ADMIN can create, update, or delete videos.

---

## API Endpoints

### Public Endpoints
- `POST /register` — Register a new user
- `POST /login` — Login (Basic Auth)

### Private Endpoints (Require Authentication)
- `GET /videos` — List all available videos (any authenticated user)
- `POST /videos` — Add a new video (ADMIN only)
- `PUT /videos/{id}` — Update video details (ADMIN only)
- `DELETE /videos/{id}` — Delete a video (ADMIN only)

---

## Error Handling
- Returns appropriate HTTP status codes (e.g., 404 for not found).
- Handles common errors gracefully.

---

## Technologies Used
- Spring Boot
- Spring Security
- MySQL
- BCrypt (for password hashing)

---

## Testing
- Unit tests for essential operations (optional).

---

## Getting Started
1. Clone the repository.
2. Configure MySQL connection in `application.properties`.
3. Build and run the application using Gradle:
   ```sh
   ./gradlew bootRun
   ```
4. Access the API endpoints as described above.

---

## Contact
For any queries, contact the project maintainer.

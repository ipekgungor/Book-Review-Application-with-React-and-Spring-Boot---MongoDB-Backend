# Book-Review-Application-with-React-and-Spring-Boot---MongoDB - Backend

This project is a review application developed using React and Spring Boot, integrated with a MongoDB database. The application allows users to see the book information like author, genre and various photos of the book and to add reviews about the books.

## Features

- **Home Page:** Users can view book information including name, author, genre, and book poster. By clicking the reviews button, they will be directed to the book's reviews page.
- **Reviews Page:** Make and displays reviews associated with each book.

## Requirements

- **Java:** 17 or later
- **Maven:** 
- **MongoDB:** Database management system

## Installation Instructions
To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/ipekgungor/Book-Review-Application-with-React-and-Spring-Boot---MongoDB-Backend.git
   cd Book-Review-Application-with-React-and-Spring-Boot---MongoDB-Backend
2. Run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
3. Once the application is running, navigate to http://localhost:8080 to use the app.

## Contact
- **Developer:** İpek Güngör
- **Email:** ipekgungor2001@gmail.com
- **GitHub Profile:** ipekgungor

## Notes
- **Be careful about the java and eclipse versions.** My Eclipse version: 2024-06 (4.32.0) / My Java version: java 22.0.
- **You can find books.json in src/main/resources/data**
- **I solved the CORS problem using ngrok. You can find the configuration in the axiosConfig.js file. Ngrok allows you to create an account and start using it by entering the command ngrok http 8080.** 

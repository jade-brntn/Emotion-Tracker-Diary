
# One Random Question a Day Diary

The "One Random Question a Day Diary" application presents users with a random question each day, allows them to submit their answers, and analyzes the sentiment of these responses to visualize emotional trends over time.

## Features

- **Daily Random Question**: Presents a random question to the user each day.
- **Response Submission**: Users can write and submit their answers.
- **Sentiment Analysis**: Analyzes the sentiment of the user responses.
- **Data Visualization**: Visualizes emotional trends over time based on sentiment analysis.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- **Java JDK 11** or later
- **Maven**: Needed for Spring Boot
- **MySQL Server**: For the database
- **Node.js and npm**: For running the React frontend

## Technology Stack

- **Backend**: Java with Spring Boot
- **Frontend**: React
- **Database**: MySQL
- **Sentiment Analysis**: Stanford NLP (integration not included in this guide)
- **Visualization**: Chart.js (for future integration)

## Setup Instructions

### Database Setup

Create a MySQL database and run the provided SQL script to set up your schema.

### Backend Setup

1. Navigate to the backend project directory.
2. Use Maven to build and run the Spring Boot application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup

1. Navigate to the frontend project directory.
2. Install dependencies and start the React application:
   ```bash
   npm install
   npm start
   ```

## Usage

After starting both the backend and frontend, visit `http://localhost:3000` in your web browser to access the application. You can view daily questions, submit responses, and (once implemented) view sentiment analysis results and trends.


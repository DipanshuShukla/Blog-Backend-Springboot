# Nordic Rose Blog Backend

This is the backend for the Nordic Rose blog project, built using Spring Boot. It connects to a MySQL database and provides essential functionality for managing and serving blog content.

If you are looking for the frontend repo of the Nordic Rose blog project, you can find it at [Nordic Rose Blog Frontend](https://github.com/DipanshuShukla/Blog-Frontend-Angular.git).

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java:** This project is developed using Java. Ensure you have Java Development Kit (JDK) 17 or higher installed.
- **MySQL:** You should have a MySQL database instance running.
- **Maven:** You need to have Apache Maven installed for building the project.

## Application Configuration

The application requires specific runtime environment variables to be set. You can configure these environment variables in your deployment environment. The following environment variables are required:

- `PORT`: The port on which the application will run.
- `DATASOURCE_URL`: The JDBC URL for your MySQL database.
- `DATASOURCE_USERNAME`: The MySQL username.
- `DATASOURCE_PASSWORD`: The MySQL password.

Ensure you have these environment variables correctly set with appropriate values in your deployment environment. This can typically be done using environment-specific configuration or deployment scripts.

## Database Setup

To set up the database, you can use the provided SQL file located in the `src/main/resources` directory. You can import this file into your MySQL database management tool. If you need assistance with this step, refer to your database tool's documentation.

```shell
mysql -u your_username -p your_database_name < src/main/resources/database-setup.sql
```

Make sure to replace `your_username` and `your_database_name` with your actual MySQL username and database name.

## Building and Running

To build and run the project, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/DipanshuShukla/Blog-Backend-Springboot.git
   cd Blog-Backend-Springboot
   ```

2. Build the project using Maven:

   ```shell
   mvn clean install
   ```

3. Run the Spring Boot application:

   ```shell
   java -jar target/Nordic-Rose-0.0.1-SNAPSHOT.jar
   ```

The application should now be running at the specified port, and you can start using the API to manage your blog content.

## API Documentation

For information on available API endpoints and how to use them, please refer to the API documentation, which can be found at [API Documentation](/api-documentation.md).

## Docker Image

You can find the Docker image for this backend on DockerHub. Visit [DockerHub - Nordic Rose Blog Backend](https://hub.docker.com/r/dipanshushukla/nordic-rose-blog-backend) to access the Docker image.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for more details.

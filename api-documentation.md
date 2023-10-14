# Nordic Rose Blog Backend API Documentation

This documentation outlines the API endpoints and the logic behind them for the Nordic Rose Blog Backend.

## API Endpoints

### Get All Tags

- **Endpoint**: `/tags`
- **Method**: `GET`
- **Description**: Retrieve a list of all tags.
- **Request**: N/A
- **Response**:
    - Status Code: `200 OK`
    - Response Body: A list of tags where each tag is represented as `{Tagid : tag_name}`.

### Get a Random Blog Post

- **Endpoint**: `/blog/random`
- **Method**: `GET`
- **Description**: Retrieve a random blog post.
- **Request**: N/A
- **Response**:
    - Status Code: `200 OK`
    - Response Body: A JSON object representing a random blog post with fields:
        - `blogid`
        - `authorid`
        - `title`
        - `subtitle`
        - `thumbnail`.

### Get Paged Blog Posts

- **Endpoint**: `/blog/paged`
- **Method**: `GET`
- **Description**: Retrieve a list of paged blog posts with optional filtering.
- **Query Parameters**:
    - `exclude` (Optional): Exclude a specific blog post by ID (default is -1 to include all posts).
    - `noPerPage` (Optional): Number of posts to display per page (default is 10).
    - `curpage` (Optional): Page number for pagination (default is 1).
- **Response**:
    - Status Code: `200 OK`
    - Response Body: A list of JSON objects, each representing a blog post with fields:
        - `blogid`
        - `authorid`
        - `title`
        - `subtitle`
        - `thumbnail`.

### Get Blog Post by ID

- **Endpoint**: `/blog/{blog_id}`
- **Method**: `GET`
- **Description**: Retrieve a specific blog post by its unique ID.
- **Parameters**:
    - `blog_id` (Path Parameter): The unique ID of the blog post to retrieve.
- **Response**:
    - Status Code: `200 OK`
    - Response Body: A JSON object representing the requested blog post with fields:
        - `blogid`
        - `title`
        - `subtitle`
        - `thumbnail`
        - `author`
        - `tags`.

### Subscribe to Newsletter

- **Endpoint**: `/newsletter/`
- **Method**: `POST`
- **Description**: Subscribe to the newsletter.
- **Request Body**:
    - `email`: The email address to subscribe.
- **Response**:
    - Status Code: `200 OK`
    - Response Body: An object with an `email` field containing the subscribed email address (contains `null` if unsuccessful).

## Database Structure

### Blogs Table

- **Table Name**: `blogs`
- **Columns**:
    - `blogid` (Primary Key, Not Null, Integer)
    - `authorid` (Nullable, Integer)
    - `title` (String, Nullable, Varchar(255))
    - `subtitle` (String, Nullable, Varchar(255))
    - `thumbnail` (String, Nullable, Varchar(255))
- **Constraints**:
    - Primary Key: `blogid`
    - Foreign Key: `authorid` (References `author(id)`)

### Author Table

- **Table Name**: `author`
- **Columns**:
    - `id` (Primary Key, Not Null, Integer)
    - `name` (Nullable, Varchar(255))
    - `about` (Nullable, Text)
    - `linkfb` (Nullable, Varchar(255))
    - `linktwt` (Nullable, Varchar(255))
    - `linkwa` (Nullable, Varchar(255))
- **Constraints**:
    - Primary Key: `id`

### Tags Table

- **Table Name**: `tags`
- **Columns**:
    - `tagid` (Primary Key, Not Null, Integer)
    - `tagname` (Nullable, Varchar(255))
- **Constraints**:
    - Primary Key: `tagid`

### Blog Tags Table

- **Table Name**: `blog_tags`
- **Columns**:
    - `blogid` (Not Null, Integer)
    - `tagid` (Not Null, Integer)
- **Constraints**:
    - Primary Key: `(blogid, tagid)`
    - Foreign Key: `blogid` (References `blogs(blogid)`)
    - Foreign Key: `tagid` (References `tags(tagid)`)

### Newsletter Subscribers Table

- **Table Name**: `newsletter_subscribers`
- **Columns**:
    - `email` (Not Null, Varchar(255))
- **Constraints**:
    - Primary Key: `email`

## CORS Support

- **CORS**: Cross-Origin Resource Sharing is enabled, allowing requests from different origins.

## Error Handling

The API may return error responses with appropriate status codes and error messages. Ensure your code handles error responses properly.
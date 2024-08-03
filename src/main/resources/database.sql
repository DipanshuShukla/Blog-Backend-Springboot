CREATE DATABASE `nordic_rose`
	
CREATE TABLE `author` (
  `id` int NOT NULL,
  `about` text,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

CREATE TABLE `blogs` (
  `blogid` int NOT NULL,
  `subtitle` varchar(255) DEFAULT NULL,
  `thumbnail` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `authorid` int DEFAULT NULL,
  PRIMARY KEY (`blogid`),
  KEY `FKn06dbdwqwrruolpd4nq2kiu9l` (`authorid`),
  CONSTRAINT `FKn06dbdwqwrruolpd4nq2kiu9l` FOREIGN KEY (`authorid`) REFERENCES `author` (`id`)
)

CREATE TABLE `news_letter_subscribers` (
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`email`)
)

CREATE TABLE `tags` (
  `tagid` int NOT NULL,
  `tagname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tagid`)
)

CREATE TABLE `blog_tags` (
  `blogid` int NOT NULL,
  `tagid` int NOT NULL,
  PRIMARY KEY (`blogid`,`tagid`)
)

INSERT INTO nordic_rose.author (id,about,name) VALUES
	 (1,'I am a passionate writer and blogger, dedicated to exploring the beauty of words and sharing compelling stories with the world. Through my writing, I aim to inspire, entertain, and provoke thought in my readers. Join me on this literary journey!','John Doe'),
	 (2,'As an adventurous soul, I have made it my mission to travel the globe and capture the essence of each destination through the power of words. Join me as I take you on thrilling expeditions, unravel fascinating cultures, and unearth hidden gems around the world, one blog post at a time.','Jane Smith'),
	 (3,'Welcome to my world of knowledge and inspiration! I am on a quest to unlock the mysteries of the universe and share the insights I discover along the way. Join me as we delve into the realms of science, philosophy, and everything in between, igniting curiosity and expanding our understanding of the cosmos.','Mike Johnson'),
	 (4,'Through the lens of my camera, I capture the fleeting moments that tell stories of life, love, and human emotions. Join me as we embark on a visual journey, exploring the world''s beauty, documenting authentic moments, and uncovering the hidden narratives that connect us all.','Sarah Adams'),
	 (5,'I''m a food enthusiast with a knack for experimenting in the kitchen. Join me as we delve into the world of flavors, culinary traditions, and gastronomic adventures. From mouthwatering recipes to restaurant reviews, I''m here to inspire your taste buds and ignite your passion for all things delicious.','Alex Thompson'),
	 (6,'Welcome to my corner of creativity! As an artist, I explore various mediums to express my thoughts, emotions, and observations. Join me as we dive into the world of paintings, sculptures, and mixed media creations, where imagination knows no bounds and art becomes a gateway to endless possibilities.','Emily Wilson'),
	 (7,'I am a nature enthusiast and wildlife conservation advocate. Through my writing and photography, I aim to raise awareness about the wonders of the natural world and the urgent need to protect our fragile ecosystems. Join me on this conservation journey as we explore breathtaking landscapes and encounter fascinating creatures.','David Roberts'),
	 (8,'As a fitness fanatic and wellness coach, I am dedicated to helping individuals achieve their health goals and live their best lives. Join me as we embark on a transformative journey, exploring exercise routines, nutrition tips, mindfulness practices, and the holistic approach to well-being.','Sophia Lee'),
	 (9,'Welcome to the world of technology and innovation! I am passionate about exploring the latest advancements, gadgets, and trends shaping our digital landscape. Join me as we navigate the ever-evolving realm of tech, unraveling its complexities, and embracing its potential to transform the way we live and interact.','Daniel Wilson'),
	 (10,'I''m an avid reader and literary critic, constantly searching for captivating stories that transport us to different worlds and broaden our perspectives. Join me as we delve into the realm of literature, sharing book reviews, author interviews, and thought-provoking discussions that celebrate the power of storytelling.','Olivia Anderson');

INSERT INTO nordic_rose.blogs (blogid,subtitle,thumbnail,title,authorid) VALUES
	 (1,'Exploring the advancements and potential of AI in today''s world.','https://example.com/thumbnails/ai.jpg','The Future of Artificial Intelligence',1),
	 (2,'Discovering the hidden gems and rich cultural heritage of Europe.','https://example.com/thumbnails/europe.jpg','A Journey Through Europe',2),
	 (3,'Savoring mouthwatering delicacies from around the globe.','https://example.com/thumbnails/food.jpg','Delicious Food Adventures',3),
	 (4,'Exploring the latest fashion trends and how they influence our style.','https://example.com/thumbnails/fashion.jpg','Fashion Trends: From the Runway to the Streets',4),
	 (5,'Unveiling the power of photography to tell compelling stories.','https://example.com/thumbnails/photography.jpg','Capturing Moments: The Art of Photography',5),
	 (6,'Diving into the adrenaline-pumping world of sports and athletes.','https://example.com/thumbnails/sports.jpg','The Thrill of Sports',6),
	 (7,'Exploring the melodies that resonate with our souls and shape our emotions.','https://example.com/thumbnails/music.jpg','Music: The Universal Language',7),
	 (8,'Celebrating the diversity of artistic expressions and their impact on society.','https://example.com/thumbnails/art.jpg','Unleashing Creativity: The World of Art',8),
	 (9,'Empowering ourselves through holistic approaches to health and well-being.','https://example.com/thumbnails/health.jpg','Healthy Living: Mind, Body, and Soul',9),
	 (10,'Discovering the marvels of the scientific world and its impact on our daily lives.','https://example.com/thumbnails/science.jpg','The Wonders of Science',10),
	 (11,'Uncovering the latest innovations and trends in the tech industry.','https://example.com/thumbnails/tech.jpg','Exploring the Tech World',2),
	 (12,'Capturing the beauty of destinations through the lens.','https://example.com/thumbnails/travel-photography.jpg','The Art of Travel Photography',1),
	 (13,'Indulging in delectable desserts from around the world.','https://example.com/thumbnails/desserts.jpg','Delicious Desserts: A Sweet Journey',3),
	 (14,'Staying ahead of the fashion game with the latest trends.','https://example.com/thumbnails/fashion-forward.jpg','Fashion Forward: Style Tips and Inspiration',2),
	 (15,'Immersing in the breathtaking landscapes captured through photography.','https://example.com/thumbnails/landscape-photography.jpg','The Magic of Landscape Photography',1),
	 (16,'Embracing adrenaline-filled sports for the daring at heart.','https://example.com/thumbnails/extreme-sports.jpg','Extreme Sports: Thrills and Adventures',3),
	 (17,'Appreciating the timeless beauty of classical music compositions.','https://example.com/thumbnails/classical-music.jpg','The Melodies of Classical Music',2),
	 (18,'Unveiling the vibrant world of street art and its cultural impact.','https://example.com/thumbnails/street-art.jpg','Exploring Street Art Culture',1),
	 (19,'Discovering tranquility and peace through mindfulness practices.','https://example.com/thumbnails/yoga-meditation.jpg','Yoga and Meditation: A Path to Inner Harmony',3),
	 (20,'Embarking on a cosmic journey to understand the universe and its wonders.','https://example.com/thumbnails/universe.jpg','Unraveling the Mysteries of the Universe',1);

INSERT INTO nordic_rose.news_letter_subscribers (email) VALUES
	 ('test@test.com'),
	 ('test1@test.com'),
	 ('test2@test.com');

INSERT INTO nordic_rose.tags (tagid,tagname) VALUES
	 (1,'Technology'),
	 (2,'Travel'),
	 (3,'Food'),
	 (4,'Fashion'),
	 (5,'Photography'),
	 (6,'Sports'),
	 (7,'Music'),
	 (8,'Art'),
	 (9,'Health'),
	 (10,'Fitness'),
	 (11,'Science'),
	 (12,'Lifestyle'),
	 (13,'Books'),
	 (14,'Movies'),
	 (15,'Gaming');

INSERT INTO nordic_rose.blog_tags (blogid,tagid) VALUES
	 (1,1),
	 (1,5),
	 (1,8),
	 (2,2),
	 (2,4),
	 (3,3),
	 (3,6),
	 (4,1),
	 (4,4),
	 (4,5),
	 (4,7),
	 (5,2),
	 (5,8),
	 (6,1),
	 (6,4),
	 (7,3),
	 (7,6),
	 (8,2),
	 (8,4),
	 (9,1),
	 (9,5),
	 (10,7),
	 (10,8),
	 (11,1),
	 (11,3),
	 (12,2),
	 (12,6),
	 (13,4),
	 (14,5),
	 (15,1),
	 (15,2),
	 (15,3),
	 (16,7),
	 (16,8),
	 (17,1),
	 (17,4),
	 (17,5),
	 (18,2),
	 (18,3),
	 (19,1),
	 (19,6),
	 (20,2),
	 (20,4),
	 (20,5);

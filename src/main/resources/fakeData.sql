INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('dog in a bog','8975','A book about a dog','2.89','dog.jpg',true,'15');

INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('hound in the pound','9867','A book about a hound','50.99','hound.jpg',false,'1');

INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('Chicken in the kitchen','4844','A book about a chicken','5000.99','chicken.jpg',true,'101');

INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('rat by the bat','0974','A book about a rat','87.99','rat.jpg',true,'2');

INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('bat with the gat','6865','A book about a bat','9.99','bat.jpg',false,'25');

INSERT INTO books (name,sku,description,price,image,active,stock)
VALUES('Cat without a hat','8976','A book about a cat without a hat','0.99','catNoHat.jpg',false,'69');

INSERT INTO categories (name)
VALUES('Fiction');

INSERT INTO categories (name)
VALUES('Action');

INSERT INTO categories (name)
VALUES('Romance');

INSERT INTO categories (name)
VALUES('Scifi');

INSERT INTO categories (name)
VALUES('Romcom');

INSERT INTO categories (name)
VALUES('Comic Book');

INSERT INTO book_category (book_id,category_id)
VALUES(1,1);

INSERT INTO book_category (book_id,category_id)
VALUES(1,2);

INSERT INTO book_category (book_id,category_id)
VALUES(2,1);

INSERT INTO book_category (book_id,category_id)
VALUES(3,1);

INSERT INTO book_category (book_id,category_id)
VALUES(2,2);




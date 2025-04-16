insert into orders (id, user_id, amount, currency) values
(1, 1, 999.99, 'RUB'),
(2, 1, 1499.99, 'RUB'),
(3, 2, 1299.99, 'RUB'),
(4, 3, 1999.99, 'RUB'),
(5, 4, 799.99, 'RUB');

insert into order_items (order_id, items) values
(1, 'iPhone 14'),
(1, 'AirPods Pro'),
(2, 'MacBook Air'),
(3, 'iPad Pro'),
(4, 'Apple Watch'),
(5, 'Apple Pencil');

INSERT INTO orders (user_id, amount, currency) VALUES (1, 199.99, 'RUB');
INSERT INTO orders (user_id, amount, currency) VALUES (2, 999.99, 'RUB');
INSERT INTO orders (user_id, amount, currency) VALUES (3, 2999.99, 'RUB');
INSERT INTO orders (user_id, amount, currency) VALUES (4, 899.99, 'RUB');
INSERT INTO orders (user_id, amount, currency) VALUES (5, 499.99, 'RUB');

INSERT INTO order_items (order_id, product_name) VALUES
(1, 'iPhone 13'), (1, 'AirPods Pro'),
(2, 'MacBook Pro'),
(3, 'iMac'), (3, 'Magic Keyboard'),
(4, 'iPad Air'),
(5, 'Apple Watch');

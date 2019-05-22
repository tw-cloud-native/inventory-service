CREATE TABLE `inventory` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `inventory_lock` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO inventory VALUES
(1, 1, 101),
(2, 2, 102),
(3, 3, 103);

INSERT INTO inventory_lock VALUES
(1, 1, 2);
create type unit_type as enum ('PCS','KG','L');

create table DishIngredient (
    id serial primary key ,
    id_dish INTEGER NOT NULL ,
    id_ingredient INTEGER NOT NULL,
    quantity_required DECIMAL(10,3) NOT NULL,
    unit unit_type,

    FOREIGN KEY (id_dish) REFERENCES dish(id) ON DELETE CASCADE,
    FOREIGN KEY (id_ingredient) references ingredient(id) ON DELETE CASCADE,
    UNIQUE (id_dish,id_ingredient)
);

ALTER TABLE dish ADD COLUMN IF NOT EXISTS selling_price DECIMAL(10, 2);
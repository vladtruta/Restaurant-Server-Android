package com.vladtruta.restaurantserver.repository

import com.vladtruta.restaurantserver.model.local.Category
import com.vladtruta.restaurantserver.model.local.MenuCourse

object MockData {
    val categories = listOf(
        Category.STARTERS,
        Category.MAIN_COURSES,
        Category.BEVERAGES,
        Category.DESSERTS
    )

    val menuCourses = listOf(
        MenuCourse(
            Category.MAIN_COURSES,
            "Chilli con carne",
            "A spicy stew containing chili peppers, meat, and often tomatoes and beans. ",
            "https://food-images.files.bbci.co.uk/food/recipes/chilliconcarne_67875_16x9.jpg",
            "300 g",
            25
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Chicken tikka masala",
            "Chicken tikka masala is an Indian dish consisting of marinated pieces of chicken breast that are first strung on a skewer and then roasted in a tandoor oven until they are crunchy on the outside and tender on the inside. The pieces of chicken are then braised in a creamy tomato sauce with paprika. \n" +
                    "\n" +
                    "Chicken tikka masala owes its origins to the world famous dish tandoori chicken as the dish was conceived as a way to make a meal out of leftovers. Since tandoori chicken is served in India without sauce, the next day the meat is usually tough and dried out. However, by stewing the chicken in a creamy tomato sauce full of spices, Indian chefs got the leftovers juicy and tasty again. Chicken tikka masala is actually the sister dish of butter chicken, which was also designed to preserve tandoori meat and keep it tender. \n" +
                    "\n" +
                    "This leftover dish became so popular that people stopped using the leftovers and started using fresh chicken instead. The marinade used for chicken tikka is the same as for tandoori chicken and other dishes from the tandoor oven.",
            "https://homecookingadventure.com/images/recipes/chicken-tikka-masala-main.jpg",
            "450 g",
            28
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Roasted pork tenderloin",
            "A cut of meat from a pig, created from the tissue along the dorsal side of the rib cage.",
            "https://cdn-image.foodandwine.com/sites/default/files/styles/medium_2x/public/201307-xl-spice-roasted-pork-tenderloin.jpg?itok=VoUYF6Eq",
            "500 g",
            37
        ),
        MenuCourse(
            Category.STARTERS,
            "Eggs Benedict",
            "An American breakfast or brunch dish that consists of two halves of an English muffin topped with a poached egg, bacon or ham, and hollandaise sauce.",
            "https://prods3.imgix.net/images/articles/2017_08/Non-Feature-eggs-benedict-recipe-breakfast1.jpg",
            "180 g",
            14
        ),
        MenuCourse(
            Category.DESSERTS,
            "Chocolate cake",
            "A cake flavored with melted chocolate, cocoa powder, or both.",
            "https://food-images.files.bbci.co.uk/food/recipes/easy_chocolate_cake_31070_16x9.jpg",
            "180 g",
            16
        ),
        MenuCourse(
            Category.DESSERTS,
            "Strawberry pudding",
            "A simple glazed strawberry mixture is layered with creamy pudding, whipped cream, and vanilla wafer cookies.",
            "https://3.bp.blogspot.com/-nVmA43OFeGk/W3TjRApNPhI/AAAAAAAApLM/yjSlIhq0E34X07L1jroRG2qENlhC1ljnACLcBGAs/s1600/Strawberry-Pudding-Photo.JPG",
            "145 g",
            8
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Mineral water",
            "Plain and simple mineral water",
            "https://www.healthxchange.sg/sites/hexassets/Assets/women/urinary-stones-drink-sparkling-mineral-water.jpg",
            "500 ml",
            6
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Sauvignon blanc",
            "A green-skinned grape variety that originates from the Bordeaux region of France.",
            "https://static.independent.co.uk/s3fs-public/thumbnails/image/2018/05/02/12/best-sauvignon-blanc.jpg?w968h681",
            "180 ml",
            12
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Craft beer",
            "A beer made in a traditional or non-mechanized way by a small brewery.",
            "https://static.vinepair.com/wp-content/uploads/2018/06/beer-bubble-cover-mobile.jpg",
            "400 ml",
            10
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Orange juice",
            "A liquid extract of the orange tree fruit, produced by squeezing or reaming oranges.",
            "https://www.earthfoodandfire.com/wp-content/uploads/2018/04/Homemade-Orange-Juice.jpg",
            "350 ml",
            11
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Mountain Dew",
            "A carbonated soft drink brand produced and owned by PepsiCo. The original formula was invented in 1940 by beverage bottlers Barney and Ally Hartman.",
            "https://radioimg.s3.amazonaws.com/wycdfm/styles/delta__775x515/s3/Mountain_Dew.jpg?itok=9MtiFKbH",
            "500 ml",
            7
        ),
        MenuCourse(
            Category.BEVERAGES,
            "Piña Colada",
            "A sweet cocktail made with rum, cream of coconut or coconut milk, and pineapple juice, usually served either blended or shaken with ice.",
            "https://www.thespruceeats.com/thmb/cDQK02EZOGbvxzBzV_u7-2-woTk=/4494x3000/filters:fill(auto,1)/virgin-pina-colada-recipe-2097115_05-5b0d8124ff1b7800364356ae.jpg",
            "550 ml",
            25
        ),
        MenuCourse(
            Category.STARTERS,
            "Devilled eggs",
            "Hard-boiled chicken eggs that have been shelled, cut in half, and filled with a paste made from the egg yolks mixed with other ingredients such as mayonnaise, chives and a little dijon mustard",
            "https://www.simplyrecipes.com/wp-content/uploads/2018/06/Kimchi-Deviled-Eggs-LEAD-HORIZONTAL.jpg",
            "200 g",
            20
        ),
        MenuCourse(
            Category.STARTERS,
            "Bruschetta",
            "Fried sour dough bread slices with cream cheese, salmon and zucchini ",
            "https://www.ricettedalmondo.it/images/foto-ricette/b/32230-bruschette-con-zucchine-e-salmone.jpg",
            "150 g",
            18
        ),
        MenuCourse(
            Category.STARTERS,
            "Foccacia",
            "Focaccia is a flat oven-baked Italian bread product similar in style and texture to pizza dough.",
            "https://littlerock.com.mt/wp-content/uploads/2015/03/Yeastless-potato-and-rosemary-foccacia.jpg",
            "300 g",
            15
        ),
        MenuCourse(
            Category.STARTERS,
            "Tapas",
            "Charcuterie board containing various Spanish specialities",
            "https://i2.wp.com/www.spainonafork.com/wp-content/uploads/2020/01/tapas1-33.png?resize=531%2C800&ssl=1",
            "600 g",
            60
        ),
        MenuCourse(
            Category.STARTERS,
            "Tempura fried vegetables",
            "Vegetables fried in Japanese style batter",
            "https://kimchimari.com/wp-content/uploads/2011/04/Tempura-Vegetables-Twigim.jpg",
            "150 g",
            15
        ),
        MenuCourse(
            Category.STARTERS,
            "Mozzarella sticks",
            "Fried mozzarella",
            "https://romaspecialtypizzas.com/wp-content/uploads/2019/04/mozzarella-sticks.jpg",
            "250 g",
            20
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Enchiladas Rojas",
            "Two red corn tortillas filled with your choice of beef or chicken fajitas rolled and topped with red enchilada gravy and cheese.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRjQODSGMLtAzUMOk9y0kqtIGQFYMarTw3ZAQh41QWaGXrufNJl&usqp=CAU",
            "400 g",
            30
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Ramen Chow Mein",
            "A stir-fry egg noodle dish packed with fresh vegetables served with chicken or beef, tofu, prawn.",
            "https://hips.hearstapps.com/hmg-prod/images/190208-delish-ramen-horizontal-093-1550096715.jpg",
            "150 g",
            15
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Sushi Menu",
            "Sushi is a Japanese dish of prepared vinegared rice, usually with some sugar and salt, accompanying a variety of ingredients, such as seafood, vegetables, and occasionally tropical fruits.",
            "https://sushicluj.ro/wp-content/uploads/2019/01/sm_sushi_set-800x533-300x169.jpg",
            "250 g",
            36
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Pizza",
            "Pizza is a savory dish of Italian origin, consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients baked at a high temperature, traditionally in a wood-fired oven. A small pizza is sometimes called a pizzetta",
            "https://www.bigbelly-cluj.ro/filehandler/ProductFirstFile/600x600/pizza-cu-ton-176.jpg?v=637043226689376134",
            "360 g",
            18
        ),
        MenuCourse(
            Category.MAIN_COURSES,
            "Ground beef",
            "Ground beef, minced beef or beef mince is beef that has been finely chopped with a knife or a meat grinder or mincing machine. It is used in many recipes including hamburgers and spaghetti Bolognese.",
            "https://cookthestory.com/wp-content/uploads/2019/02/how-to-cook-ground-beef-1392-320x180.jpg",
            "300 g",
            27
        ),
        MenuCourse(
            Category.DESSERTS,
            "Bagel",
            "A dense bread roll in the shape of a ring, made by boiling dough and then baking it.",
            "https://static1.squarespace.com/static/549367d9e4b0b0a3e2543543/t/5e2b22920d037176a3124973/1579885252035/NYC+Bagels.jpg?format=1500w",
            "70g",
            5
        ),
        MenuCourse(
            Category.DESSERTS,
            "Banana Bread",
            "Moist and delicious banana bread recipe. Easy to make, no need for a mixer! Ripe bananas, butter, sugar, egg, vanilla, baking soda, and flour.",
            "https://natashaskitchen.com/wp-content/uploads/2018/05/Banana-Bread-Recipe-7.jpg",
            "100g",
            15
        ),
        MenuCourse(
            Category.DESSERTS,
            "English Muffin",
            "O brioșă engleză este o pâine mică, rotundă și plată cu drojdie, care este de obicei feliată orizontal, prăjită și untată. Muffins-ul englezesc prăjit, care este adesea folosit în Marea Britanie și Statele Unite ca mâncare pentru micul dejun, poate fi servit cu toppinguri dulci sau topping-uri savuroase.",
            "https://www.biggerbolderbaking.com/wp-content/uploads/2019/03/No-knead-English-Muffins-Website-Thumbnail.jpg",
            "130g",
            15
        ),
        MenuCourse(
            Category.DESSERTS,
            "Croissant",
            "Un croissant este o brutărie, făină, viennoiserie de patiserie de origine austriacă, numită pentru forma sa istorică de semilună. Croissants și alte viennoiserie sunt făcute dintr-un aluat stratificat cu drojdie de drojdie.",
            "https://bakingamoment.com/wp-content/uploads/2019/02/IMG_2757-croissant-recipe-easy.jpg",
            "40g",
            5
        ),
        MenuCourse(
            Category.DESSERTS,
            "Bagheta",
            "O baghetă este o pâine lungă și subțire de pâine franceză, care este obișnuit obținută din aluat slab de bază. Se distinge prin lungimea și crusta ei crocante.",
            "https://www.exquis.ro/wp-content/uploads/2018/06/bagheta.png",
            "120g",
            12
        ),
        MenuCourse(
            Category.DESSERTS,
            "Orez cu lapte",
            "Orezul cu lapte este un desert făcut din orez fiert în lapte. De obicei se condimentează cu zahăr și cu scorțișoară, nucșoară sau ghimbir. De multe ori se adaugă și stafide. Cel mai bun pregratar!!",
            "https://retete.unica.ro/wp-content/uploads/2016/09/shutterstock_62962489-1024x739.jpg",
            "150g",
            11
        )
    )
}
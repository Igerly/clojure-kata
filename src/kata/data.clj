(ns kata.data)

(def mall
  {:shops     [{:name  "White Furniture"
                :items [{:name "chair" :price 2000}
                        {:name "table" :price 5500}
                        {:name "small chair" :price 1800}
                        {:name "small table" :price 2800}]}

               {:name  "Dish Devices"
                :items [{:name "cup" :price 380}
                        {:name "plate" :price 680}
                        {:name "fork" :price 210}
                        {:name "spoon" :price 210}
                        {:name "chopsticks" :price 180}]}

               {:name  "The Do It Ourselves"
                :items [{:name "rope" :price 800}
                        {:name "saw" :price 1400}
                        {:name "bond" :price 480}
                        {:name "plane" :price 2200}
                        {:name "screwdriver" :price 600}]}

               {:name  "Electrics"
                :items [{:name "chair" :price 600}
                        {:name "desk" :price 1800}
                        {:name "cable" :price 230}
                        {:name "speaker" :price 19000}
                        {:name "headphone" :price 8800}
                        {:name "earphone" :price 7800}]}

               {:name  "Amazing Apothecary"
                :items [{:name "cold medicine" :price 800}
                        {:name "ointment" :price 500}
                        {:name "eye-drops" :price 600}
                        {:name "poultice" :price 900}]}

               {:name  "The Rapid Supermarket"
                :items [{:name "spinach" :price 100}
                        {:name "ginseng" :price 120}
                        {:name "onion" :price 160}
                        {:name "ice cream" :price 200}
                        {:name "crisps" :price 80}]}]
   :customers [{:name         "Joe"
                :age          22
                :budget       8000
                :wants-to-buy [{:name "small table"}
                               {:name "plate"}
                               {:name "fork"}]}

               {:name         "Steven"
                :age          27
                :budget       2000
                :wants-to-buy [{:name "ice cream"}
                               {:name "screwdriver"}
                               {:name "cable"}
                               {:name "earphone"}]}

               {:name         "Patrick"
                :age          28
                :budget       4000
                :wants-to-buy [{:name "onion"}
                               {:name "ice cream"}
                               {:name "crisps"}
                               {:name "chopsticks"}]}

               {:name         "Diana"
                :age          38
                :budget       12000
                :wants-to-buy [{:name "cable"}
                               {:name "speaker"}
                               {:name "headphone"}]}

               {:name         "Chris"
                :age          26
                :budget       9000
                :wants-to-buy [{:name "saw"}
                               {:name "bond"}
                               {:name "plane"}
                               {:name "bag"}]}

               {:name         "Kathy"
                :age          22
                :budget       6000
                :wants-to-buy [{:name "cold medicine"}]}

               {:name         "Alice"
                :age          32
                :budget       2500
                :wants-to-buy [{:name "chair"}
                               {:name "desk"}]}

               {:name         "Andrew"
                :age          35
                :budget       11000
                :wants-to-buy [{:name "pants"}
                               {:name "coat"}]}

               {:name         "Martin"
                :age          21
                :budget       1000
                :wants-to-buy [{:name "cup"}
                               {:name "plate"}
                               {:name "fork"}
                               {:name "spoon"}]}

               {:name         "Amy"
                :age          36
                :budget       2000
                :wants-to-buy [{:name "ointment"}
                               {:name "poultice"}
                               {:name "spinach"}
                               {:name "ginseng"}
                               {:name "onion"}]}]})
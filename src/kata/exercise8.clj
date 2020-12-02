(ns kata.exercise8
  (:use [clojure.test]
        [kata.data]))

(testing "Nowhere to be Found"

  ; Create a set of item names that are in {@link customer->wants-to-buy} but not on sale in any shop.
  (let [not-for-sale #{}]

    (is (= not-for-sale #{"bag", "pants", "coat"}))))

(defn wanted-total [wishlist price-list]
  (reduce + (map #(price-list (:name %) 0) wishlist)))

(defn rich-enough [price-list customer]
  (>= (:budget customer) (wanted-total (:wants-to-buy customer) price-list)))

(defn cheapest-items-only [shops]
  (map first
       (partition-by :name
                     (sort-by (juxt :name :price)
                              (flatten (map :items shops))))))

(defn build-price-list [shops]
  (into {}
        (map (fn [item] {(:name item) (:price item)})
             (cheapest-items-only shops))))

(testing "I see it, I like it, I want it, I got it "

  ; Create a customers' name list including who are having enough money to buy all items they want which is on sale.
  ; Items that are not for sale can be counted as 0 money cost.
  ; If there are multiple items with the same names, but different prices, customer will choose the cheapest one.
  (let [richies (map :name
                     (filter #(rich-enough (build-price-list (:shops mall)) %) (:customers mall)))]

    (is (= richies ["Joe", "Patrick", "Chris", "Kathy", "Alice", "Andrew", "Amy"]))))

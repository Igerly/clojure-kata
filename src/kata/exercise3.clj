(ns kata.exercise3
  (:use [clojure.test]
        [kata.data]))

(testing "How many items wanted"

  ; Count how many items are wanted
  (let [wanted-items
        (count (mapcat :wants-to-buy (:customers mall)))]

    (is (= wanted-items 32))))


(testing "Richest customer"

  ; Find the richest customer's budget
  (let [richest-customer
        (apply max (map :budget (:customers mall)))]

    (is (= richest-customer 12000))))

(testing "Youngest customer"

  ; Find the youngest customer
  (let [youngest-customer
        (apply min-key :age (:customers mall))]

    (is (= (:name youngest-customer) "Martin"))))

(ns kata.exercise5
  (:use [clojure.test]
        [kata.data]
        [kata.matchers]))

; Create a list of customer names
(def name-list [])
;(def name-list (map #(:name %) (:customers mall)))

(is (contains-each name-list
                       ["Joe1", "Steven", "Patrick", "Diana", "Chris", "Kathy", "Alice", "Andrew", "Martin", "Amy"]))

; Create a set of customer age

(def age-set [])
(is (contains-each age-set
                       [21, 22, 26, 27, 28, 32, 35, 36, 38]))

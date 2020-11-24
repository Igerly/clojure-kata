(ns kata.matchers)

(defn contains-each [coll xs]
  (every?
    #(.contains coll %)
    xs))
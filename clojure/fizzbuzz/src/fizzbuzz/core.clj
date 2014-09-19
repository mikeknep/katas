(ns fizzbuzz.core)

(defn convert [number]
  (cond
    (= 0 (mod number 15))  "fizzbuzz"
    (= 0 (mod number 3))   "fizz"
    (= 0 (mod number 5))   "buzz"
    :else number))

(defn fizzbuzz [target]
  (map convert (range 1 (+ 1 target))))

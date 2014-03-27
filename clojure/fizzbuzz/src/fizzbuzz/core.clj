(ns fizzbuzz.core)

(defn rules [counter]
  (cond
    (= 0 (mod counter 15))  "fizzbuzz"
    (= 0 (mod counter 3))   "fizz"
    (= 0 (mod counter 5))   "buzz"
    :else counter))

(defn fizzbuzz [target]
  (loop [target     target
         counter    0
         output     []]
    (if (= target counter)
      output
      (recur target (inc counter) (conj output (rules (inc counter)))))))

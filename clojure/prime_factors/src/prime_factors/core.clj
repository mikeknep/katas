(ns prime_factors.core)

(defn prime_factors_for [n]
  (loop [n        n
         factors  []
         divisor  2]
    (if (= n 1)
      factors
      (if (= 0 (mod n divisor))
        (recur (/ n divisor) (conj factors divisor) divisor)
        (recur n factors (inc divisor))))))

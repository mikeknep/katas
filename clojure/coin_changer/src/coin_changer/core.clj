(ns coin_changer.core)


(defn coinchanger[total]
  (loop [total  total
         change []]
    (if (= total 0)
      change
      (cond
        (>= total 25) (recur (- total 25) (conj change 25))
        (>= total 10) (recur (- total 10) (conj change 10))
        (>= total 5) (recur (- total 5) (conj change 5))
        (>= total 1) (recur (- total 1) (conj change 1))))))
